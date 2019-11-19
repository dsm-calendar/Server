package com.example.demo.controller;

import com.example.demo.entity.Event;
import com.example.demo.repository.*;
import com.example.demo.service.CertifiedService;
import com.example.demo.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


public class EventController {
    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private LoginUserRepository loginUserRepository;
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private MessageRepository messageRepository;


    private EventService eventService;
    private CertifiedService certifiedService;

    public EventController() {
        this.eventService = new EventService();
        this.certifiedService = new CertifiedService();
    }

    @PostMapping(path = "/event/request")
    public ResponseEntity<String> uploadRequest(@RequestHeader Integer loginUserId, @RequestBody Event event) {
        certifiedService.isLogin(loginUserId, loginUserRepository, userRepository, adminRepository);
        eventService.requestEvent(event, eventRepository, messageRepository, adminRepository);
        return ResponseEntity.ok("Success");
    }

    @PutMapping(path = "/event/{eventId}")
    public ResponseEntity<String> addEventRequest(@RequestHeader Integer loginUserId, @PathVariable Integer eventId, @RequestBody Event event) {
        certifiedService.isLogin(loginUserId, loginUserRepository, userRepository, adminRepository);
        certifiedService.isAdmin(loginUserRepository.findById(loginUserId),adminRepository);
        eventService.eventStatus(eventId, eventRepository, event.getEventStatus());
        return ResponseEntity.ok("Success");
    }

    @DeleteMapping(path = "/event/{eventId}")
    public ResponseEntity<String> deleteEvent(@RequestHeader Integer loginUserId, @PathVariable Integer eventId) {
        certifiedService.isLogin(loginUserId, loginUserRepository, userRepository, adminRepository);
        certifiedService.isAdmin(loginUserRepository.findById(loginUserId),adminRepository);
        eventService.deleteEvent(eventId, eventRepository);
        return ResponseEntity.ok("Success");
    }

    @GetMapping(value = "/event/{eventId}")
    public ResponseEntity<Event> readEvent(@RequestHeader Integer loginUserId, @PathVariable Integer eventId){
        certifiedService.isLogin(loginUserId,loginUserRepository,userRepository,adminRepository);
        return ResponseEntity.ok(eventService.readEvent(eventId,eventRepository));
    }

    @PostMapping(path = "/event")
    public ResponseEntity<String> adminEvent(@RequestHeader Integer loginUserId){
        certifiedService.isLogin(loginUserId, loginUserRepository, userRepository, adminRepository);
        certifiedService.isAdmin(loginUserRepository.findById(loginUserId),adminRepository);
        eventService.readAllEvent(eventRepository);
        return ResponseEntity.ok("Success");
    }
}
package com.example.demo.service;

import com.example.demo.entity.Event;
import com.example.demo.entity.Message;
import com.example.demo.exception.NotFoundException;
import com.example.demo.repository.AdminRepository;
import com.example.demo.repository.EventRepository;
import com.example.demo.repository.MessageRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class EventService {
    public Event requestEvent(Event newEvent, EventRepository eventRepository, MessageRepository messageRepository, AdminRepository adminRepository) {
        eventRepository.save(new Event());
        messageRepository.save(new Message(false, adminRepository.findAll().get(0).getId(), new Date(), 0, newEvent.getEventId(), 1));
        return eventRepository.save(newEvent);
    }
    public void deleteEvent(Integer EventId, EventRepository eventRepository){
        Optional<Event> e = eventRepository.findById(EventId);
        if(!e.isPresent()) {
            throw new NotFoundException("event not exists");
        }
        eventRepository.delete(e.get());
    }

    public Event readEvent(Integer EventId, EventRepository eventRepository){
        Optional<Event> e = eventRepository.findById(EventId);
        if (!e.isPresent()){
            throw new NotFoundException("event not exists");
        }
        return e.get();
    }

    public void eventStatus(Integer eventId, EventRepository eventRepository, Boolean eventStatus) {
        Optional<Event> e = eventRepository.findById(eventId);
        if (eventStatus){
            e.get().setEventStatus(true);
        } else {
          eventRepository.delete(e.get());
        }
    }

    public List<Event> readAllEvent(EventRepository eventRepository){
        return eventRepository.findAll();
    }
}

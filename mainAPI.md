메인페이지
```
GET/main
```
 - Request
 ```
 - header
 {
     loginUserId:Integer
 }
```
 - Response
```
SUCCESS {"code: 200, [{
  "eventList": [{
      "endDate": "string",
      "eventDetail": "string",
      "eventId": 0,
      "eventPoster": "string",
      "startDate": "string"
    }],
  "notices": [{
      "endDate": "string",
      "noticeContent": "string",
      "noticeId": 0,
      "noticeTitle": "string",
      "startDate": "string"
    }],
  "timeTables": [{
      "subject": "string",
      "teacher": "string",
      "timeTableIndex": 0
    }]
  }]
}
```
```
FAIL {"code": 500, "message":"FAIL"}
FAIL {"code": 403,"message": "Forbidden"}
```



 
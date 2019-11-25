이벤트 요청
-
```
POST/event
```
 - Request
```
- header
 {
     loginUserId:Integer
 }
- body(form-data)
{
    "eventDetail": String,
    "eventPoster": String,
    "startDate": String,
    "endDate": String
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success"}
FAIL {"code": 403,"message": "Forbidden"}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
이벤트 올리기
-
```
POST/event/{eventId}
```
 - Request
```
- header
{
     loginUserId:Integer
}
- body
{
    "eventStatus": Boolean
}
- 수락: true
- 거절: false
```
- Response
```
SUCCESS {"code": 200, "message": "Success"}
```
```
FAIL {"code": 500,"message":"FAIL"}
FAIL {"code": 403,"message": "Forbidden"}
FAIL {"code": 404, message:"Not found"}
```
이벤트 보기
-
```
GET/event
```
 - Request
```
{
    
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success",events:{[
    "EventId": Int,
    "eventTitle": String,
    "image": String,
    "summary": String,
    "startDate": String,
    "endDate": String
]}}
```
```
FAIL {"code": 500,"message":"FAIL"}
FAIL {"code": 403,"message": "Forbidden"}
```
이벤트 상세보기
-
```
GET/event/{EventId}
```
 - Request
```
{
    
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success",[{
    "eventId": Integer,
    "eventDetail": String,
    "eventPoster": String,
    "startDate": String,
    "endDate": String
    }]
}
```
```
FAIL {"code": 500,"message":"FAIL"}
FAIL {"code": 403,"message": "Forbidden"}
```
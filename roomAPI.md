그룹 만들기
-
```
POST/room
```
 - Request
```
{
    loginUserId: Integer
}
{
    "groupTitle": String
}
```
- Response
```
SUCCESS {"code": 200, [{
    "calendarId": Integer,
    "iconIndex": Int,
    "roomId": Integer,
    "roomTitle": "string"
  }]
}
```
```
FAIL {"code": 500,"message":"FAIL"}
FAIL {"code": 403,"message": "Forbidden"}
```
그룹 초대
-
```
POST/room/{roomId}
```
 - Request
```
{
    loginUserId: Integer
}
{
    "id": "string"
}
```
- Response
```
SUCCESS {"code": 200, "message": "ok"}
```
```
FAIL {"code": 500,"message":"FAIL"}
FAIL {"code": 403,"message": "Forbidden"}
FAIL {"code": 404, message:"Not found"}
```
그룹 목록 보기
-
```
GET/room/
```
 - Request
```
{
    loginUserId: Integer
}
```
- Response
```
SUCCESS {"code": 200, [{
    "calendarId": Integer,
    "iconIndex": Int,
    "roomId": Integer,
    "roomTitle": "string"
  }]
}
```
```
FAIL {"code": 500,"message":"FAIL"}
FAIL {"code": 403,"message": "Forbidden"}
```
그룹 상세보기
-
```
GET/room/{roomId}
```
 - Request
```
{
    loginUserId: Integer
}
```
- Response
```
SUCCESS {"code": 200, {
  "room": {
    "calendarId": 0,
    "iconIndex": 0,
    "roomId": 0,
    "roomTitle": "string"
  },
  "schedules": [
    {
      "calendarId": 0,
      "endDate": "string",
      "scheduleContent": "string",
      "scheduleId": 0,
      "scheduleTitle": "string",
      "startDate": "string"
    }
  ]
}
```
```
FAIL {"code": 500,"message":"FAIL"}
FAIL {"code": 403,"message": "Forbidden"}
FAIL {"code": 404, message:"Not found"}
```
멤버 목록 보기
-
```
GET/room/memberList/{roomId}
```
- Request
```
- header
{
    loginUserId: Integer
}
```
- Response
```
[{
  "memberId": 0,
  "memberRight": 0,
  "roomId": 0,
  "userId": "string"
}]
```
멤버 권한 수정
-
```
PUT/room/memberList/{roomId}
```
 - Request
```
- header
{
    loginUserId: Integer
}
- body
{
  "memberId": 0,
  "roomId": 0,
}
```
- Response
```
SUCCESS {"code": 200, message: "ok"}
```
```
FAIL {"code": 500,"message":"FAIL"}
FAIL {"code": 403,"message": "Forbidden"}
FAIL {"code": 404, message:"Not found"}
```
그룹삭제
-
```
DELETE/room/{roomId}
```
 - Request
```
- header
{
    loginUserId: Integer
}
- body
{
  
}
```
- Response
```
SUCCESS {"code": 200, message: "ok"}
```
```
FAIL {"code": 500,"message":"FAIL"}
FAIL {"code": 403,"message": "Forbidden"}
FAIL {"code": 404, message:"Not found"}
```

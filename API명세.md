회원
=
회원가입
-
```
POST/join
```
- STUDENT
    - Request
    ```
    {
        "id": String,
        "pw": String,
        "classOf": Int
    }
    ```
    - Response
    ```
    SUCCESS {"code": 200, "message": "Success"}
    ```
    ```
    FAIL {"code": 500,"message":"FAIL"}
    ```
로그인
-
```
POST/loginUser
```
 - Request
```
{
    "id": String,
    "pw": String,
}
```
- Response
```
SUCCESS {"code": 200, {
     classOf: Int,
     iconIndex: Int,
     id: String,
     loginUserId: Integer,
     myCalendarId: Integer
    }}
```
```
FAIL {"code": 500,"message":"FAIL"}
```

일정 추가
-
```
POST/calendar/{calendarId}
```
 - Request
```
{
    scheduleContent: String,
    scheduleTitle: String,
    startDate: String,
    endDate: String
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success", [{
    scheduleContent: String,
    scheduleTitle: String,
    startDate: String,
    endDate: String
}]}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
일정 수정
-
```
PUT/calendar/{scheduleId}
```
 - Request
```
{
    scheduleContent: String,
    scheduleTitle: String,
    startDate: String,
    endDate: String
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success", [{
    scheduleContent: String,
    scheduleTitle: String,
    startDate: String,
    endDate: String
}]}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
내 일정 보기
-
```
GET/myCalendar
```
 - Request
```
{
   
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success", [{
    scheduleContent: String,
    scheduleTitle: String,
    startDate: String,
    endDate: String
}]}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
일정 상세보기
-
```
GET/calendar/{scheduleId}
```
 - Request
```

```
- Response
```
SUCCESS {"code": 200, "message": "Success", [{
    scheduleContent: String,
    scheduleTitle: String,
    startDate: String,
    endDate: String
}]}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
일정 삭제
-
```
DELETE/calendar/deleteSchedule/{scheduleId}
```
 - Request
```
{
    
}
```
- Response
```
SUCCESS {"code": 200, "message": "Ok"}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
공지사항 추가
-
```
POST/notice/createNotice
```
 - Request
```
{
    "endDate": "string",
    "noticeContent": "string",
    "noticeTitle": "string",
    "startDate": "string"
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success", "notices":[{
    "noticeId": Int,
    "title": String,
    "startDate": String,
    "endDate": String
}]}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
공지사항 보기
-
```
POST/notice/
```
 - Request
```
{
   
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success", [{
    endDate: "string",
    noticeContent: "string",
    noticeTitle: "string",
    startDate: "string"
}]}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
공지사항 상세보기
-
```
GET/notice/{noticeId}
```
 - Request
```
{
   
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success", "notice":{
    "title": String,
    "content": String,
    "startDate": String,
    "endDate": String
}}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
공지사항 삭제
-
```
DELETE/notice/delete/{noticeId}
```
 - Request
```
{
    
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success"}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
시간표 수정
-
```
PUT/timetable/updateTimetable
```
 - Request
```
{
    "index": Int,
    "subject": String
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success", "timetables":[{
    "index": Int,
    "subject": String
}]}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
시간표 전체 보기
-
```
GET/timetable/
```
 - Request
```
{

}
```
- Response
```
SUCCESS {"code": 200, "message": "Success", "timetables":[{
    "index": Int,
    "subject": String
}]}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
메세지 받기
-
```
GET/message
```
 - Request
```
{
   
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success", "messages":[{
    "messageId": Int,
    "messageText": String,
    "needDialogue": Boolean
}]}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
메세지 삭제
-
```
DELETE/message/{messageId}
```
 - Request
```
{
   
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success"}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
이벤트 요청
-
```
POST/event/uploadRequest
```
 - Request
```
{
    "eventTitle": String,
    "image": String,
    "summary": String,
    "content": String,
    "startDate": String,
    "endDate": String
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success"}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
이벤트 올리기
-
```
POST/event/addEvent
```
 - Request
```
{
    "EventId": String,
    "accept": Boolean
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success",events:{[
    "EventId": Int,
    "eventTitle": String,
    "image": String,
    "summary": String,
    "content": String,
    "startDate": String,
    "endDate": String
]}}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
이벤트 수정
-
```
PUT/event/updateEvent/{EventId}
```
 - Request
```
{
    "eventTitle": String,
    "image": String,
    "summary": String,
    "content": String,
    "startDate": String,
    "endDate": String
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success",events:{[
    "EventId": Int,
    "eventTitle": String,
    "image": String,
    "summary": String,
    "content": String,
    "startDate": String,
    "endDate": String
]}}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
이벤트 삭제
-
```
DELETE/event/deleteEvent/{EventId}
```
 - Request
```
{
    
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success"}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
이벤트 보기
-
```
GET/event/
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
SUCCESS {"code": 200, "message": "Success",events:{
    "eventTitle": String,
    "image": String,
    "summary": String,
    "content": String,
    "startDate": String,
    "endDate": String
}}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
그룹 만들기
-
```
POST/group/makeGroup
```
 - Request
```
{
    "groupTitle": String
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success"}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
그룹 초대
-
```
POST/group/inviteMembers/{GroupId}
```
 - Request
```
{
    "invitedMembers": [String]
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success"}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
그룹 목록 보기
-
```
GET/group/
```
 - Request
```
{
    
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success","groups":[{
    "groupTitle": String,
    "GroupId": String
}]}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
그룹 상세보기
-
```
POST/group/{_id}
```
 - Request
```
{
    
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success","group":{
    "groupTitle": String,
    "calendarId": String
}}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
그룹 수락,거절
-
```
POST/group/enterGroup
```
 - Request
```
{
    "accept": Boolean
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success"}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
권한 수정
-
```
POST/group/updateRight
```
 - Request
```
{
    "id": String,
    "rightNumber": Number
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success"}
```
```
FAIL {"code": 500,"message":"FAIL"}
```

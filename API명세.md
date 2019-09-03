회원
=
회원가입
-
```
POST/auth/resister
```
- STUDENT
    - Request
    ```
    {
        "id": String,
        "pw": String,
        "classOf": Number
    }
    ```
    - Response
    ```
    SUCCESS {"code": 200, "message": "Success"}
    ```
    ```
    FAIL {"code": 500,"message":"FAIL"}
    ```
- TEACHER
    - Request
    ```
    {
        "id": String,
        "pw": String,
        "accessCode": String
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
POST/auth/login
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
SUCCESS {"code": 200, "message": "Success",{
    "isAdmin": Boolean,
    "token": String
    }}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
인증코드 전송
-
```
POST/user/accessCode
```
 - Request
```
{
    "accessCode": String
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success", "isAdmin": Boolean}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
일정 추가
-
```
POST/schedule/addSchedule
```
 - Request
```
{
    "title": String,
    "information": String,
    "startDate": String,
    "endDate": String
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success", "schedules":[{
    "title": String,
    "startDate": String,
    "endDate": String
}]}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
일정 수정
-
```
PUT/schedule/updateSchedule/{_id}
```
 - Request
```
{
    "title": String,
    "information": String,
    "startDate": String,
    "endDate": String
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success", "schedule":{
    "title": String,
    "information": String,
    "startDate": String,
    "endDate": String
}}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
일정 보기
-
```
GET/schedule/
```
 - Request
```
{
   
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success", "schedules":[{
    "title": String,
    "startDate": String,
    "endDate": String
}]}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
일정 상세보기
-
```
GET/schedule/{_id}
```
 - Request
```

```
- Response
```
SUCCESS {"code": 200, "message": "Success", "schedule":{
    "title": String,
    "information": String,
    "startDate": String,
    "endDate": String
}}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
일정 삭제
-
```
DELETE/schedule/deleteSchedule/{_id}
```
 - Request
```
{
    
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success", "schedules":[{
    "title": String,
    "information": String,
    "startDate": String,
    "endDate": String
}]}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
공지사항 추가
-
```
POST/notice/addNotice
```
 - Request
```
{
    "title": String,
    "content": String,
    "startDate": String,
    "endDate": String
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success", "notices":[{
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
SUCCESS {"code": 200, "message": "Success", "notices":[{
    "title": String,
    "startDate": String,
    "endDate": String
}]}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
공지사항 상세보기
-
```
GET/notice/{_id}
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
DELETE/notice/delete/{_id}
```
 - Request
```
{
    
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success", "notices":[{
    "title": String,
    "startDate": String,
    "endDate": String
}]}
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
    "grade": Number,
    "class": Number,
    "order": Number,
    "subject": String
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success", "timetable":{
    "grade": [{
        class:[{
            dayOfWeek:[{
                subject:[{
                    String
                }]
            }]
        }]
    }]
}}
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
SUCCESS {"code": 200, "message": "Success", "timetable":"timetable":{
    "grade": [{
        class:[{
            dayOfWeek:[{
                subject:[{
                    String
                }]
            }]
        }]
    }]
}}}
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
    "messageTitle": String
}]}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
메세지 삭제
-
```
DELETE/message/{_id}
```
 - Request
```
{
   
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success", "messages":[{
    "messageTitle": String
}]}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
이벤트 요청
-
```
POST/uploadRequest
```
 - Request
```
{
    eventTitle: String,
    file: String,
    content: String
}
```
- Response
```
SUCCESS {"code": 200, "message": "Success"}
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
POST/group/inviteMembers/{_id}
```
 - Request
```
{
    "members": [String]
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
    groupTitle: String,
    _id: String
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
    groupTitle: String,
    members:[{
        "id": String,
        "rightNumber":Number
    }],
    notices:[{
        "title": String,
        "information": String,
        "startDate": String,
        "endDate": String
    }]
}}
```
```
FAIL {"code": 500,"message":"FAIL"}
```
그룹 수락
-
```
POST/group/enterGroup
```
 - Request
```
{
    "_id": String
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

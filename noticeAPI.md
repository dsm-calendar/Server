공지사항 추가
-
```
POST/notice
```
 - Request
```
- header
{
    loginUserId: Integer
}
- body
{
    "endDate": "string",
    "startDate": "string",
    "noticeContent": "string",
    "noticeTitle": "string"
}
```
- Response
```
SUCCESS {"code": 200, [{
    "endDate": "string",
    "noticeContent": "string",
    "noticeId": Integer,
    "noticeTitle": "string",
    "startDate": "string"
    }]
}
```
```
FAIL {"code": 500,"message":"FAIL"}
FAIL {"code": 403,"message": "Forbidden"}
FAIL {"code": 403,"message": "Forbidden"}
```
공지사항 보기
-
```
GET/notice
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
SUCCESS {"code": 200, [{
    "endDate": "string",
    "noticeContent": "string",
    "noticeId": Integer,
    "noticeTitle": "string",
    "startDate": "string"
  }]
}
```
```
FAIL {"code": 500,"message":"FAIL"}
FAIL {"code": 403,"message": "Forbidden"}
```
공지사항 상세보기
-
```
GET/notice/{noticeId}
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
SUCCESS {"code": 200, "message": "Success", {
    "endDate": "string",
    "noticeContent": "string",
    "noticeId": Integer,
    "noticeTitle": "string",
    "startDate": "string"
}}
```
```
FAIL {"code": 500,"message":"FAIL"}
FAIL {"code": 403,"message": "Forbidden"}
FAIL {"code": 404, message:"Not found"}
```
공지사항 삭제
-
```
DELETE/notice/{noticeId}
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
SUCCESS {"code": 200, "message": "ok"}
```
```
FAIL {"code": 500,"message":"FAIL"}
FAIL {"code": 403,"message": "Forbidden"}
FAIL {"code": 404, message:"Not found"}
```
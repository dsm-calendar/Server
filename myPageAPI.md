마이페이지 읽기
-
```
GET/myPage
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
 SUCCESS{"code:200", [{
    "eventId": Integer,
    "haveDialog": Boolean,
    "messageId": Integer,
    "roomId": Integer,
    "sendDateNow": "string",
    "toUserId": "string",
    "type": Int
  }
]}
```
```
FAIL {"code" : 500, "message":"FAIL"}
FAIL {"code": 403,"message": "Forbidden"}

```
아이콘 수정하기
-
```
PUT/myPage
```
 - Request
```
-header
{
    loginUserId: Integer
}
-body
{
  "iconIndex": Int,
}
```
 - Response
```
SUCCESS {"code" : 200, {
  "admin": Boolean,
  "classOf": Int,
  "iconIndex": Int,
  "id": "string",
  "myCalendarId": Integer,
  "pw": "string"
}}

```
```
FAIL {"code": 500, "message":"FAIL"}
FAIL {"code": 403,"message": "Forbidden"} 
```
메세지 읽기
-
```
GET/message
```
 - Request
 ```
 - header 
 {
    loginUserId:Integer
 }

```
  - Respones
```
SUCCESS {"code: 200, [{
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

```
POST/message/{messageId}
```
 - Request
```
 - header
 {
     loginUserId:
     Integer
 }
 - body
 {
  "status": true
 }
 ```
 - Response
 ```
 SUCCESS {"code":200,"message":"Ok", "string"}
 ```
 ```
 FAIL {"code":500,"message":"FAIL"}
 FAIL {"code": 403,"message": "Forbidden"}
 ```

 ```
 DELETE/message/
 {messageId}
 ```
  - Request
  ```
  - header
  {
      loginUserId:
      Integer
  }
  ```
   - Response
  ```
  SUCCESS {"code":200, [{
    "eventId": Integer,
    "haveDialog": Boolean,
    "messageId": Integer,
    "roomId": Integer,
    "sendDateNow": "string",
    "toUserId": "string",
    "type": Int
  }]}
  ```
  ```
  FAIL {"code": 500,"message" : "FAIL"}
  FAIL {"code": 403,"message":"Forbidden"}
  ```






 

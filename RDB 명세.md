Student
=
```
{
    id: VARCHAR(30) PRIMARY KEY,
    pw: VARCHAR(30),
    classOf: INT,
    myCalendarId: VARCHAR(40),
    iconIndex: INT
}
```

Message
=
```
{
    messageId: VARCHAR() PRIMARY KEY,
    userId: VARCHAR(),
    messageText: VARCHAR(),
    haveDialogue: TINYINT(1)
}
```

Calendar
=
```
{
    calendarId: INT() PRIMARY KEY
}
```

Schedule
=
```
{
    calendarId: VARCHAR(),
    scheduleId: VARCHAR() PRIMARY KEY,
    title: VARCHAR(),
    information: VARCHAR(),
    startDate: VARCHAR(),
    endDate: VARCHAR()
}
```

Group
=
```
{
    groupId: VARCHAR() PRIMARY KEY,
    groupName: VARCHAR(),
    calendarId: VARCHAR()
}
```

GroupMember
=
```
{
    groupId: VARCHAR() PRIMARY KEY,
    memberRight: INT,
    userId: VARCHAR(30)
    rightNumber: TINYINT(2)
}
```

InvitedMember
=
```
{
    groupId: VARCHAR() PRIMARY KEY,
    userId: VARCHAR()
}
```

Event
=
```
{
    evnetId : VARCHAR() PRIMARY KEY,
    eventTitle: VARCHAR(),
    image: VARCHAR(),
    summary: VARCHAR(),
    content: VARCHAR(),
    startDate: Date,
    endDate: Date
}
```

Notice
=
```
{
    noticeId : VARCHAR() PRIMARY KEY,
    title: VARCHAR(),
    content: VARCHAR(),
    startDate: DATE,
    endDate: DATE
}
```

Timetable
=
```
{
    index : INT PRIMARY KEY,
    subject : VARCHAR(25)
}
```
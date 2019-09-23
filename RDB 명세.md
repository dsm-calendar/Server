User
=
```
{
    id: VARCHAR() PRIMART_KEY,
    pw: VARCHAR(),
    classOf: SMALLINT,
    isAdmin: TINYINT(1),
    myCalendarId: VARCHAR(),
}
```

Message
=
```
{
    id: VARCHAR() PRIMART_KEY,
    index: INT PRIMART_KEY,
    message: VARCHAR(),
    haveDialogue: TINYINT(1)
}
```

Calendar
=
```
{
    calendarId: VARCHAR() PRIMART_KEY
}
```

Schedule
=
```
{
    calendarId: VARCHAR() PRIMART_KEY,
    id: VARCHAR()  PRIMART_KEY,
    title: VARCHAR(),
    information: VARCHAR(),
    startDate: Date,
    endDate: Date
}
```

Group
=
```
{
    groupId: VARCHAR() PRIMART_KEY,
    groupTitle: VARCHAR(),
    calendarId: VARCHAR()
}
```

GroupMember
=
```
{
    groupId: VARCHAR() PRIMART_KEY,
    id: VARCHAR() PRIMART_KEY,
    rightNumber: TINYINT(2)
}
```

InvitedMember
=
```
{
    groupId: VARCHAR() PRIMART_KEY,
    id: VARCHAR() PRIMART_KEY
}
```

Event
=
```
{
    id : VARCHAR() PRIMART_KEY
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
    id : VARCHAR() PRIMART_KEY,
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
    id : SMALLINT PRIMART_KEY,
    subject : VARCHAR(25)
}
```

AccessCode
=
```
{
    accessCode: VARCHAR() PRIMART_KEY
}
```
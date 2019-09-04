User
=
```
{
    id: String,
    pw: String,
    classOf: Number,
    group:[String],
    isAdmin: Boolean,
    myCalendarId: String,
    myMessages:[{
        message: String,
        needDialogue: Boolean
    }],
    _id: String
}
```

Calendar
=
```
{
    schedule:[{
        title: String,
        information: String,
        startDate: String,
        endDate: String
    }]
    _id: String
}
```

Group
=
```
{
    groupTitle: String,
    members:[{
        id: String,
        rightNumber: Number
    }],
    calendarId: String,
    invitedUser: [String]
    _id: String
}
```

Event
=
```
{
    eventTitle: String,
    image: String,
    summary: String,
    content: String,
    startDate: String,
    endDate: String,
    _id: String
}
```

Notice
=
```
{
    title: String,
    content: String,
    startDate: String,
    endDate: String
}
```

Timetable
=
```
{
    grade[{
        class:[{
            dayOfWeek:[{
                subject:[{
                    String
                }]
            }]
        }]
    }]
}
```

AccessCode
=
```
{
    accessCode: String
}
```
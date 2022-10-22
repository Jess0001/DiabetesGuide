package com.example.diabetesguide;

import java.sql.Time;
import java.util.Date;

public class Reminders {
    private String categories;
    private Date reminderDate;
    private Time reminderTime;
    private String reminderDescription;

    public Reminders() {
    }

    public Reminders(String categories, Date reminderDate, Time reminderTime, String reminderDescription) {
        this.categories = categories;
        this.reminderDate = reminderDate;
        this.reminderTime = reminderTime;
        this.reminderDescription = reminderDescription;
    }
}


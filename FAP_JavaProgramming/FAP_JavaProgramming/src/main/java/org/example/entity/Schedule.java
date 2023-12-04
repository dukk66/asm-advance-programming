package org.example.entity;

import java.time.LocalDate;

public class Schedule {
    private LocalDate date;
    private String subject;
    private String startTime;
    private String endTime;

    public Schedule(LocalDate date, String subject, String startTime, String endTime) {
        this.date = date;
        this.subject = subject;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Date: " + date + ", Subject: " + subject + ", Time: " + startTime + " - " + endTime;
    }
}
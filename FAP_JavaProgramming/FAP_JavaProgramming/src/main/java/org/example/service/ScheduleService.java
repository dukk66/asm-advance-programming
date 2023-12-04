package org.example.service;

import org.example.entity.Schedule;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ScheduleService {
    private List<Schedule> schedules;

    private ScheduleService(Builder builder) {
        this.schedules = builder.schedules;
    }

    public void printSchedule() {
        System.out.println("Schedule:");
        for (Schedule schedule : schedules) {
            System.out.println(schedule);
        }
    }
    public static class Builder {
        private List<Schedule> schedules;
        public Builder() {
            this.schedules = new ArrayList<>();
        }
        public Builder addLesson(LocalDate date, String subject, String startTime, String endTime) {
            Schedule schedule = new Schedule(date, subject, startTime, endTime);
            schedules.add(schedule);
            return this;
        }
        public ScheduleService build() {
            return new ScheduleService(this);
        }
    }
}

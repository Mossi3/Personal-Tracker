package com.example.personaltraker.physical.model;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
public class PhysicalLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId;

    private String logType;

    private Double value;

    private Instant timestamp;

    public PhysicalLog() {
    }

    public PhysicalLog(String userId, String logType, Double value, Instant timestamp) {
        this.userId = userId;
        this.logType = logType;
        this.value = value;
        this.timestamp = timestamp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
}

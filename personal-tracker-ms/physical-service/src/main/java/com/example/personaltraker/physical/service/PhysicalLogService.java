package com.example.personaltraker.physical.service;

import com.example.personaltraker.physical.model.PhysicalLog;
import com.example.personaltraker.physical.repository.PhysicalLogRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class PhysicalLogService {

    private final PhysicalLogRepository repository;

    public PhysicalLogService(PhysicalLogRepository repository) {
        this.repository = repository;
    }

    public PhysicalLog logEntry(PhysicalLog log) {
        if (log.getTimestamp() == null) {
            log.setTimestamp(Instant.now());
        }
        return repository.save(log);
    }

    public List<PhysicalLog> getLogsByUserIdAndPeriod(String userId, String period) {
        String p = period == null ? "weekly" : period.toLowerCase();
        Instant end = Instant.now();
        Instant start;
        switch (p) {
            case "daily":
                start = end.minus(1, ChronoUnit.DAYS);
                break;
            case "monthly":
                start = end.minus(30, ChronoUnit.DAYS);
                break;
            case "weekly":
            default:
                start = end.minus(7, ChronoUnit.DAYS);
        }
        return repository.findByUserIdAndTimestampBetween(userId, start, end);
    }
}

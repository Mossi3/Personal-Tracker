package com.example.personaltraker.physical.repository;

import com.example.personaltraker.physical.model.PhysicalLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;

@Repository
public interface PhysicalLogRepository extends JpaRepository<PhysicalLog, Long> {
    List<PhysicalLog> findByUserIdAndTimestampBetween(String userId, Instant start, Instant end);
    List<PhysicalLog> findByUserId(String userId);
}

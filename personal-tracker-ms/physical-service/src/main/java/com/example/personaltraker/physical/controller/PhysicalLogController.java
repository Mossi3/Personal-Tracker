package com.example.personaltraker.physical.controller;

import com.example.personaltraker.physical.model.PhysicalLog;
import com.example.personaltraker.physical.service.PhysicalLogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/physical")
public class PhysicalLogController {

    private final PhysicalLogService service;

    public PhysicalLogController(PhysicalLogService service) {
        this.service = service;
    }

    @PostMapping("/log")
    public ResponseEntity<PhysicalLog> log(@RequestBody PhysicalLog log) {
        PhysicalLog saved = service.logEntry(log);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("/logs/{userId}")
    public List<PhysicalLog> getLogs(@PathVariable String userId, @RequestParam(name = "period", required = false) String period) {
        return service.getLogsByUserIdAndPeriod(userId, period);
    }
}

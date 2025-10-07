package com.example.personaltraker.ai.controller;

import com.example.personaltraker.ai.service.AISuggestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ai")
public class AITrackerController {

    private final AISuggestionService aiSuggestionService;

    public AITrackerController(AISuggestionService aiSuggestionService) {
        this.aiSuggestionService = aiSuggestionService;
    }

    @GetMapping("/growth-plan/{userId}/{period}")
    public String growthPlan(@PathVariable String userId, @PathVariable String period) {
        return aiSuggestionService.generateGrowthPlan(userId, period);
    }
}

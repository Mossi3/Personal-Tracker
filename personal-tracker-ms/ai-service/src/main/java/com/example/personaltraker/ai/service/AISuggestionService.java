package com.example.personaltraker.ai.service;

import com.example.personaltraker.ai.client.DomainDataClient;
import com.example.personaltraker.ai.model.AnalysisReport;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.StringJoiner;

@Service
public class AISuggestionService {

    private final ChatClient chatClient;
    private final DomainDataClient domainDataClient;

    public AISuggestionService(ChatClient chatClient, DomainDataClient domainDataClient) {
        this.chatClient = chatClient;
        this.domainDataClient = domainDataClient;
    }

    public String generateGrowthPlan(String userId, String period) {
        List<AnalysisReport> reports = domainDataClient.getFullAnalysis(userId);

        StringJoiner joiner = new StringJoiner("\n");
        joiner.add("User analysis report:");
        for (AnalysisReport r : reports) {
            joiner.add("- Domain: " + r.getDomain());
            joiner.add("  Weekly Average: " + r.getWeeklyAverage());
            joiner.add("  Monthly Goal: " + r.getMonthlyGoal());
            joiner.add("  Recent Highlight: " + r.getRecentHighlight());
        }

        String prompt = "You are a professional personal growth coach. " +
                "Based on the following user data report, provide 3 specific, actionable suggestions tailored for a " + period + " focus. " +
                "Suggestions must target the user's biggest area for improvement or inconsistency. " +
                "Format the output as a numbered list.\n\n" +
                joiner.toString();

        return chatClient
                .prompt()
                .user(prompt)
                .call()
                .content();
    }
}

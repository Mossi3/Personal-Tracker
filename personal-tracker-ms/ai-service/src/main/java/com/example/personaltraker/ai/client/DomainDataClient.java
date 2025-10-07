package com.example.personaltraker.ai.client;

import com.example.personaltraker.ai.model.AnalysisReport;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DomainDataClient {

    public List<AnalysisReport> getFullAnalysis(String userId) {
        return Arrays.asList(
                new AnalysisReport("Physical", "Workout 3x/week, avg 35 mins", "Run 10 miles/week", "Hit 5k PR on Sat"),
                new AnalysisReport("Financial", "$120/week dining out", "Save $300 this month", "Paid off store card"),
                new AnalysisReport("Emotional", "Mood 6/10 avg", "Journal 5 days/week", "Had relaxing hike Sun"),
                new AnalysisReport("Career", "2 deep-work sessions/week", "Ship portfolio case study", "Presented team demo on Fri")
        );
    }
}

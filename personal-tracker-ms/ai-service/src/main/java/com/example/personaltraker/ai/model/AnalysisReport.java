package com.example.personaltraker.ai.model;

public class AnalysisReport {
    private String domain;
    private String weeklyAverage;
    private String monthlyGoal;
    private String recentHighlight;

    public AnalysisReport() {
    }

    public AnalysisReport(String domain, String weeklyAverage, String monthlyGoal, String recentHighlight) {
        this.domain = domain;
        this.weeklyAverage = weeklyAverage;
        this.monthlyGoal = monthlyGoal;
        this.recentHighlight = recentHighlight;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getWeeklyAverage() {
        return weeklyAverage;
    }

    public void setWeeklyAverage(String weeklyAverage) {
        this.weeklyAverage = weeklyAverage;
    }

    public String getMonthlyGoal() {
        return monthlyGoal;
    }

    public void setMonthlyGoal(String monthlyGoal) {
        this.monthlyGoal = monthlyGoal;
    }

    public String getRecentHighlight() {
        return recentHighlight;
    }

    public void setRecentHighlight(String recentHighlight) {
        this.recentHighlight = recentHighlight;
    }
}

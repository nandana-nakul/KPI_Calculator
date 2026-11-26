package com.nandana.KPI_Calculator.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = " jira_metrics",uniqueConstraints = @UniqueConstraint(
        name = "uk_jira_metrics_employee_year_month",
        columnNames = {"employee_id", "year", "month"}))
@Data
public class JiraMetrics {

    @Id
    Integer id;
    Integer story_points_committed ;
    Integer story_points_completed ;
    Integer issues_resolved ;
    Integer bugs_resolved ;
    Integer  bugs_reopened ;
    LocalDateTime synced_at;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id" , nullable = false)
    private Employee employee;

}

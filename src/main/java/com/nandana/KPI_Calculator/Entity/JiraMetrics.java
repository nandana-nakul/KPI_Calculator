package com.nandana.KPI_Calculator.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = " jira_metrics")
@Data
public class JiraMetrics {

    @Id
    Integer id;
    @Column(unique = true)
    Integer year;
    @Column(unique = true)
    Integer month ;
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

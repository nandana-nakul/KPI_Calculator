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
    Integer employee_id ;
    Integer year;
    Integer month ;
    Integer story_points_committed ;
    Integer story_points_completed ;
    Integer issues_resolved ;
    Integer bugs_resolved ;
    Integer  bugs_reopened ;
    LocalDateTime synced_at;

}

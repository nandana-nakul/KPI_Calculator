package com.nandana.KPI_Calculator.Entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "github_metrics")
@Data

public class GitHubMetrics {

    @Id
    Integer id ;
    Integer employee_id;
    Integer year  ;
    Integer month;
    Integer prs_merged ;
    Integer reviews_completed ;
    Integer commits ;
    Double avg_pr_merge_hours ;
    LocalDateTime synced_at;
}

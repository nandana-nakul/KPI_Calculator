package com.nandana.KPI_Calculator.Entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "github_metrics")
@Data

public class GitHubMetrics {

    @Id
    Integer id ;
    @Column(unique = true)
    Integer year  ;
    @Column(unique = true)
    Integer month;
    Integer prs_merged ;
    Integer reviews_completed ;
    Integer commits ;
    Double avg_pr_merge_hours ;
    LocalDateTime synced_at;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id" , nullable = false)
    private Employee employee;



}

package com.nandana.KPI_Calculator.Repository;

import com.nandana.KPI_Calculator.Entity.Employee;
import com.nandana.KPI_Calculator.Entity.GitHubMetrics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GitHubMetricsRepository extends JpaRepository<GitHubMetrics,Integer> {
}

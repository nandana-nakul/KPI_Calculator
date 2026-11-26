package com.nandana.KPI_Calculator.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name ="sap_metric",uniqueConstraints = @UniqueConstraint(
        name = "uk_jira_metrics_employee_year_month",
        columnNames = {"employee_id", "year", "month"}))
@Data
public class SapMetrics {
    @Id
    Integer  id ;
    Integer working_days ;
    Integer days_present ;
    Integer approved_leave_days ;
    Integer late_check_ins;
    LocalDateTime synced_at;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id" , nullable = false)
    private Employee employee;

}

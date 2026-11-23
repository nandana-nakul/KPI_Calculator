package com.nandana.KPI_Calculator.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name ="sap_metric")
@Data
public class SapMetrics {
    @Id
    Integer  id ;
    Integer employee_id;
    @Column(unique = true)
    Integer year ;
    Integer month ;
    Integer working_days ;
    Integer days_present ;
    Integer approved_leave_days ;
    Integer late_check_ins;
    LocalDateTime synced_at;

}

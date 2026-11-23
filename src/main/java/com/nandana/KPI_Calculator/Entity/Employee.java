package com.nandana.KPI_Calculator.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name ="employee")
@Data
public class Employee {

    @Id
    Integer id;
    String name ;
    String email;
    String team;
    String role ;
    String github_username;
    String jira_account_id ;
    String sap_personnel_number;
    LocalDateTime createdAt;

    @PrePersist
    void onCreate()
    {
        createdAt = LocalDateTime.now();
    }

}

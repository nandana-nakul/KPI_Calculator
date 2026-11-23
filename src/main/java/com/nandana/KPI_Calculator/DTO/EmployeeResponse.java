package com.nandana.KPI_Calculator.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EmployeeResponse {

    Integer id;
    String name ;
    String email;
    String team;
    String role ;
    String latestMonth;
    Float latestOverallScore;
}

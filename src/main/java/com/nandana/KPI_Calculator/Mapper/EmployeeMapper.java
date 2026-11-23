package com.nandana.KPI_Calculator.Mapper;

import com.nandana.KPI_Calculator.DTO.EmployeeResponse;
import com.nandana.KPI_Calculator.Entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {
    public EmployeeResponse toResponse(Employee employee)
    {
        EmployeeResponse employeeResponse = new EmployeeResponse();
        employeeResponse.setId(employee.getId());
        employeeResponse.setName(employee.getName());
        employeeResponse.setEmail(employee.getEmail());
        employeeResponse.setTeam(employee.getTeam());
        employeeResponse.setRole(employee.getRole());
        return employeeResponse;
    }
}



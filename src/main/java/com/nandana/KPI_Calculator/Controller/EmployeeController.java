package com.nandana.KPI_Calculator.Controller;

import com.nandana.KPI_Calculator.DTO.EmployeeResponse;
import com.nandana.KPI_Calculator.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<EmployeeResponse>getEmployee(@RequestParam(required = false) String team)
    {
        return employeeService.getEmployees(team);
    }


    @GetMapping("/employees/{id}")
    public EmployeeResponse getOneEmployee(@PathVariable Integer id)
    {
        return employeeService.getOne(id);
    }








}

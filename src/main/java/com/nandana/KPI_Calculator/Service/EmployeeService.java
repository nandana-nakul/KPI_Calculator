package com.nandana.KPI_Calculator.Service;

import com.nandana.KPI_Calculator.DTO.EmployeeResponse;
import com.nandana.KPI_Calculator.Entity.Employee;
import com.nandana.KPI_Calculator.Mapper.EmployeeMapper;
import com.nandana.KPI_Calculator.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EmployeeMapper employeeMapper;


    public List<EmployeeResponse> getEmployees(String team) {

        List<Employee> emp = new ArrayList<>();

        if(team==null || team.isEmpty())
        {
            emp = employeeRepository.findAll();
        }
        else
        {
            emp = employeeRepository.findAllByTeam(team);
        }

        List<EmployeeResponse> responses = new ArrayList<>();
        for (Employee employee : emp)
        {
            EmployeeResponse er = employeeMapper.toResponse(employee);
            responses.add(er);

        }
        return responses;

    }


    public EmployeeResponse getOne(Integer id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isEmpty())
        {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        Employee emp = employee.get();
        EmployeeResponse response =employeeMapper.toResponse(emp);
        return response;

    }



}

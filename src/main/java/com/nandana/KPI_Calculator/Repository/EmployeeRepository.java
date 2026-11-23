package com.nandana.KPI_Calculator.Repository;

import com.nandana.KPI_Calculator.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {


}


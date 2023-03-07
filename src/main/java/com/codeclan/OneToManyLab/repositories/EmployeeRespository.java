package com.codeclan.OneToManyLab.repositories;

import com.codeclan.OneToManyLab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRespository extends JpaRepository<Employee,Long> {
}

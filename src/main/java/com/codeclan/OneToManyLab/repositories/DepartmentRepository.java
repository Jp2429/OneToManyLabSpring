package com.codeclan.OneToManyLab.repositories;

import com.codeclan.OneToManyLab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}

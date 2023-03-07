package com.codeclan.OneToManyLab.repositories;

import com.codeclan.OneToManyLab.models.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment,Long> {
}

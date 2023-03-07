package com.codeclan.OneToManyLab.repositories;

import com.codeclan.OneToManyLab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
}

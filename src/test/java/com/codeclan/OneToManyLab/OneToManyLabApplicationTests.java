package com.codeclan.OneToManyLab;

import com.codeclan.OneToManyLab.models.Assignment;
import com.codeclan.OneToManyLab.models.Department;
import com.codeclan.OneToManyLab.models.Employee;
import com.codeclan.OneToManyLab.models.Project;
import com.codeclan.OneToManyLab.repositories.AssignmentRepository;
import com.codeclan.OneToManyLab.repositories.DepartmentRepository;
import com.codeclan.OneToManyLab.repositories.EmployeeRespository;
import com.codeclan.OneToManyLab.repositories.ProjectRepository;
import org.apache.tomcat.jni.Proc;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OneToManyLabApplicationTests {
	@Autowired
	EmployeeRespository employeeRespository;
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	AssignmentRepository assignmentRepository;
	@Autowired
	ProjectRepository projectRepository;
	@Test
	void contextLoads() {
	}
	@Test
	public void createData(){
		Department dept=new Department("Engineering");
		Employee emp_1=new Employee("Janet","Sturgeon",123,dept);
		Project project1=new Project ("project1",14);
		Assignment a1=new Assignment(emp_1,project1);
		departmentRepository.save(dept);
		employeeRespository.save(emp_1);
		projectRepository.save(project1);
		assignmentRepository.save(a1);
	}

}

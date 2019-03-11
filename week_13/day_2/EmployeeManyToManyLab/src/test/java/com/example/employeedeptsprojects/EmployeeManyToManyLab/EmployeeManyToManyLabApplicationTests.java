package com.example.employeedeptsprojects.EmployeeManyToManyLab;

import com.example.employeedeptsprojects.EmployeeManyToManyLab.Models.Department;
import com.example.employeedeptsprojects.EmployeeManyToManyLab.Models.Employee;
import com.example.employeedeptsprojects.EmployeeManyToManyLab.Models.Project;
import com.example.employeedeptsprojects.EmployeeManyToManyLab.Repositories.DepartmentRepository;
import com.example.employeedeptsprojects.EmployeeManyToManyLab.Repositories.EmployeeRepository;
import com.example.employeedeptsprojects.EmployeeManyToManyLab.Repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeManyToManyLabApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment() {
		Department department = new Department("Developers");
		departmentRepository.save(department);
		Employee employee = new Employee("David", "Brent", 1, department);
		employeeRepository.save(employee);

	}

	@Test
	public void addProjectToEmployee() {
		Department department = new Department("Developers");
		departmentRepository.save(department);
		Employee employee = new Employee("David", "Brent", 1, department);
		employeeRepository.save(employee);
		Project project = new Project("Database", 30);
		projectRepository.save(project);
		employee.addProjectToEmployee(project);
		employeeRepository.save(employee);

	}
}

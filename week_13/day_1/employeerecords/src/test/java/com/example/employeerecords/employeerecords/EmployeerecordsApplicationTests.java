package com.example.employeerecords.employeerecords;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeerecordsApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void createEmployee() {
		Employee robin = new Employee("Robin Bailey", 35, 1, "robin.bailey@codeclan.com");
		employeeRepository.save(robin);
	}
}

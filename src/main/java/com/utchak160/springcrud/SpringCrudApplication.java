package com.utchak160.springcrud;

import com.utchak160.springcrud.model.Employee;
import com.utchak160.springcrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudApplication.class, args);
	}

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee1 = new Employee();
		employee1.setFirstName("Utkarsh");
		employee1.setLastName("Chak");
		employee1.setEmail("ut@gmail.com");
		employeeRepository.save(employee1);

		Employee employee2 = new Employee();
		employee2.setFirstName("Riya");
		employee2.setLastName("V");
		employee2.setEmail("rv@gmail.com");
		employeeRepository.save(employee2);
	}
}

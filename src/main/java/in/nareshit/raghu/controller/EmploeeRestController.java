package in.nareshit.raghu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.nareshit.raghu.model.Employee;
import in.nareshit.raghu.service.EmployeeService;

@RestController
public class EmploeeRestController {

	@Autowired
	private EmployeeService service;
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Employee> showData(@PathVariable Integer id) {
		Employee emp = service.getOneEmployee(id);
		return ResponseEntity.ok(emp);
	}

	
	
}

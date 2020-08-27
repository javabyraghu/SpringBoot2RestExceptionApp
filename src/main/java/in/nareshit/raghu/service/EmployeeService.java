package in.nareshit.raghu.service;

import org.springframework.stereotype.Service;

import in.nareshit.raghu.exception.EmployeeNotFoundException;
import in.nareshit.raghu.model.Employee;

@Service
public class EmployeeService {

	public Employee getOneEmployee(Integer id) {

		if(id<=5) 
			throw new EmployeeNotFoundException("Employee Not Exist");
		return new Employee(id,"ABC");
	}

}

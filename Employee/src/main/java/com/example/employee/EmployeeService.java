package com.example.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    public List<Employee> getAllEmployeesSorted(String sortingOrder) {
        Sort.Direction direction = "asc".equalsIgnoreCase(sortingOrder) ? Sort.Direction.ASC : Sort.Direction.DESC;
        Sort sort = Sort.by(direction, "price");
        return employeeRepository.findAll(sort);
    }


    public Employee findEmployeeWithHighestSalary() {
        List<Employee> allEmployees = employeeRepository.findAll();

        if (allEmployees.isEmpty()) {
            throw new NoEmployeesFoundException("No entries found.");
        }

        Optional<Employee> employeeWithHighestSalary = allEmployees.stream()
                .max(Comparator.comparing(Employee::getSalary));

        return employeeWithHighestSalary.orElseThrow(() ->
                new RuntimeException("Can't find such employee."));
    }

    public Employee getEmployeeById(Long id) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if (optionalEmployee.isPresent()) {
            return optionalEmployee.get();
        } else {
            throw new EmployeeNotFoundException("Employee not found with id: " + id);
        }
    }

    public Employee updateEmployee(Long id, Employee updatedEmployee) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if (optionalEmployee.isPresent()) {
            updatedEmployee.setId(id);
            return employeeRepository.save(updatedEmployee);
        } else {
            throw new EmployeeNotFoundException("Employee not found with id: " + id);
        }
    }

    public void deleteEmployee(Long id) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if (optionalEmployee.isPresent()) {
            employeeRepository.deleteById(id);
        } else {
            throw new EmployeeNotFoundException("Employee not found with id: " + id);
        }
    }
}

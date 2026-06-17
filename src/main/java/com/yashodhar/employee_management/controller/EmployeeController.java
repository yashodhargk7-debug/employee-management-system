package com.yashodhar.employee_management.controller;

import com.yashodhar.employee_management.dto.EmployeeRequestDTO;
import com.yashodhar.employee_management.dto.EmployeeResponseDTO;
import com.yashodhar.employee_management.entity.Employee;
import com.yashodhar.employee_management.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<EmployeeResponseDTO> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping("/employees")
    public EmployeeResponseDTO saveEmployee(@Valid @RequestBody EmployeeRequestDTO employeeRequestDTO) {
        return employeeService.saveEmployee(employeeRequestDTO);
    }

    @GetMapping("/employees/{id}")
    public EmployeeResponseDTO getEmployee(@PathVariable Long id) {
        return employeeService.getEmployee(id);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }

    @PutMapping("/employees/{id}")
    public EmployeeResponseDTO updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }

    @GetMapping("/employees/department/{department}")
    public List<Employee> findById(@PathVariable String department) {
        return employeeService.findByDepartment(department);
    }
}

package com.yashodhar.employee_management.service;

import com.yashodhar.employee_management.dto.EmployeeRequestDTO;
import com.yashodhar.employee_management.dto.EmployeeResponseDTO;
import com.yashodhar.employee_management.entity.Employee;
import com.yashodhar.employee_management.exception.EmployeeNotFoundException;
import com.yashodhar.employee_management.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeResponseDTO> getAllEmployees() {

        List<Employee> employees = employeeRepository.findAll();

        List<EmployeeResponseDTO> employeeResponseDTOs = new ArrayList<>();

        for(Employee employee : employees) {
            employeeResponseDTOs.add(convertToDTO(employee));
        }

        return employeeResponseDTOs;
    }

    public EmployeeResponseDTO saveEmployee(EmployeeRequestDTO employeeRequestDTO) {

        Employee employee = new Employee();

        employee.setName(employeeRequestDTO.getName());
        employee.setEmail(employeeRequestDTO.getEmail());
        employee.setPassword(employeeRequestDTO.getPassword());
        employee.setSalary(employeeRequestDTO.getSalary());
        employee.setDepartment(employeeRequestDTO.getDepartment());

        employee = employeeRepository.save(employee);

        return convertToDTO(employee);

    }

    public EmployeeResponseDTO getEmployee(Long id) {

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee with id " + id + " not found"));

        return convertToDTO(employee);
    }

    public void deleteEmployee(Long id) {

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee with id" + id + "not found"));
        employeeRepository.delete(employee);
    }

    public EmployeeResponseDTO updateEmployee(Long id, Employee employee) {

        Employee existingEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee with id" + id + "not found"));

        existingEmployee.setName(employee.getName());
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setPassword(employee.getPassword());
        existingEmployee.setSalary(employee.getSalary());
        existingEmployee.setDepartment(employee.getDepartment());

        existingEmployee = employeeRepository.save(existingEmployee);

        return convertToDTO(existingEmployee);
    }

    public List<Employee> findByDepartment(String department) {
        return employeeRepository.findByDepartment(department);
    }

    public EmployeeResponseDTO convertToDTO(Employee employee) {

        EmployeeResponseDTO dto = new EmployeeResponseDTO();

        dto.setId(employee.getId());
        dto.setName(employee.getName());
        dto.setEmail(employee.getEmail());
        dto.setSalary(employee.getSalary());
        dto.setDepartment(employee.getDepartment());

        return dto;

    }

}

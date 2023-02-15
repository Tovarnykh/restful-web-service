package ua.tovarnykh.springboot.restcrudapi.dao;

import java.util.List;

import ua.tovarnykh.springboot.restcrudapi.dao.entity.Employee;

public interface EmployeeDAO {
    
    public List<Employee> findAll();
    
    public Employee findById(int id);
    
    public void save(Employee employee);
    
    public void deleteById(Employee employee);

}
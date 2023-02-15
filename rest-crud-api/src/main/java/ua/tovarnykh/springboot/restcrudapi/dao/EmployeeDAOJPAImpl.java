/*package ua.tovarnykh.springboot.restcrudapi.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import ua.tovarnykh.springboot.restcrudapi.entity.Employee;

@Repository
public class EmployeeDAOJPAImpl implements EmployeeDAO {

    private EntityManager entityManager;
    
    public EmployeeDAOJPAImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        Query querry = entityManager.createQuery("from Employee");
       
        return querry.getResultList();
    }

    @Override
    public Employee findById(int id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public void save(Employee employee) {        
        Employee dbEmployee = entityManager.merge(employee);
        
        employee.setId(dbEmployee.getId());
    }

    @Override
    public void deleteById(Employee employee) {        
        entityManager.remove(employee);
    }

}*/
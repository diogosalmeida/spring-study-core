package com.study.spring.repository;

import com.study.spring.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
    public List<Customer> findAll(){
        List<Customer> customers = new ArrayList<Customer>();
        Customer customer = new Customer("Diogo", "Almeida");
        Customer customer2 = new Customer("Daniel", "Almeida");

        customers.add(customer);
        customers.add(customer2);

        return customers;
    }
}

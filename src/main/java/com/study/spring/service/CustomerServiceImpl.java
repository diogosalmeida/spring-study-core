package com.study.spring.service;

import com.study.spring.model.Customer;
import com.study.spring.repository.CustomerRepository;
import com.study.spring.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    public List<Customer> findAll(){
       return customerRepository.findAll();
    }
}

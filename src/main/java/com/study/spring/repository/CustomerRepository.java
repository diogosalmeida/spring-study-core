package com.study.spring.repository;

import com.study.spring.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}

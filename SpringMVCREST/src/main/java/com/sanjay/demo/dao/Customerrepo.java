package com.sanjay.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanjay.demo.model.Customer;

public interface Customerrepo extends JpaRepository<Customer, Integer>{



}

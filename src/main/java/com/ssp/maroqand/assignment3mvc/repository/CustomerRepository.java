package com.ssp.maroqand.assignment3mvc.repository;

import com.ssp.maroqand.assignment3mvc.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {


    Customer findCustomerByPhone(int tel);
}

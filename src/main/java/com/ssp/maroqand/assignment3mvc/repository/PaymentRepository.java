package com.ssp.maroqand.assignment3mvc.repository;

import com.ssp.maroqand.assignment3mvc.model.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

//    @Query(value = "select sum (amount) from payment p where p.time >= :start and p.time<= end")
//    double getSummAmount(@Param("start") Date start,@Param("end") Date end);
}

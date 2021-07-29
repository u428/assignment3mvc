package com.ssp.maroqand.assignment3mvc.repository;


import com.ssp.maroqand.assignment3mvc.constant.enums.OrderStatus;
import com.ssp.maroqand.assignment3mvc.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    Order findOrderByCustomerId(Long id);

    Order findOrderByCustomerIdAndStatus(Long id, OrderStatus orderStatus);

    List<Order> findAllByCustomerIdAndStatus(Long id, OrderStatus orderStatus);

    List<Order> findAllByStatus(OrderStatus orderStatus);

}

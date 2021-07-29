package com.ssp.maroqand.assignment3mvc.Service;

import com.ssp.maroqand.assignment3mvc.model.dto.OrderDTO;
import com.ssp.maroqand.assignment3mvc.model.entity.Customer;
import com.ssp.maroqand.assignment3mvc.model.entity.Product;
import org.springframework.http.ResponseEntity;

import java.net.MalformedURLException;
import java.util.List;

public interface OtherService {
    ResponseEntity getAllProducts(int page, int limit);

    ResponseEntity<Product> getProductById(Long id);

    ResponseEntity customOrder(List<OrderDTO> orderDTOList, Customer customer);

    ResponseEntity sortProductByCategory(Long id, int limit, int page);

    ResponseEntity karzinka(OrderDTO orderDTO, String userName);

    ResponseEntity getKarzinka(String telNomer);

    ResponseEntity image(Long id) throws MalformedURLException;

    ResponseEntity getAllcategory();
}

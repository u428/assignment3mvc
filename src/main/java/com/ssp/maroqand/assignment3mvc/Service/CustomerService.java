package com.ssp.maroqand.assignment3mvc.Service;

import com.ssp.maroqand.assignment3mvc.model.secure.CustomerSignUp;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface CustomerService extends UserDetailsService {
    boolean signUp(CustomerSignUp customerSignUp);

    ResponseEntity checkTelNomer(int tel);

    ResponseEntity getCurrentCustomer(String telNomer);

    ResponseEntity payment(String telNomer);

    ResponseEntity buy(double summa, String telNomer);

    ResponseEntity getRole(String telnomer);

    ResponseEntity deleteDetails(Long id);

    ResponseEntity updateDetails(Long id, short quantity, String telNomer);

    ResponseEntity getAllInvoices(String telNomer);
}

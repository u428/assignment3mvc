package com.ssp.maroqand.assignment3mvc.model.secure;


import lombok.Data;

@Data
public class CustomerLogin {

    public Integer phone;
    public String password;
    public String remember_me;

}

package com.ssp.maroqand.assignment3mvc.Security;


public class SecurityConstants {

    public static final long EXPIRATION_TIME=864000000;  //10 days
    public static final String TOKEN_PREFIX="Bearer ";
    public static final String HEADER_STRING="Authorization";
    public static final String SIGN_UP_URL="/auth/signUp";

//    @Value("${token.secret}")
    public static String TOKEN_SECRET="qurbanovulugbek428@gmail.com";
}

package com.ssp.maroqand.assignment3mvc.config;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CsrfConfigFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {

        CsrfToken csrfToken=(CsrfToken) httpServletRequest.getAttribute("_csrf");

        httpServletResponse.setHeader("CSRF-TOKEN-VALUE", csrfToken.getToken());

        filterChain.doFilter(httpServletRequest, httpServletResponse);

    }
}

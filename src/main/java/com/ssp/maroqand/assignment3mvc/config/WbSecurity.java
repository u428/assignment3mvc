package com.ssp.maroqand.assignment3mvc.config;

import com.ssp.maroqand.assignment3mvc.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import java.util.concurrent.TimeUnit;


@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WbSecurity extends WebSecurityConfigurerAdapter {

    @Autowired
    private CustomerService customerService;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public WbSecurity(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin()
                .loginPage("/auth/login").permitAll()
                    .defaultSuccessUrl("/all", true)
                    .failureForwardUrl("/auth/login?error")

                .and()
                .authorizeRequests()
                .antMatchers( "/auth/**")
                .permitAll()
                .anyRequest()
                .authenticated()

                .and()
                .rememberMe()
                    .tokenValiditySeconds((int) TimeUnit.DAYS.toSeconds(2))
                    .key("qurbanovulugbek428@gmail.com")

                .and()
                .logout()
                    .invalidateHttpSession(true)
                    .clearAuthentication(true)
                    .logoutRequestMatcher(new AntPathRequestMatcher("/logOut"))
                    .logoutSuccessUrl("/auth/login?logOut")
                    .permitAll()

//                .and()
//                .addFilterAfter(new CsrfConfigFilter(), CsrfFilter.class)
        ;

    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//       http
//               .csrf().disable()
//
//               .authorizeRequests()
//
//               .antMatchers(HttpMethod.POST, SecurityConstants.SIGN_UP_URL)
//               .permitAll()
//
//               .antMatchers(HttpMethod.GET, "/auth/checkTelNomer")
//               .permitAll()
//               .antMatchers(HttpMethod.GET, "/auth/image")
//               .permitAll()
////               .antMatchers(HttpMethod.GET, "/")
////               .permitAll()
//
//
//                .antMatchers("/admin/**").hasRole(ApplicationUserRole.ADMIN.name())
////               .antMatchers( "/users/**").hasRole(ApplicationUserRole.USER.name())
//
//               .anyRequest()
//               .authenticated()
//               .and()
//
//               .cors()
//               .and()
//
//               .addFilter(getAuthenticationFilter())
//               .addFilter(new AuthorizationFilter(authenticationManager()))
//
//               .sessionManagement()
//               .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//
//       ;
//
//    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customerService).passwordEncoder(bCryptPasswordEncoder);
    }

//    public AuthenticationFilter getAuthenticationFilter() throws Exception{
//        final AuthenticationFilter filter=new AuthenticationFilter(authenticationManager());
//        filter.setFilterProcessesUrl("/auth/login");
////        filter.setPostOnly(true);
//        return filter;
//    }
}

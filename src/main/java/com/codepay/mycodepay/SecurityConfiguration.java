package com.codepay.mycodepay;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
    private static final String USER = "USER";
    private static final String ADMIN = "ADMIN";
    private static final String ADMIN_URI = "/admin";
    private static final String ROOT = "/";
    private static final String USER_URI = "/user";
    @Autowired
    UserDetailsService userDetailsService;
    /**
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(userDetailsService);
    }
     /**
      * @param http
      * @throws Exception
      */
    @Override
    protected void configure(HttpSecurity http) throws Exception{
       http.authorizeRequests()
       .antMatchers(ADMIN_URI).hasRole(ADMIN)
       .antMatchers(USER_URI).hasAnyRole(ADMIN,USER)
       .antMatchers(ROOT)
       .permitAll()
       .and().formLogin();
    }
    /**
     * @return
     */
    @Bean

    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

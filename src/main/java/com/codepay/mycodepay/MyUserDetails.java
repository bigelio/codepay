package com.codepay.mycodepay;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails {
    private String userName;
    /**
     * @param userName
     */
    public MyUserDetails(String username) {
        this.userName = username;
    }
    public MyUserDetails() {
    }
    /**
     * @return the authorities
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
    }
    /**
     * @return the password
     */
    @Override
    public String getPassword() {
        return "pass";
    }
    /**
     * @return the username
     */
    @Override
    public String getUsername() {
        return userName;
    }
    /**
     * @return the accountNonExpired
     */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    /**
     * @return the accountNonLocked
     */
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    /**
     * @return the credentialsNonExpired
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    /**
     * @return the enabled
     */
    @Override
    public boolean isEnabled() {
        return true;
    }
}

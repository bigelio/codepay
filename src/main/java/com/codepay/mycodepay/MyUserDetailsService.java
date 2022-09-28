package com.codepay.mycodepay;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.codepay.mycodepay.models.MyUserDetails;
@Service
public class MyUserDetailsService implements UserDetailsService{

    @Autowired
    UserRepository userRepository;
/**
 * @param username
 */
@Override
public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

    Optional<User> user = userRepository.findUserByUserName(userName);
    user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + userName));
    return user.map(MyUserDetails::new).get();
}
}

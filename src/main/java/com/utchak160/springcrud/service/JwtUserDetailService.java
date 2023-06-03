package com.utchak160.springcrud.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("utkarsh".equals(username)) {
            return new User("utkarsh", "qwerty1234", new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("user not found with name " + username);
        }
    }
}

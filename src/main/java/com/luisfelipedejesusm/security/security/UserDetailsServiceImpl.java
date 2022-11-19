package com.luisfelipedejesusm.security.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // Get the user from the database using the username.
        // I'll mock the user since I don't want to do any db config
        if(!username.equals("testUsername"))
            throw new UsernameNotFoundException("User not found");

        // Here you return your user in a class that extends UserDetails
        return new UserDetailsImpl(username);
    }
}

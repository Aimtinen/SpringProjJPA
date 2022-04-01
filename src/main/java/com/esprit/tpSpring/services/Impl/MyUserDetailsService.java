package com.esprit.tpSpring.services.Impl;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.esprit.tpSpring.entity.Role;
import com.esprit.tpSpring.entity.User;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserService userService;
	
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
			User user = userService.findUserByUserName(userName);
			List<GrantedAuthority> authorities = getUserAuthority(user.getRoles());
			return new org.springframework.security.core.userdetails.User(user.getUserName(),
					user.getPassword(),user.getActive(), true, true, true,authorities);
	}
	
	
	private List<GrantedAuthority> getUserAuthority(Set<Role> userRoles) {
		Set<GrantedAuthority> roles = new HashSet<GrantedAuthority>();
		for (Role role : userRoles) {
			roles.add(new SimpleGrantedAuthority(((GrantedAuthority) role).getAuthority()));
		}
		
		List<GrantedAuthority>grantedAuthorities = new ArrayList<>(roles);
		return grantedAuthorities;
	}
	

	
	
	
}
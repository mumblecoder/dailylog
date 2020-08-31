package com.example.boot.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.boot.bean.UserInfo;
import com.example.boot.enums.Role;
import com.example.boot.repository.UserRepository;

@Service
public class UserDetailService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
		UserInfo user = userRepository.findByUserId(id);
		if(user == null) {
			throw new UsernameNotFoundException("존재하지 않는 유저입니다.");
		}
		Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
		if (user.getName().equals("admin")) {
            grantedAuthorities.add(new SimpleGrantedAuthority(Role.ADMIN.getValue()));
        } else {
            grantedAuthorities.add(new SimpleGrantedAuthority(Role.MEMBER.getValue()));
        }
		return new User(user.getUserId(), user.getPassword(), grantedAuthorities);
	}

}

package com.auth.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.auth.entity.User;

@SuppressWarnings("serial")
public class MyUserDetailsImpl implements UserDetails
{
    private String userName;
	private String password;
	private boolean active;
    @SuppressWarnings("unused")
	private String role;
	private List<GrantedAuthority> authorities;
	
	
	public MyUserDetailsImpl(User user)
{
		super();
		this.userName = user.getUserName();
		this.password = user.getPassword();
		this.active = user.isActive();
		this.role = user.getRole();
		this.authorities = Arrays.stream(user.getRole().split(","))
		                  .map(SimpleGrantedAuthority :: new)
		                  .collect(Collectors.toList());
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}


	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}


	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}


	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return active;
	}


	
}


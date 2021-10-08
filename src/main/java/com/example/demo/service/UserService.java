package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.naming.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.iUsuario;
import com.example.demo.modelo.Usuario;



@Service
public class UserService  implements UserDetailsService {
	
@Autowired
private iUsuario repo;
 static int countIntentos ;
	
	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		 countIntentos=0;
		//countIntentos++;
	
		Usuario us= repo.findByLogin(login);

if (us == null) {               
	
    throw new UsernameNotFoundException("El usuario no existe");
}
		//if()
			
		
			List<GrantedAuthority> roles= new ArrayList<>();
			roles.add(new SimpleGrantedAuthority("Admin"));
			
			UserDetails userDat= new User(us.getLogin(),us.getPassword(),roles);
	
				return userDat;
		
			
		}
		
		
		

		
	

}

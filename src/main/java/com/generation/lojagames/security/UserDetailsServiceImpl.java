package com.generation.lojagames.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.generation.lojagames.model.Usuario;
import com.generation.lojagames.repository.UsuarioRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired UsuarioRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException{
		Optional<Usuario> usuario = userRepository.findByUsuario(userName);
		usuario.orElseThrow(()-> new UsernameNotFoundException(userName + " usuário não encontrado na base de dados"));
		return usuario.map(UserDetailsImpl::new).get();
	}
}

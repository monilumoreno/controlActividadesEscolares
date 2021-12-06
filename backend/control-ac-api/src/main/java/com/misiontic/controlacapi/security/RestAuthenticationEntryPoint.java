package com.misiontic.controlacapi.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

/**
 * 
 * Configura el tipo de respuestas que se lanzan cada vez que se intente una autenticación.
 *
 */

public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {
	
	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException e) throws IOException, ServletException {
		//Cada vez que exista un intento de autenticación y se lanza una excepción
		//de genera el mensaje Unauthorized
		response.sendError(HttpServletResponse.SC_UNAUTHORIZED, e.getLocalizedMessage());		
	}
}

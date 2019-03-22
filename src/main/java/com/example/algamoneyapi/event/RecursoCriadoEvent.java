package com.example.algamoneyapi.event;

import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationEvent;

import lombok.Getter;

@Getter
public class RecursoCriadoEvent extends ApplicationEvent{

	private static final long serialVersionUID = -7415091831785546983L;
	private HttpServletResponse response;
	private UUID codigo;

	public RecursoCriadoEvent(Object source, HttpServletResponse response, UUID codigo) {
		super(source);
		this.response = response;
		this.codigo = codigo;
	}

}

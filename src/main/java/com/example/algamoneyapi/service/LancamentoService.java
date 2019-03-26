package com.example.algamoneyapi.service;

import java.util.Optional;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.algamoneyapi.model.Lancamento;
import com.example.algamoneyapi.repository.LancamentoRepository;

@Service
public class LancamentoService {
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	public Lancamento atualizar(UUID id, Lancamento lancamento, HttpServletResponse response) {
		Optional<Lancamento> lancamentoSalvo = lancamentoRepository.findById(id);
		
		if (!lancamentoSalvo.isPresent()) {
			throw new EmptyResultDataAccessException(1);
		}
		
		BeanUtils.copyProperties(lancamento, lancamentoSalvo.get(), "id");
		lancamentoRepository.save(lancamentoSalvo.get());
		return lancamentoSalvo.get();
	}
	
}

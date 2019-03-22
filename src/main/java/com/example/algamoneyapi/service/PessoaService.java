package com.example.algamoneyapi.service;

import java.util.Optional;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.algamoneyapi.model.Pessoa;
import com.example.algamoneyapi.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa atualizar(UUID id, Pessoa pessoa, HttpServletResponse response) {
		Optional<Pessoa> pessoaSalva = pessoaRepository.findById(id);
		
		if (!pessoaSalva.isPresent()) {
			throw new EmptyResultDataAccessException(1);
		}
		
		BeanUtils.copyProperties(pessoa, pessoaSalva.get(), "id");
		pessoaRepository.save(pessoaSalva.get());
		return pessoaSalva.get();
	}
	
}

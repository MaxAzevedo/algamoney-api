package com.example.algamoneyapi.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pessoa")
@Getter @Setter
public class Pessoa {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "id")
	private UUID id;
	
	@NotNull
	private String nome;
	
	private boolean ativo;
	
	private Endereco endereco;

}

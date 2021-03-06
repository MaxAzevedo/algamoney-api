package com.example.algamoneyapi.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "categoria")
@Getter @Setter
public class Categoria {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "id")
	private UUID id;
	
	@NotNull
	private String codigo;
	
	@NotNull
	@Size(min = 3, max = 20)
	private String nome;

}

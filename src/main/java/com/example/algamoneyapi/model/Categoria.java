package com.example.algamoneyapi.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	private String codigo;
	private String nome;

}

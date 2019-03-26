package com.example.algamoneyapi.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.example.algamoneyapi.enums.TipoLancamento;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "lancamento")
@Getter @Setter
public class Lancamento {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "id")
	private UUID id;
	
	@NotNull
	@Column(name = "datavencimento")
	private LocalDate dataVencimento;
	
	@Column(name = "datapagamento")
	private LocalDate dataPagamento;
	
	@NotNull
	private BigDecimal valor;
	
	private String observacao;
	
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;
	
	@ManyToOne
	@JoinColumn(name = "pessoa_id")
	private Pessoa pessoa;
	
	@Enumerated(EnumType.STRING)
	@NotNull
	private TipoLancamento tipo;

}

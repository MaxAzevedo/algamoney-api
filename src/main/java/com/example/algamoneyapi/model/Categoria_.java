package com.example.algamoneyapi.model;

import java.util.UUID;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Categoria.class)
public abstract class Categoria_ {

	public static volatile SingularAttribute<Categoria, String> codigo;
	public static volatile SingularAttribute<Categoria, String> nome;
	public static volatile SingularAttribute<Categoria, UUID> id;

	public static final String CODIGO = "codigo";
	public static final String NOME = "nome";
	public static final String ID = "id";

}


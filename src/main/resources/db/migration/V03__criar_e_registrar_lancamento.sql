CREATE TABLE lancamento(
	id UUID NOT NULL DEFAULT id_generator(),
	descricao TEXT,
	dataVencimento date NOT NULL,
 	dataPagamento date,
 	valor DECIMAL(10, 2) NOT NULL,
	observacao TEXT,
	categoria_id UUID NOT NULL,
	pessoa_id UUID NOT NULL,
	tipo TEXT NOT NULL,
	CONSTRAINT pk_lancamento PRIMARY KEY (id)
);

ALTER TABLE lancamento ADD CONSTRAINT fk_lancamento_categoria FOREIGN KEY (categoria_id) REFERENCES categoria(id);
ALTER TABLE lancamento ADD CONSTRAINT fk_lancamento_pessoa FOREIGN KEY (pessoa_id) REFERENCES pessoa(id); 
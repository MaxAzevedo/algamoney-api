CREATE TABLE pessoa(
	id UUID NOT NULL DEFAULT id_generator(),
	nome TEXT NOT NULL,
	ativo BOOLEAN NOT NULL DEFAULT true,
 	logradouro TEXT,
 	numero TEXT,
	complemento TEXT,
	bairro TEXT,
	cep TEXT,
	cidade TEXT,
	estado TEXT,
	CONSTRAINT pk_pessoa PRIMARY KEY (id)
);

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) values ('Max', true, 'Rua Projetada', '105', '', 'Centro', '58306290', 'Bayeux', 'PB');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) values ('Pedro', true, 'Rua Flávio Maroja', '110', '', 'Centro', '58306280', 'João Pessoa', 'PB');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) values ('Tiago', true, 'Rua Manoel Duarte da Silveira', '1105', '', 'Ipês', '58306270', 'João Pessoa', 'PB');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) values ('Tiago', true, 'Rua Manoel Duarte da Silveira', '1105', '', 'Ipês', '58306270', 'João Pessoa', 'PB');
CREATE OR REPLACE FUNCTION id_generator() RETURNS UUID AS
$$
DECLARE 
	id UUID := NULL;
BEGIN
	id := (SELECT uuid_in(md5(random()::text || clock_timestamp()::text)::cstring));
	RETURN id;
END;
$$
LANGUAGE plpgsql;

CREATE TABLE categoria(
	id UUID NOT NULL DEFAULT id_generator(),
	codigo TEXT NOT NULL,
	nome TEXT NOT NULL,
	CONSTRAINT pk_categoria PRIMARY KEY (id)
);

INSERT INTO categoria (codigo, nome) values ('01', 'Lazer');
INSERT INTO categoria (codigo, nome) values ('02', 'Alimentação'); 
INSERT INTO categoria (codigo, nome) values ('03', 'Supermercado'); 
INSERT INTO categoria (codigo, nome) values ('04', 'Farmácia');
INSERT INTO categoria (codigo, nome) values ('05', 'Outro'); 
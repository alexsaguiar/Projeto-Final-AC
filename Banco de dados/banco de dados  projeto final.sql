create table clientes (codigo_cliente integer primary key, nome_cliente varchar(100) not null, email varchar(100),
			telefone varchar(15), celular varchar(15), senha varchar(10),observacao varchar (50),
			codigo_cidade integer, nome_cidade varchar(100), estado varchar(100))


create table cidades (codigo_cidade integer primary key, nome_cidade varchar(100), estado varchar(100))



alter table clientes add constraint fk_cidades foreign key (codigo_cidade) references  cidades(codigo_cidade);

create table historicos (codigo_historico integer primary key, pendente varchar(500), tb_concluido varchar(500))
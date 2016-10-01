create table cliente (codigo_cliente integer primary key, nome varchar(80), email varchar(100), telefone varchar(12), celular varchar(14), senha varchar(12))

create table cidade (codigo_cidade integer primary key, nome varchar(80), estado varchar(80))

alter table cliente add column codigo_cidade integer not null;

alter table cliente add constraint  fk_cidade foreign key (codigo_cidade) references cidade (codigo_cidade)

create table historico (codigo_historico primary key, descricao varchar(500))
---Refiz as tabelas para introduzir nova nomenclatura --
drop table cliente 
drop table cidade
---------------------------------------------------------


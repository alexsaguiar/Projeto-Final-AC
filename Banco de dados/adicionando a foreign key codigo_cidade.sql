alter table cliente add column codigo_cidade integer not null 

alter table cliente add constraint fk_cidade foreign key (codigo_cidade) references cidade (codigo_cidade)
/**
* Loja Rações BR
* @author Pedro Noga
*/

create database dbloja;
-- Selecionar o banco de dados
use dbloja;

/* Tabelas */
-- Exibir tabelas
show tables;
-- Criar uma tabela
create table produtos(
	idpro int primary key auto_increment,
    nomeproduto varchar(50) not null,
    tipo varchar(20),
    quantidade int not null,
    valor decimal(10,2) not null
);
-- Descrever a estrutura da tabela
describe produtos;

-- Excluir uma Tabela
drop table produtos;

/* CRUD (Create Read Update Delete) */
-- CRUD Create
insert into produtos(nomeproduto,quantidade,valor)
values('Racao Premier',2,281.98);
insert into produtos(nomeproduto,tipo,quantidade,valor)
values('Racao Golden','Para Gatos',1,123.99);
insert into produtos(nomeproduto,tipo,quantidade,valor)
values('Racao Alcon','Para Peixes',3,26.97);
insert into produtos(nomeproduto,quantidade,valor)
values('Fardo de Feno',10,550.00);
insert into produtos(nomeproduto,tipo,quantidade,valor)
values('Racao Nutropica','Para Hamster',5,32.50);

-- CRUD Read
select * from produtos;
select * from produtos order by nomeproduto;
select * from produtos where idpro = 3;

-- CRUD Update
update produtos set tipo='Para Caes' where idpro = 2;
update produtos set nomeproduto='Fardo de Feno',tipo='Para Cavalos',
quantidade= 5,valor=275.00 where idpro = 4;

-- CRUD Delete
delete from produtos where idpro = 1;
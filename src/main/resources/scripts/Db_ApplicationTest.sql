Create Database if Not Exists CadastroTeste;

use cadastroteste;
insert into pessoa(
	nome, sobrenome, email, login, senha) values (
    'Bruno', 'Ardel', 'djbrunohardel@hotmail.com', 'Hardel', '123');
truncate table pessoa;
select * from pessoa;
drop database if exists cadastroteste;

insert into cupom (
	data_lancamento, valor, id_pessoa_id) values (
    '20170527', 100.00, 1);
    
select * from cupom

update cupom set valor = 100.00 where id = 1;
create database cursos;
use cursos;

show tables;

insert into tbl_curso (nome, carga_hora, preco, detalhes) values ("Yoga", 12, 120, "Curso de yoga Mahatma com o professor Hélio Couto");
insert into tbl_curso (nome, carga_hora, preco, detalhes) values ("Tênis", 20, 200, "Aulas de tênis com o professor Roger Federer");
insert into tbl_curso (nome, carga_hora, preco, detalhes) values ("Basquete", 20, 200, "Aulas de basquete com professor Manu Ginobili");
insert into tbl_curso (nome, carga_hora, preco, detalhes) values ("Krav Maga", 15, 350, "Aula de Krav Maga com professor do exército israelense");
insert into tbl_curso (nome, carga_hora, preco, detalhes) values ("Natação", 10, 150, "Aula de natação com peixes");

insert into tbl_aluno (nome, email, cpf, data_nasc, fone, curso_id_curso) values ("Ana Beatriz", "anapati@gmail.com", "415.871.229-74", "18/06/94", "(11)97420-2566", 1);
insert into tbl_aluno (nome, email, cpf, data_nasc, fone, curso_id_curso) values ("Thiago Calegari", "cale@gmail.com", "416.786.558-82", "20/01/94", "(11)97420-2577", 2);
insert into tbl_aluno (nome, email, cpf, data_nasc, fone, curso_id_curso) values ("Ítalo Andrew", "wolfzerax@gmail.com", "632.875.118-21", "26/08/92" , "(11)97412-5547", 4);
insert into tbl_aluno (nome, email, cpf, data_nasc, fone, curso_id_curso) values ("Victória Paiva", "vic@gmail.com", "523.788.655-25", "02/02/00" , "(11)97821-1265", 5);
insert into tbl_aluno (nome, email, cpf, data_nasc, fone, curso_id_curso) values ("Adrian Ferreira", "familia@gmail.com", "125.789.123.85", "03/03/00", "(11)98755-1236", 3);

select tbl_aluno.nome as "Aluno", tbl_curso.nome as "Curso", tbl_curso.detalhes from tbl_aluno inner join tbl_curso on curso_id_curso=id_curso;
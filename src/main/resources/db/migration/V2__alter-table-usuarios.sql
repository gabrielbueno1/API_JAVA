create table usuarios(

id bigint not null auto_increment,
nome varchar(100) not null,
email varchar(100) not null,
idade int not null,
genero varchar(50) not null,
vaga_pretendida varchar(255) not null,
salario_desejado float not null,

primary key(id)

);
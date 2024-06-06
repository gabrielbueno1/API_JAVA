create table usuarios(

id bigint not null auto_increment,
nome varchar(100) not null,
email varchar(100) not null,
idade int not null,
genero varchar(50) not null,
vagaPretendida varchar(255) not null,
salarioDesejado float not null,

primary key(id)

);
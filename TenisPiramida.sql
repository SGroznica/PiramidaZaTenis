drop database if exists tenispiramida;
create database tenispiramida character set utf8;
use tenispiramida;

create table igrac(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    oib char(11),
    brojmobitela varchar(50)
);

create table red(
    sifra int not null primary key auto_increment,
    brojreda varchar(50) not null,
    igrac int not null
);

create table tenis_match(
    sifra int not null primary key auto_increment,
    igrac1 int not null,
    igrac2 int not null,
    tenis_set varchar(50) not null,
    tenis_gem varchar(50) not null,
    datumigranja datetime
);

create table kolo(
    sifra int not null primary key auto_increment,
    brojkola varchar(50) not null,
    tenis_match int
);

alter table red add foreign key (igrac) references igrac(sifra);

alter table tenis_match add foreign key (igrac1) references igrac(sifra);
alter table tenis_match add foreign key (igrac2) references igrac(sifra);

alter table kolo add foreign key (tenis_match) references tenis_match(sifra);


insert into igrac(sifra,ime,prezime) values
(null,'Stjepan','Groznica'),
(null,'Tomislav','Mršo'),
(null,'Roger','Federer'),
(null,'Rafael','Nadal'),
(null,'Novak','Djoković'),
(null,'Borna','Ćosić'),
(null,'Mario','Ančić'),
(null,'Andre','Agassi'),
(null,'Ivan','Ljubičić'),
(null,'Daniil','Medvedev'),
(null,'Marin','Čilić'),
(null,'Andy','Roddick'),
(null,'Mardy','Fish'),
(null,'Goran','Ivanišević'),
(null,'Pete','Sampras'),
(null,'Alexander','Zerev'),
(null,'Andy','Murray'),
(null,'Steve','Johnson'),
(null,'Denis','Shapovalov'),
(null,'Pero','Perić');

insert into red(sifra,brojreda,igrac) values
(null,'1',1),
(null,'1',2);

insert into tenis_match(sifra,igrac1,igrac2,tenis_set,tenis_gem,datumigranja) values
(null,1,2,'3','6:3,2:6,7:5','2021-11-17');

insert into kolo(sifra,brojkola,tenis_match) values
(null,'1',1);
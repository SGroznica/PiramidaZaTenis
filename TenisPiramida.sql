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
    rezultat varchar(50),
    datumigranja datetime,
    pobjednik int not null
);

alter table red add foreign key (igrac) references igrac(sifra);

alter table tenis_match add foreign key (igrac1) references igrac(sifra);
alter table tenis_match add foreign key (igrac2) references igrac(sifra);
alter table tenis_match add foreign key (pobjednik) references igrac(sifra);

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

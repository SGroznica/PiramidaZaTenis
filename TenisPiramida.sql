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
    datumigranja datetime,
    rezultat varchar(50),
    pobjednik int
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


insert into tenis_match(sifra,igrac1,igrac2,rezultat,datumigranja,pobjednik) values
(null,1,2,'6:4,2:6,7:5','2021-11-25',1),
(null,3,4,'2:6,1:6','2021-11-26',2);

insert into red(sifra,brojreda,igrac) values
(null,1,1),
(null,1,2),
(null,2,3),
(null,2,4);

update igrac set oib='80482522016', brojmobitela='0981335687' where sifra=1;

update igrac set oib='26456987612', brojmobitela='0926875246' where sifra=2;
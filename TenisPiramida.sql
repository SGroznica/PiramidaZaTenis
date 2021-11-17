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

create table mec(
    sifra int not null primary key auto_increment,
    igrac int,
    sett varchar(50) not null,
    gem varchar(50) not null,
    datumigranja datetime
);

create table kolo(
    sifra int not null primary key auto_increment,
    brojkola varchar(50) not null,
    mec int
);

alter table red add foreign key (igrac) references igrac(sifra);

alter table mec add foreign key (igrac) references igrac(sifra);

alter table kolo add foreign key (mec) references mec(sifra);


insert into igrac(sifra,ime,prezime) values
(null,'Stjepan','Groznica'),
(null,'Tomislav','Mršo');

insert into red(sifra,brojreda,igrac) values
(null,'1',1),
(null,'1',2);

insert into mec(sifra,igrac,sett,gem,datumigranja) values
(null,1,'3','6:3,2:6,7:5','2021-11-17');

insert into kolo(sifra,brojkola,mec) values
(null,'1',1);
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
    teren varchar(50),
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
(null,'Borna','Ćorić'),
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
(null,'Pero','Perić'),
(null,'Toni','Tieško'),
(null,'Filip','Vrban'),
(null,'Joip','Krstić'),
(null,'Tomislav','Josipović'),
(null,'Matej','Marković'),
(null,'Petar','Filipović'),
(null,'Janko','Marko'),
(null,'Josip','Martin'),
(null,'Kristijan','Blažević'),
(null,'Goran','Cerić');

insert into tenis_match(sifra,igrac1,igrac2,datumigranja,teren,rezultat,pobjednik) values
(null,1,3,'2021-11-25','Olimpija','6:4,2:6,7:5',1),
(null,2,4,'2021-11-26','Jezero','2:6,1:6',4),
(null,10,14,'2021-11-28','Perivoj','4:6,7:5,2:6',14),
(null,5,8,'2021-11-29','Olimpija','6:0,6:0',5),
(null,13,6,'2021-11-29','Perivoj','6:4,6:1',13);

insert into red(sifra,brojreda,igrac) values
(null,1,1),
(null,1,2),
(null,2,3),
(null,2,4),
(null,2,5),
(null,2,6),
(null,2,7),
(null,2,8),
(null,3,9),
(null,3,10),
(null,3,11),
(null,3,12),
(null,3,13),
(null,3,14),
(null,3,15),
(null,3,16),
(null,4,17),
(null,4,18),
(null,4,19),
(null,4,20),
(null,4,21),
(null,4,22),
(null,4,23),
(null,4,24),
(null,4,25),
(null,4,26),
(null,4,27),
(null,4,28),
(null,4,29),
(null,4,30);

update igrac set oib='80482522016', brojmobitela='0981335687' where sifra=1;

update igrac set oib='26456987612', brojmobitela='0926875246' where sifra=2;

update igrac set oib='26728836288', brojmobitela='0915468732' where sifra=3;

update igrac set oib='36630535268', brojmobitela='0925647821' where sifra=4;

update igrac set oib='89026785451', brojmobitela='0998456213' where sifra=5;

update igrac set oib='54650108881', brojmobitela='0989521462' where sifra=6;

update igrac set oib='79987045804', brojmobitela='0971234978' where sifra=8;

update igrac set oib='26185486525', brojmobitela='0915687461' where sifra=10;

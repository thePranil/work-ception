USE workception;

drop table if exists project_skill;
drop table if exists project;
drop table if exists skill;


create table project(
	pid int NOT NULL AUTO_INCREMENT,
    pname TEXT,
	pdate DATE,
    PRIMARY KEY (pid)
);

create table skill(
	sid int NOT NULL AUTO_INCREMENT,
    sname TEXT,
    PRIMARY KEY (sid)
);

create table project_skill(
	pid int,
    sid int,
	foreign key (pid) references project(pid),
    foreign key (sid) references skill(sid)
);


insert into project (pname, pdate)
values ("CUP-Despoit",'2020-10-10');
insert into project (pname, pdate)
values ("Attendance App",'2020-06-13');
insert into project (pname, pdate)
values ("LookTV",'2019-06-23');


insert into skill (sname) values ("Java");
insert into skill (sname) values ("Maven");
insert into skill (sname) values ("Rest APIs");
insert into skill (sname) values ("AngularJS");
insert into skill (sname) values ("MySQL");
insert into skill (sname) values ("VueJS");
insert into skill (sname) values ("Spring Boot");
insert into skill (sname) values ("Postman");
insert into skill (sname) values ("Git/Github");
insert into skill (sname) values ("Python");





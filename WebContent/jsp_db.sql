Create database if not exists jsp_db character set utf8;
use jsp_db;
drop table if exists tbl_user;
create table tbl_user(
 id int(11) unsigned not null auto_increment,
 name varchar(50) not null default '',
 password varchar(50) not null default '',
 email varchar(50) default '',
 primary key(id)
)
engine=InnoDB
default charset=utf8;

drop table if exists tbl_address;
create table tbl_address(
id int(11) unsigned not null auto_increment,
city varchar(20) default null,
country varchar(20) default null,
user_id int(11) unsigned not null,
primary key(id)
)
engine=InnoDB
default charset=utf8;

insert into tbl_user
values
(1,'刘伟','111111','liuwei@qq.com'),
(2,'哇哈哈哈','111111','coffee@gmail.com');
insert into tbl_address(city,country,user_id)values
('nanjin','china',1),('beijing','china',2);
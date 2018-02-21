drop table if exists tbl_user;
CREATE TABLE tbl_user (
    user_name VARCHAR(20),
    age INT,
    signup_date DATE
);

insert into tbl_user values('coffeeliu',18,'2018-01-01');
insert into tbl_user values('liuwei',20,'2017-04-05');

update tbl_user set age=38 where user_name='coffeeliu';
select * from tbl_user;
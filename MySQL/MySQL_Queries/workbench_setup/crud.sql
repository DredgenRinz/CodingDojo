CREATE DATABASE testcd;
USE testcd;

CREATE TABLE codingdojo(
id int not null auto_increment primary key,
first_name varchar(45)
);

insert into codingdojo (id, first_name) values (null, "Yolo");
select first_name as nombres from codingdojo;
alter table codingdojo add last_name varchar(45) after first_name;
update codingdojo set last_name = "trolling" where id = 1;

select concat(first_name," ", last_name) as full_name from codingdojo;

delete from codingdojo where id = 1;

drop database testcd;
#select * from users;
#//jdbc:mysql://localhost:3306/security
drop table users;
create table users(username varchar(20), password varchar(20), enabled int default 0);
insert into users (username, password, enabled) values('USER1', 'USER1', 1), ('USER2', 'USER2', 1), ('rajan', 'rajan', 1);

drop table user_roles;
create table user_roles(username varchar(20), role varchar(10) );
insert into user_roles values ('USER1', 'ROLE_USER'), ('USER2', 'ROLE_USER'), ('rajan', 'ROLE_USER');


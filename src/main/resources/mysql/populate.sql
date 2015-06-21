insert into category(id, name)
value
('1', 'Computer'),
('2', 'mobiles and accessories'),
('3', 'vehicles and automobiles'),
('4', 'arts and painting');

insert into auction(id, title, description, minExpectedAmount,  category_id, maxBid_id)
values
(2,'xps laptop 226SSD 16gb Ram', 'The best laptop in the world you could ever find out. fastest yet slim, high resolution', 750, 1, 1);
;

insert into bid( auctionId, bidAmount, username)
values
(1, 760, 'rajan')
;

--------------------------------------users-----------------------------
select * from bid;


drop table users;
create table users(username varchar(20), password varchar(20), enabled int default 0);
insert into users (username, password, enabled) values('USER1', 'USER1', 1), ('USER2', 'USER2', 1), ('rajan', 'rajan', 1);

drop table user_roles;
create table user_roles(username varchar(20), role varchar(10) );
insert into user_roles values ('USER1', 'ROLE_USER'), ('USER2', 'ROLE_USER'), ('rajan', 'ROLE_USER');
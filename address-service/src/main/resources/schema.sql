
create table address(id int(20)  auto_increment primary key,
account_id int(20) not null,
city varchar(30) not null,
state varchar(30) not null,
land_mark varchar(100) not null,
house_no varchar(30) not null,
pin int(20) not null);
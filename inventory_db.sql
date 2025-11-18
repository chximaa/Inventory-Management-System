create database inventory_db;
use inventory_db;

create table products(
id INT primary key,
name varchar(100) NOT NULL,
category varchar(100),
quantity INT,
price double,
supplier_id INT,
foreign key(supplier_id) references suppliers(id)
);
create table suppliers(
id INT primary key,
name varchar(100) not null,
contact varchar(100)
);

select * from suppliers



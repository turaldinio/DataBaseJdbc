create table customers
(
    id           int auto_increment primary key,
    name         char(20) not null,
    surname      char(20) not null,
    age          int unsigned,
    phone_number long

);
insert into customers (name, surname, age, phone_number)
VALUES ('Alexey', 'Gavrilov', 22, 75836273948),
       ('Dmitry', 'Lolipov', 43, 26173647564),
       ('Pavlov', 'Sergey', 24, 2637283948);

create table orders
(
    id           int auto_increment primary key,
    date         timestamp default CURRENT_TIMESTAMP,
    customer_id  int      not null,
    product_name char(30) not null,
    amount       int      not null,
    foreign key (customer_id) references customers (id)
);
insert into orders (customer_id, product_name, amount)
VALUES (1, 'MacBook air 13', 87400),
       (2, 'Iphone 13 Pro Max', 95000);
create table customers
(
    id           int auto_increment primary key,
    name         char(20) not null,
    surname      char(20) not null,
    age          int unsigned,
    phone_number long

);
create table orders
(
    id           int auto_increment primary key,
    date         timestamp default CURRENT_TIMESTAMP,
    customer_id  int      not null,
    product_name char(30) not null,
    amount       int      not null,
    foreign key (customer_id) references customers (id)
)
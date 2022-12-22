create table customers
(
    id           int auto_increment primary key,
    name         char(20) not null,
    surname      char(20) not null,
    age          int unsigned,
    phone_number long

);

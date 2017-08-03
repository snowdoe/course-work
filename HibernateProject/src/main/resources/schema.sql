CREATE TABLE Addresses (
    id int not null auto_increment primary key,
    streetname varchar,
    cityname varchar
);


CREATE TABLE Students (
    id int not null auto_increment primary key,
    name varchar,
    surname varchar,
    course varchar,
    address_id int not null,

    foreign key (address_id) references Addresses(id)
);

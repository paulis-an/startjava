CREATE DATABASE jaegers;

CREATE TABLE jaegers( 
    id serial primary key,
    modelName varchar (64),
    mark char (8),
    height integer,
    weight real,
    status varchar (32),
    origin varchar (32),
    launch numeric (4),
    kaijuKill integer);
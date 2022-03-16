create table userdatas
(
    id serial not null,
    user_id integer not null,
    stone_amt integer not null,
    primary key (id,user_id)
);

create table characters
(
    id serial not null,
    lank integer not null,
    name text not null,
    url text not null,
    primary key (id)
);


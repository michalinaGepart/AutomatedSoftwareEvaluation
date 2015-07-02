# --- !Ups

create table person(
  id          integer PRIMARY KEY AUTOINCREMENT,
  firstName   varchar(255),
  lastName    varchar(255),
  eMail       varchar(255),
  password    varchar(255),
  matriculationNumber integer
);

# --- !Downs

PRAGMA foreign_keys = OFF;

drop table answer;

drop table fluencyLevel;

drop table language;

drop table person;

drop table tandem;

PRAGMA foreign_keys = ON;
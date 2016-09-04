create table Users (id bigint not null auto_increment, email varchar(255), password varchar(255), username varchar(255), primary key (id))
alter table Users add constraint UK_23y4gd49ajvbqgl3psjsvhff6  unique (username)

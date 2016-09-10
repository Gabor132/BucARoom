
/**
 * Author:  Dragos
 * Created: Sep 10, 2016
 */

create table users (id bigint(20) auto_increment primary key, username varchar(255) not null unique ,
 password varchar(255) not null, lastName varchar(255) not null,
 firstName varchar(255) not null, email varchar(255) not null);

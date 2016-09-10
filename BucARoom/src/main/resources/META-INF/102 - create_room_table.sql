
/**
 * Author:  Dragos
 * Created: Sep 10, 2016
 */

create table rooms (id bigint(20) auto_increment primary key, roomNumber int(3) not null unique ,
 roomFloor int(3) not null, canBeReserved varchar(255) not null default 'YES');


drop schema geonames if exists;
create schema geonames;

create table geonames.geoname (
	geoname_id integer primary key,
	name varchar(255),
	ascii_name varchar(255),
	alternate_names varchar(255),
	latitude 			double,
	longitude 		decimal,
	feature  varchar(255),
	feature_code varchar(255),
	country_code varchar(255),
	cc2 varchar(255),
	admin1_code varchar(255),
	admin2_code varchar(255),
	admin3_code varchar(255),
	admin4_code varchar(255),
	population integer,
	elevation integer,
	dem integer, 
	timezone varchar(255),
	modification date
);
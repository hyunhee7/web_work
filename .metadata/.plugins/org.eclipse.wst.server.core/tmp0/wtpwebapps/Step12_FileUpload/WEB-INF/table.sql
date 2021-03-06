create table board_data(
num 			number 			primary key,
writer 			varchar2(100) 	not null,
title 			varchar2(100) 	not null,
orgFileName 	varchar2(100) 	not null,
saveFileName 	varchar2(100) 	not null,
filesize 		Number 			not null,
regdate 						date);

create sequence board_data_seq;

CREATE TABLE board_image
(num NUMBER PRIMARY KEY,
name VARCHAR2(100) NOT NULL,
imgSrc VARCHAR(100) NOT NULL,
regdate DATE);

CREATE SEQUENCE board_image_seq;

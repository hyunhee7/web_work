CREATE TABLE board_guest
(num NUMBER PRIMARY KEY,
writer VARCHAR2(50),
title VARCHAR2(100),
content CLOB,
regdate DATE);

CREATE SEQUENCE board_guest_seq;

INSERT INTO board_guest VALUES(board_guest_seq.NEXTVAL, '김구라1', '제목1','내용1', SYSDATE);
INSERT INTO board_guest VALUES(board_guest_seq.NEXTVAL, '김구라2', '제목2','내용2', SYSDATE);
INSERT INTO board_guest VALUES(board_guest_seq.NEXTVAL, '김구라3', '제목3','내용3', SYSDATE);
INSERT INTO board_guest VALUES(board_guest_seq.NEXTVAL, '김구라4', '제목4','내용4', SYSDATE);
INSERT INTO board_guest VALUES(board_guest_seq.NEXTVAL, '김구라5', '제목5','내용5', SYSDATE);
INSERT INTO board_guest VALUES(board_guest_seq.NEXTVAL, '김구라6', '제목6','내용6', SYSDATE);
INSERT INTO board_guest VALUES(board_guest_seq.NEXTVAL, '김구라7', '제목7','내용7', SYSDATE);
INSERT INTO board_guest VALUES(board_guest_seq.NEXTVAL, '김구라8', '제목8','내용8', SYSDATE);
INSERT INTO board_guest VALUES(board_guest_seq.NEXTVAL, '김구라9', '제목9','내용9', SYSDATE);
INSERT INTO board_guest VALUES(board_guest_seq.NEXTVAL, '김구라10', '제목10','내용10', SYSDATE);
INSERT INTO board_guest VALUES(board_guest_seq.NEXTVAL, '김구라11', '제목11','내용11', SYSDATE);
INSERT INTO board_guest VALUES(board_guest_seq.NEXTVAL, '김구라12', '제목12','내용12', SYSDATE);
INSERT INTO board_guest VALUES(board_guest_seq.NEXTVAL, '김구라13', '제목13','내용13', SYSDATE);
INSERT INTO board_guest VALUES(board_guest_seq.NEXTVAL, '김구라14', '제목14','내용14', SYSDATE);
INSERT INTO board_guest VALUES(board_guest_seq.NEXTVAL, '김구라15', '제목15','내용15', SYSDATE);
INSERT INTO board_guest VALUES(board_guest_seq.NEXTVAL, '김구라16', '제목16','내용16', SYSDATE);
INSERT INTO board_guest VALUES(board_guest_seq.NEXTVAL, '김구라17', '제목17','내용17', SYSDATE);
INSERT INTO board_guest VALUES(board_guest_seq.NEXTVAL, '김구라18', '제목18','내용18', SYSDATE);
INSERT INTO board_guest VALUES(board_guest_seq.NEXTVAL, '김구라19', '제목19','내용19', SYSDATE);
INSERT INTO board_guest VALUES(board_guest_seq.NEXTVAL, '김구라20', '제목20','내용20', SYSDATE);


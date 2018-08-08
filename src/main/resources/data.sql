-- SELECT * FROM BOOK_REQUEST;
-- BOOKREQID  	BOOK  	CATEGORY  	STATUS  	USERID  

insert into BOOK_REQUEST values (1,'Book1inCat1','Cat1','D',1);
insert into BOOK_REQUEST values (2,'Book2inCat1','Cat1','D',2);
insert into BOOK_REQUEST values (3,'Book1inCat2','Cat2','D',1);
insert into BOOK_REQUEST values (4,'Book1inCat1','Cat1','D',2);
insert into BOOK_REQUEST values (5,'Book1inCat3','Cat3','D',1);
insert into BOOK_REQUEST values (6,'Book2inCat3','Cat3','D',1);
insert into BOOK_REQUEST values (7,'Book1inCat1','Cat1','D',3);
insert into BOOK_REQUEST values (8,'Book1inCat2','Cat2','D',4);

-- SELECT * FROM BOOKREVIEW;
-- BOOKREVID  	BOOKID  	REVIEW  	USERID  

insert into BOOKREVIEW values (1,1,'Good',1);
insert into BOOKREVIEW values (2,2,'Good',1);
insert into BOOKREVIEW values (3,1,'Good',2);
insert into BOOKREVIEW values (4,2,'Good',2);
insert into BOOKREVIEW values (5,1,'Good',3);
insert into BOOKREVIEW values (6,4,'Good',4);
insert into BOOKREVIEW values (7,5,'Good',6);
insert into BOOKREVIEW values (8,7,'Good',7);

-- SELECT * FROM LIKEREVIEW;
-- LIKEID  	LIKESTATUS  	BOOKREWID  	COMMENTS  	USERID  	VOTE  

insert into LIKEREVIEW values (1,'liked',1,'OK',2,'U');
insert into LIKEREVIEW values (2,'liked',1,'OK',3,'U');
insert into LIKEREVIEW values (3,'liked',2,'OK',2,'U');
insert into LIKEREVIEW values (4,'liked',3,'OK',5,'U');
insert into LIKEREVIEW values (5,'liked',2,'OK',6,'U');
insert into LIKEREVIEW values (6,'liked',4,'OK',7,'U');

-- BOOK_ID  	BOOKNAME  	BOOKCAT_ID  

-- insert into BOOK  values (1,'harrypotter',4);
-- insert into BOOK  values (2,'alchemist',3);
-- insert into BOOK  values (3,'gonegal',1);
-- insert into BOOK  values (4,'2states',6);
-- insert into BOOK  values (5,'The Monk',3);
-- insert into BOOK  values (6,'Twilight',5);
-- insert into BOOK  values (7,'revolution2020',1);


-- BOOKCAT_ID  	NAME 
insert into BOOK_CATEGORY  values (1,'Cat1');
insert into BOOK_CATEGORY  values (2,'Cat2');
insert into BOOK_CATEGORY  values (3,'Cat3');
insert into BOOK_CATEGORY  values (4,'Cat4');
insert into BOOK_CATEGORY  values (5,'Cat5');
insert into BOOK_CATEGORY  values (6,'Cat6');
insert into BOOK_CATEGORY  values (7,'Cat7');


    
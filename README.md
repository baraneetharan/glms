# Gamified Library Management System (GLMS)
# REST API 
## library

{
  "book": [
    {
      "bookId": 0,
      "bookname": "JAVA8"
    },
    {
      "bookId": 0,
      "bookname": "Angular 6"
    }
  ],
  "bookcatId": 0,
  "name": "CSE"
}

{
  "book": [
    {
      "bookId": 0,
      "bookname": "Robotics"
    },
    {
      "bookId": 0,
      "bookname": "SpaceX"
    }
  ],
  "bookcatId": 0,
  "name": "Mech"
}

## Search books

by ID
by name
by category(Department)

## User table
userid, name, role

## BookRequest table:
bookreqid, userid,category,book,status (Q/I/R)
### Return the book
Once the user mark the book as Return Scheduler will issue the book to next user
### BookReview table:
bookreviewid,bookid, userid,review
### Likereview
likeid,bookreviewid,userid,likestatus,vote(U/D),comment
### points & badge calculation
get all records from BookRequest table

SELECT * FROM BOOK_REQUEST;
BOOKREQID  	BOOK  	CATEGORY  	STATUS  	USERID  
1	Book1inCat1	Cat1	D	1
2	Book2inCat1	Cat1	D	2
3	Book1inCat2	Cat2	D	1
4	Book1inCat1	Cat1	D	2
5	Book1inCat3	Cat3	D	1
6	Book2inCat3	Cat3	D	1
7	Book1inCat1	Cat1	D	3
8	Book1inCat2	Cat2	D	4

SELECT * FROM BOOKREVIEW;
BOOKREVID  	BOOKID  	REVIEW  	USERID  
1	1	Good	1
2	2	Good	1
3	1	Good	2
4	2	Good	2
5	1	Good	3
6	4	Good	4
7	5	Good	6
8	7	Good	7

SELECT * FROM LIKEREVIEW;
LIKEID  	LIKESTATUS  	BOOKREWID  	COMMENTS  	USERID  	VOTE  
1	liked	1	OK	2	U
2	liked	1	OK	3	U
3	liked	2	OK	2	U
4	liked	3	OK	5	U
5	liked	2	OK	6	U
6	liked	4	OK	7	U

## userid 1 details expected output

*********************
No. of  books:4
Category wise count:{Cat3=2, Cat2=1, Cat1=1}
More than one book taken from Category:{Cat3=2}
Distinct Category:{Cat2=1, Cat1=1}
**********POINT********
the points for books is :4
the point for each catergory :3
catergory points for more than 2 books in single cat 3
the reviewpoint:10
the liked point :2
the points for liked book took by other users: 6


Curl
curl -X GET --header 'Accept: text/plain' 'http://localhost:8080/api/Bookrequest/userwise/1'
Request URL
http://localhost:8080/api/Bookrequest/userwise/1
Request Headers
{
  "Accept": "*/*"
}
Response Body
**********Book Request***********
No. of  books:4
Category wise count:{Cat3=2, Cat2=1, Cat1=1}
More than one book taken from Category:{Cat3=2}
Distinct Category:{Cat2=1, Cat1=1}
**********Review Points********
the points for books is :4
the point for each catergory :3
catergory points for more than 2 books in single cat 3
the reviewpoint:10
the liked point :2
the points for liked book took by other users: 6
Response Code

# Angular





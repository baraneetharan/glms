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
bookreqid,bookid, userid, status (Q/I/R)
### Return the book
Once the user mark the book as Return Scheduler will issue the book to next user
### BookReview table:
bookreviewid,bookid, userid,review
### Likereview
bookreviewid,userid,likestatus,vote(U/D),comment
### points & badge calculation
get all records from BookRequest table

# Angular





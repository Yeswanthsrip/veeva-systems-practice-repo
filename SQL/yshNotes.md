DBMS

--in sqlite alter modify,truncate are not there

--pragma table_info(table_name)

--create table table_name (field1 type1,field2 type2...);

--select * from table_name;

-- CREATE TABLE friends (name varchar(25), age int, village varchar(25));
-- pragma table_info(friends);
-- INSERT INTO
--   friends (name, age, village)
-- VALUES
--   ("Lalithyaa", 21, "Tallagokavaram"),
--   ("Bhavyaa", 20, "Polavaram"),
--   ("Vaani", 20, "Tadepalligudem");
-- //update
-- UPDATE
--   friends
-- SET
--   age = 21;
-- UPDATE
--   friends
-- SET
--   age = 20
-- WHERE
--   name = "Bhavyaa";
-- //alter add
-- ALTER TABLE
--   friends
-- ADD
--   COLUMN number int;
-- //alter rename
-- ALTER TABLE
--   friends RENAME COLUMN number TO phno;
-- //alter modify
-- ALTER TABLE
--   friends
-- MODIFY
--   column phno varchar(10);
--   modify doesn't work in sqlite
-- //alter drop
-- ALTER TABLE
--   friends DROP COLUMN phno;
-- //delete specific row
-- DELETE FROM
--   friends
-- WHERE
--   name = "Vani";
-- //delete all records
-- DELETE FROM
--   friends;
-- DROP TABLE friends;
-- //truncate not there in sqlite

-- SELECT
--   *
-- FROM
--   friends;


***IN BETWEEN operators
--IN
SELECT
  *
FROM
  product
WHERE
  brand IN ( "Puma", "Levi's", "Mufti", "Lee", "Denim");
  
--BETWEEN
 SELECT
  name,
  price,
  brand
FROM
  product
WHERE
  price BETWEEN 1000
  AND 5000;
  
***ORDER BY

SELECT
  name,
  price,
  rating
FROM
  product
WHERE
  name = "Blue Shirt"
ORDER BY
  rating DESC,
  price ASC;
  
***DISTINCT

SELECT
  DISTINCT brand
FROM
  product
ORDER BY
  brand;
  
*** LIMIT OFFSET

SELECT
  name,
  price,
  rating
FROM
  product
ORDER BY
  rating DESC
LIMIT 5 
OFFSET 6;

------------------In SQLite, OFFSET clause should be used after theLIMITclause.
				  Default OFFSET value is 0.
				  In PostgreSQL, the OFFSET clause can be used with or without the LIMIT clause.-------
				  
				  
***Aggregate functions Count,Sum,Max,Min,Avg

SELECT
  AVG(score) AS avg_score
FROM
  player_match_details;
  
.we can use aggregats functions are commonly used in select,having but not in where
..WHERE filters rows before grouping
..HAVING filters groups after aggregation.

***Group By with Having

SELECT
  name,
  COUNT(*) AS half_centuries
FROM
  player_match_details
WHERE
  score >= 50
GROUP BY
  name
HAVING
  half_centuries > 1;
  
***Expressions in querying

**Arthmetic operations in sql
..SELECT
  (budget_in_cr + 10) AS new_budget
FROM
  movie;

..SELECT
  (budget_in_cr * 100) budget_as_lakhs
FROM
  movie;
  
..SELECT
  (collection_in_cr / budget_in_cr) AS collection_rate
FROM
  movie;
  
..SELECT
  age % 2 AS age_reminder_for_2
FROM
  actor;
  
**Using Expressions in select clause

..SELECT
  age % 2 AS age_reminder_for_2
FROM
  actor;
  
**In update clause

..UPDATE movie
SET rating = rating/2;

**In having clause

..SELECT
  genre
FROM
  movie
GROUP BY
  genre
HAVING
  AVG(collection_in_cr - budget_in_cr) >= 100;
  

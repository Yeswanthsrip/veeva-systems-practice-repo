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
  
***SQL functions

--Date Functions: Used to work with dates or times.
--Cast Functions: Used to change the data type of a value.
--Arithmetic Functions: Used to perform calculations on numbers.

==strftime()
	The strftime() function is used to extract year, month, day, hour
	Strftime() extracts date and time in the string format.
	
	format		description				output format				Function					Behavior
	
	%Y			Year					1990, 2021 etc.			strftime("%Y", field_name)		Extract Year
	%m			Month					01 - 12					strftime("%m", field_name)		Extract Month
	%d			Day of the month		01 - 31					strftime("%d", field_name)		Extract Day
	%H			Hour					00 - 24					strftime("%H", field_name)		Extract Hour
	...	...	...	...	...
	
	strftime(format, field_name)
	strftime("%Y", release_date)
	
	SELECT 
    strftime('%m', release_date) AS month,
		COUNT(*) AS total_movies
	FROM
		movie
	WHERE
		strftime('%Y', release_date) = '2010'
	GROUP BY
		month;
		

***Cast Functions

	--CAST function is used to convert a value from one data type to another data type. 
	
	CAST(value AS data_type);
	CAST(strftime('%Y', release_date) AS INTEGER)
	
	SELECT
	  strftime('%m', release_date) AS month,
	  COUNT(*) AS total_movies
	FROM
	  movie
	WHERE
	  CAST(strftime('%Y', release_date) AS INTEGER) = 2010
	GROUP BY
	  month;
	  
***Arithmetic Functions

	--FLOOR Function
		The FLOOR function rounds a number to the nearest integer below its current value.
		
		FLOOR(number)
		SELECT FLOOR(2.3);
		
	--CEIL Function
		The CEIL function rounds a number to the nearest integer above its current value.
		
		CEIL(number)
		SELECT CEIL(-2.7);
		
	--ROUND Function
		The ROUND function rounds a number to the specified number of decimal places.
		
		ROUND(number, decimal_places)
		SELECT ROUND(2.345, 2);
		SELECT ROUND(2.345, 1);
		
***String Functions

		SQL Function					Behavior
		
			UPPER()				Converts a string to upper case
			LOWER()				Converts a string to lowercase
			
	SELECT
	  name
	FROM
	  movie
	WHERE
	  UPPER(name) LIKE UPPER("%avengers%");
	  
***Case Clause
	
	--Similar to the switch case / if-else conditions
	--We can use CASE in various clauses like SELECT, WHERE, HAVING, ORDER BY and GROUP BY.
	
	SELECT c1, c2,
	CASE
		WHEN condition1 THEN value1
		WHEN condition2 THEN value2
		...
		ELSE value
	END AS cn
	FROM table;
	
	SELECT id, name, (collection_in_cr - budget_in_cr) as profit,
	  CASE
		WHEN (collection_in_cr - budget_in_cr) <= 100 THEN (collection_in_cr - budget_in_cr) * 0.1
		WHEN (collection_in_cr - budget_in_cr > 100
			AND collection_in_cr - budget_in_cr <= 500) THEN (collection_in_cr - budget_in_cr) * 0.15
		ELSE (collection_in_cr - budget_in_cr) * 0.18
	  END AS tax_amount
	FROM
	  movie;
	  
	  
	**Case with Aggregates
	
		SELECT
		  COUNT(
			CASE
			  WHEN rating >= 8 THEN 1
			END
		  ) AS above_eight,
		  COUNT(
			CASE
			  WHEN rating < 8 THEN 1
			END
		  ) AS below_eight
		FROM
		  movie
		WHERE
		  CAST(strftime("%Y", release_date) AS INTEGER) BETWEEN 2015 AND 2020;
		  
		  
***SET Operations

	--SQL Set operation is used to combine the two or more SQL queries.
	
	1.Intersect==in both
	2.Minus==present in A not in B
	3.Union==Unique present in either A or B
	4.Union All==Does not eliminate duplicate results 
	
	Rules :- Each SELECT statement must have the same number of columns.
			 The columns must have similar data types.
			 The columns in each SELECT statement must be in the same order.
	
	Syntax :- 
			SELECT
				c1, c2
			FROM
				table_name_1
			SET_OPERATOR
			SELECT
				c1, c2
			FROM
				table_name_2;
	
	SELECT
	  actor_id
	FROM
	  cast
	WHERE
	  movie_id = 6
	INTERSECT
	SELECT
	  actor_id
	FROM
	  cast
	WHERE
	  movie_id = 15;
	  
	**Except
		SELECT
		  actor_id
		FROM
		  cast
		WHERE
		  movie_id = 6		
		EXCEPT
		SELECT
		  actor_id
		FROM
		  cast
		WHERE
		  movie_id = 15;
		  
	**ORDER BY Clause in Set Operations
	
		SELECT
		  actor_id
		FROM
		  cast
		WHERE
		  movie_id = 6
		UNION
		SELECT
		  actor_id
		FROM
		  cast
		WHERE
		  movie_id = 15
		ORDER BY
		  1 DESC;
	**Pagination in Set Operations
		
		SELECT
		  actor_id
		FROM
		  cast
		WHERE
		  movie_id = 6
		UNION
		SELECT
		  actor_id
		FROM
		  cast
		WHERE
		  movie_id = 15
		ORDER BY
		  1 DESC
		LIMIT
		  5;
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
		  
***Entity Relationship Model (ER Model)

	**Entity
		Real world objects/concepts are called entities in ER Model.
	**Attributes of an Entity
		Properties of real world objects/concepts are represented as attributes of an entity in ER model.
	**Key Attribute
		The attribute that uniquely identifies each entity is called key attribute.
	**Entity Type
		Entity Type is a collection of entities that have the same attributes (not values).
	**Relationships
		Association among the entities is called a relationship.
		Types of Relationships :-
			One-to-One Relationship == An entity is related to only one entity, and vice versa.
			One-to-Many or Many-to-One Relationship == n entity is related to many other entities.
			Many-to-Many Relationship == Multiple entities are related to multiple entities.
	**Cardinality Ratio
		Cardinality in DBMS defines the maximum number of times an instance in one entity can relate to instances of another entity.
			One-to-one(1:1)
			one-to-many(1:m)
			many-to-one(m:1)
			many-to-many(m:n)
			
	**Participation Constraints
		Participation Constraints define whether the existence of an entity depends on its association with another entity through a relationship.
		It specifies the minimum number of times an entity instance must participate in a relationship.
			Two Types :-
				1. Total Participation (Mandatory)
					Every entity instance must participate in the relationship. It is represented by a double line in the ER diagram.
					Example:
						Every employee must work for a department. So, the Employee entity has total participation in the "Works For" relationship.
				2. Partial Participation (Optional)
					Not all entity instances are required to participate in the relationship. It is represented by a single line in the ER diagram.
					Example:
						Not every employee manages a department. So, the Employee entity has partial participation in the "Manages" relationship.
						
	Note: Cardinality Ratio and Participation Constraints together are known as the Structural Constraints of a relationship in the ER Model.
	
	**Entity type to tables
		Entity Types   ---> Tables
		Attributes     ---> Columns
		Key Attribute ---> Primary Key
		
	**Primary Key
		CREATE TABLE table_name (
			c1 t1 NOT NULL PRIMARY KEY, 
		...
			cn tn, 
		);
	**Foreign Key
		CREATE TABLE table2(
		  c1 t1 NOT NULL PRIMARY KEY,
		  c2 t2,
		  FOREIGN KEY(c2) REFERENCES table1(c3) ON DELETE CASCADE
		);
	
					--ON DELETE CASCADE == Ensure that if a row intable1is deleted, then all its related rows intable2will also be deleted.
					--To enable foreign key constraints in SQLite, usePRAGMA foreign_keys = ON; By default it is enabled in our platform!
					
	**Relational databases creating
	
	-- customer table
	-- CREATE TABLE customer(
	--   id integer NOT NULL PRIMARY KEY,
	--   name varchar(250),
	--   age int
	-- );
	-- pragma table_info(customer);
	-- product table
	-- CREATE TABLE product(
	--   id integer NOT NULL PRIMARY KEY,
	--   name varchar(250),
	--   price int,
	--   brand varchar(250),
	--   category varchar(250)
	-- );
	-- pragma table_info(product);
	-- address table
	-- CREATE TABLE address(
	--   id integer NOT NULL PRIMARY KEY,
	--   pin_code integer,
	--   door_no varchar(250),
	--   city varchar(250),
	--   customer_id integer,
	--   FOREIGN KEY (customer_id) REFERENCES customer(id) ON DELETE CASCADE
	-- );
	-- pragma table_info(address);
	-- cart table
	-- CREATE TABLE cart(
	--   id integer NOT NULL PRIMARY KEY,
	--   customer_id integer NOT NULL UNIQUE,
	--   total_price integer,
	--   FOREIGN KEY(customer_id) REFERENCES customer(id) ON DELETE CASCADE
	-- );
	-- pragma table_info(cart);
	-- table cart_product
	-- CREATE TABLE cart_product(
	--   id integer NOT NULL PRIMARY KEY,
	--   cart_id integer,
	--   product_id integer,
	--   quantity integer,
	--   FOREIGN KEY (cart_id) REFERENCES cart(id) ON DELETE CASCADE,
	--   FOREIGN KEY (product_id) REFERENCES product(id) ON DELETE CASCADE
	-- );
	-- pragma table_info(cart_product);
	-- inserting into customer table
	-- INSERT INTO
	--   customer(id, name, age)
	-- VALUES
	--   (1, 'John', 29),
	--   (2, 'Emma', 24);
	-- inserting into address table
	-- INSERT INTO
	--   address(id, pin_code, door_no, city, customer_id)
	-- VALUES
	--   (1001, 517130, '6-1', 'Hyderabad', 1),
	--   (1002, 615670, '6-13', 'Bengaluru', 1);
	-- inserting into cart table
	-- INSERT INTO
	--   cart(id, total_price, customer_id)
	-- VALUES
	--   (1, 12000, 1),
	--   (2, 500, 2);
	-- inserting into product table
	-- INSERT INTO
	--   product(id, name, price, brand, category)
	-- VALUES
	--   (1, 'Jeans', 1500, 'Pepe', 'Clothing'),
	--   (2, 'T-shirt', 500, 'Puma', 'Clothing'),
	--   (3, 'Mobile', 10000, 'Redmi', 'Gadgets'),
	--   (4, 'Watch', 2000, 'Titan', 'Gadgets');
	-- inserting into cart_product table
	-- INSERT INTO
	--   cart_product(id, cart_id, product_id, quantity)
	-- VALUES
	--   (1, 1, 1, 1),
	--   (2, 1, 2, 1),
	--   (3, 1, 3, 1),
	--   (4, 2, 1, 1);
	-- 1. One-to-Many Relationships....Retrieve all the addresses for John
	-- SELECT
	--   *
	-- FROM
	--   customer
	--   JOIN address ON customer.id = address.customer_id
	-- WHERE
	--   customer.name = "John";
	-- 2. One-to-One Relationships....Retrieve the cart details for John
	-- SELECT
	--   *
	-- FROM
	--   customer
	--   JOIN cart ON customer.id = cart.customer_id
	-- WHERE
	--   customer.name = "John";
	-- 3. Many-to-Many Relationships....Retrieve all the products in John's cartwhere (customer_id = 1).
	-- SELECT
	--   *
	-- FROM
	--   cart
	--   JOIN cart_product ON cart.id = cart_product.cart_id
	--   JOIN product ON product.id = cart_product.product_id
	-- WHERE
	--   cart.customer_id = 1;
	
***JOINS
	**Natural Join
		..NATURAL JOINcombines the tables based on the common columns.
		
		--SELECT course.name,
		  instructor.full_name
		FROM course
		  NATURAL JOIN instructor
		WHERE instructor.full_name = "Alex";
		
		--Natural join on multiple tables
			SELECT
			  review.course_id,
			  review.content,
			  review.created_at,
			  student_course.score
			FROM
			  review NATURAL
			  JOIN student_course
			WHERE
			  student_course.score > 70;
			  
	**Inner Join
		..INNER JOIN combines rows from both the tables if they meet a specified condition.
		
		--SELECT student.full_name,
		   review.content,
		   review.created_at
		FROM student
		   INNER JOIN review 
		ON student.id = review.student_id
		WHERE review.course_id = 15;
		
	**Left Join
		..InLEFT JOIN, for each row in the left table, matched rows from the right table are combined. 
		If there is no match, NULL values are assigned to the right half of the rows in the temporary table.
		
		--SELECT student.full_name
		FROM student
		   LEFT JOIN student_course
		ON student.id = student_course.student_id
		WHERE student_course.id IS NULL;
		
	**Joins on Multiple Tables
		--Fetch all the students who enrolled for the courses taught by the instructor “Arun” (id = 102)
			---SELECT T.name AS course_name,
			   student.full_name
			FROM (course
			   INNER JOIN student_course
			ON course.id = student_course.course_id) AS T
			   INNER JOIN student
			ON T.student_id = student.id
			WHERE course.instructor_id = 102;
		
		--Using joins with other clauses
			---We can applyWHERE,ORDER BY,HAVING,GROUP BY,LIMIT,OFFSETand other clauses 
			(which are used for retrieving data tables) on the temporary joined table as well.
		
			---SELECT student.full_name
			FROM (course
			   INNER JOIN student_course
			ON course.id = student_course.course_id) AS T
			   INNER JOIN student
			ON T.student_id = student.id
			WHERE course.name = "Machine Learning"
			ORDER BY student_course.score DESC
			LIMIT 1;
		--Using joins with aggregations
			---We can apply aggregate functions such as SUM, AVG, COUNT, MAX, MIN and others to perform calculations on the temporary joined table as well.
			
			---SELECT
			  course.name AS course_name,
			  MAX(score) AS highest_score
			FROM
			  course
			  LEFT JOIN student_course 
			ON course.id = student_course.course_id
			GROUP BY
			  course.id;
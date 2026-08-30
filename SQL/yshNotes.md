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

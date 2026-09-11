CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
set N=N-1;
  RETURN (
      select max(salary) from(select distinct salary from employee
      order by salary desc limit 1 offset N)as la

  );
END
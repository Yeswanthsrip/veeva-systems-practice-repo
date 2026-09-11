select Employee.name,
	   bonus
	   from Employee left join Bonus on Employee.empId=Bonus.empId
    	where bonus<1000
			or Employee.empId not in (select Bonus.empId from Bonus);
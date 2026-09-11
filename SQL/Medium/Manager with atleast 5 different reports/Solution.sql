select name from (
    select name,row_number() over(order by id desc) as rn from Employee
)t where rn>5;
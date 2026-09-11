select id from (
    select id,recordDate,temperature,
    lag(recordDate) over(order by recordDate) as prev_date,
    lag(temperature) over(order by recordDate) as prev_temp from weather) as t 
    where DATEDIFF(recordDate,prev_date)=1 and 
    temperature>prev_temp;
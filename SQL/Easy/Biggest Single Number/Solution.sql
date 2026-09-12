select max(num) as num from (
    select num,count(*) as count_num 
    from mynumbers 
    group by num 
    order by num desc
) t
where count_num=1;
select name,
    sum(case   
        when users.id not in (
            select user_id from rides
        ) then 0
        else distance
    end) as travelled_distance
from users left join rides 
    on users.id=rides.user_id
group by users.id
order by travelled_distance desc,name;
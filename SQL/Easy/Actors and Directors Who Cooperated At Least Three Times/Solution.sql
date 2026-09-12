select actor_id,director_id from(
    select actor_id,director_id,
        count(*) over(partition by actor_id,director_id)as count_ad
        from actordirector
) t
    where count_ad>2
    group by actor_id,director_id;
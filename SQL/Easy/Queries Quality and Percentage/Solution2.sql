select query_name,
    round(quality,2) as quality,
    round(100*poor_query_percentage,2) as poor_query_percentage
    from (
        select query_name,
            avg(rating/position) over(partition by query_name) as quality,
            sum(
                case
                    when rating<3 then 1
                    else 0
                end
            ) over (partition by query_name)
            /count(*) over (partition by query_name) as poor_query_percentage
        from queries
    ) t
    group by query_name;
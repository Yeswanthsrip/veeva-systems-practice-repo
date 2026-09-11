select customer_number
    from (
        select customer_number,
        count(*) as count_cn,
        max(count(*)) over() as max_count
        from orders
        group by customer_number
    ) t
    where count_cn = max_count;
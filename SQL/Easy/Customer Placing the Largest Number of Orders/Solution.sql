select distinct customer_number
    from (
        select customer_number,count(customer_number) 
        over(partition by customer_number) as count_cn
        from orders
    ) t
    where count_cn =(
        select max(count_cn)
            from (
                SELECT
                    COUNT(customer_number) OVER (
                        PARTITION BY customer_number
                    ) AS count_cn
                FROM orders
            ) tt
    );
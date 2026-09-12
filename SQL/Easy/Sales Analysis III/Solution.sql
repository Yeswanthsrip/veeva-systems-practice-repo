select product_id,
       product_name 
    from (
        select product.product_id,
               product_name,
               sale_date
        from product join sales on 
        product.product_id=sales.product_id
    ) t 
    group by product_id,product_name
    having min(sale_date)>='2019-01-01' and max(sale_date)<='2019-03-31';
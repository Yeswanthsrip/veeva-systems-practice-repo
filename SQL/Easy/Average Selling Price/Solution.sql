select  prices.product_id,
    round(coalesce(sum(price*units)/sum(units),0),2) as average_price
    from prices left join unitsSold on prices.product_id=unitsSold.product_id
    and purchase_date between start_date and end_date
    group by prices.product_id;
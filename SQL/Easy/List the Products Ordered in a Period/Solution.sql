select product_name,
    sum(unit) as unit
from products join orders
    on products.product_id=orders.product_id
    and order_date>="2020-02-01" and order_date<="2020-02-29"
group by product_name
having unit>=100;
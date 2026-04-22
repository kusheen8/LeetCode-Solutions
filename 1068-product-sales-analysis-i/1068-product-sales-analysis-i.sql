# Write your MySQL query statement below
Select p.Product_name,s.year,s.price
FROM Sales as s inner join product as p
ON s.product_id = p.product_id;
# Write your MySQL query statement below
select sell_date, count(distinct product) as num_sold, GROUP_CONCAT(distinct product) as products
from Activities
GROUP BY sell_date;
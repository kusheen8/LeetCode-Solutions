# Write your MySQL query statement below
Select query_name, ROUND(AVG(rating/position),2) as quality,
round(sum(case when rating <3 THEN 1 ELSE 0 END) / COUNT(*) * 100, 2) AS poor_query_percentage
from queries
where query_name is not null
group by query_name;
# Write your MySQL query statement below
SELECT person_name
FROM(
    Select person_name,sum(weight) over (order by turn) as total_weight
    from queue
) t
WHERE total_weight <=1000
ORDER by total_weight desc
limit 1;
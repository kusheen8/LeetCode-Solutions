# Write your MySQL query statement below
Select *
FROM Cinema as c
WHERE (c.id % 2 !=0)
AND c.description != 'boring'
ORDER BY c.rating DESC;
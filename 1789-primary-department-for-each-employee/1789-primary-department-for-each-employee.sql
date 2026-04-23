# Write your MySQL query statement below
SELECT employee_id,department_id
FROM Employee where primary_flag = 'Y'
union
Select employee_id,department_id
FROM Employee group by 1
Having count(*) = 1;
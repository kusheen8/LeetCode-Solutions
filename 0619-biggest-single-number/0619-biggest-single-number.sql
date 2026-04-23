# Write your MySQL query statement below
Select max(num) as num
FROM MyNumbers
WHERE num in(
    select num
    FROM MyNumbers
    GROUP BY num
    Having Count(*) = 1
);
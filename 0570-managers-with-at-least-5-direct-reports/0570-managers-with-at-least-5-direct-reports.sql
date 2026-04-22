# Write your MySQL query statement below
Select e1.name
FROM Employee as e1
Left join Employee as e2
ON e1.id = e2.managerId
GROUP BY e2.managerId
Having count(e2.managerId) >= 5;
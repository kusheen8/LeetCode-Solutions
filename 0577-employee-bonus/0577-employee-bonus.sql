# Write your MySQL query statement below
Select e.name,b.bonus
FROM Employee as e
Left Join Bonus as b
ON e.empId = b.empID
WHERE bonus < 1000 or bonus is null;
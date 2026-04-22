# Write your MySQL query statement below
Select  unique_id,name
From Employees AS e Left join EmployeeUNI as emp
ON e.id=emp.id;
# Write your MySQL query statement below
Select v.customer_id ,count(v.visit_id)  as count_no_trans
From Visits as v
LEFT join Transactions as t
ON t.visit_id = v.visit_id
where t.transaction_id is NULL
Group by v.customer_id;

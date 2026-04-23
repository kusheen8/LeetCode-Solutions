# Write your MySQL query statement below
Select activity_date AS day, COUNT(DISTINCT user_id) AS active_users
FROM Activity
Where (activity_date > "2019-06-27" AND activity_date <= "2019-07-27")
GROUP BY activity_date;
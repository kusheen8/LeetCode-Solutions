# Write your MySQL query statement below
Select distinct a.user_id , round(IFNULL(AVG(action ='confirmed'),0),2) As confirmation_rate
FROM Signups as a
Left Join Confirmations as b on a.user_id = b.user_id
GROUP BY a.user_id;
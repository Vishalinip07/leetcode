-- Last updated: 19/07/2026, 21:07:10
# Write your MySQL query statement below
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(*)>1;
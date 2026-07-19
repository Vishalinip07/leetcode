-- Last updated: 19/07/2026, 21:05:23
# Write your MySQL query statement below
SELECT name
FROM Customer
WHERE referee_id <> 2
   OR referee_id IS NULL;
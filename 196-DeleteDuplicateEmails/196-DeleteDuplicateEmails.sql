-- Last updated: 19/07/2026, 21:07:03
# Write your MySQL query statement below
DELETE p1 FROM Person p1
JOIN Person p2 
ON p1.email = p2.email AND p1.id > p2.id;
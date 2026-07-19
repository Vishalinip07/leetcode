-- Last updated: 19/07/2026, 21:05:20
# Write your MySQL query statement below
SELECT name, population, area
FROM World
WHERE area >= 3000000 OR population >= 25000000;
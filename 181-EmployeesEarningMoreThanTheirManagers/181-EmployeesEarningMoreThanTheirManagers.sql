-- Last updated: 19/07/2026, 21:07:11
# Write your MySQL query statement below
SELECT e.name AS Employee
FROM Employee e
JOIN Employee m
ON e.managerId=m.id
WHERE e.salary>m.salary;
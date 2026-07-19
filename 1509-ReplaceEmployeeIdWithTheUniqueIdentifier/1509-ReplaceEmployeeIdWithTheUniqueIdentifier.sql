-- Last updated: 19/07/2026, 21:04:27
# Write your MySQL query statement below
SELECT EM.unique_id,E.name FROM EMPLOYEES E LEFT JOIN EMPLOYEEUNI EM ON E.ID=EM.ID
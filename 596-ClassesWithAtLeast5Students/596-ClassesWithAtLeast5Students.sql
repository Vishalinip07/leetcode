-- Last updated: 19/07/2026, 21:05:19
# Write your MySQL query statement below
select Class
from Courses group by Class having count(student)>=5;
-- Last updated: 19/07/2026, 21:07:19
# Write your MySQL query statement below
SELECT Person.firstName,
       Person.lastName,
       Address.city,
       Address.state
FROM Person
LEFT JOIN
Address ON Person.personId=Address.personId

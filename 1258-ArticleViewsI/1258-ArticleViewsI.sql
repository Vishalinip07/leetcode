-- Last updated: 19/07/2026, 21:04:40
# Write your MySQL query statement below

select distinct author_id as id from Views
where author_id = viewer_id 
order by id;
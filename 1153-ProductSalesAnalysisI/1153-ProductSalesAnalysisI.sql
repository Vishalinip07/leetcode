-- Last updated: 19/07/2026, 21:04:46
# Write your MySQL query statement below
SELECT product_name, year,  price
FROM Sales
LEFT JOIN Product
ON Sales.product_id = Product.product_id;
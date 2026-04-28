# Write your MySQL query statement below
SELECT product_name, year, price FROM Sales sal
LEFT JOIN Product pro
ON pro.product_id = sal.product_id
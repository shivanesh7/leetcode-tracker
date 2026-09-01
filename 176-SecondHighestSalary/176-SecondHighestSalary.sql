-- Last updated: 9/1/2026, 4:21:36 PM
# Write your MySQL query statement below
SELECT
    (SELECT DISTINCT salary
     FROM Employee
     ORDER BY salary DESC
     LIMIT 1 OFFSET 1)AS SecondHighestSalary
    

    
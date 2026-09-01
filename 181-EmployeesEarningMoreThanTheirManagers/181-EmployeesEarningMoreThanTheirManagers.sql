-- Last updated: 9/1/2026, 4:21:31 PM
SELECT e1.Name AS Employee
FROM Employee e1
JOIN Employee e2
ON e1.ManagerId = e2.Id
WHERE e1.Salary > e2.Salary;
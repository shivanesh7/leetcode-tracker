-- Last updated: 9/1/2026, 4:21:29 PM
SELECT Email
FROM Person
GROUP BY Email
HAVING COUNT(Email) > 1;
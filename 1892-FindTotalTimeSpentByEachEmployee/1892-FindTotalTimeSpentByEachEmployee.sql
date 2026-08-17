-- Last updated: 8/17/2026, 2:48:00 PM
SELECT event_day AS day,emp_id,SUM(out_time-in_time)AS total_time
FROM Employees
GROUP by emp_id,event_day;

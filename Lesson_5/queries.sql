SELECT * 
	FROM jaegers;

SELECT * 
	FROM jaegers 
	WHERE status = 'active';

SELECT * 
	FROM jaegers
	WHERE mark = 3 
	OR mark = 5;

SELECT * 
	FROM jaegers 
	ORDER BY mark DESC;

SELECT modelName 
		FROM jaegers
		WHERE launch = (SELECT MIN(launch) FROM jaegers);

SELECT modelName 
		FROM jaegers
		WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM jaegers);

SELECT AVG(weight) 
	FROM jaegers;

UPDATE jaegers 
	SET kaijuKill = kaijuKill + 1 
	WHERE status = 'active';

DELETE 
	FROM jaegers 
	WHERE status = 'Destroyed';
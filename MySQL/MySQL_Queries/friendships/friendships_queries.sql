/*START*/
SELECT * FROM users 
LEFT JOIN friendships ON users.id=friendships.user_id 
LEFT JOIN users as friend ON friendships.friend_id = friend.id;
/*1*/
SELECT CONCAT(f.first_name," ",f.last_name) AS "Nombre", CONCAT(u.first_name," ",u.last_name) AS "Amigos"
FROM users AS u 
RIGHT JOIN friendships AS fs ON u.id = fs.user_id 
RIGHT JOIN users AS f ON fs.friend_id = f.id
WHERE f.id = 4;
/*2*/
SELECT COUNT(fs.id) AS AMISTADES_REGISTRADAS from friendships AS fs;
/*3*/
SELECT u.id AS id, CONCAT(u.first_name," ",u.last_name) AS Nombre, 
(SELECT COUNT(fs.user_id) WHERE fs.user_id = u.id) AS Amigos from users AS u JOIN friendships AS fs ON u.id = fs.user_id GROUP BY u.id ORDER BY Amigos DESC;
/*4*/
INSERT INTO `users` VALUES (6,'Dred','Gen',now(),NULL);
INSERT INTO `friendships` VALUES (7,6,2,now(),NULL), (8,6,4,now(),NULL), (9,6,5,now(),NULL);
/*5*/
(SELECT CONCAT(u.first_name," ",u.last_name) AS Nombre, CONCAT(f.first_name," ",f.last_name) AS Nombre_Amigos 
FROM users AS u JOIN friendships AS fs on u.id = fs.user_id 
JOIN users AS f ON fs.friend_id = f.id WHERE u.id = 2)
UNION
(SELECT CONCAT(f.first_name," ",f.last_name) AS Nombre, CONCAT(u.first_name," ",u.last_name) AS Nombre_Amigos 
FROM users AS u JOIN friendships AS fs on u.id = fs.user_id 
JOIN users AS f ON fs.friend_id = f.id WHERE f.id = 2) 
ORDER BY Nombre_Amigos;
/*6*/
DELETE FROM friendships WHERE user_id = 2 AND friend_id = 5;
/*7*/
SELECT CONCAT(f.first_name," ",f.last_name) AS "Nombre", CONCAT(u.first_name," ",u.last_name) AS "Amigos"
FROM users AS u 
JOIN friendships AS fs ON u.id = fs.user_id 
JOIN users AS f ON fs.friend_id = f.id;
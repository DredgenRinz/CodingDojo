/*1*/
SELECT SUM(amount) AS Ganancias_Marzo FROM billing WHERE charged_datetime BETWEEN "2012/03/01 00:00:00" AND "2012/03/31 23:59:59";
/*2*/
SELECT CONCAT(c.first_name," ",c.last_name) AS Nombre, SUM(b.amount) AS Recaudacion_cliente FROM clients AS c JOIN billing AS b ON c.client_id = b.client_id WHERE b.client_id = 2;
/*3*/
SELECT CONCAT(c.first_name," ",c.last_name) AS Nombre, s.domain_name AS Sitio FROM clients as c JOIN sites AS s ON c.client_id = s.client_id WHERE c.client_id = 10;
/*4*/
SELECT CONCAT(c.first_name," ",c.last_name) AS Nombre, COUNT(s.site_id) AS Sitio, date_format(s.created_datetime,"%Y %M") AS Fecha
FROM clients AS c JOIN sites AS s ON c.client_id = s.client_id WHERE c.client_id = 1 GROUP BY s.created_datetime ORDER BY Fecha;
SELECT CONCAT(c.first_name," ",c.last_name) AS Nombre, COUNT(s.site_id) AS Sitio, date_format(s.created_datetime,"%Y %M") AS Fecha
FROM clients AS c JOIN sites AS s ON c.client_id = s.client_id WHERE c.client_id = 20 GROUP BY s.created_datetime ORDER BY Fecha;
/*5*/
SELECT s.domain_name AS Nombre_Sitio, count(l.site_id) AS Clientes FROM sites AS s JOIN leads AS l ON s.site_id = l.site_id
WHERE l.registered_datetime BETWEEN  "2011-01-01" AND "2011-02-15" GROUP BY l.site_id; 
/*6*/
SELECT CONCAT(c.first_name," ",c.last_name) AS Nombre, COUNT(l.leads_id) AS clientes_potenciales FROM clients AS c JOIN sites as s ON c.client_id = s.client_id JOIN leads AS l ON s.site_id = l.site_id 
WHERE l.registered_datetime BETWEEN "2011-01-01" AND "2011-12-31" GROUP BY Nombre;
/*7*/
SELECT CONCAT(c.first_name," ",c.last_name) AS Nombre, COUNT(l.leads_id) AS clientes_potenciales, month(l.registered_datetime) AS Mes FROM clients AS c JOIN sites as s ON c.client_id = s.client_id JOIN leads AS l ON s.site_id = l.site_id 
WHERE l.registered_datetime BETWEEN "2011-01-01" AND "2011-6-31" GROUP BY Nombre, Mes ORDER BY Mes ASC;
/*8*/
SELECT CONCAT(c.first_name," ",c.last_name) AS Nombre,s.domain_name AS Nombre_Sitio, COUNT(l.leads_id) AS clientes_potenciales FROM clients AS c JOIN sites as s ON c.client_id = s.client_id JOIN leads AS l ON s.site_id = l.site_id 
WHERE l.registered_datetime BETWEEN "2011-01-01" AND "2011-12-31" GROUP BY Nombre, Nombre_Sitio ORDER BY Nombre ASC;
SELECT CONCAT(c.first_name," ",c.last_name) AS Nombre,s.domain_name AS Nombre_Sitio, COUNT(l.leads_id) AS clientes_potenciales FROM clients AS c JOIN sites as s ON c.client_id = s.client_id JOIN leads AS l ON s.site_id = l.site_id 
GROUP BY Nombre, Nombre_Sitio ORDER BY Nombre ASC;
/*9*/
SELECT c.client_id AS ID, CONCAT(c.first_name," ",c.last_name) AS Nombre, SUM(b.amount) AS Recaudación, MONTH(b.charged_datetime) AS Mes, YEAR(b.charged_datetime) AS año FROM clients AS c JOIN billing AS b ON c.client_id = b.client_id
GROUP BY ID, Mes, Año ORDER BY Año, Mes;
/*10*/
SELECT CONCAT(c.first_name," ",c.last_name) AS Nombre, GROUP_CONCAT(s.domain_name SEPARATOR ' / ' ) AS Sitios FROM clients AS c JOIN sites AS s ON c.client_id = s.client_id GROUP BY Nombre;
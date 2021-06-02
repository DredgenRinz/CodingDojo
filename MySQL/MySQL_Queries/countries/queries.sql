use world;
/*1*/
select c.name, l.language, l.percentage from countries as c join languages as l on c.id = l.country_id where l.language = "Slovene" order by l.percentage desc;
/*2*/
select c.name as Pais, count(ci.id) as Ciudades from countries as c join cities as ci on c.id = ci.country_id group by c.name order by Ciudades desc;
/*3*/
select co.name as Pais, ci.name as Ciudad, ci.population as Poblacion from countries as co join cities as ci on co.id = ci.country_id where co.name = "Mexico" AND ci.population >= 500000 order by ci.population desc;
/*4*/
select c.name as Pais, i.language as Lenguaje, i.percentage as Porcentaje from countries as c join languages as i on c.id = i.country_id where i.percentage > 89 order by i.percentage desc; 
/*5*/
select c.name as Pais, c.surface_area as Superficie, c.population as Poblacion from countries as c where surface_area < 501.0 AND c.population > 100000 order by c.name;
/*6*/
select c.name as Pais, c.government_form as Tipo_de_Gobernacion, c.capital as capital, c.life_expectancy as Espectativas_de_vida from countries as c where c.government_form = "Constitutional Monarchy" AND c.capital > 200 AND c.life_expectancy > 75;
/*7*/
select c.name as Pais, ci.name as Ciudad, ci.district as Distrito, ci.population as Poblacion from countries as c join cities as ci  on c.id = ci.country_id where c.name = "Argentina" AND ci.district = "Buenos Aires" AND ci.population > 500000 order by Poblacion desc;
/*8*/
select region as Regiones, COUNT(name) as Paises from countries group by region order by Paises desc;
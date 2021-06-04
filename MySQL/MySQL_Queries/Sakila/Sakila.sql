use sakila;
/*1*/
select c.first_name as Nombre, c.last_name as Apellido, c.email as Correo, a.address as Direccion, ci.city as Ciudad from customer as c join address as a on c.address_id = a.address_id join city as ci on a.city_id = ci.city_id where ci.city_id = 312;
/*2*/
select f.title as Titulo, f.description as Descripcion, f.release_year as Año_lanzamiento, f.rating as Calificacion, f.special_features as Caracteristicas_especiales, cat.name as Genero from film as f join film_category as fc on f.film_id = fc.film_id join category as cat on fc.category_id = cat.category_id where cat.name = "Comedy";
/*3*/
select a.actor_id as Identificacion, CONCAT(first_name," ", last_name) as Nombre_Actor, f.title as Titulo, f.description as Descripcion, f.release_year as Año_lanzamiento from actor as a join film_actor as fa on a.actor_id = fa.actor_id join film as f on fa.film_id = f.film_id where a.actor_id = 5;
/*4*/
select c.first_name as Nombre, c.last_name as Apellido, c.email as Correo, a.address as Direccion from customer as c join store on c.store_id = store.store_id join address as a on store.address_id = a.address_id join city on a.address_id = city.city_id where city.city_id in (1, 42, 312, 459) AND store.store_id = 1;
/*5*/
select f.title as Titulo, f.description as Descripcion, f.release_year as Año_lanzamiento, f.rating as Calificacion, f.special_features as Caracteristicas_especiales from film as f join film_actor on f.film_id = film_actor.film_id join actor on film_actor.actor_id = actor.actor_id where actor.actor_id = 15 AND f.special_features LIKE '%Behind the Scenes%' AND f.rating = "G"; 
/*6*/
select f.film_id as ID, f.title as Titulo, a.actor_id as "ID Actor/Actriz", CONCAT(a.first_name, " ", a.last_name)as "Nombre" from film as f join film_actor on f.film_id = film_actor.film_id join actor as a on film_actor.actor_id = a.actor_id where f.film_id = 369;
/*7*/
select f.title as Titulo, f.description as Descripcion, f.release_year as Año_lanzamiento, f.rating as Calificacion, f.special_features as Caracteristicas_especiales, cat.name as Genero from film as f join film_category as fc on f.film_id = fc.film_id join category as cat on fc.category_id = cat.category_id where cat.name = "Drama" AND f.rental_rate = 2.99;
/*8*/
select CONCAT(a.first_name, " ", a.last_name) as Nombre, f.title as Titulo, f.description as Descripcion, f.release_year as Año_lanzamiento, f.rating as Calificacion, f.special_features as Caracteristicas_especiales, cat.name as Genero from (film as f join film_category as fc on f.film_id = fc.film_id join category as cat on fc.category_id = cat.category_id) join film_actor on f.film_id = film_actor.film_id join actor as a on film_actor.actor_id = a.actor_id where cat.name LIKE "%Action%" AND a.actor_id = 23;
--Datos para carga inicial de la base de datos

--Para giis.demo.tkrun:

delete from articulo;
delete from pedido;
delete from articuloPedido;
delete from contenedor;

INSERT INTO articulo(idArticulo,volumen,nombre,categoria) VALUES
(210,3,"coca cola","no perecedero"),   /* b) En la tabla árticulos se carguen más registros para que la tabla me quede como sigue*/
(211,4,"carne de ternera","perecedero");
(212,5,"manzana golden","perecedero"),
(213,9,"toallitas bebe","no perecedero");
(259,5,"mayonesa musa","no perecedero"),
(260,9,"agua font vella","no perecedero");

INSERT INTO pedido(numArticulos) VALUES /* c) En la tabla de pedidos solamente aparezcan los siguientes registros*/
(6),
(5),
(9),
(2),
(12),
(84);

INSERT INTO articuloPedido(idArticulo,idPedido,volumen,embolsado) VALUES
(25,1,6,1),
(28,1,3,1),
(63,1,8,1);


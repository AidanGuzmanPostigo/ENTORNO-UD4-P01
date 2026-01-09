# Unidad 4 Entorno de Desarrollo Practica 1 - Realizado por Aidan Guzmán Postigo 1ºDAM

## 1 - ¿Qué tipo de relación se define en el diagrama UML entre Pedido y Producto?

Según el diagrama, la relación entre ambas clases es una composición en la que pedido es el todo y producto la parte, es decir, un producto se compone de productos (según el diagrama 0 o muchos, por eso el *) y sin un pedido los productos no existirían además de solo poder pertenecer a un pedido (por eso el 1). 

## 2 - ¿Qué significa la cardinalidad indicada en esa relación?

El 1 representa que los productos pertenecen obligatoriamente y de manera exclusiva a un pedido y el 0..* representa que un pedido está compuesto por mínimo 0 y máximo un número indeterminado de productos.

## 3 - ¿Qué otros tipos de cardinalidad se pueden definir en UML? Investiga y explica al menos tres ejemplos distintos.

- 0..1: Significa que mínimo es 0 y máximo 1.
- 1: Significa que exactamente es uno.
-  \* / 0...\* : Significa que mínimo es 0 y máximo un número indeterminado.
- 1..\*: Significa que mínimo es 1 y máximo muchos.
- n: Significa un número específico, como por ejemplo 2.
- 0..n: Mínimo 0 máximo un determinado número, por ejemplo 3.
- 1..n: Mínimo 1 máximo un determinado número, por ejemplo 5.
- n..m: Un rango específico, por ejemplo, mínimo 3 máximo 9.

## 4 - ¿Qué diferencias existen entre una asociación, una agregación y una composición?

Las asociaciones solo indican que una clase se relaciona con otra, pero no menciona nada sobre la propiedad, el ciclo de vida o que clase controla a la otra, ambas clases existen independientemente, por ejemplo un pedido tiene productos y un producto puede estar en varios paquetes o en ninguno.

Las agregaciones son un tipo de asociación "todo-parte débil" en la que las clases pueden existir independientemente a la vez que pueden compartirse, por ejemplo un equipo de futbol tiene varios jugadores pero ambas clases pueden existir independientemente.

Las composiciones son un tipo de relación "todo-parte fuerte" donde las clases no existen sin el todo y estas pertenecen a un único todo, por ejemplo, en el caso del programa la relación de Productos y Pedidos sería una composición ya que sin los pedidos los productos no existirían.

A pesar de todo lo anterior, es importante tener en cuenta que la relación entre dos clases dependerá en su mayoría de la lógica y el diseño que se le quiera aplicar, por ejemplo la relación entre pedidos y productos puede ser una composición o una asociación dependiendo de como sea la logística y el diseño que se quiera implementar.
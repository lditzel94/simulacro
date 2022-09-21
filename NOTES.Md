Objetivo
Realizar el diagrama UML y programar en Java (implementando los patrones que se requieran) el siguiente enunciado:

Enunciado
Se necesita desarrollar un sistema que permita gestionar el peso de las cargas que ingresan a los barcos. Existen dos tipos de carga, las simples y los contenedores.
Ambos tipos de carga tienen un nombre y una descripción. En las cargas simples hay que tener en cuenta el peso de la carga que llevan y si la carga necesita refrigeración o no y en los contenedores como son muy pesados hay que tener en cuenta el peso del contenedor.
Se necesitará desarrollar las siguientes funcionalidades:
Poder calcular el peso de una carga simple que es el peso de la carga excepto que si va refrigerado se le suma un 10% al peso.
Poder calcular el peso de un contenedor que consiste en la sumatoria de todas las cargas que este puede contener más el peso del propio contenedor.
Un barco deberá poder mostrar todas las cargas simples y contenedores que ingresaron indicando el nombre y peso de cada una.

Reproducir la siguiente situación en una clase Test que contenga el método main e invocar al método que muestra las cargas con sus pesos:
Carga simple: TV 32’ LCD que tiene un peso de 3 kg y no necesita refrigeración.
Carga simple: caja de medicamentos que tiene un peso de 2 kg y necesita refrigeración.
Contenedor: contiene las dos cargas simples anteriores y el peso del contenedor es de 100 kg con lo cual el peso total es de 105,2 kg.
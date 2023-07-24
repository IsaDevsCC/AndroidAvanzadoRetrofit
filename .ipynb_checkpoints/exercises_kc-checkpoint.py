"""

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

## (4)
Crea la función sum_mult_of_3:
* Recibe una lista de números
* Devuelve la suma de aquellos que son *múltiplos de 3*
#### DIVIDE & VENCERÁS
Resuelve primero el subproblema "saber si un número es múltiplo de 3", creando el predicado is_multiple_3. Recuerda el operador % para obtener el resto de una división.

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

## (5)
Crea la función count_str que recibe una lista y devuelve el número de cadenas que hay en ella.
Asegúrate de que funciona cuando:
* solo hay cadenas
* no hay ninguna cadena
* la lista de entrada es la vacía
1. ¿Se parece en algo a sum_mult_of_3?

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

## (6)
Crea la función max_value que recibe una lista y devuelve el mayor elemento de la misma.
* ¿Qué crees que debe de hacer si todos son iguales?
* ¿Qué crees que debe de devolver en caso de recibir la lista vacía?
"""

listOfThree = [2, 4, 5, 9, 7, 6]

def sum_mult_of_3(listOfThree) :

    result = map(filter(lambda i : i % 3 == 0, listOfThree))




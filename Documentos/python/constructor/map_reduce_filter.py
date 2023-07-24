# MAP : TRANSFORMA UNA SECUENCIA EN OTRA
# RECIBE UNA FUNCIÓN QUE TRANSFORMA CADA ELEMENTO
# UNA LISTA QUE SERÁ TRANSFORMADA

words = ["hola", "pienso", "luego", "existo"]

def toUpper(words : list) -> list :

    return list(map(lambda i : i.upper(), words))

print(toUpper(words))

print(list(map(lambda i : i.upper(), words)))



####  REDUCE    ###


from functools import reduce

nums = [1, 8, 8]

# SEGUN LA OPERACIÓN QUE SE DESEE REALIZAR, DESDE EL 'REDUCE' SE HA DE ESPECÍFICAR POR CUÁL VALOR INICIAL, EN ÉSTE CASO, DESDE EL '0' YA QUE ES UNA SUMA, PERO SE DEBERÁ DE PENSAR SI ES UNA MULTIPLICACIÓN, EL 0 NO ES UN ELEMENTO NEUTRO
total = reduce(lambda i, x : i + x, nums, 0)
print(total)

# EJEMPLO CON MULTIPLICACIÓN, CUYO VALOR INICIAL SERÁ EL 1 PUES EL 0 DARÍA ERROR
prod = reduce(lambda i, x : i * x, nums, 1)
print(prod)


####    FILTER  ###
"""
    - recibe secuencia y predicado.
    - devuelve una secuencia con los parametros que pasan la condicion a validar
"""
evens = filter(lambda i : i % 2 == 0, nums)
for evenNum in evens :
    print(evenNum)

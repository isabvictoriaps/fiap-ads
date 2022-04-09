
"""
Programa que realiza a fórmula de Bhaskara
"""
import math
#Pedindo os dados A, B e C
a = float(input("Digite o valor A da sua equação: "))
b = float(input("Digite o valor B da sua equação: "))
c = float(input("Digite o valor C da sua equação: "))

# Realizando a operação do delta
delta = (b * b) - 4 * (a * c) 

# Fazendo as validações
if delta> 0.0:
    #cálculo de dois valores para x
    x1 = (-b + math.sqrt(delta)) /(2 * a)
    x2 = (-b - math.sqrt(delta)) / (2* a)
    print("Para a equação {}x2 + {}x + {} = 0, obtivemos os seguintes valores: x1 = {} e x2 = {}".format(a,b,c,x1,x2))

else:
    if delta == 0:
        x=(-b + math.sqrt(delta)) / (2 * a)
        print("Para a equação {} x2 + {}x  + {} = 0, obtivemos o seguinte valor: x = {}".format(a,b,c,x))

    else: print("Para a equação {}x2 + {}x + {} = 0, não existem valores reais para x".format(a,b,c))
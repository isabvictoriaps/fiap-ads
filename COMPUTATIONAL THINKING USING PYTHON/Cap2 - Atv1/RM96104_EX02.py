
print ("Programa para verificar qual dia será o escolhido para a realização das lives.")

# Pedir ao usuário a quantidade de votos que cada um dos 5 dias da semana recebeu

segunda = int(input("Por favor, digite a quantidade de votos que segunda-feira recebeu: "))
terca = int(input("Por favor, digite a quantidade de votos que terça-feira recebeu: "))
quarta = int(input("Por favor, digite a quantidade de votos que quarta-feira recebeu: "))
quinta = int(input("Por favor, digite a quantidade de votos que quinta-feira recebeu: "))
sexta = int(input("Por favor, digite a quantidade de votos que sexta-feira recebeu: "))

# Verificação de qual dia foi o escolhido 

if (segunda > terca) and (segunda > quarta) and (segunda > quinta) and (segunda > sexta):
    print ("Segunda-feira foi o dia escolhido com {} votos".format(segunda))

elif (terca > segunda) and (terca > quarta) and (terca > quinta) and (terca > sexta):
    print ("Terça-feira foi o dia escolhido com {} votos".format(terca))

elif (quarta > segunda) and (quarta > terca) and (quarta > quinta) and (quarta > sexta):
    print ("Quarta-feira foi o dia escolhido com {} votos".format(quarta))

elif (quinta > segunda) and (quinta > terca) and (quinta > quarta) and (quinta > sexta):
    print ("Quinta-feira foi o dia escolhido com {} votos".format(quinta))

elif (sexta > segunda) and (sexta > terca) and (sexta > quarta) and (sexta > quinta):
    print ("Sexta-feira foi o dia escolhido com {} votos".format(sexta))

else:
    print("Resultado inválido, houve um empate")

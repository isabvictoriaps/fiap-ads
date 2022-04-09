from ast import Str
from pydoc import describe

print ("DESCONTOS DA AGÊNCIA DE VIAGENS")

valorBruto = float(input("Digite o valor bruto do pacote que você comprou: "))
categoriaDeAssento = input("Digite a categoria dos assentos: ECONÔMICA (1), EXECUTIVA(2) ou PRIMEIRA CLASSE(3): ")
quantidadeViajantes = int(input("Digite a quantidade de viajantes que moram em uma mesma casa: "))
desconto = int

if categoriaDeAssento == "1":
    print ("Desconto para Econômica")

    if quantidadeViajantes == 2:
        desconto = 3
        print ("Desconto de {}%".format(desconto))

    if quantidadeViajantes == 3:
        desconto = 4
        print ("Desconto de {}%".format(desconto))

    if quantidadeViajantes >= 4:
        desconto = 5
        print ("Desconto de {}%".format(desconto))

if categoriaDeAssento == "2":
    print ("Desconto para Executiva")

    if quantidadeViajantes == 2:
        desconto = 5
        print ("Desconto de {}%".format(desconto))

    if quantidadeViajantes == 3:
        desconto = 7
        print ("Desconto de {}%".format(desconto))

    if quantidadeViajantes >= 4:
        desconto = 8
        print ("Desconto de {}%".format(desconto))

if categoriaDeAssento == "3":
    print ("Desconto para Primeira Classe")

    if quantidadeViajantes == 2:
        desconto = 10
        print ("Desconto de {}%".format(desconto))

    if quantidadeViajantes == 3:
        desconto = 15
        print ("Desconto de {}%".format(desconto))

    if quantidadeViajantes >= 4:
        desconto = 20
        print ("Desconto de {}%".format(desconto))


descontoPassagem = (desconto/100 * valorBruto) 
totalPassagem = valorBruto - descontoPassagem
mediaPorPessoa = totalPassagem/quantidadeViajantes
print ("--------------------------------------------------------------")
print ("O valor bruto da sua passagem é R${} reais".format(valorBruto))
print ("Com o desconto de {} reais a sua passagem ficou R$ {} reais".format(descontoPassagem,totalPassagem))
print ("O valor médio por pessoa é de {} reais".format(mediaPorPessoa))
""""
EXERCÍCIO: COM QUE ROUPA EU VOU?
A loja FIAP Wear que vende roupas disponibilizou o cupom de NIVER10 no mês de seu aniversário.
Caso o cliente digite o cupom corretamente, deverá ser informado do valor final da compra já com desconto,
caso digite de maneira incorreta, deverá ser mostrado sem desconto.
"""

valor_compra = input("Digite o valor da compra realizada: ")
cupom = input ("Digite o cupom de desconto: ")

if cupom.upper() == "NIVER10":
    valor_compra = float(valor_compra) * 0.9
else:
    valor_compra = float(valor_compra)
    print("CUPOM INVÁLIDO")

print("O valor final da sua compra é: {}".format(valor_compra))
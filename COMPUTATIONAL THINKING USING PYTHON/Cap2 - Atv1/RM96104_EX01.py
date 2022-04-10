# Algoritmo que recebe o tipo de assinatura do cliente, o faturamento anual e exibe o valor que o cliente deve pagar.

#    Plano         Porcentagem sobre o faturamento 
#    Basic              30%
#    Silver             20%
#    Gold               10%
#    Platinum           5%

print ("Porcentagem do faturamento")

# Solicitação dos do tipo de assinatura e do faturamento anual

assinaturaCliente = input("Por favor, digite o tipo de assinatura que você possui: Basic (1), Silver (2), Gold (3) ou Platinum (4): ")
faturamentoAnual = float(input("Por favor, digite o valor do seu faturamento anual: "))

# Verificação e exibição do valor que o cliente deve pagar
if assinaturaCliente == "1":
    bonus = (30/100) * faturamentoAnual
    print ("O valor do bônus que você deverá pagar é de R$ {} ".format(bonus))

elif assinaturaCliente == "2":
    bonus = (20/100) * faturamentoAnual
    print ("O valor do bônus que você deverá pagar é de R$ {} ".format(bonus))

elif assinaturaCliente == "3":
    bonus = (10/100) * faturamentoAnual
    print ("O valor do bônus que você deverá pagar é de R$ {} ".format(bonus))

elif assinaturaCliente == "4":
    bonus = (5/100) * faturamentoAnual
    print ("O valor do bônus que você deverá pagar é de R$ {} ".format(bonus))
else:
    print("Opção de assinatura inválida.")

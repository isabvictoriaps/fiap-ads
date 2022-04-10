# Receber os minutos atuais 
minutosAtuais = int(input("Digite os minutos de agora: "))
multiplicacao = 1

# Realzição do fatorial
while minutosAtuais >= 2:
    multiplicacao = multiplicacao * minutosAtuais
    minutosAtuais = minutosAtuais - 1    

# exibimento da senha
print ("A senha necessária para o desbloqueio é: LIBERDADE{}".format(multiplicacao))
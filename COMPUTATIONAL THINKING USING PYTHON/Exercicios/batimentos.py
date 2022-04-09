print("VERIFICADOR DE FREQUÊNCIA CARDIACA")

batimentoUsuario = int(input("Informe o seu número de Batimentos por Minuto - BPM: "))
idade = int(input("Informe a sua idade: "))
 
if idade <= 2: 
    if batimentoUsuario >= 120 and batimentoUsuario <= 140:
            print("Batimentos normais para a idade fornecida")

    else:
        print("Frequência cardíaca inadequada")

elif 8 <= idade and idade <= 17:
    if batimentoUsuario >= 80 and batimentoUsuario <= 100:
            print ("Batimentos normais para a idade fornecida")

    else:
        print("Frequência cardíaca inadequada")
    
elif 18 >= idade or  idade < 60:
    if batimentoUsuario >= 70 and batimentoUsuario <= 80:
            print("Batimentos normais para a idade fornecida")
    else:
        print("Frequência cardíaca inadequada")

elif idade >= 60:
    if batimentoUsuario >= 50 and batimentoUsuario <= 60:
            print("Batimentos normais para a idade fornecida")
        
    else:
        print("Frequência cardíaca inadequada")
else:
    print("Não existem dados para a idade indicada")                                                                                                                                                                                                                                                                                       

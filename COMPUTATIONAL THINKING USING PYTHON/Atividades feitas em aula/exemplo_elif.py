# EXEMPLOS DO USO DE ELIF

pontuacao = input("Insira a pontuação do cliente: ")
pontuacao = int(pontuacao)
if pontuacao >= 1000:
    print("O cliente tem direito a receber mais 3gb na sua franquia de internet")
elif pontuacao >= 500:
    print("O cliente tem direito a receber mais 1,5gb na sua franquia de internet")
elif pontuacao >= 200:
    print("O cliente tem direito a receber mais 500mb na sua franquia de internet")
else:
    print ("O cliente não receberá bônus.")
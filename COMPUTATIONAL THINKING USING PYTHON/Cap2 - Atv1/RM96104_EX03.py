# declaração de variáveis
alunosImpar = 1
alunosPar = 1
somaPar = 0
somaImpar = 0

print ("Programa para cálcular média dos alunos da escola de Inglês JoWell Santana")

# solicitação de notas dos alunos impares
while 50 >= alunosImpar:
    if (alunosImpar%2) != 0:
        print("Você está digitando as notas dos alunos impares.")
        numeroImpar = float(input("Por favor, insira a nota do aluno de número {}:".format(alunosImpar)))
        somaImpar = somaImpar + numeroImpar
        alunosImpar = alunosImpar + 1
    else:
        alunosImpar = alunosImpar + 1

# solicitação de notas dos alunos pares
while 50 >= alunosPar:
    if (alunosPar%2) == 0:
        print("Você está digitando as notas dos alunos pares.")
        numeroPar = float(input("Por favor, insira a nota do aluno de número {}.".format(alunosPar)))

        somaPar = somaPar + numeroPar
        alunosPar = alunosPar + 1
    else: 
        alunosPar = alunosPar + 1

# cálculo e exibição de média da nota dos alunos 
mediaImpar = somaImpar/25
mediaPar = somaPar/25

print ("A média das notas da turma impar foi de {}".format(mediaImpar))
print("A média das notas da turma par foi de {}".format(mediaPar))

# verificação e exibição da nota da maior turma
if mediaImpar > mediaPar:
    print("As notas da turma Impar teve maior nota na média")
else:
    print ("As notas da turma Par teve maior nota na média")


    





"""
AJUDANDO O DOUTOR!

O doutor Henry Jones Junior estabeleceu uma regra com seus alunos da disciplina de Arqueologia: todos os que
obtiverem nota maior que 8,5 na prova semestral serão convidados para um visita de campo ba América do Sul.
Solicitar o email do aluno, caso o mesmo satisfaça a condição proposta escrever: ENVIANDO CONVITE
"""

email = input ("Digite o seu e-mail: ")
nota = input("Digite sua nota na disciplina de Arqueologia: ")
if float(nota) >= 8.5:
    print("Enviando convite para o e-mail: {}".format(email))
else:
    print("Sua nota não atinge o requisito.")    
#Critérios: senha, ajuda da senha, número do telefone, nome, email e data do vazamento

# criticidade de cada requisito 
senha = 100
ajudaSenha = 90
telefone = 80
nome = 70
email = 60

# lista dos vazamentos das empresas
linkedin = sum([email, senha,2016])
edmodo = sum([email,senha,2017])
dropbox = sum([email,senha,2012])
descomplica = sum([email,nome,senha,2021])
adobe = sum([email,ajudaSenha,senha,2013])


# adicionando todas as empresas na lista ranking
ranking = []

ranking.append(str(linkedin) + " - Linkedin")
ranking.append(str(edmodo) + " - Edmodo")
ranking.append(str(dropbox) + " - Dropbox")
ranking.append(str(descomplica) + " - Descomplica")
ranking.append(str(adobe) + " - Abode")

# colocar em ordem decrescente 
ranking.sort(reverse = True)

# apresentando ao usuário
print("======== EMPRESAS QUE VIOLARAM DADOS ========")
print("-----------------------------------------")
print ("Empresas que tiveram seus dados violados: ")
print("- Linkedin: em 2016 o Linkedin comprometeu os seguintes dados de seus usuários: email e senha;")
print("- Edmodo: em 2017 o Edmodo comprometeu os seguintes dados de seus usuários: email e senha;")
print("- Dropbox: em 2012 o Dropbox comprometeu os seguintes dados de seus usuários: email e senha;")
print("- Descomplica: em 2021 o Descomplica comprometeu os seguintes dados de seus usuários: email, nome e senha;")
print("- Adobe: em 2013 o Adobe comprometeu os seguintes dados de seus usuários: email, ajuda de senha e senha.")
print("-----------------------------------------------------")
print("Critério de criticidade para o ranking:")
print("senha, ajuda da senha, número do telefone, nome, email e data do vazamento.")
print("-----------------------------------------------------")
print("-----------------------RANKING-----------------------")
print("Atenção! O primeiro número diz respeito a pontuação da empresa")

# utilizando o laço de repetição while para apresentar o ranking
contador = 1
indice = 0

while (contador <= 5):
    print ("{}º Lugar: {}.".format(contador, ranking[indice]))
    contador = contador + 1
    indice = indice + 1
 

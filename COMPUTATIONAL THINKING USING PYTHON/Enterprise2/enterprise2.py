
# Ranking de Criticidade: senha, ajuda da senha, número do telefone, nome, email e data do vazamento

from audioop import reverse
from pickle import APPEND
from pstats import SortKey

# Apresentação das empresas

print("============== EMPRESAS ===========")
print ("Linkedin: A empresa em 2016 sofreu uma violação de dados que comprometeu o email e senha de seus usuário.")
print ("Edmodo: Em 2017 a empresa sofreu sofreu uma exposição do email e senha de seus usuários.")
print ("Dropbox: Em 2012 o Dropbox teve o email e senha de seus usuários violados.")
print ("Descomplica: Em 2021 o Descomplica teve os seguintes dados violados: email, nomes e senhas.")
print ("Adobe: em 2013 o email, as dicas de senha e a senha dos usuários foram comprometidos.")

# criticidade de cada requisito 
senha = 10000
ajudaSenha = 9000
telefone = 8000
nome = 7000
email = 6000



print ("==========RANKING DAS EMPRESAS SEGUINDO OS CRITÉRIOS============")

# lista dos vazamentos das empresas
empresa = {
    'Linkedin': sum([email, senha,2016]),
    'Edmodo' : sum([email,senha,2017]),
    'Dropbox' : sum([email,senha,2012]),
    'Descomplica' : sum([email,nome,senha,2021]),
    'Adobe' : sum([email,ajudaSenha,senha,2013])
}

for item in sorted(empresa, key = empresa.get, reverse=True):
    print (item)
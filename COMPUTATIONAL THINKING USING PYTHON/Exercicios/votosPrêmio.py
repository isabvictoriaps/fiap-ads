from pprint import pp


votosMembro1 = input("Digite qual console vocÊ quer: Playstation (1) XBOX (2) ou Nitendo(3): ")
votosMembro2 = input("Digite qual console vocÊ quer: Playstation (1) XBOX (2) ou Nitendo(3): ")
votosMembro3 = input("Digite qual console vocÊ quer: Playstation (1) XBOX (2) ou Nitendo(3): ")
votosMembro4 = input("Digite qual console vocÊ quer: Playstation (1) XBOX (2) ou Nitendo(3): ")
votosMembro5 = input("Digite qual console vocÊ quer: Playstation (1) XBOX (2) ou Nitendo(3): ")

playstation = 0
xbox = 0
nintendo = 0

if votosMembro1 == "1":
    playstation = playstation + 1
elif votosMembro1 == "2":
    xbox = xbox + 1
elif votosMembro1 == "3": 
    nintendo = nintendo + 1
else: 
 print ("Membro 1 - Seu voto não tem número correspondente e foi desconsiderado")

if votosMembro2 == "1":
    playstation = playstation + 1
elif votosMembro2 == "2":
    xbox = xbox + 1
elif votosMembro2 == "3": 
    nintendo = nintendo + 1
else: 
 print ("Membro 2 - Seu voto não tem número correspondente e foi desconsiderado")

if votosMembro3 == "1":
    playstation = playstation + 1
elif votosMembro3 == "2":
    xbox = xbox + 1
elif votosMembro3 == "3": 
    nintendo = nintendo + 1
else: 
 print ("Membro 3 - Seu voto não tem número correspondente e foi desconsiderado")


if votosMembro4 == "1":
    playstation = playstation + 1
elif votosMembro4 == "2":
    xbox = xbox + 1
elif votosMembro4 == "3": 
    nintendo = nintendo + 1
else: 
 print ("Membro 4 - Seu voto não tem número correspondente e foi desconsiderado")


if votosMembro5 == "1":
    playstation = playstation + 1
elif votosMembro5 == "2":
    xbox = xbox + 1
elif votosMembro5 == "3": 
    nintendo = nintendo + 1
else: 
 print ("Membro 5 - Seu voto não tem número correspondente e foi desconsiderado")



if playstation > xbox and playstation > nintendo:
    print("O playstation foi o escolhido com {} votos".format(playstation))

elif xbox > playstation and xbox > nintendo:
    print ("O xbox foi o escolhido com {} votos".format(xbox))

elif nintendo > xbox and nintendo > playstation:
    print ("O nintendo foi o escolhido com {} votos".format(nintendo))
else:
    print ("Houve um empate")
# Ejercicio3 : Agregar personajes a una lista
# Escriba un programa donde cree una lista con los siguientes personajes del señor de los anillos:
# Nombre: Aragon , Clase: Guerrero , Raza: Dúnadan del norte
# Nombre: Gandalf, Clase: Mago, Raza: Istar
# Nombre: Legolas, Clase: Arquero, Raza: Elfo Sindar

personajes = [] # Creamos una lista vacia
# Creamos diccionarios:
person1 = {'Nombre':'Aragon', 'Clase': 'Guerrero', 'Raza':'Dúnadan del norte'}
person2 = {'Nombre': 'Gandalf', 'Clase': 'Mago', 'Raza': 'Istar'}
person3 = {'Nombre': 'Legolas', 'Clase': 'Arquero', 'Raza': 'Elfo Sindar'}

personajes.append(person1)
personajes.append(person2)
personajes.append(person3)
print(personajes)

person4 = {'Nombre':'Frodo', 'Clase': 'Portador del Anillo', 'Raza':'Hobbit'}
person5 = {'Nombre': 'Sauron', 'Clase': 'Señor oscuro', 'Raza': 'Maia'}
person6 = {'Nombre': 'Gimli', 'Clase': 'Señor de las cavernas', 'Raza': 'Enano'}

personajes.append(person4)
personajes.append(person5)
personajes.append(person6)
print(personajes)

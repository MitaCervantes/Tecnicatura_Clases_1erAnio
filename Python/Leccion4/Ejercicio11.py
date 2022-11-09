# Agenda telefonica
# Hacer un programa que simule una agenda de contactos. Crear
# un diccionario donde la clave sea el nombre del usuario y el valor
# sea el telefono, el programa tendrá el siguiente menu de opciones:
#           1.Nuevo contacto
#           2.Borrar contacto
#           3.Ver contactos existentes
#           4.Salir

agenda = {}
while True:
    print("\t.:Menu:.")
    print("1.Nuevo contacto")
    print("2.Borrar contacto")
    print("3.Ver contactos existentes")
    print("4.Salir")
    print()
    opcion = int(input("Digite una opcion: "))
    print()
    if opcion == 1:
        nombre = input("Ingrese el nombre del contacto: ")
        telefono = input("Digite el numero de telefono: ")
        if nombre not in agenda:
            agenda[nombre]= telefono
            print("Contacto agregado exitosamente.")
            print()
        else:
            print("Ese nombre de contacto ya existe.")
    elif opcion == 2:
        nombre = input("Cual es el nombre del contacto: ")
        if nombre in agenda:
            del(agenda[nombre])
            print("Se ha eliminado el contacto requerido.")
        else:
            print("Ese contacto no existe en la agenda!")
    elif opcion == 3:
        print(f'Agenda de contactos: ')
        for clave, valor in agenda.items():
            print(f'Nombre : {clave}, Telefono: {valor}')
    elif opcion == 4:
        print("Gracias por utilizar su agenda de contactos")
        break
    else:
        print("Se equivocó de opción de menú.")
        print()
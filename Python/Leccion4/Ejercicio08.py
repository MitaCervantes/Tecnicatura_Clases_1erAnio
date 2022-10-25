# Ejercicio 8: Menu Interactivo - Cajero Automatico
# Hacer un programa que simule un cajero automatico con un saldo
# inicial de $1000  y tendrá el siguiente menú de opciones:
#                   1. Ingresar dinero en la cuenta
#                   2. Retirar dinero de la cuenta
#                   3. Mostrar dinero disponible
#                   4. Salir

saldo = 1000
while True:
    print("\t.:Menu:.")
    print("1.Ingresar dinero en la cuenta")
    print("2.Retirar dinero de la cuenta")
    print("3.Mostrar dinero disponible")
    print("4.Salir")
    print()
    opcion = int(input("Digite una opcion: "))
    print()
    if opcion == 1:
        ingreso = float(input("Cuanto dinero desea ingresar: "))
        saldo += ingreso
        print(f"Saldo actual: ${saldo}.-")
        print()
    elif opcion == 2:
        extraccion = float(input("Cuanto dinero desea extraer: "))
        if extraccion > saldo:
            print("Saldo insuficiente para realizar operacion.")
            print(f"Saldo actual: ${saldo}.-")
            print("Ingrese nuevamente una opcion: ")
            print()
        else:
            saldo -= extraccion
            print(f"Saldo actual: ${saldo}.-")
            print()
    elif opcion == 3:
        print(f"Su saldo actual es : ${saldo}")
        print()
    elif opcion == 4:
        print("Usted ha terminado de operar en su cuenta.")
        print()
        break
    else:
        print("Error, opcion de menu incorrecta.")
print("Gracias por utilizar nuestros servicios.")

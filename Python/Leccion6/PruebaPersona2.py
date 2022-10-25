from Persona2 import Persona2

if __name__ == '__main__':
    print('Creación objetos'.center(50, '-'))
    persona1 = Persona2('Lionel', 'Messi', 35)
    persona1.mostrar_detalles()

    print(__name__)

print('Eliminación objetos'.center(50, '-'))
del persona1

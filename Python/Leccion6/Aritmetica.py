class Aritmetica:
    """
    El nombre de este tipo de comentario es : DocString,
    esto es documentacion de la clase en Python
    Vamos a realizar las operaciones de sumar, restar, multiplicar y más
    """

    def __init__(self, operandoA, operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB

    def sumar(self):
        return self.operandoA + self.operandoB

    def restar(self):
        return self.operandoA - self.operandoB

    def multiplicar(self):
        return self.operandoA * self.operandoB

    def dividir(self):
        return self.operandoA / self.operandoB


aritmetica1 = Aritmetica(7, 9)
print(f'Suma= {aritmetica1.sumar()}')
print(f'Resta= {aritmetica1.restar()}')
print(f'Multiplicacion= {aritmetica1.multiplicar()}')
print(f'Division= {aritmetica1.dividir():.2f}')

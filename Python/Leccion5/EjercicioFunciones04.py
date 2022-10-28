# Ejercicio 04: Calculadora de Impuestos
# Crear una función para calcular el total de un pago incluyendo un impuesto aplicado. (IVA)
# Formula: pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
# Proporcione el pago sin impuesto: 1000
# Proporcione el monto del impuesto: 21%
# Pago con impuesto: xxxx



# Funcion que calcula el total de un pago incluyendo el impuesto
def calcular_pago(pago_sin_impuesto, impuesto):
    pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto / 100)
    print(f"\nEl pago sin impuesto es de: {pago_sin_impuesto} y el impuesto es de: {impuesto} ")
    print(f"\nEl pago total es de: {pago_total}")


# Ejecutamos la funcion
pago_sin_impuesto = float(input("Digite el monto sin impuesto: "))
impuesto = float(input("Digite el monto del impuesto: "))
calcular_pago(pago_sin_impuesto, impuesto)

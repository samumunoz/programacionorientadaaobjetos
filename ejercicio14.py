class CalculadoraPotencias:
    def __init__(self, numero):
        self.numero = float(numero)
        self.cuadrado = 0.0
        self.cubo = 0.0

    def calcular_cuadrado(self):
        self.cuadrado = self.numero ** 2

    def calcular_cubo(self):
        self.cubo = self.numero ** 3

    def mostrar_potencias(self):
        print("--- Cálculos de Potencias ---")
        print(f"Número base: {self.numero}")
        print(f"El cuadrado del número es: {self.cuadrado}")
        print(f"El cubo del número es: {self.cubo}")

# Ejecución
calculadora = CalculadoraPotencias(5) # Ejemplo de lectura
calculadora.calcular_cuadrado()
calculadora.calcular_cubo()
calculadora.mostrar_potencias()
calculadora.mostrar_potencias()

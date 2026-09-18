import math

class Circulo:
    def __init__(self, radio):
        self.radio = float(radio)
        self.area = 0.0
        self.circunferencia = 0.0

    def calcular_area(self):
        self.area = math.pi * (self.radio ** 2)

    def calcular_circunf(self):
        self.circunferencia = 2 * math.pi * self.radio

    def mostrar_geometria(self):
        print("--- Geometría del Círculo ---")
        print(f"Radio ingresado: {self.radio}")
        print(f"Área del círculo: {self.area:.2f}")
        print(f"Longitud de la circunferencia: {self.circunferencia:.2f}")

# Ejecución
circulo = Circulo(10) # Ejemplo de radio dado
circulo.calcular_area()
circulo.calcular_circunf()
circulo.mostrar_geometria()

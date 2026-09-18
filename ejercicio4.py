class Familia:
    def __init__(self, edad_juan):
        self.edad_juan = float(edad_juan)
        self.edad_alberto = 0.0
        self.edad_ana = 0.0
        self.edad_mama = 0.0

    def calcular_edades(self):
        # Alberto tiene 2/3 de la edad de Juan
        self.edad_alberto = (2 / 3) * self.edad_juan
        # Ana tiene 4/3 de la edad de Juan
        self.edad_ana = (4 / 3) * self.edad_juan
        # La edad de la mamá es la suma de las tres
        self.edad_mama = self.edad_juan + self.edad_alberto + self.edad_ana

    def mostrar_edades(self):
        print("--- Edades de la Familia ---")
        print(f"Edad de Juan: {self.edad_juan:.2f} años")
        print(f"Edad de Alberto: {self.edad_alberto:.2f} años")
        print(f"Edad de Ana: {self.edad_ana:.2f} años")
        print(f"Edad de la Mamá: {self.edad_mama:.2f} años")

# Ejecución
familia = Familia(15) # Ejemplo asumiendo que Juan tiene 15 años
familia.calcular_edades()
familia.mostrar_edades()

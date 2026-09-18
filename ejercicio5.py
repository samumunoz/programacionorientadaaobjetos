class PruebaEscritorio:
    def __init__(self):
        self.suma = 0.0
        self.x = 0.0
        self.y = 0.0

    def ejecutar_instrucciones(self):
        self.suma = 0
        self.x = 20
        self.suma = self.suma + self.x
        self.y = 40
        self.x = self.x + (self.y ** 2)
        self.suma = self.suma + (self.x / self.y)

    def mostrar_suma(self):
        print(f"EL VALOR DE LA SUMA ES: {self.suma}")

# Ejecución
prueba = PruebaEscritorio()
prueba.ejecutar_instrucciones()
prueba.mostrar_suma()

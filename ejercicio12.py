class Empleado:
    def __init__(self, horas_trabajadas, valor_hora, retencion_base):
        self.horas_trabajadas = horas_trabajadas
        self.valor_hora = valor_hora
        self.retencion_base = retencion_base
        self.salario_bruto = 0.0
        self.valor_retencion = 0.0
        self.salario_neto = 0.0

    def calcular_liquidacion(self):
        self.salario_bruto = self.horas_trabajadas * self.valor_hora
        self.valor_retencion = self.salario_bruto * (self.retencion_base / 100)
        self.salario_neto = self.salario_bruto - self.valor_retencion

    def mostrar_resultados(self):
        print("--- Liquidación de Empleado ---")
        print(f"Salario Bruto: ${self.salario_bruto:,.2f}")
        print(f"Retención en la Fuente: ${self.valor_retencion:,.2f}")
        print(f"Salario Neto: ${self.salario_neto:,.2f}")

# Ejecución
empleado = Empleado(48, 5000, 12.5)
empleado.calcular_liquidacion()
empleado.mostrar_resultados()

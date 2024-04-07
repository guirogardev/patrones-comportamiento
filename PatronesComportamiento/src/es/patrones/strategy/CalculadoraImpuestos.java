package es.patrones.strategy;

public class CalculadoraImpuestos {
	private Impuesto estrategia;

    public CalculadoraImpuestos(Impuesto estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularImpuesto(double monto) {
        return estrategia.calcularImpuesto(monto);
    }

	public void setEstrategia(Impuesto estrategia) {
		this.estrategia = estrategia;
	}
	
}

package es.patrones.strategy;

public class ImpuestoReducido implements Impuesto {
	@Override
    public double calcularImpuesto(double cantidad) {
        return cantidad * 0.10;
    }
}

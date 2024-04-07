package es.patrones.strategy;

public class ImpuestoNormal implements Impuesto {
	@Override
    public double calcularImpuesto(double cantidad) {
        return cantidad * 0.21;
    }
}

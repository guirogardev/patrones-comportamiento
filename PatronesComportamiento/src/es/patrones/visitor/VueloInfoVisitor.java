package es.patrones.visitor;

public class VueloInfoVisitor implements Visitor {
    @Override
    public void visit(VueloInternacional vuelo) {
        System.out.println("Información de vuelo internacional: " + vuelo.toString());
    }

    @Override
    public void visit(VueloDomestico vuelo) {
        System.out.println("Información de vuelo doméstico: " + vuelo.toString());
    }
}

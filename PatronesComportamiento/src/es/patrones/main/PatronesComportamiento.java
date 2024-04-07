package es.patrones.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.patrones.cadena.Operacion;
import es.patrones.cadena.OperacionCompulsar;
import es.patrones.cadena.OperacionEditar;
import es.patrones.cadena.OperacionValidar;
import es.patrones.command.Bombilla;
import es.patrones.command.Comando;
import es.patrones.command.ComandoApagar;
import es.patrones.command.ComandoEncender;
import es.patrones.command.Interruptor;
import es.patrones.iterator.Iterador;
import es.patrones.iterator.ListaNombres;
import es.patrones.mediator.ChatMediador;
import es.patrones.mediator.Mediador;
import es.patrones.mediator.Usuario;
import es.patrones.memento.MementoPersona;
import es.patrones.memento.Persona;
import es.patrones.observer.Prensa;
import es.patrones.observer.Suscriptor;
import es.patrones.observer.SuscriptorConcreto;
import es.patrones.state.Reproductor;
import es.patrones.strategy.CalculadoraImpuestos;
import es.patrones.strategy.ImpuestoNormal;
import es.patrones.strategy.ImpuestoReducido;
import es.patrones.templateMethod.Ajedrez;
import es.patrones.templateMethod.Go;
import es.patrones.visitor.Vuelo;
import es.patrones.visitor.VueloDomestico;
import es.patrones.visitor.VueloInfoVisitor;
import es.patrones.visitor.VueloInternacional;

public class PatronesComportamiento {

	public static void main(String[] args) {
		ejecutarPatronCadena();
		generadorCadena();
		ejecutarPatronCommand();
		ejecutarPatronIterator();
		ejecutarPatronMediator();
		ejecutarPatronMemento();
		ejecutarPatronObserver();
		ejecutarPatronState();
		ejecutarPatronStrategy();
		ejecutarPatronTemplateMethod();
		ejecutarPatronVisitor();
	}

	/**
	 * Prueba del patrón de comportamiento Cadena de Responsabilidad.
	 */
	private static void ejecutarPatronCadena() {
		System.out.println("[INICIO PATRÓN CADENA DE RESPONSABILIDAD]");
		final OperacionCompulsar compulsar = new OperacionCompulsar();
		final OperacionEditar editar = new OperacionEditar();
		final OperacionValidar validar = new OperacionValidar();
		compulsar.setNext(editar);
		validar.setNext(compulsar);
		validar.ejecutar();
		System.out.println("[FIN PATRÓN CADENA DE RESPONSABILIDAD]");
		System.out.println("\r\n");
	}

	/**
	 * Prueba del patrón de comportamiento Command.
	 */
	private static void ejecutarPatronCommand() {
		System.out.println("[INICIO PATRÓN COMMAND]");
		final Bombilla bombilla = new Bombilla();
		final Comando comandoEncender = new ComandoEncender(bombilla);
		final Comando comandoApagar = new ComandoApagar(bombilla);

		final Interruptor interruptor = new Interruptor();

		interruptor.setComando(comandoEncender);
		interruptor.apretar();

		interruptor.setComando(comandoApagar);
		interruptor.apretar();
		System.out.println("[FIN PATRÓN COMMAND]");
		System.out.println("\r\n");
	}

	/**
	 * Prueba del patrón de comportamiento Iterator.
	 * 
	 * Permite separar los algoritmos de búsqueda y recorrido de la implementación
	 * propia de la estructura de datos.
	 */
	private static void ejecutarPatronIterator() {
		System.out.println("[INICIO PATRÓN ITERATOR]");
		final String[] nombres = { "A", "B", "C", "D", "E" };

		final ListaNombres lista = new ListaNombres(nombres);
		final Iterador iterador = lista.createIterator();

		while (iterador.hasNext()) {
			String elemento = iterador.next();
			System.out.println(elemento);
		}
		System.out.println("[FIN PATRÓN ITERATOR]");
		System.out.println("\r\n");
	}

	/**
	 * Prueba del patrón de comportamiento Mediator.
	 */
	private static void ejecutarPatronMediator() {
		System.out.println("[INICIO PATRÓN MEDIATOR]");
		final Mediador mediador = new ChatMediador();

		final Usuario usuario1 = new Usuario("Usuario1", mediador);
		final Usuario usuario2 = new Usuario("Usuario2", mediador);

		usuario1.enviarMensaje("Hola, ¿cómo estás?", usuario2);
		usuario2.enviarMensaje("Hola, todo bien, gracias", usuario1);
		System.out.println("[FIN PATRÓN MEDIATOR]");
		System.out.println("\r\n");
	}

	/**
	 * Prueba del patrón de comportamiento Memento.
	 */
	private static void ejecutarPatronMemento() {
		System.out.println("[INICIO PATRÓN MEMENTO]");
		final Persona persona = new Persona("Juan", 30);

		// Guardar estado actual de la persona
		final MementoPersona memento = persona.guardarEstado();

		// Modificar estado de la persona
		persona.setNombre("Pedro");
		persona.setEdad(25);

		System.out.println("Estado actual de la persona: " + persona.getNombre() + " " + persona.getEdad());

		// Restaurar estado anterior de la persona
		persona.restaurarEstado(memento);
		System.out.println("Estado recuperado de la persona: " + persona.getNombre() + " " + persona.getEdad());
		System.out.println("[FIN PATRÓN MEMENTO]");
		System.out.println("\r\n");
	}

	/**
	 * Prueba del patrón de comportamiento Observer.
	 */
	private static void ejecutarPatronObserver() {
		System.out.println("[INICIO PATRÓN OBSERVER]");
		final Prensa prensa = new Prensa();

		final Suscriptor user1 = new SuscriptorConcreto("Pepe");
		final Suscriptor user2 = new SuscriptorConcreto("Paco");

		prensa.addSuscriptor(user1);
		prensa.addSuscriptor(user2);

		prensa.notifySuscriptores("Se ha lanzado una nueva actualización con Pepe");

		prensa.removeSuscriptor(user1);

		prensa.notifySuscriptores("Se ha lanzado una nueva actualización sin Pepe");
		System.out.println("[FIN PATRÓN OBSERVER]");
		System.out.println("\r\n");
	}

	/**
	 * Prueba del patrón de comportamiento State.
	 */
	private static void ejecutarPatronState() {
		System.out.println("[INICIO PATRÓN STATE]");
		final Reproductor reproductor = new Reproductor();
		reproductor.reproducir();
		reproductor.reproducir();
		reproductor.pausar();
		reproductor.pausar();
		reproductor.detener();
		reproductor.detener();
		System.out.println("[FIN PATRÓN STATE]");
		System.out.println("\r\n");
	}

	/**
	 * Prueba del patrón de comportamiento Strategy.
	 */
	private static void ejecutarPatronStrategy() {
		System.out.println("[INICIO PATRÓN STRATEGY]");
		final CalculadoraImpuestos calculadora = new CalculadoraImpuestos(new ImpuestoNormal());
		final double impuestoNormal = calculadora.calcularImpuesto(100);
		System.out.println("Impuesto normal: " + impuestoNormal);

		calculadora.setEstrategia(new ImpuestoReducido());

		final double impuestoReducido = calculadora.calcularImpuesto(100);
		System.out.println("Impuesto reducido: " + impuestoReducido);
		System.out.println("[FIN PATRÓN STRATEGY]");
		System.out.println("\r\n");
	}

	/**
	 * Prueba del patrón de comportamiento Template Method.
	 */
	private static void ejecutarPatronTemplateMethod() {
		System.out.println("[INICIO PATRÓN TEMPLATE METHOD]");
		final Ajedrez ajedrez = new Ajedrez();
		ajedrez.jugar();

		final Go go = new Go();
		go.jugar();
		System.out.println("[FIN PATRÓN TEMPLATE METHOD]");
		System.out.println("\r\n");
	}

	/**
	 * Prueba del patrón de comportamiento Visitor.
	 * 
	 * Este patrón permite colocar nuevos comportamientos en una clase separada sin
	 * tener que agregarlos en la clase ya existente.
	 */
	private static void ejecutarPatronVisitor() {
		System.out.println("[INICIO PATRÓN VISITOR]");
		final Vuelo internacional = new VueloInternacional();
		final Vuelo domestico = new VueloDomestico();

		// Este visitor tiene la nueva funcionalidad.
		final VueloInfoVisitor visitor = new VueloInfoVisitor();

		// Cada vuelo concreto acepta esa nueva funcionalidad del visitor.
		internacional.accept(visitor);
		domestico.accept(visitor);

		System.out.println("[FIN PATRÓN VISITOR]");
		System.out.println("\r\n");
	}
	
	/**
	 * Prueba de un generador de cadena dada una lista con los manejadores en orden.
	 */
	private static void generadorCadena() {
		System.out.println("[INICIO] generadorCadena()");
		final List<Operacion> manejadoresCadena = new ArrayList<>(
				Arrays.asList(new OperacionCompulsar(), new OperacionEditar(), new OperacionValidar()));
		
		for (int i = 0; i < manejadoresCadena.size() - 1; i++) {
			manejadoresCadena.get(i).setNext(manejadoresCadena.get(i + 1));
        }
		
		manejadoresCadena.get(0).ejecutar();
		
		System.out.println("[FIN] generadorCadena()");
	}

}

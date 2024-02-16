package futbol;

import java.util.ArrayList;

public class Futbol {


	// ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
	public static ArrayList<Personal> integrantes = new ArrayList<Personal>();

	public static void main(String[] args) {

		Entrenador Anceloti = new Entrenador(1, "Carlo", "Anceloti", 60, "284EZ89");
		Futbolista Mbape = new Futbolista(2,"Interior Derecho",6, "Kyian",  "Mbape", 29);
		Masajista Ana = new Masajista(3, "Ana", "Jauregi", 41, "Licenciada en Fisioterapia", 1);

		integrantes.add(Anceloti);
		integrantes.add(Mbape);
		integrantes.add(Ana);
                System.out.println(Anceloti.toString());

		// CONCENTRACION
		System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
		for (Personal integrante : integrantes) {
                           //solo muestra los masajistas
                        if(integrante instanceof Masajista)
                            System.out.println(integrante.toString());
			integrante.concentrarse();
                 
		}

		// VIAJE
		System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
		for (Personal integrante : integrantes) {
			System.out.print(integrante.getNombre()+" "+integrante.getApellido()+" -> ");
			integrante.viajar();
		}
                System.out.println("nPlanificar Entrenamiento: Solo el entrenador tiene el método para planificar un entrenamiento:");
//// ENTRENAMIENTO
//System.out.println("nEntrenamiento: Todos los integrantes tienen su función en un entrenamiento (Especialización)");
//for (SeleccionFutbol integrante : integrantes) {
//	System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
//	integrante.entrenamiento();
//}
//
//// PARTIDO DE FUTBOL
//System.out.println("nPartido de Fútbol: Todos los integrantes tienen su función en un partido (Especialización)");
//for (SeleccionFutbol integrante : integrantes) {
//	System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
//	integrante.partidoFutbol();
//}
     
//System.out.print(delBosque.getNombre() + " " + delBosque.getApellidos() + " -> ");
//((Entrenador) delBosque).planificarEntrenamiento();
//
//// ENTREVISTA
//System.out.println("nEntrevista: Solo el futbolista tiene el método para dar una entrevista:");
//System.out.print(iniesta.getNombre() + " " + iniesta.getApellidos() + " -> ");
//((Futbolista) iniesta).entrevista();
//
//// MASAJE
//System.out.println("nMasaje: Solo el masajista tiene el método para dar un masaje:");
//System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellidos() + " -> ");
//((Masajista) raulMartinez).darMasaje();
        }
}
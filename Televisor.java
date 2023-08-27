package POO;

// Crear una clase de televisor
public class Televisor {
    // Propiedades del televisor
    String marca; // La marca del televisor
    int pulgadas; // El tamaño de la pantalla en pulgadas
    String tipo; // El tipo de pantalla 
    boolean inteligente; // Si el televisor tiene funciones inteligentes o no
    int volumen; // El nivel de volumen del sonido
    // Comportamientos del televisor
    public void encender() { // Encender el televisor
        System.out.println("El televisor se ha encendido.");
    }

    public void apagar() { // Apagar el televisor
        System.out.println("El televisor se ha apagado.");
    }

    public void subirVolumen() { // Subir el volumen del sonido
        if (volumen < 100) { // Si el volumen no está al máximo
            volumen++; // Aumentar el volumen en una unidad
            System.out.println("El volumen es: " + volumen);
        } else { // Si el volumen está al máximo
            System.out.println("El volumen ya está al máximo.");
        }
    }

    public void bajarVolumen() { // Bajar el volumen del sonido
        if (volumen > 0) { // Si el volumen no está al mínimo
            volumen--; // Disminuir el volumen en una unidad
            System.out.println("El volumen es: " + volumen);
        } else { // Si el volumen está al mínimo
            System.out.println("El volumen ya está al mínimo.");
        }
    }

    public static void main(String[] args) {

        // Crear dos objetos de la clase Televisor
        Televisor tv1 = new Televisor(); // Crear el primer objeto
        Televisor tv2 = new Televisor(); // Crear el segundo objeto

        // Establecer diferentes valores para las propiedades de los objetos
        tv1.marca = "Samsung"; // La marca del primer televisor es Samsung
        tv1.pulgadas = 55; // El tamaño de la pantalla del primer televisor es 55 pulgadas
        tv1.tipo = "QLED"; // El tipo de pantalla del primer televisor es QLED
        tv1.inteligente = true; // El primer televisor tiene funciones inteligentes
        tv1.volumen = 50; // El nivel de volumen del sonido del primer televisor es 50

        tv2.marca = "LG"; // La marca del segundo televisor es LG
        tv2.pulgadas = 43; // El tamaño de la pantalla del segundo televisor es 43 pulgadas
        tv2.tipo = "LED"; // El tipo de pantalla del segundo televisor es LED
        tv2.inteligente = false; // El segundo televisor no tiene funciones inteligentes
        tv2.volumen = 30; // El nivel de volumen del sonido del segundo televisor es 30

        // Llamar a los métodos de los objetos de la clase Televisor
        tv1.encender(); // Encender el primer televisor
        tv2.apagar(); // Apagar el segundo televisor
        tv1.subirVolumen(); // Subir el volumen del sonido del primer televisor
        tv2.bajarVolumen(); // Bajar el volumen del sonido del segundo televisor

    }

}

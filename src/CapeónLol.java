/**
 * Clase CaMpeónLol
 */
public class CapeónLol {


    /**
     * Atributos de la clase
     */
    String tipo;
    String carril;
    String nombre;

    /**
     * Constructor de la clase
     * @param tipo Tipo de campeón
     * @param carril Carril en el que se juega el campeón
     * @param nombre Nombre del campeón
     *
     *Complejidad temporal: O(1) Complejidad constante
     */
    CapeónLol(String tipo, String carril, String nombre){
        this.tipo = tipo;
        this.carril = carril;
        this.nombre = nombre;

    }

    /**
     * Método que imprime la información del campeón (tipo, carril y nombre)
     *
     * Complejidad temporal: O(1) Complejidad constante
     */
    void Rol(){
        System.out.println("El campeón " + nombre + " juega en " + carril + " y es un(a) " + tipo);
    }

}

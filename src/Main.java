/**
 * Clase Main (Se ejecuta en primer lugar)
 */
public class Main {
    /**
     * Método ejecutado primero
     *
     * @param args
     *
     * Complejidad temporal: O(1) Complejidad constante
     */
    public static void main(String[] args) {

        CapeónLol Katarina = new CapeónLol("asesino", "mid", "Katarina");
        CapeónLol Diana = new CapeónLol("luchador", "jungla", "Diana");
        CapeónLol Xayah = new CapeónLol("tirador", "ADcarry", "Xayah");

        Katarina.Rol();
        Diana.Rol();
        Xayah.Rol();

    }
}
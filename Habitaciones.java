public class Habitaciones {

    public static String dormitorios[] = {
            "Una persona",
            "Dos personas",
            "Tres personas",
            "Cuatro peronas"
    };

    public static void camas (String data) {

        for (int i = 0; i < 4; i++) {
            System.out.println("[" + i + "]" + Habitaciones.dormitorios[i]);
        }

    }
}

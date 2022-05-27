public class Horarios {

    public static String rutina [] = {
            "Mañanas",
            "Tardes",
            "Noches",
            "Timepo indefinido"
    };
    //Resolver para que el usuario pueda escribir nota!
    public static void tiempo (String data) {

        for (int i = 0; i < 4; i++) {
            System.out.println("[" + i + "]" + Horarios.rutina [i]);
        }

    }
}

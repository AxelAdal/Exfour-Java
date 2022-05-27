public class CantidaPersonas {

    public static String personas[] = {
            "1",
            "2",
            "3",
            "4"
    };

    public static void Grupo (String data) {

        for (int i = 0; i < 4; i++) {
            System.out.println("[" + i + "]" + CantidaPersonas.personas[i]);
        }

    }
}

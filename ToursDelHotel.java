public class ToursDelHotel {

    public static String tours[] = {
            "Gran safari",
            "Acu aparque",
            "Bosque de la paz",
            "Ninguno"
    };

    public static void viajes (String data) {

        for (int i = 0; i < 4; i++) {
            System.out.println("[" + i + "]" + ToursDelHotel.tours[i]);
        }

    }
}

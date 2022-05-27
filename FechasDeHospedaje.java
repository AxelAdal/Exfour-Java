public class FechasDeHospedaje {

    public static String Fechas [] = {
            "01/06/2022",
            "02/06/2022",
            "03/05/2022",
            "04/06/2022"
    };

    public static void fechas (String data){

        for(int i = 0; i<4; i++){
            System.out.println("["+ i + "]" + FechasDeHospedaje.Fechas[i]);
        }


    }
}

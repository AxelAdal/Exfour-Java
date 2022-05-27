public class Base {

     public static String sistema [] = {
         "Fechas",
        "Cantidad de Personas por Habitación",
        "Habitaciones",
         "Horarios",
        "Tours del Hotel",
        "Fecha de retiro"
    };

    public static void mostrardatos(String data){

        for(int i = 0; i<6; i++){
            System.out.println("["+ i + "]" + Base.sistema[i]);
        }


    }

}

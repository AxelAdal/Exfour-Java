import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //MENSAJE
        Mensaje.mensaje_inicial();
        //Mostrar categorias
        Base.mostrardatos("");

        //ENTRADA DE DATOS PARA LA CATEGORIA
        System.out.print(" ");//SALTO DE LINEA
        Scanner imput_opcion = new Scanner(System.in);
        System.out.print("Opción: ");
        String opcion = imput_opcion.nextLine();


        if (0 == 0) {
              FechasDeHospedaje.fechas("");
            System.out.println("Fehcas de Hospedaje");

            System.out.print(" ");//SALTO DE LINEA
            Scanner impu_opc = new Scanner(System.in);
            System.out.print("Opción: ");
            String opc = impu_opc.nextLine();


        }else{
            Mensaje.mensaje_inicial();
            Base.mostrardatos("");


            System.out.print(" ");//SALTO DE LINEA
            Scanner focus_ph = new Scanner(System.in);
            System.out.print("Opción: ");
            String ph = focus_ph.nextLine();
        }
        if(1 == 1){
            CantidaPersonas.Grupo("");
            System.out.println("Cantidad de Personas");

            System.out.print(" ");//SALTO DE LINEA
            Scanner impu_opc = new Scanner(System.in);
            System.out.print("Opción: ");
            String opc = impu_opc.nextLine();

        }else{
            Mensaje.mensaje_inicial();
            Base.mostrardatos("");


            System.out.print(" ");//SALTO DE LINEA
            Scanner focus_ph = new Scanner(System.in);
            System.out.print("Opción: ");
            String ph = focus_ph.nextLine();
        }

        if(2 == 2){
            Habitaciones.camas("");
            System.out.println("Habiraciones");

            System.out.print(" ");//SALTO DE LINEA
            Scanner fe_si = new Scanner(System.in);
            System.out.print("Opción: ");
            String si = fe_si.nextLine();
        }else{
            Mensaje.mensaje_inicial();
            Base.mostrardatos("");


            System.out.print(" ");//SALTO DE LINEA
            Scanner focus_ph = new Scanner(System.in);
            System.out.print("Opción: ");
            String ph = focus_ph.nextLine();
        }

        if(3 == 3){
            Horarios.tiempo( "");
            System.out.println("Tiempos disponibles");

            System.out.print(" ");//SALTO DE LINEA
            Scanner ma_va = new Scanner(System.in);
            System.out.print("Opción: ");
            String va = ma_va.nextLine();

        }else{
            Mensaje.mensaje_inicial();
            Base.mostrardatos("");


            System.out.print(" ");//SALTO DE LINEA
            Scanner n_p = new Scanner(System.in);
            System.out.print("Opción: ");
            String p = n_p.nextLine();
        }

        if(4==4){
            ToursDelHotel.viajes("");
            System.out.println("Tours del Hotel");

            System.out.print(" ");//SALTO DE LINEA
            Scanner si_no = new Scanner(System.in);
            System.out.print("Opción: ");
            String no = si_no.nextLine();

        }else{
            Mensaje.mensaje_inicial();
            Base.mostrardatos("");


            System.out.print(" ");//SALTO DE LINEA
            Scanner focus_ph = new Scanner(System.in);
            System.out.print("Opción: ");
            String ph = focus_ph.nextLine();
        }

        if(5 == 5){
            FechaDeRetiro.retiro("");
            System.out.println("Día y hora del Retiro");

            System.out.print(" ");//SALTO DE LINEA
            Scanner focus_ph = new Scanner(System.in);
            System.out.print("Opción: ");
            String ph = focus_ph.nextLine();

            System.out.println("Escribe Porfavor tu dia y hora de salida");
            System.out.print(" ");//SALTO DE LINEA
            Scanner no_se = new Scanner(System.in);
            System.out.print("Opción: ");
            String se = no_se.nextLine();
        }else{
            System.out.println("Gracias por Hospedarte en");
            System.out.println("Hotel Luna de Miel");
        }

    }
}

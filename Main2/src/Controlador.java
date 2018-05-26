import java.util.Scanner;

public class Controlador {

    Controlador(){}

    public void inicioprograma() {

        String respuesta1;
        int cantpreguntas;
        int i;
        String pregunta;
        int puntajepregunta;
        Preguntas_totales pt = new Preguntas_totales();
        Prueba prueba;

        boolean estado=true;



        Scanner sc = new Scanner(System.in);

        while (estado) {

            System.out.print("Ingrese P para ingresar preguntas al repositorio o R para pedir una prueba del mismo: ");
            respuesta1 = sc.nextLine();


            if (respuesta1.equals("P")) {

                System.out.print("Ingrese la cantidad de preguntas que desea ingresar: ");
                cantpreguntas = sc.nextInt();

                for (i = 0; i <= cantpreguntas; i++) {

                    System.out.print("Ingrese la pregunta: ");
                    pregunta = sc.nextLine();

                    System.out.print("Ingrese el puntaje de la pregunta: ");
                    puntajepregunta = sc.nextInt();

                    Pregunta p = new Pregunta(pregunta, puntajepregunta);
                    pt.agregarPregunta(p);

                }

            }

            else if (respuesta1.equals("R")) {

                int tamañolista = pt.getTamaño();

                if (tamañolista == 0){
                    pt.preguntas_por_defecto();
                }

                prueba = new Prueba(pt);
                prueba.imprimepreguntas();
                estado=false;
            }
        }
    }
}

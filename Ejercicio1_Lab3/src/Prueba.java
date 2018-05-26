import java.util.ArrayList;
import java.util.Random;

public class Prueba {

    private ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();

    Prueba(Preguntas_totales pt){


        for (int i = 0; i <= 5; i++){

            preguntas.add(pt.getPregunta());

        }
    }

    public void imprimepreguntas(){

        for (Pregunta i: preguntas) {
            System.out.println(i.getPregunta() + " " + i.getPuntaje());
        }

    }



}

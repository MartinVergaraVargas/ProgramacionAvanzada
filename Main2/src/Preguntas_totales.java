import java.util.ArrayList;
import java.util.Random;

public class Preguntas_totales {

    private ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();


    public void preguntas_por_defecto(){
        preguntas.add(new Pregunta("¿ pregunta1 ?", 20));
        preguntas.add(new Pregunta("¿ pregunta2 ?", 20));
        preguntas.add(new Pregunta("¿ pregunta3 ?", 20));
        preguntas.add(new Pregunta("¿ pregunta4 ?", 20));
        preguntas.add(new Pregunta("¿ pregunta5 ?", 20));
    }


    public void agregarPregunta(Pregunta pregunta){

        preguntas.add(pregunta);
    }

    public ArrayList<Pregunta> getPreguntas(){

        return preguntas;
    }


    public int getTamaño(){
        return preguntas.size();
    }


    public Pregunta getPregunta(){

        int pregunta = (int) (Math.random() * preguntas.size());
        return preguntas.get(pregunta);
    }

}

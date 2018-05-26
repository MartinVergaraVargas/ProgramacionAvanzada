public class Pregunta {

    private int puntaje;
    private String pregunta;

    Pregunta (String pregunta, int puntaje) {

        this.puntaje = puntaje;
        this.pregunta = pregunta;
    }



    public void setPregunta(String pregunta){

        this.pregunta=pregunta;
    }

    public void setPuntaje (int puntaje) {

        this.puntaje = puntaje;
    }



    public String getPregunta(){

        return pregunta;
    }

    public int getPuntaje () {

        return puntaje;
    }


}

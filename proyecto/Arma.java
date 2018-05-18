public class Arma {
    int dispara;
    public int disparar(int boton, int botonseleccionado) {
        if(boton==botonseleccionado){
            dispara=1;
        }
        else{
            dispara=0;
        }
        return dispara;
    }
}
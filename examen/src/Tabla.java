import java.util.ArrayList;

public class Tabla {

    private Peleador peleador;

    private ArrayList<Peleador> tabla = new ArrayList<Peleador>();


    public void agregarPeleador(Peleador peleador){

        tabla.add(peleador);
    }

    public ArrayList<Peleador> getTabla(){

        return tabla;
    }


}

import java.util.ArrayList;
public class Arena {


    private Nacion nacionalidad;

    private ArrayList<Nacion> arenas = new ArrayList<Nacion>();


    public void agregarArena(Nacion arena){

        arenas.add(arena);
    }

    public ArrayList<Nacion> getArenas(){

        return arenas;
    }





}

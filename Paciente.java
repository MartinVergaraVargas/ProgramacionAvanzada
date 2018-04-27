import java.util.ArrayList;

public class Paciente
{
    public String Nombre;
    public int Edad;
    public int Peso;
    public float BMI;
    public String TipoDeSangre;
    ArrayList<String> listaMedicos;


    public Paciente(String n, int e, int p, float b, String tds, ArrayList<String> lm)
    {
        this.Nombre = n;
        this.Edad = e;
        this.Peso = p;
        this.BMI = b;
        this.TipoDeSangre = tds;
        listaMedicos = lm;
    }



    //SETTER
    public void setNombre(String n)
    {
        this.Nombre = n;
    }

    public void setEdad(int e)
    {
        this.Edad = e;
    }

    public void setPeso(int p)
    {
        this.Peso = p;
    }

    public void setBMI(float b)
    {
        this.BMI = b;
    }

    public void setTipoDeSangre(String tds)
    {
        this.TipoDeSangre = tds;
    }
    //FIN SETTER

    //GETTER
    public String getNombre()
    {
        return Nombre;
    }

    public int getEdad()
    {
        return Edad;
    }

    public int getPeso()
    {
        return Peso;
    }

    public float getBMI()
    {
        return BMI;
    }

    public String getTipoDeSangre()
    {
        return TipoDeSangre;
    }

    public ArrayList<String> getListaMedicos()
    {
        return listaMedicos;
    }
    //FIN GETTER
}

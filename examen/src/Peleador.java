public class Peleador {


    private String nombre;
    private int vitalidad;
    private Nacion nacionalidad;
    private int peso;
    private float estatura;
    private int posicion;
    private String especialidad;


    //String nombre, int vitalidad, int estatura, int peso, Nacion nacionalidad, int posicion
    Peleador () {
        this.nombre = nombre;
        this.vitalidad = vitalidad;
        this.estatura = estatura;
        this.nacionalidad = nacionalidad;
        this.peso = peso;
        this.posicion = posicion;
        this.especialidad = especialidad;
    }

    public void setNombre (String nombre) {

        this.nombre = nombre;
    }

    public String getNombre () {

        return nombre;
    }

    public void setPeso (int peso) {

        this.peso = peso;
    }

    public int getPeso () {

        return peso;
    }

    public void setEstatura(float estatura) {

        this.estatura = estatura;
    }

    public float getEstatura() {

        return estatura;
    }

    public void setVitalidad(int vitalidad) {

        this.vitalidad = 20;
    }

    public int getVitalidad() {

        return vitalidad;
    }

    public void setNacionalidad(Nacion nacionalidad) {

        this.nacionalidad = nacionalidad;
    }

    public Nacion getNacionalidad() {

        return nacionalidad;
    }

    public void setPosicion (int posicion) {

        this.posicion = posicion;
    }

    public int getPosicion () {

        return posicion;
    }

    public void setEspecialidad (String especialidad) {

        this.especialidad = especialidad;
    }

    public String getEspecialidad () {

        return especialidad;
    }

}

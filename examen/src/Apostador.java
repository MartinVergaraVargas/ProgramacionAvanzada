public class Apostador {

    private String nombre;
    private int edad;
    private Arena nacionalidad;
    private int credito;

    Apostador (String nombre, int edad, int credito, Arena nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.credito = credito;
        this.nacionalidad = nacionalidad;
    }

    public void setNombre (String nombre) {

        this.nombre = nombre;
    }

    public String getNombre () {

        return nombre;
    }

    public void setEdad(int edad) {

        this.edad = 20;
    }

    public int getEdad() {

        return edad;
    }

    public void setNacionalidad(Arena nacionalidad) {

        this.nacionalidad = nacionalidad;
    }

    public Arena getNacionalidad() {

        return nacionalidad;
    }

    public void setCredito(int credito) {

        this.credito = 5000;
    }

    public int getCredito() {

        return credito;
    }



}

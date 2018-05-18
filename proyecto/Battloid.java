import java.util.ArrayList;
import java.util.Scanner;
public class Battloid {
    Scanner read = new Scanner(System.in);
    int altura_robot;
    int selecarma;
    String respuesta;
    ArrayList<PartesArmadas> armasbattloid= new ArrayList<PartesArmadas>();
    int Estado=3;
    public int medir_battloid()
    {
        System.out.println("¿Cuántos metros medirá el modo Humanoide?(2m-12m)");
        altura_robot=read.nextInt();
        while (altura_robot>12 || altura_robot<2) {
            System.out.println("El modo Battoid no puede medir mas que 12 m ni menos que 2 m intentelo nuevamente: ");
            altura_robot=read.nextInt();
        }
        return altura_robot;
    }

    public ArrayList<PartesArmadas>  obtener_armas_battloid(ArrayList<PartesArmadas> armasbattloid)
    {
        System.out.println("¿Desea un arma en los brazos?(s/n)");
        respuesta = read.next();
        while(!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n")){
            System.out.println("¿Desea un arma en los brazos?(s/n)");
            respuesta = read.next();
        }
        if (respuesta.equalsIgnoreCase("s")) {
            System.out.println("¿Desea un arma en el brazo izquierdo o derecho(d/i)?");
            respuesta = read.next();
            while(!respuesta.equalsIgnoreCase("d") && !respuesta.equalsIgnoreCase("i")){
                System.out.println("¿Desea un arma en el brazo izquierdo o derecho(d/i)?");
                respuesta = read.next();
            }
            if (respuesta.equalsIgnoreCase("d")) {
                armasbattloid.get(1).tiene_arma = true;
                armasbattloid.get(2).tiene_arma = false;
            }
            if (respuesta.equalsIgnoreCase("i")) {
                armasbattloid.get(2).tiene_arma = true;
                armasbattloid.get(1).tiene_arma = false;
            }
        }
        if (respuesta.equalsIgnoreCase("n")) {
            armasbattloid.get(1).tiene_arma = false;
            armasbattloid.get(2).tiene_arma = false;
        }
        return armasbattloid;
    }

    public ArrayList<PartesArmadas> disparar()
    {
        System.out.println("Selecciona un arma\n1.Arma brazo derecho\n2.Arma brazo izquierdo");
        selecarma = (read.nextInt());
        if(armasbattloid.get(selecarma-1).tiene_arma == true){
            if((armasbattloid.get(selecarma-1).arma.disparar(selecarma, 1))==1){
                System.out.println("Dispara el cañon derecho");
            }
            if((armasbattloid.get(selecarma-1).arma.disparar(selecarma, 2))==1){
                System.out.println("Dispara el cañon izquierdo");
            }
        }
        if(armasbattloid.get(selecarma-1).tiene_arma == false){
            System.out.println("Arma no válida");
        }
        return armasbattloid;
    }
    public int caminar(ArrayList<Piernas> piernasbattloid)
    {
        while (Estado==3) {
            System.out.println("MODO BATTLOID");
            System.out.println("Ingresa 'a' para avanzar con la pierna izquierda\nIngresa 'd' para avanzar con la pierna derecha\nNo puedes dar dos pasos seguidos con la misma pierna\nIngresa 'g' para cambiar a modo Gerwalk\nIngresa 'p' para disparar");
            respuesta = read.next();
            if((respuesta.equalsIgnoreCase("a") && piernasbattloid.get(0).avanza==true)||(respuesta.equalsIgnoreCase("d") && piernasbattloid.get(1).avanza == true)){
                System.out.println("INCORRECTO");
            }
            if (respuesta.equalsIgnoreCase("a") && piernasbattloid.get(0).avanza == false) {
                piernasbattloid.get(0).avanza = true;
                piernasbattloid.get(1).avanza = false;
                System.out.println("Izquierda");
            }
            if (respuesta.equalsIgnoreCase("d") && piernasbattloid.get(1).avanza == false) {
                piernasbattloid.get(1).avanza = true;
                piernasbattloid.get(0).avanza = false;
                System.out.println("Derecha");
            }
            if(respuesta.equalsIgnoreCase("p")){
                disparar();
            }
            if (respuesta.equalsIgnoreCase("g")) {
                Estado = 2;
            }
        }
        return Estado;
    }
}
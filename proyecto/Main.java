import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        Robot Valkirie= new Robot();
        Pista pista= new Pista();
        pista.obtener_largo_pista();
        Valkirie.armado();
        Valkirie.acciones();
    }
}
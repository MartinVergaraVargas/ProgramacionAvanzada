import java.util.Scanner;
public class Pista {
    int largo_pista;
    Scanner read = new Scanner(System.in);
    public int obtener_largo_pista(){
        System.out.println("Si desea despegar, el largo de la pista debe ser mayor a 100");
        while(largo_pista<100) {
            System.out.println("Ingrese largo de la pista:");
            largo_pista = read.nextInt();
            read.nextLine();
        }
        return largo_pista;
    }
}

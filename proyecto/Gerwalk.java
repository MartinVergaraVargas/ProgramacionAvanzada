import java.util.ArrayList;
import java.util.Scanner;
public class Gerwalk {
    String respuesta;
    Scanner read = new Scanner(System.in);
    int selecarma;
    int cont=0;
    int[] variablesgerwalk = new int[3];
    Battloid battloid = new Battloid();
    Gerwalk() {
        variablesgerwalk[0] = 0; //altura
        variablesgerwalk[1] = 0; //velocidad
        variablesgerwalk[2] = 1; // estado
    }

    public ArrayList<PartesArmadas>   obtener_armas(PartesArmadas avion, PartesArmadas bderecho, PartesArmadas bizquierdo, ArrayList<PartesArmadas> armasgerwalk) {
        armasgerwalk.add(0,avion);
        armasgerwalk.add(1,bderecho);
        armasgerwalk.add(2,bizquierdo);
        System.out.println("¿Desea un arma en la parte superior(s/n)?");
        respuesta = read.nextLine();
        while(!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n")){
            System.out.println("¿Desea un arma en la parte superior(s/n)?");
            respuesta = read.nextLine();
        }
        if (respuesta.equalsIgnoreCase("s")) {
            armasgerwalk.get(0).tiene_arma = true;
        }
        if (respuesta.equalsIgnoreCase("n")) {
            armasgerwalk.get(0).tiene_arma = false;
        }
        armasgerwalk=battloid.obtener_armas_battloid(armasgerwalk);
        return armasgerwalk;
    }


    public void disparar_arma( ArrayList<PartesArmadas> armasgerwalk){
        if(armasgerwalk.get(0).tiene_arma==true){
            System.out.println("1. Arma superior");
        }
        if(armasgerwalk.get(1).tiene_arma==true){
            System.out.println("2. Arma brazo derecho");
        }
        if(armasgerwalk.get(2).tiene_arma==true){
            System.out.println("3. Arma brazo izquierdo");
        }
        selecarma = (read.nextInt());
        while(cont==0){
            if(selecarma>=4 || selecarma<=0){
                System.out.println("Arma Incorrecta, intenta nuevamente");
                selecarma=read.nextInt();
            }
            else {
                if(armasgerwalk.get(selecarma-1).tiene_arma==false){
                    System.out.println("Arma Incorrecta, intenta nuevamente");
                    selecarma=read.nextInt();
                }
                else{
                    cont=1;
                }
            }
        }
        if(armasgerwalk.get(selecarma-1). tiene_arma == true) {
            if ((armasgerwalk.get(selecarma - 1).arma.disparar(selecarma, 1)) == 1) {
                System.out.println("Dispara el laser superior");
            }
            if ((armasgerwalk.get(selecarma - 1).arma.disparar(selecarma, 2)) == 1) {
                System.out.println("Dispara el cañon derecho");
            }
            if ((armasgerwalk.get(selecarma - 1).arma.disparar(selecarma, 3)) == 1) {
                System.out.println("Dispara el cañon izquierdo");
            }
        }
    }


    public int[] obtener_velocidad_y_vuelo_gerwalk(ArrayList<PartesArmadas> armasgerwalk, ArrayList<Piernas> piernasbattloid) {
        while(variablesgerwalk[2]==2){
            if (variablesgerwalk[0]==0)
            {
                variablesgerwalk[1]=0;
                System.out.println("MODO GERWALK");
                System.out.println("altura : "+variablesgerwalk[0]+"\nvelocidad : " +variablesgerwalk[1]+"\nIngresa 'a' para avanzar con la pierna izquierda\nIngresa 'b' para avanzar con la pierna derecha\nNo puedes dar dos pasos seguidos con la misma pierna\nIngresa 'w' para subir\nIngresa 'b' para cambiar a modo Battloid\nIngresa 'p' para disparar");
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
                if(respuesta.equalsIgnoreCase("w")){
                    variablesgerwalk[0]=variablesgerwalk[0]+50;
                }
                if(respuesta.equalsIgnoreCase("p")){
                    disparar_arma(armasgerwalk);
                }
                if(respuesta.equalsIgnoreCase("b")){
                    variablesgerwalk[2]=3;
                }
                variablesgerwalk[1]=0;
            }
            if (variablesgerwalk[0]>0) {
                System.out.println("MODO GERWALK");
                System.out.println("Altura: " + variablesgerwalk[0] + "m\nVelocidad: " + variablesgerwalk[1] + "Km/h\nPresione 'w' para subir \nPresione 's' para bajar\nPresione 'd' para acelerar\nPresione 'a' para desacelerar\nPresiona 'p' para disparar");
                if(variablesgerwalk[0]<=200){
                    System.out.println("Presione 'b' para cambiar a modo Battloid");
                    System.out.println("Presione 'f' para cambiar a modo Fighter");
                }
                respuesta = (read.nextLine());
                if (respuesta.equalsIgnoreCase("w")) {
                    variablesgerwalk[0] = variablesgerwalk[0] + 50;
                }
                if (respuesta.equalsIgnoreCase("s")) {
                    variablesgerwalk[0] = variablesgerwalk[0] - 50;
                }
                if (respuesta.equalsIgnoreCase("d")) {
                    variablesgerwalk[1] = variablesgerwalk[1] + 50;
                }
                if (respuesta.equalsIgnoreCase("a")) {
                    variablesgerwalk[1] = variablesgerwalk[1] - 50;
                }
                if (respuesta.equalsIgnoreCase("p")) {
                    disparar_arma(armasgerwalk);
                }
                if(variablesgerwalk[0]<=200){
                    if(respuesta.equalsIgnoreCase("f")){
                        variablesgerwalk[2]=1;
                    }
                    if(respuesta.equalsIgnoreCase("b")){
                        variablesgerwalk[2]=3;
                    }
                }
                if (variablesgerwalk[1]>750){
                    variablesgerwalk[1] = variablesgerwalk[1]-50;
                }
            }
        }
        return variablesgerwalk;
    }
}

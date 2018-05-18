import java.util.ArrayList;
import java.util.Scanner;
public class Fighter {
    int selecarma;
    String acelerar;
    ArrayList<Arma>armasfighter=new ArrayList<Arma>();
    Scanner read = new Scanner(System.in);

    int[] variablesfighter = new int[3];
    Fighter() {
        variablesfighter[0] = 0; //altura
        variablesfighter[1] = 0; //velocidad
        variablesfighter[2] = 1; // estado
    }

    public int obtener_cantidad_de_armas(int cantidad_armas,Arma cañon, Arma laser1, Arma laser2, Arma laser3) {
        while (cantidad_armas != 1 && cantidad_armas != 2 && cantidad_armas != 4) {
            System.out.println("Ingrese cantidad de armas (1 - 2 - 4):");
            cantidad_armas = read.nextInt();
            if (cantidad_armas == 1) {
                System.out.print("Posee canon de misiles\n");
                armasfighter.add(0,cañon);
            }
            if (cantidad_armas == 2) {
                System.out.print("Posee canon de misiles\n");
                System.out.print("Posee canon laser\n");
                armasfighter.add(0,cañon);
                armasfighter.add(1,laser1);
            }
            if (cantidad_armas == 4) {
                System.out.print("Posee canon de misiles\n");
                System.out.print("Posee canon laser\n");
                System.out.print("Posee canon laser\nPosee canon laser\n");
                armasfighter.add(0,cañon);
                armasfighter.add(1,laser1);
                armasfighter.add(2,laser2);
                armasfighter.add(3,laser3);
            }
        }
        return cantidad_armas;
    }

    public void disparararma(int cantidad_armas){
        System.out.println("Selecciona un arma");
        if(cantidad_armas==1){
            System.out.println("Armas Válidas : 1");
        }
        if(cantidad_armas==2){
            System.out.println("Armas Válidas : 1, 2");
        }
        if(cantidad_armas==4){
            System.out.println("Armas Válidas : 1, 2, 3, 4");
        }
        selecarma = (read.nextInt());
        if (cantidad_armas == 1) {
            while(selecarma>1 || selecarma<1){
                System.out.println("Armas válidas : 1");
                selecarma=read.nextInt();
            }
            if ((armasfighter.get(selecarma-1)).disparar(selecarma,1) == 1 ) {
                System.out.println("Canon dispara");

            }
        }
        if (cantidad_armas == 2) {
            while(selecarma>2 || selecarma<1){
                System.out.println("Armas válidas : 1, 2");
                selecarma=read.nextInt();
            }
            if ((armasfighter.get(selecarma-1)).disparar(selecarma,1) == 1  ) {
                System.out.println("Canon dispara");

            }
            if ((armasfighter.get(selecarma-1)).disparar(selecarma,2) == 1) {
                System.out.println("Laser " + (1) + " dispara");

            }
        }
        if (cantidad_armas == 4) {
            while(selecarma>4 || selecarma<1){
                System.out.println("Armas válidas : 1, 2, 3, 4");
                selecarma=read.nextInt();
            }
            if ((armasfighter.get(selecarma-1)).disparar(selecarma,1) == 1) {
                System.out.println("Cañón dispara");
            }
            if ((armasfighter.get(selecarma-1)).disparar(selecarma,2) == 1 ) {
                System.out.println("Laser " + (1) + " dispara");
            }
            if ((armasfighter.get(selecarma-1)).disparar(selecarma,3) == 1 ) {
                System.out.println("Laser " + (2) + " dispara");
            }
            if ((armasfighter.get(selecarma-1)).disparar(selecarma,4) == 1  ) {
                System.out.println("Laser " + (3) + " dispara");
            }
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////7
    public int[] obtener_velocidad_y_vuelo_fighter(int cantidad_armas) {
        while(variablesfighter[2]==1){
            if(variablesfighter[0]==0){
                if (variablesfighter[1]==0){
                    read.nextLine();
                    System.out.println("MODO FIGHTER");
                    System.out.println("Velocidad: " + variablesfighter[1] + "Km/h\nPresione 'd' para acelerar\nPresione 'a' para salir\nPresiona 'p' para disparar\nPresione 'g' para cambiar a modo Gerwalk");
                    acelerar = (read.nextLine());
                    if (acelerar.equalsIgnoreCase("d")) {
                        variablesfighter[1] = variablesfighter[1] + 50;
                    }
                    if (acelerar.equalsIgnoreCase("a")) {
                        System.exit(0);
                    }
                    if(acelerar.equalsIgnoreCase("p")){
                        disparararma(cantidad_armas);
                    }
                    if(acelerar.equalsIgnoreCase("g")){
                        variablesfighter[2]=2;
                    }
                }
                if(variablesfighter[1] > 0 && variablesfighter[1]<350){
                    System.out.println("MODO FIGHTER");
                    System.out.println("Velocidad: " + variablesfighter[1] + "Km/h\nPresione 'd' para acelerar\nPresione 'a' para desacelerar\nPresiona 'p' para disparar\nPresione 'g' para cambiar a modo Gerwalk");
                    acelerar = (read.nextLine());
                    if (acelerar.equalsIgnoreCase("d")) {
                        variablesfighter[1] = variablesfighter[1] + 50;
                    }
                    if (acelerar.equalsIgnoreCase("a")) {
                        variablesfighter[1] = variablesfighter[1] - 50;
                    }
                    if(acelerar.equalsIgnoreCase("p")){
                        disparararma(cantidad_armas);
                    }
                    if(acelerar.equalsIgnoreCase("g")){
                        variablesfighter[2]=2;
                    }
                }
                if(variablesfighter[1]>=350 && variablesfighter[1]<=750){
                    System.out.println("MODO FIGHTER");
                    System.out.println("Altura: "+ variablesfighter[0]+"m\nVelocidad: "+variablesfighter[1] +"Km/h\nPresione 'w' para despegar\nPresione 'd' para acelerar\nPresione 'a' para desacelerar\nPresiona 'p' para disparar\nPresione 'g' para cambiar a modo Gerwalk");
                    acelerar = (read.nextLine());
                    if (acelerar.equalsIgnoreCase("w")) {
                        variablesfighter[0] = variablesfighter[0] + 50;
                    }
                    if (acelerar.equalsIgnoreCase("d")){
                        variablesfighter[1] = variablesfighter[1] + 50;
                    }
                    if (acelerar.equalsIgnoreCase("a")){
                        variablesfighter[1] = variablesfighter[1] - 50;
                    }
                    if(acelerar.equalsIgnoreCase("p")){
                        disparararma(cantidad_armas);
                    }
                    if(acelerar.equalsIgnoreCase("g")){
                        variablesfighter[2]=2;
                    }
                }
                if (variablesfighter[1]>750){
                    variablesfighter[1] = variablesfighter[1]-50;
                }
            }
            if(variablesfighter[0]>0 && variablesfighter[0]<=200){

                if (variablesfighter[1]==0)
                {
                    System.out.println("MODO FIGHTER");
                    System.out.println("Altura: " +variablesfighter[0]+ "m\nVelocidad: "+variablesfighter[1]+"Km/h\nPresione 'w' para subir \nPresione 's' para bajar\nPresione 'd' para acelerar\nPresiona 'p' para disparar\nPresiona 'g' para cambiar a modo Gerwalk\nPresiona 'b' para cambiar a Battloid");
                    acelerar = (read.nextLine());
                    if (acelerar.equalsIgnoreCase("w")){
                        variablesfighter[0] = variablesfighter[0] + 50;
                    }
                    if (acelerar.equalsIgnoreCase("s")){
                        variablesfighter[0] = variablesfighter[0] - 50;
                    }
                    if (acelerar.equalsIgnoreCase("d")){
                        variablesfighter[1] = variablesfighter[1] + 50;
                    }
                    if(acelerar.equalsIgnoreCase("p")){
                        disparararma(cantidad_armas);
                    }
                    if(acelerar.equalsIgnoreCase("g")){
                        variablesfighter[2]=2;
                    }
                    if (acelerar.equalsIgnoreCase("b")) {
                        variablesfighter[2]=3;
                        System.out.println("EL ROBOT HA CAIDO");
                    }
                }
                if(variablesfighter[1]>=50 && variablesfighter[1]<=750){
                    System.out.println("MODO FIGHTER");
                    System.out.println("Altura: " +variablesfighter[0]+ "m\nVelocidad: "+variablesfighter[1]+"Km/h\nPresione 'w' para subir \nPresione 's' para bajar\nPresione 'd' para acelerar\nPresione 'a' para desacelerar\nPresiona 'p' para disparar\nPresiona 'g' para cambiar a modo Gerwalk");
                    acelerar = (read.nextLine());
                    if (acelerar.equalsIgnoreCase("a")){
                        variablesfighter[1] = variablesfighter[1] - 50;
                    }
                    if (acelerar.equalsIgnoreCase("w")){
                        variablesfighter[0] = variablesfighter[0] + 50;
                    }
                    if (acelerar.equalsIgnoreCase("s")){
                        variablesfighter[0] = variablesfighter[0] - 50;
                    }
                    if (acelerar.equalsIgnoreCase("d")){
                        variablesfighter[1] = variablesfighter[1] + 50;
                    }
                    if(acelerar.equalsIgnoreCase("p")){
                        disparararma(cantidad_armas);
                    }
                    if(acelerar.equalsIgnoreCase("g")){
                        variablesfighter[2]=2;
                    }
                    if (acelerar.equalsIgnoreCase("b")) {
                        variablesfighter[2]=3;
                        System.out.println("EL ROBOT HA CAIDO");
                    }
                }
                if (variablesfighter[1]>750){
                    variablesfighter[1] = variablesfighter[1]-50;
                }
                if(variablesfighter[0]>200){
                    if (variablesfighter[1]==0){
                        System.out.println("MODO FIGHTER");
                        System.out.println("Altura: " +variablesfighter[0]+ "m\nVelocidad: "+variablesfighter[1]+"Km/h\nPresione 'w' para subir \nPresione 's' para bajar\nPresione 'd' para acelerar\nPresiona 'p' para disparar");
                        acelerar = (read.nextLine());
                        if (acelerar.equalsIgnoreCase("w")){
                            variablesfighter[0] = variablesfighter[0] + 50;
                        }
                        if (acelerar.equalsIgnoreCase("s")){
                            variablesfighter[0] = variablesfighter[0] - 50;
                        }
                        if (acelerar.equalsIgnoreCase("d")){
                            variablesfighter[1] = variablesfighter[1] + 50;
                        }
                        if(acelerar.equalsIgnoreCase("p")){
                            disparararma(cantidad_armas);
                        }
                    }
                    if(variablesfighter[1]>0 && variablesfighter[1]<=750){
                        System.out.println("MODO FIGHTER");
                        System.out.println("Altura: " +variablesfighter[0]+ "m\nVelocidad: "+variablesfighter[1]+"Km/h\nPresione 'w' para subir \nPresione 's' para bajar\nPresione 'd' para acelerar\nPresione 'a' para desacelerar\nPresiona 'p' para disparar");
                        acelerar = (read.nextLine());
                        if (acelerar.equalsIgnoreCase("w")){
                            variablesfighter[0] = variablesfighter[0] + 50;
                        }
                        if (acelerar.equalsIgnoreCase("s")){
                            variablesfighter[0] = variablesfighter[0] - 50;
                        }
                        if (acelerar.equalsIgnoreCase("d")){
                            variablesfighter[1] = variablesfighter[1] + 50;
                        }
                        if(acelerar.equalsIgnoreCase("a")){
                            variablesfighter[1]=variablesfighter[1]-50;
                        }
                        if(acelerar.equalsIgnoreCase("p")){
                            disparararma(cantidad_armas);
                        }
                    }
                    if (variablesfighter[1]>750){
                        variablesfighter[1] = variablesfighter[1]-50;
                    }
                }
            }
        }
        return variablesfighter;
    }
    ////////////////////////////////////////////
}
import java.util.Scanner;
public class Controlador {
Peleador p;
Nacion n;

    Controlador(){}

    public void inicioprograma() {

        String nombre;
        float estatura;
        int peso;
        String nacionalidad;
        String especialidad;
        Tabla t = new Tabla();
        Arena a = new Arena();









        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Definicion de peleadores: \n");


            for (int i = 0; i < 8; ++i) {

                p = new Peleador();
                n = new Nacion();

                System.out.println("ingrese el nombre del peleador " + (i + 1) + ": ");
                nombre = sc.nextLine();
                p.setNombre(nombre);

                System.out.println("ingrese la estatura del peleador " + (i + 1) + ": ");
                estatura = sc.nextFloat();
                p.setEstatura(estatura);

                System.out.println("ingrese el peso del peleador " + (i + 1) + ": ");
                peso = sc.nextInt();
                p.setPeso(peso);

                System.out.println("ingrese la nacion del peleador " + (i + 1) + ": ");
                nacionalidad = sc.nextLine();
                n.setNombre(nacionalidad);
                p.setNacionalidad(n);

                a.agregarArena(n);



                System.out.println("ingrese la especialidad del peleador " + (i + 1) + ": ");
                especialidad = sc.nextLine();
                p.setNombre(especialidad);

                p.setPosicion(i+1);

                t.agregarPeleador(p);


            }







        }



    }


}

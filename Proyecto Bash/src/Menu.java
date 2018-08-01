import java.util.Scanner;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Menu
{
    private Scanner leer;
    public Menu(){

        this.leer=new Scanner(System.in);

    }
    public  int Menupc()
    {
        int eleccion =0;
        System.out.println("Elija la opcion que desee:");
        System.out.println("1 Datos del Sistema");
        System.out.println("2 ver usuarios reales y buscar usuarios por su inicial");
        System.out.println("3 ver ficheros y procesos ");
        System.out.println("4. ver actividades de usuario");
        System.out.println("5. buscar directorio o archivos en especifico");
        eleccion = this.leer.nextInt();

        return eleccion ;

    }
    public void Menueleccion()
    {
        while(true)
        {
            int eleccion =this.Menupc();
            switch (eleccion)
            {
                case 1:
                    datosdelsistema();
                break;
                case 2:
                    usuarios();
                    break;
                case 3:
                    ficherosyprocesos();
                    break;
                case 4:
                    actividadesdeusuario();
                    break;
                case 5:
                    buscar();
                    break;
            }
        }
    }
    public void datosdelsistema()
    {
        Scanner scanner = new Scanner(System.in);

        try{
            //Process p = Runtime.getRuntime().exec("ls -llt");
            Process p = Runtime.getRuntime().exec("./bash/opcion1.bash");
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = null;

            while ((line = in.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public void usuarios()
    {
        Scanner scanner = new Scanner(System.in);
        String usuario;
        System.out.println("Buscar usuarios cuyo nombre empieze con la letra: ");
        usuario=scanner.nextLine();

        try{
            //Process p = Runtime.getRuntime().exec("ls -llt");
            Process p = Runtime.getRuntime().exec("./bash/opcion2.bash "+usuario);
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = null;

            while ((line = in.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public void ficherosyprocesos()
    {
        Scanner scanner = new Scanner(System.in);

        try{
            //Process p = Runtime.getRuntime().exec("ls -llt");
            Process p = Runtime.getRuntime().exec("./bash/opcion3.bash");
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = null;

            while ((line = in.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public void actividadesdeusuario()
    {
        Scanner scanner = new Scanner(System.in);

        try{
            //Process p = Runtime.getRuntime().exec("ls -llt");
            Process p = Runtime.getRuntime().exec("./bash/opcion4.bash ");
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = null;

            while ((line = in.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void buscar()
    {
        Scanner scanner = new Scanner(System.in);
        String buscador;
        System.out.println("Ingrese el directorio que esta buscando: ");
        buscador= scanner.nextLine();


        try{
            //Process p = Runtime.getRuntime().exec("ls -llt");
            Process p = Runtime.getRuntime().exec("./bash/opcion5.bash "+buscador);
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = null;

            while ((line = in.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

}




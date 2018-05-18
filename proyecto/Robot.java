import java.util.ArrayList;
public class Robot {
    int velocidad=0;
    int altura=0;
    int Estado=1;
    int cantidad_armas_fighter;

    Fighter fighter = new Fighter();
    Gerwalk gerwalk = new Gerwalk();
    Battloid battloid = new Battloid();
    Arma cañon=new Arma();
    Arma laser1=new Arma();
    Arma laser2=new Arma();
    Arma laser3=new Arma();
    PartesArmadas avion = new PartesArmadas();
    PartesArmadas bderecho = new PartesArmadas();
    PartesArmadas bizquierdo = new PartesArmadas();

    Piernas pderecha = new Piernas();
    Piernas pizquierda = new Piernas();

    ArrayList<PartesArmadas> armasgerwalk = new ArrayList<PartesArmadas>();

    ArrayList<Piernas> piernasbattloid = new ArrayList<Piernas>();

    Robot(){
        piernasbattloid.add(0, pizquierda);
        piernasbattloid.add(1, pderecha);
        piernasbattloid.get(0).avanza=false;
        piernasbattloid.get(1).avanza=false;
    }

    public void armado() {
        System.out.println("ENSAMBLAJE\nMODO FIGHTER");
        cantidad_armas_fighter = fighter.obtener_cantidad_de_armas(cantidad_armas_fighter,cañon,laser1,laser2,laser3);
        System.out.println("MODO GERWALK - BATTLOID");
        armasgerwalk=gerwalk.obtener_armas(avion,bderecho,bizquierdo, armasgerwalk);
        System.out.println("MODO BATTLOID");
        battloid.medir_battloid();
    }

    public void acciones(){
        while(Estado==1 || Estado==2 || Estado==3) {
            if (Estado== 1) {
                altura = fighter.obtener_velocidad_y_vuelo_fighter(cantidad_armas_fighter)[0];
                velocidad = fighter.obtener_velocidad_y_vuelo_fighter(cantidad_armas_fighter)[1];
                Estado = fighter.obtener_velocidad_y_vuelo_fighter(cantidad_armas_fighter)[2];
                gerwalk.variablesgerwalk[0] = altura;
                gerwalk.variablesgerwalk[1] = velocidad;
                gerwalk.variablesgerwalk[2] = Estado;
                battloid.Estado=Estado;
            }
            if (Estado == 2) {
                altura = gerwalk.obtener_velocidad_y_vuelo_gerwalk(armasgerwalk, piernasbattloid)[0];
                velocidad = gerwalk.obtener_velocidad_y_vuelo_gerwalk(armasgerwalk, piernasbattloid)[1];
                Estado = gerwalk.obtener_velocidad_y_vuelo_gerwalk(armasgerwalk, piernasbattloid)[2];
                fighter.variablesfighter[0] = altura;
                fighter.variablesfighter[1] = velocidad;
                fighter.variablesfighter[2] = Estado;
                battloid.Estado=Estado;
            }
            if (Estado==3){
                altura=0;
                velocidad=0;
                Estado=battloid.caminar(piernasbattloid);
                gerwalk.variablesgerwalk[2]=Estado;
                fighter.variablesfighter[2]=Estado;
                gerwalk.variablesgerwalk[0]=0;
                gerwalk.variablesgerwalk[1]=0;
            }
        }
    }
}

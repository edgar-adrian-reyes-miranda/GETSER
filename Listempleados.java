package getset;
import java.util.ArrayList;
import java.util.Scanner;

public class Listempleados {

    ArrayList<String> Listempleados;
    public static void main(String[] args) {
       Listempleados Emp = new Listempleados();
       Emp.Listempleados =new ArrayList();
       Emp.Opc1();
    }    
    
    public void Opc1(){
        Scanner elije= new Scanner (System.in);
        int opc1 = 0;
        do{
            System.out.println("1.- Agregar empleados");
            System.out.println("2.- Modificar empleados");
            System.out.println("3.- Mostrar usuarios");
            System.out.println("4.- Salir");
            System.out.println("Elije que opcion hacer: ");
            opc1 = elije.nextInt();
            switch(opc1){
                case 1:
                    agregarempleado();
                    break;
                case 2:
                    modificarempleados();
                    break;
                case 3:
                    mostrarempleados();
                break;
                case 4:
                    System.out.println("aprieta cualquier tecla para salir");
                    break;
                default: 
                    System.out.println("Error esa opcion no existe");
                    
            }
        }while(opc1 != 4);        
    }
    public void  agregarempleado(){
        Scanner lista = new Scanner(System.in);
        String name;
        String fistname;
        
        System.out.println("Empleado de una empresa");
        System.out.print("Ingresa el nombre del  empleado: " );
    name = lista.nextLine();
        System.out.print("Ingresa el apellido del empleado: ");
     fistname = lista.nextLine();
        System.out.print("Ingrea la edad que tiene el empleado: ");
String old = lista.nextLine ();    
    Listempleados.add(name);
    Listempleados.add(fistname);
    Listempleados.add(old);
        System.out.println("Se agrego los empleados: " +name+ "  " +fistname+ " " +old+ " \n ");
    }
public void modificarempleados(){
    Scanner lista = new Scanner(System.in);
    String name, fistname, old;
    String newname, newfistname, newold;
    int incio; 
    System.out.println(Listempleados);
    System.out.println("Escribe el nombre del empleado: ");
    name = lista.nextLine();
    System.out.println("Escribe el apellido del empleado: ");
    fistname =lista.nextLine();
    System.out.println("Escribe la edad del empleado: ");
    old = lista.nextLine();
    incio = Listempleados.indexOf(name);
    incio = Listempleados.indexOf(fistname); 
    incio = Listempleados.indexOf(old);
    if(incio != -1 )
{System.out.println("Nuevo nombre: ");
    newname = lista.nextLine();
    System.out.println("Nuevo apellido: ");
    newfistname =lista.nextLine();
    System.out.println("Nueva edad: ");
    newold =lista.nextLine();
            
Listempleados.set(incio, newname);
Listempleados.set(incio, newfistname);
Listempleados.set(incio, newold);
    System.out.println("Se modifico el(la)emplead@:  " +newname+" " +newfistname+ " " +newold+"   \n" );
}else{
        System.out.println("El dato que dijito no se encuentra");
    }
            }

public void mostrarempleados(){
    if(!Listempleados.isEmpty()){
        System.out.println("Muestra de los elementos ");
        for(int i=0; i < Listempleados.size(); i++){
            
            System.out.print( Listempleados.get(i) );
            System.out.println( );
            System.out.println( );
        }
    }
    else{
        System.out.println("no  existe");
    }
}
}


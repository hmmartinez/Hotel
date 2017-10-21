        package hotel;
        import java.util.Scanner;
        public class Hotel {

         
        public static ArrayClientes xy = new ArrayClientes();
        
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int opc = 0;
    do {
                
        System.out.println("*********** REGISTRO ***********");
        System.out.print("\n1. Verificar habitaciones");
        System.out.print("\n2. Reservar habitación");
        System.out.print("\n3. Retirar Reservacion de habitacion");
        System.out.print("\n4. Finanzas");
        System.out.print("\n5.Salir");
        
        System.out.println("\nElija una opción: ");
        opc = leer.nextInt();
                
        switch(opc){
   
        case 1:
            System.out.print("");
            xy.mostrarClientes();
            System.out.print("");
            xy.Ocupadas();
            System.out.print("");
        break;
        
        
        case 2:
        int a = 0;
          
            while(a!=4){
            System.out.println("-------Tipo de habitacion------");
            System.out.println("1-Sencillas \n2-Dobles \n3-Suites \n4-Atras ");
            System.out.print("Ingrese opcion :");a=leer.nextInt();
                

                switch(a){
                
                
                case 1:
                    int o=0;
                    System.out.println("------Pisos--------");
                    System.out.println(" 1-Primer piso\n 2-Segundo piso ");
                    System.out.print("Ingrese opcion :");
                   o=leer.nextInt();
                    if(o==1){
                      
                xy.reservando(4);
                    }else if(o==2){
                    xy.reservando(3);
                    
                    }
                break;
                
                case 2:
                    int j=0;
                    System.out.println("------Pisos--------");
                    System.out.println(" 1-Tercer piso\n 2-Cuarto piso ");
                    System.out.print("Ingrese opcion :");
                   j=leer.nextInt();
                    if(j==1){
                      
                xy.reservando(2);
                    }else if(j==2){
                    xy.reservando(1);
                    
                    }
                    break;
                case 3:
                
                    System.out.println("------Suites--------");
                   
                    xy.reservando(0);
                    
                    
                    break;
                    
                case 4:
                    break;
              
            
            }
            
            }
            break;
        case 3:
          int op = 0;
          
            while(op!=4){
            System.out.println("-------Tipo de habitacion------");
            System.out.println("1-Sencillas \n2-Dobles \n3-Suites \n4-Atras ");
            System.out.print("Ingrese opcion :");op=leer.nextInt();
                
                switch(op){
                
                
                case 1:
                    int o=0;
                    System.out.println("------Pisos--------");
                    System.out.println(" 1-Primer piso\n 2-Segundo piso ");
                    System.out.print("Ingrese opcion :");
                   o=leer.nextInt();
                    if(o==1){
                      
                xy.retirarReservacion(4);
                    }else if(o==2){
                    xy.retirarReservacion(3);
                    
                    }
                break;
                
                case 2:
                  
                    int j=0;
                    System.out.println("------Pisos--------");
                    System.out.println(" 1-Tercer piso\n 2-Cuarto piso ");
                    System.out.print("Ingrese opcion :");
                   o=leer.nextInt();
                    if(j==1){
                      
                xy.retirarReservacion(2);
                    }else if(j==2){
                    xy.retirarReservacion(1);
                    
                    }
                    break;
                case 3:
                
                    System.out.println("------Suites--------");
                   
                    xy.retirarReservacion(0);
                    
                    
                    break;
                    
                case 4:
                    break;

            }
            }
            break;
        case 4:
           System.out.print(" "); 
            xy.dineroSencillas();
            xy.dineroDobles();
            xy.dineroSuits();
            xy.dineroTotal();
           System.out.print(" ");
            break;
        
        case 5:
            System.out.println("Saliendo...");
        }
    } while(opc!=5);
            }
        }
        
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Posicion obj;

        Scanner input = new Scanner(System.in);
        
        // Solicitar posicion inicial
        int x, y;
        System.out.println("Posición inicial:");
        do { 
            System.out.print("Ingrese la posición en x (0-9): ");
            x = input.nextInt();
        } while (x < 0 || x > 9);

        do { 
            System.out.print("Ingrese la posición en y (0-9): ");
            y = input.nextInt();
        } while (y < 0 || y > 9);

        // Establecer posición inicial
        obj = new Posicion(x, y);


        // Menú para mover el objeto
        int res;
        do {
            // Mostrar tablero inicial
            System.out.println("Posición inicial: ("+x+", "+y+")");
            obj.getPosicion();
            int opcion;
            System.out.println("Para cambiar la posición del objeto... ");
            System.out.println("1) Mover a la izquierda.");
            System.out.println("2) Mover a la derecha.");
            System.out.println("3) Mover hacia arriba.");
            System.out.println("4) Mover hacia abajo.");
            System.out.println("0) Salir.");
            System.out.print("Ingrese una opción: ");
            opcion = input.nextInt();

            // Desplazar el objeto
            int desplazamiento;
            switch (opcion) {
                case 0:
                    System.out.println("Saliendo...");
                    res = 0;
                    break;
                case 1:
                    System.out.print("Ingrese la cantidad de posiciones que desea desplazar hacia la izquierda: ");
                    desplazamiento = input.nextInt();
                    x = obj.moverIzquierda(desplazamiento);
                    if (x<0){
                        System.out.println("Movimiento inválido. El objeto no puede salir del tablero."); 
                        break; 
                    }
                    obj = new Posicion(x, y);
                    obj.getPosicion();
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad de posiciones que desea desplazar hacia la derecha: ");
                    desplazamiento = input.nextInt();
                    x = obj.moverDerecha(desplazamiento);
                    if (x>9){
                        System.out.println("Movimiento inválido. El objeto no puede salir del tablero.");  
                        break;
                    }

                    obj = new Posicion(x, y);
                    obj.getPosicion();
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad de posiciones que desea desplazar hacia arriba: ");
                    desplazamiento = input.nextInt();
                    y = obj.moverArriba(desplazamiento);
                    if (y<0){
                        System.out.println("Movimiento inválido. El objeto no puede salir del tablero.");  
                        break;
                    }
                    obj = new Posicion(x, y);
                    obj.getPosicion();
                    break;
                case 4:
                    System.out.print("Ingrese la cantidad de posiciones que desea desplazar hacia abajo: ");
                    desplazamiento = input.nextInt();
                    y = obj.moverAbajo(desplazamiento);
                    if (y>9){
                        System.out.println("Movimiento inválido. El objeto no puede salir del tablero.");
                        break;  
                    }
                    obj = new Posicion(x, y);
                    obj.getPosicion();
                    break;
                default:
                    System.out.println("Opción no encontrada.");
                    break;
            }
            System.out.println("Desea volver a cambiar la posición del objeto? (1: Sí, 0: No)");
            res = input.nextInt();
        } while (res != 0);
        
        
    }
}

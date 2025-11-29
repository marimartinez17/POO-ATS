public class Posicion {
    // Atributos
    int x;
    int y;

    // Constructor
    public Posicion(int x, int y){
        this.x = x;
        this.y = y;
    }

    // Métodos para cambiar de posición
    public int moverIzquierda(int desplazamiento){
        this.x = this.x - desplazamiento;
        return this.x;
    }

    public int moverDerecha(int desplazamiento){
        this.x = this.x + desplazamiento;
        return this.x;
    }

    public int moverArriba(int desplazamiento){
        this.y = this.y - desplazamiento;
        return this.y;
    }

    public int moverAbajo(int desplazamiento){
        this.y = this.y + desplazamiento;
        return this.y;
    }

    // Método getter
    public void getPosicion(){
        int tablero[][] = new int[10][10];
        for(int i=0;i<tablero.length;i++){
            for (int j=0;j<tablero[i].length;j++){
                if (i == this.y && j==this.x){
                    tablero[i][j] = 1;
                    System.out.print("["+tablero[i][j]+"]");
                } else {
                    tablero[i][j] = 0;
                    System.out.print("["+tablero[i][j]+"]");
                }
            }
            System.out.println();
        }
    }
}

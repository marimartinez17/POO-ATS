
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Cuadrilatero forma1;

        float l1, l2;
        l1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el lado #1 del cuadrilatero: "));
        l2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el lado #2 del cuadrilatero: "));

        if (l1==l2){
            forma1 = new Cuadrilatero(l1);
        } else {
            forma1 = new Cuadrilatero(l1,l2);
        }

        System.out.println("El perímetro es: "+forma1.getPerimetro());
        System.out.println("El área es: "+forma1.getArea());
    }
}

import javax.swing.JOptionPane;

public class UncheckedException {
    public static void main(String[] args) {

        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

    try{
        int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
        System.out.println("Resultado: " + resultado);
    }catch (NumberFormatException e){
        System.out.println("Error: " + e.getMessage());
    }
}
    public static int dividir(int a, int b) {
        return a / b;
    }
}

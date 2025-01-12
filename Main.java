import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Venda venda1 = new Venda();
        Producte producte1 = new Producte("Carxofa", 2.05);


        try {
            venda1.calcularTotal(); // EmptyPurchaseException test
        } catch (VendaBuidaException e) {
            System.out.println(e.getMessage());
        }

        venda1.addProduct(producte1);
        System.out.println("Preu total abans d'afegir producte: " + venda1.getPreuTotalDeLaVenda());

        try {
            venda1.calcularTotal();
        } catch (VendaBuidaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Preu total després d'afegir producte: " + venda1.getPreuTotalDeLaVenda() + "\n");

        try {
            //throw new ArrayIndexOutOfBoundsException();
            String[] numbers = { "un", "dos", "tres" };
            System.out.println(numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("La següent excepció ha sigut llançada: " + e);
        }

    }
}
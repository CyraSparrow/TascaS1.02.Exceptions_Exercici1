import java.util.ArrayList;
import java.util.List;

public class Venda {

    private ArrayList<Producte> ColeccioDeProductes;

    private double PreuTotalDeLaVenda;

    public Venda() {

        ColeccioDeProductes = new ArrayList<>();

    }
    public double getPreuTotalDeLaVenda() {
        return PreuTotalDeLaVenda;
    }


    public void addProduct(Producte producte) {
        ColeccioDeProductes.add(producte);

    }

    public void calcularTotal() throws VendaBuidaException {
        if (ColeccioDeProductes.size() == 0) {
            throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
        } double total = 0;
            for (Producte producte : ColeccioDeProductes) {
                total += producte.getPreu();
            }
            PreuTotalDeLaVenda = total;
            System.out.println("El preu final de la venda és: " + PreuTotalDeLaVenda + "€");
        }

}




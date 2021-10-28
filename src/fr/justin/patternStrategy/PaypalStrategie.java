package fr.justin.patternStrategy;

public class PaypalStrategie implements PaiementStrategy {
    String id, mdp;

    public PaypalStrategie(String id, String mdp) {
        this.id = id;
        this.mdp = mdp;
    }

    @Override
    public void payer(int montant) {
        System.out.println(montant + "€ payé avec Paypal");
    }
}

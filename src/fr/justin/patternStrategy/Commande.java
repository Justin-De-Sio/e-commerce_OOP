package fr.justin.patternStrategy;

import fr.justin.pannier.Pannier;

public class Commande {
    Pannier pannier;
    PaiementStrategy paiementStrategy;

    public Commande(PaiementStrategy paiementStrategy) {
        this.paiementStrategy = paiementStrategy;
    }

    public Commande(Pannier pannier, PaiementStrategy paiementStrategy) {
        this.pannier = pannier;
        this.paiementStrategy = paiementStrategy;
    }

    public void payOrder() {
        paiementStrategy.payer(pannier.countSum());
        System.out.println("Order complet ! Thank you !");
        pannier.getPannier().clear();
    }
}

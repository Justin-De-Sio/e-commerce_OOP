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

    public void terminerCommande() {
        paiementStrategy.payer(pannier.countSum());
    }
}

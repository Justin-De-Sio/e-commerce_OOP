package fr.justin.patternStrategy;

public class CarteDePaiementStrategy implements PaiementStrategy {
    int numeroDeCarte;
    int cryptoGramme;
    int numeroExpiration;


    public CarteDePaiementStrategy(int numeroDeCarte, int cryptoGramme, int numeroExpiration) {
        this.numeroDeCarte = numeroDeCarte;
        this.cryptoGramme = cryptoGramme;
        this.numeroExpiration = numeroExpiration;
    }

    @Override
    public void payer(int montant) {
        System.out.println(montant+"€ payer en carte bleu");
    }
}

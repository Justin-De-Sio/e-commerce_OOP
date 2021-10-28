package fr.justin.pannier;

import fr.justin.patternObserver.Publisher;

public class Article {
    String nom;
    float prix;

    public Publisher getPublisher() {
        return publisher;
    }

    Publisher publisher;

    public Article(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
        this.publisher = new Publisher();
    }

    @Override
    public String toString() {
        return nom+" : "+prix+'€';
    }


    public float getPrix() {
        return prix;
    }

    public String getNom() {
        return nom;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void promo(float promotion) {
        this.prix = this.prix * (1 - (promotion / 100));
        publisher.notifySubscriber(promotion, nom);
    }
}

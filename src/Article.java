import java.util.Comparator;

public class Article  {
    String nom;
    int prix;

    public Article(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Article{" +
                "nom='" + nom + '\'' +
                ", prix='" + prix + '\'' +
                '}';
    }


    public int getPrix() {
        return prix;
    }

    public String getNom() {
        return nom;
    }


}

package fr.justin;

import fr.justin.pannier.*;
import fr.justin.patternStrategy.*;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Pannier pannier = new Pannier(new ArrayList<>());
        pannier.add(new Article("sony XM3", 250));
        pannier.add(new Article("souris logitech", 17));
        pannier.add(new Article("ps4", 350));

        PaypalStrategie paypalStrategie = new PaypalStrategie("exemple@live.fr", "motdepasse");

        Commande commande = new Commande(pannier, paypalStrategie);
        System.out.println(pannier);
        pannier.getPannier().sort(new ArticleComparator());
        System.out.println(pannier);
        commande.terminerCommande();


    }
}

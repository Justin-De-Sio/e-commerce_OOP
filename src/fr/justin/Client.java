package fr.justin;

import fr.justin.pannier.Article;
import fr.justin.pannier.ArticleComparator;
import fr.justin.pannier.Pannier;
import fr.justin.patternObservator.MailAlertSubscriber;
import fr.justin.patternObservator.PhoneAlrtSubscriber;
import fr.justin.patternStrategy.Commande;
import fr.justin.patternStrategy.PaypalStrategie;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {

        Pannier pannier = new Pannier(new ArrayList<>());

        Article xm3 = new Article("sony XM3", 250),
                xm4 = new Article("sony XM4", 250),
                ps4 = new Article("ps4", 350),
                souris = new Article("souris logitech", 17);

        pannier.add(ps4);
        pannier.add(xm3);

        ps4.getPublisher().subscribe(new MailAlertSubscriber());
        xm3.getPublisher().subscribe(new PhoneAlrtSubscriber());
        xm3.promo(30);

        PaypalStrategie paypalStrategie = new PaypalStrategie("exemple@live.fr", "motdepasse");
        Commande commande = new Commande(pannier, paypalStrategie);

        System.out.println(pannier);
        pannier.getPannier().sort(new ArticleComparator());
        System.out.println(pannier);

        commande.payOrder();
        System.out.println(pannier);

    }
}

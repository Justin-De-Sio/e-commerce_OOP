package fr.justin;

import fr.justin.article.Article;
import fr.justin.article.ArticleComparator;
import fr.justin.article.Pc;
import fr.justin.pannier.Pannier;
import fr.justin.patternObserver.MailAlertSubscriber;
import fr.justin.patternObserver.PhoneAlrtSubscriber;
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
        Pc pc = new Pc.PcBuilder("pcCUSTOM", 0F).addGpu(new Article("gtx1080", 500)).addCpu(new Article("i5", 200)).addRam(new Article("Crucial 16Go ddr4", 100)).build();
        pannier.add(ps4);
        pannier.add(xm3);
        pannier.add(pc);

        ps4.getPublisher().subscribe(new MailAlertSubscriber());
        xm3.getPublisher().subscribe(new PhoneAlrtSubscriber());
        xm3.promo(30);

        PaypalStrategie paypalStrategie = new PaypalStrategie("exemple@live.fr", "motdepasse");
        Commande commande = new Commande(pannier, paypalStrategie);

        pannier.getPannier().sort(new ArticleComparator());
        System.out.println(pannier);

        commande.payOrder();
        System.out.println(pannier);

    }
}

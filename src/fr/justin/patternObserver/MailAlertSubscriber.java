package fr.justin.patternObserver;

public class MailAlertSubscriber implements Subscriber {
    @Override
    public void update(float promotion, String nom) {
        System.out.println("Bonjour,\n" +
                "Nous sommes heureux de vous annoncé que nous avons mis en  promotion de " + promotion + "% sur l'article " + nom + "\n");
    }
}

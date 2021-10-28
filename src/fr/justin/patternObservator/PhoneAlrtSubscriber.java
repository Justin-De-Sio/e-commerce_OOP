package fr.justin.patternObservator;

public class PhoneAlrtSubscriber implements Subscriber {
    @Override
    public void update(float promotion, String nom) {
        System.out.println("ATTENTION promotion de " + promotion + "% sur l'article " + nom);
    }
}

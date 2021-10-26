package fr.justin.pannier;

import java.util.ArrayList;

public class Pannier {
    private ArrayList<Article> pannier ;

    @Override
    public String toString() {
        return "fr.justin.pannier.Pannier{" +
                "fr.justin.pannier=" + pannier +
                '}';
    }

    public Pannier(ArrayList<Article> pannier) {
        this.pannier = pannier;
    }
    public ArrayList<Article> getPannier(){
        return pannier;
    }
    public void add(Article article){
        pannier.add(article);
    }
    public void remove(Article article){
        pannier.remove(article);
    }

    public int countSum(){
        int cpt=0;
        for (Article article: pannier){
            cpt+=article.getPrix();
        }
        return cpt;
    }

}

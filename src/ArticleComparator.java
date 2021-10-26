import java.util.Comparator;

public class ArticleComparator implements Comparator<Article> {
    @Override
    public int compare(Article article1, Article article2) {
        if (article1.getPrix()==article2.getPrix()){
            return article1.getNom().compareTo(article2.getNom());
        }
        return article1.getPrix()-article2.getPrix();
    }
}

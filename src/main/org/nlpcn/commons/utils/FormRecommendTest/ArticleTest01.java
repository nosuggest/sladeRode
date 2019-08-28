package main.org.nlpcn.commons.utils.FormRecommendTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by slade on 2019/8/26.
 */
public class ArticleTest01 {

    List<Article> getRecommendation(Article article) {
        List<Article> formreponse = new ArrayList<Article>();

        Article newArticle = new Article();
        newArticle.setAmount(article.getAmount() + 1);
        newArticle.setArtNo(article.getArtNo() + 2);
        newArticle.setName(article.getName() + "  wow!");

        formreponse.add(newArticle);
        return formreponse;
    }

    public static void main(String[] args) {
        ArticleTest01 t = new ArticleTest01();
        Article article = new Article(123, 21, "jack");
        System.out.println(article);
        article.toString();
        List<Article> ans = t.getRecommendation(article);
        System.out.println(ans);
    }
}

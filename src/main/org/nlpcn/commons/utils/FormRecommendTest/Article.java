package main.org.nlpcn.commons.utils.FormRecommendTest;

/**
 * Created by slade on 2019/8/26.
 */
public class Article {
    private int artNo;
    private int amount;
    private String name;

    public Article() {
    }

    public Article(int artNo, int amount, String name) {
        this.artNo = artNo;
        this.amount = amount;
        this.name = name;
    }

    public int getArtNo() {
        return artNo;
    }

    public void setArtNo(int artNo) {
        this.artNo = artNo;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Article{" +
                "artNo=" + artNo +
                ", amount=" + amount +
                ", name='" + name + '\'' +
                '}';
    }
}

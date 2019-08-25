package main.org.nlpcn.commons.utils.封装;

public class datTest {
    private final int AGE = 10;
    private int Year = 2018;
    private String name = "Slade";
    private String[] hit = new String[]{"S","A"};

    public int getAGE() {
        return AGE;
    }

    public int getYear() {
        return Year;
    }

    public String getName() {
        return name;
    }

    public String[] getHit() {
        return hit;
    }
    //year != Year
    public void setYear(int year) {
        Year = year;
    }

    //name == name ,此处需要用this代指本对象自身
    public void setName(String name) {
        this.name = name;
    }

    public void setHit(String[] hit) {
        this.hit = hit;
    }
}

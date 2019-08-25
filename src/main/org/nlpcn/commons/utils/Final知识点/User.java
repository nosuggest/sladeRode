package main.org.nlpcn.commons.utils.Final知识点;

public class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    private int id;
    public User(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

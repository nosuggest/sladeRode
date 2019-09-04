package main.org.nlpcn.commons.utils.Arrays;

import java.util.ArrayList;

public class Room {
    private String no;
    private String type;
    private boolean isUse;

    public Room(String no, String type, boolean isUse) {
        this.no = no;
        this.type = type;
        this.isUse = isUse;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isUse() {
        return isUse;
    }

    public void setUse(boolean use) {
        isUse = use;
    }

    @Override
    public String toString() {
        return "Room{" +
                "no='" + no + '\'' +
                ", type='" + type + '\'' +
                ", isUse=" + isUse +
                '}';
    }
}

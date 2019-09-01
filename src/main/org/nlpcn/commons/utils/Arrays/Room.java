package main.org.nlpcn.commons.utils.Arrays;

import java.util.ArrayList;

public class Room {
    String No;
    //0:普通，1：双人，2豪华
    String type;
    boolean isUsed;
    int maxId = 0;
}

class Hotel {
    // 5层，10间
    // 1,2标准间
    //3,4双人间
    //5豪华
    Room[][] room;

    public Hotel() {
        this(5, 10);
    }

    public Hotel(int rows, int cols) {
        int idx = 1;
        room = new Room[rows][cols];
        //有参构造方法
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                room[i][j] = new Room();
                room[i][j].No = String.valueOf(idx);
                room[i][j].isUsed = false;
                if (i <= 1) {
                    room[i][j].type = "common";
                } else if (i <= 3) {
                    room[i][j].type = "double";
                } else {
                    room[i][j].type = "rich";
                }
                idx++;
                room[i][j].maxId = rows * cols;
            }
        }
    }

    public void houseOrder(String orderType) {
        if (orderType != "common" && orderType != "double" && orderType != "rich") {
            System.out.println("the room is not exist");
            return;
        }
        if (orderType == "common") {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 10; j++) {
                    if (room[i][j].isUsed == false) {
                        System.out.println("the room is free,and the no of the room is " + room[i][j].No + " and the room is " + room[i][j].type + " type");
                        room[i][j].isUsed = true;
                        return;
                    } else {
                        System.out.println("the room is busy，please change another one type");
                    }
                }
            }
        } else if (orderType == "double") {
            for (int i = 2; i < 4; i++) {
                for (int j = 0; j < 10; j++) {
                    if (room[i][j].isUsed == false) {
                        System.out.println("the room is free,and the no of the room is " + room[i][j].No + " and the room is " + room[i][j].type + " type");
                        room[i][j].isUsed = true;
                        return;
                    } else {
                        System.out.println("the room is busy，please change another one type");
                    }
                }
            }
        } else if (orderType == "rich") {
            for (int i = 4; i < 5; i++) {
                for (int j = 0; j < 10; j++) {
                    if (room[i][j].isUsed == false) {
                        System.out.println("the room is free,and the no of the room is " + room[i][j].No + " and the room is " + room[i][j].type + " type");
                        room[i][j].isUsed = true;
                        return;
                    } else {
                        System.out.println("the room is busy，please change another one type");
                    }
                }
            }
        } else {
            System.out.println("all room is busy，please change hotel");
        }
    }

    public void houseRender(int roomId) {

        if (roomId > room[0][0].maxId) {
            System.out.println("the room is not exsit,please check again");
            return;
        }
        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[0].length; j++) {
                if (room[i][j].No==String.valueOf(roomId)){
                    if (room[i][j].isUsed == false) {
                        System.out.println("the room is not in use,please check again");
                        return;
                    } else {
                        room[i][j].isUsed = false;
                        System.out.println("houseRender over");
                        return;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Hotel SevenDay = new Hotel(5, 10);
        SevenDay.houseOrder("rich");
        SevenDay.houseOrder("rich");
        SevenDay.houseOrder("common");
    }

}

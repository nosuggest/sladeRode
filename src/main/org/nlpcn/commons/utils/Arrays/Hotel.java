package main.org.nlpcn.commons.utils.Arrays;

public class Hotel {
    // 房间
    Room[][] rooms;

    public Hotel() {
        this(5, 10);
    }

    public Hotel(int row, int col) {
        rooms = new Room[row][col];

        for (int i = 0; i < rooms.length; i++) {
            int idx = 0;
            for (int j = 0; j < rooms[i].length; j++) {
                if (i == 0 || i == 1) {
                    rooms[i][j] = new Room(String.valueOf((i + 1) * 100 + idx), "标准", false);
                } else if (i == 2 || i == 3) {
                    rooms[i][j] = new Room(String.valueOf((i + 1) * 100 + idx), "双人", false);
                } else {
                    rooms[i][j] = new Room(String.valueOf((i + 1) * 100 + idx), "豪华", false);
                }
                idx++;
            }
        }
    }

    public void print() {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.println(rooms[i][j] + "    ");
            }
            System.out.println(" ");
        }
    }

    public void order(String no) {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (rooms[i][j].getNo().equals(no)) {
                    if (!rooms[i][j].isUse()) {
                        rooms[i][j].setUse(true);
                        return;
                    } else {
                        System.out.println("in used");
                        return;
                    }
                }
            }
        }
    }

    public void refund(String no) {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (rooms[i][j].getNo().equals(no)) {
                    if (rooms[i][j].isUse()) {
                        rooms[i][j].setUse(false);
                        System.out.println("refund sucessfully");
                        return;
                    } else {
                        System.out.println("not is use");
                        return;
                    }
                }
            }
        }
    }
}



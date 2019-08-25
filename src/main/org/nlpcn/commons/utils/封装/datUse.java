package main.org.nlpcn.commons.utils.封装;

import java.util.Arrays;

public class datUse {
    public static void main(String[] args) {
        datTest dT =new datTest();
        System.out.println(dT);
        System.out.println(dT.getAGE());
        System.out.println(Arrays.toString(dT.getHit()));
        dT.setHit(new String[]{"S+"});
        System.out.println(Arrays.toString(dT.getHit()));
        System.out.println(dT.getYear());
        dT.setYear(2011);
        System.out.println(dT.getYear());
    }

}

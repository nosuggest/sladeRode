package main.org.nlpcn.commons.utils.Decorator;

public class Test02 {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        bufferedReader.close();
    }
}

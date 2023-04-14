import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner mattson = new Scanner(System.in);
        int girls;
        int boys;
        int people;
        girls = 11;
        boys = 6;
        people = girls & boys;
        System.out.println(people);
    }
}
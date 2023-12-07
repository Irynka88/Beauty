import java.util.Scanner;
public class PhoneNumber extends Number {
    int num;

    public PhoneNumber(int num) {
        this.num = num;
    }

    public PhoneNumber() {
    }

    Scanner scan = new Scanner(System.in);
    @Override
    void number() {
        System.out.println(scan.nextInt());
    }
}

package Package;

import Package.test.PMessage;

public class PDemo {
    public static void main(String[] args) {
        PMessage msg = new PMessage() ;
        System.out.println(msg.PSend());
    }
}

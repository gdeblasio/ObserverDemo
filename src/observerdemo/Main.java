package observerdemo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ConcreteSubject cs = new ConcreteSubject();
        Observer hexObserver = new HexObserver(cs);
        Observer octObserver = new OctObserver(cs);
        Observer binObserver = new BinObserver(cs);
        cs.add(hexObserver);
        cs.add(octObserver);
        cs.add(binObserver);

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nIntroducir número decimal: ");
            int n = scanner.nextInt();
            if (n == 0) break;
            cs.setState(n);
        }
        
        cs.remove(binObserver);
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIntroducir número: ");
        cs.setState(scanner.nextInt());
    }
}

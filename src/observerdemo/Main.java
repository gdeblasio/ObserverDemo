package observerdemo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ConcreteSubject cs = new ConcreteSubject();
        HexObserver hexObserver = new HexObserver(cs);
        OctObserver octObserver = new OctObserver(cs);
        BinObserver binObserver = new BinObserver(cs);
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

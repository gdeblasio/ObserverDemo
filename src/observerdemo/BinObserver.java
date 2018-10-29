package observerdemo;

public class BinObserver implements Observer {
    private final ConcreteSubject concreteSubject;

    public BinObserver(ConcreteSubject cs) {
        this.concreteSubject = cs;
    }
    
    @Override
    public void update() {
        System.out.println("Binario: " + 
                Integer.toBinaryString(concreteSubject.getState()));
    }
    
}

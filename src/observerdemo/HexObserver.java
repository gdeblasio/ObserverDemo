package observerdemo;

public class HexObserver implements Observer {
    private final ConcreteSubject concreteSubject;
    
    public HexObserver(ConcreteSubject cs) {
        this.concreteSubject = cs;
    }
    
    @Override
    public void update() {
        System.out.println("Hexadecimal: " + 
                Integer.toHexString(concreteSubject.getState()).toUpperCase());
    }
    
}

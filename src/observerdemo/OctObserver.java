package observerdemo;

public class OctObserver implements Observer {
    private final ConcreteSubject concreteSubject;

    public OctObserver(ConcreteSubject cs) {
        this.concreteSubject = cs;
    }
    
    @Override
    public void update() {
        System.out.println("Octal: " + 
                Integer.toOctalString(concreteSubject.getState()));
    }
}

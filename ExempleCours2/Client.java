abstract class Automobile {
    public abstract void methodeAutomobile();
}

class AutomobileElectrique extends Automobile {
    @Override
    public void methodeAutomobile(){
        System.out.println("AutomobileElectrique.methodeAutomobile()");
    }
}

class AutomobileEssence extends Automobile {
    @Override
    public void methodeAutomobile(){
        System.out.println("AutomobileEssence.methodeAutomobile()");
    }
}

abstract class Scooteur {
    public abstract void methodeScooteur();
}

class ScooteurElectrique extends Scooteur {
    @Override
    public void methodeScooteur(){
        System.out.println("ScooteurElectrique.methodeScooteur()");
    }
}

class ScooteurEssence extends Scooteur {
    @Override
    public void methodeScooteur(){
        System.out.println("ScooteurEssence.methodeScooteur()");
    }
}

abstract class AbstractFactory {
    protected abstract Automobile createAutomobile();
    protected abstract Scooteur createScooteur();
}

class FabriqueEssence extends AbstractFactory {
    @Override
    public Automobile createAutomobile() {
        return new AutomobileEssence();
    }
    
    @Override
    public Scooteur createScooteur() {
        return new ScooteurEssence();
    }
}

class FabriqueElectrique extends AbstractFactory {
    @Override
    public Automobile createAutomobile() {
        return new AutomobileElectrique();
    }
    
    @Override
    public Scooteur createScooteur() {
        return new ScooteurElectrique();
    }
}

class Client {
    public static void main(String[] args){
        System.out.println("Abstract Factory");

        FabriqueEssence fabriqueEssence = new FabriqueEssence();
        FabriqueElectrique fabriqueElectrique = new FabriqueElectrique();

        Automobile automobile;
        Scooteur scooteur;

        System.out.println("Utilisation de la fabrique essence");
        scooteur = fabriqueEssence.createScooteur();
        automobile = fabriqueEssence.createAutomobile();
        scooteur.methodeScooteur();
        automobile.methodeAutomobile();
        
        System.out.println("Utilisation de la fabrique automobile");
        scooteur = fabriqueElectrique.createScooteur();
        automobile = fabriqueElectrique.createAutomobile();
        scooteur.methodeScooteur();
        automobile.methodeAutomobile();
    }
}


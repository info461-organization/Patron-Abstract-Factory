interface IProduitA {
    void methodeProduitA();
}

interface IProduitB {
    void methodeProduitB();
}

interface IAbstractFactory {
    IProduitA createProduitA();
    IProduitB createProduitB();
}

class ProduitA1 implements IProduitA {
    @Override
    public void methodeProduitA() {
        System.out.println("ProduitA1.methodeProduitA");
    }
}

class ProduitA2 implements IProduitA {
    @Override
    public void methodeProduitA() {
        System.out.println("ProduitA2.methodeProduitA");
    }
}

class ProduitB1 implements IProduitB {
    @Override
    public void methodeProduitB() {
        System.out.println("ProduitB1.methodeProduitB");
    }
}

class ProduitB2 implements IProduitB {
    @Override
    public void methodeProduitB() {
        System.out.println("ProduitB2.methodeProduitB");
    }
}

class Factory1 implements IAbstractFactory {
    @Override 
    public IProduitA createProduitA() {
        return new ProduitA1();
    }
    
    @Override 
    public IProduitB createProduitB() {
        return new ProduitB1();
    }
}

class Factory2 implements IAbstractFactory {
    @Override 
    public IProduitA createProduitA() {
        return new ProduitA2();
    }
    
    @Override 
    public IProduitB createProduitB() {
        return new ProduitB2();
    }
}

class Client {
    public static void main(String[] args){
        System.out.println("Abstract Factory");

        IAbstractFactory factory1 = new Factory1();
        IAbstractFactory factory2 = new Factory2();

        IProduitA produitA;
        IProduitB produitB;

        System.out.println("Utilisation de la premiere fabrique");
        produitA = factory1.createProduitA();
        produitB = factory1.createProduitB();
        produitA.methodeProduitA();
        produitB.methodeProduitB();
        
        System.out.println("Utilisation de la deuxieme fabrique");
        produitA = factory2.createProduitA();
        produitB = factory2.createProduitB();
        produitA.methodeProduitA();
        produitB.methodeProduitB();
    }
}
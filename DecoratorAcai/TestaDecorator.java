package DecoratorAcai;

public class TestaDecorator {
    
    public static void main(String[] args) {

        
        Adicional acai = new Acai();
        Adicional add = new Morango(acai);
        add = new Banana(add);
        add = new LeiteCondensado(add);

        System.out.println(add.getDescricao());
        System.out.println(add.custo());
    }
}

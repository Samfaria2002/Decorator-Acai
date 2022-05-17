package DecoratorAcai;

public class Morango extends BaseDecorator {
    
    Acai preco = new Acai();

    public Morango(Adicional add) {
        super(add);
    }

    public String getDescricao() {
        return  super.getDescricao() + "Morango";
    }

    @Override
    public double custo() {
        if (preco.getTamanho() == 1) {
            return super.custo() + 1.00;
        } else if (preco.getTamanho() == 2) {
            return super.custo() + 1.50;
        } else if (preco.getTamanho() == 3) {
            return super.custo() + 2.00;
        }
        return super.custo();
    }
}

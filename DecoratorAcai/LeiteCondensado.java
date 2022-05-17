package DecoratorAcai;

public class LeiteCondensado extends BaseDecorator{

    Acai preco = new Acai();

    public LeiteCondensado(Adicional add) {
        super(add);
    }

    public String getDescricao() {
        super.getDescricao();
        return  super.getDescricao() + "Leite Condensado";
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
        return custo();
    }
}

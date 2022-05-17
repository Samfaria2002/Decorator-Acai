package DecoratorAcai;

public class BaseDecorator implements Adicional {

    private Adicional wrapper;

    public BaseDecorator(Adicional add) {
        this.wrapper = add;
    }

    @Override
    public String getDescricao() {
        
        return wrapper.getDescricao();
    }

    @Override
    public double custo() {
        return wrapper.custo();
    }

    @Override
    public void setTamanho(char t) {
        wrapper.setTamanho(t);
    }


    

    

    

    
    
}

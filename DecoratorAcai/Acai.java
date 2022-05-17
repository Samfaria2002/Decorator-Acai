package DecoratorAcai;

public class Acai implements Adicional {

    private int indiceTamanho = 3;

    @Override
    public void setTamanho(char cTamanho) {
        this.indiceTamanho = cTamanho;
    }

    public int getTamanho() {
        return indiceTamanho;
    }

    @Override
    public String getDescricao() {

        return "Um açaí";
    }

    @Override
    public double custo() {

        switch (this.indiceTamanho) {
            case 1:
                System.out.println("Açaí pequeno");
                return 10.00;
            case 2:
                System.out.println("Açaí médio");
                return 15.00;
            case 3:
                System.out.println("Açaí grande");
                return 20.00;
            default:
                break;
        }
        return custo();
    }

} 

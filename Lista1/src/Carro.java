public class Carro extends Veiculo{
    private String renavam;
    private int nLugares;

    public Carro(String renavam, int nLugares, String cor, String modelo, String placa, Pessoa proprietario) {
        super(cor,modelo,placa,proprietario);
        this.renavam = renavam;
        this.nLugares = nLugares;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public int getnLugares() {
        return nLugares;
    }

    public void setnLugares(int nLugares) {
        this.nLugares = nLugares;
    }
}

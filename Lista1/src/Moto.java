public class Moto extends Veiculo{
    private int cilindrada;

    public Moto(int cilindrada, String cor, String modelo, String placa, Pessoa proprietario) {
        super(cor,modelo,placa,proprietario);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

}

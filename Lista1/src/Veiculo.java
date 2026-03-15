public class Veiculo {
    private String cor;
    private String modelo;
    private String placa;
    private Pessoa proprietario;

    public Veiculo(String cor, String modelo, String placa, Pessoa proprietario) {
        this.cor = cor;
        this.modelo = modelo;
        this.placa = placa;
        this.proprietario = proprietario;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }
}

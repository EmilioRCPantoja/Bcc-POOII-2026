import java.util.ArrayList;

public class Vendedor extends Pessoa{
    private double comissao;
    private ArrayList<String> areaVenda;


    public Vendedor(double comissao, ArrayList<String> areaVenda, String cpf, String nome, String email, String numero) {
        super(cpf, nome,email,numero);
        this.comissao = comissao;
        this.areaVenda = areaVenda;

    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public ArrayList<String> getAreaVenda() {
        return areaVenda;
    }

    public void setAreaVenda(ArrayList<String> areaVenda) {
        this.areaVenda = areaVenda;
    }

}

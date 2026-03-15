public class Pessoa {
    private String cpf;
    private String nome;
    private String email;
    private String numero;
    private Object Papel;

    public Pessoa(String cpf, String nome, String email, String numero, Object papel) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.numero = numero;
        Papel = papel;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Object getPapel() {
        return Papel;
    }

    public void setPapel(Object papel) {
        Papel = papel;
    }

}

public class BotaoS extends Botao {
    private String mensagem = "sim";

    @Override
    public void apertar(){
        System.out.println(mensagem);
    }
}

public class BotaoN extends Botao{
    private String mensagem = "não";

    @Override
    public void apertar(){
        System.out.println(mensagem);
    }
}

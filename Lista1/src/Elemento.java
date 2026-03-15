public class Elemento {
    private Double valorI = 0.0;

    private String valorS = null;

    public Elemento(){};

    public Elemento(Double ValorI){
        this.valorI = ValorI;
    }

    public Elemento(String ValorS){
        this.valorS = ValorS;
    }


    public void setValor(Double ValorI){
        if(this.valorS == null)
            this.valorI = ValorI;

    }

    public void setValor(String ValorS){
        if(this.valorI == 0)
            this.valorS = ValorS;
    }

    public Object getValor() {
        if(this.valorS == null)
            return valorI;
        else
            return valorS;
    }


    public Object somador(Elemento e1){
        if( e1.getValor() instanceof Double && this.valorS == null){
            return ((Double) e1.getValor() + valorI);
        }
        else if(e1.getValor() instanceof Double && this.valorS != null){
            return ( String.valueOf(e1.getValor()) + valorS);
        }
        else if(e1.getValor() instanceof String && this.valorS != null){
            return ((String) e1.getValor() + valorS);
        }
        else if(e1.getValor() instanceof String && this.valorS == null){
            return ((String) e1.getValor()  + String.valueOf(valorI));
        }
        return "erro ao somar elementos";
    }
}

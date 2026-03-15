import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Motorista {
    private String cnh;
    private Date vencCnh;

    public Motorista(String cnh, Date vencCnh) {
        this.cnh = cnh;
        this.vencCnh = vencCnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public Date getVencCnh() {
        return vencCnh;
    }

    public void setVencCnh(Date vencCnh) {
        this.vencCnh = vencCnh;
    }
}

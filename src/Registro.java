import java.util.Date;

public class Registro {
    private int codigo;
    private Date entrada;
    private Date saida = null;

    Registro (int codigo, Date entrada) {
        this.codigo = codigo;
        this.entrada = entrada;
    }

    @Override
    public String toString() {
        return "o crachá:" + codigo + "entrou: " + entrada + "saiu: " + saida;
    }
    public int getCodigo() {
        return this.codigo;
    }
    public void setSaida(Date saida) {
        this.saida = saida;
    }

    public Date getSaida() {
        return saida;
    }
}

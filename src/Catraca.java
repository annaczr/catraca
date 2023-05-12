import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Catraca {
    private ArrayList<Registro> registros = new ArrayList<>();

    public boolean adicionarRegistro(int cod_registro){
        for (int i = 0; i < this.registros.size(); i++) {
            if(cod_registro == this.registros.get(i).getCodigo()){
                if (registros.get(i).getSaida() == null) {
                    registros.get(i).setSaida(new Date());
                    System.out.println("Obrigado pela visita! \uD83D\uDE0A");
                    return true;
                }
            }
        }
        registros.add(new Registro(cod_registro, new Date()));
        System.out.println("Bem-vindo, acesso liberado! \uD83D\uDE0A");
        return false;
    }
    public ArrayList<Registro> getRegistros() {
        return this.registros;
    }
}

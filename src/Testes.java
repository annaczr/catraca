public class Testes {
    public static void main(String[] args) {
        int cod1 = 1;
        int cod2 = 2;
        Catraca catraca = new Catraca();
        catraca.adicionarRegistro(1);
        catraca.adicionarRegistro(2);
        catraca.adicionarRegistro(1);
        catraca.adicionarRegistro(1);

        if(catraca.getRegistros().size() == 3) {
            System.out.println("Testes passados com sucesso!");
        }
    }
}

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Catraca catraca = new Catraca();
        Scanner entradas = new Scanner(System.in);
        while (true) {
            System.out.println("CATRACA JBS");
            System.out.println("     Menu    ");
            System.out.println("1. Adicionar um registro");
            System.out.println("2. Mostrar LOGS");
            System.out.println("3. Sair");

            int decisao = entradas.nextInt();
            switch (decisao) {
                case 1: {
                    System.out.println("-- ADICIONANDO UM REGISTRO --");
                    System.out.print("Insira o código do crachá: ");
                    int codigo = entradas.nextInt();
                    catraca.adicionarRegistro(codigo);
                    break;
                }
                case 2: {
                    System.out.println(catraca.getRegistros());
                    break;
                }
            }
            if(decisao == 3) {
                break;
            }
        }
    }
}
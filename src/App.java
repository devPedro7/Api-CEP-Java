import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int cep;

        Scanner cepIn = new Scanner(System.in);
        System.out.println("Insira o cep para buscarmos o endereco: ");
        cep = cepIn.nextInt();

        ConsultaCep consultaEnd = new ConsultaCep();
        Endereco endereco =  consultaEnd.buscaEndereco(cep);


        System.out.println("Dados retornados a partir do cep: " + endereco);

    }
}

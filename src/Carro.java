import java.time.LocalDate;

public class Carro {
    String modelo;
    int ano;
    String cor;

    public void ExibirFichaTecnica(Carro carro){
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Cor: " + carro.cor);
    }

    public int IdadeDoCarro(int ano){
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - ano;
    }
}

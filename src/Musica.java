public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacoes;
    double avaliacao;
    int numAvaliacoes;

    public void ExibirFichaTecnica(Musica musica){
        System.out.println("Titulo: " + musica.titulo);
        System.out.println("Artista: " + musica.artista);
        System.out.println("Ano de lancamento: " + musica.anoLancamento);
        System.out.println("Media das avaliacoes: " + CalculaMedia());
    }

    public void AvaliaMusica(double avaliacao){
        somaAvaliacoes += avaliacao;
        numAvaliacoes++;
    }

    public double CalculaMedia(){
        return somaAvaliacoes / numAvaliacoes;
    }
}

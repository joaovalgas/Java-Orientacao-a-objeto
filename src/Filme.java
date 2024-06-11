public class Filme {
    String nome;
    int anoDeLancamento;
    double  somaAvaliacoes = 0;
    boolean incluidoNoPlano;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração: " + duracaoEmMinutos + "min");
    }

    void avalia(double nota){
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double exibeMedia(){
        return somaAvaliacoes/totalDeAvaliacoes;
    }
}

package school.sptech;

public class Exercicio01 {
    public static void main(String[] args) {
        Integer qntdFilhos0a3 = 2;
        Integer qntdFilhos4a16 = 1;
        Integer qntdFilhos17a18 = 1;

        Integer qntdTotalFilhos = qntdFilhos0a3 + qntdFilhos4a16 + qntdFilhos17a18;

        Double taxaFilhos_comMenos4 = 25.12;
        Double taxaFilhos_entre4a16 = 15.88;
        Double taxaFilhos_entre17a18 = 12.44;

        Double calculoBolsa = (qntdFilhos0a3 * taxaFilhos_comMenos4) +
                (qntdFilhos4a16 * taxaFilhos_entre4a16) +
                (qntdFilhos17a18 * taxaFilhos_entre17a18);

        System.out.println("""
            Você tem um total de %d filhos e vai receber R$%.2f de bolsa
            """.formatted(qntdTotalFilhos, calculoBolsa));
    }
}

package school.sptech;

public class Exercicio03 {
    public static void main(String[] args) {
        Double valorProduto = 8.0;
        Integer qntdVendida = 4;
        Double valorVenda = 50.0;

        Double trocoVenda = (valorVenda - (valorProduto*qntdVendida));

        System.out.println("""
                Seu troco será de R$%.2f!
                """.formatted(trocoVenda));
    }
}

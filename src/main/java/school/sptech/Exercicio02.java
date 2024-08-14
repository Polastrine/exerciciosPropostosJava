package school.sptech;

public class Exercicio02 {
    public static void main(String[] args) {
        Integer minutosAquecendo = 60;
        Integer minutosAerobicos = 90;
        Integer minutosMusculacao = 120;

        Integer minutosTotais = (minutosAerobicos + minutosAquecendo + minutosMusculacao);

        Integer percaCalorica_aquecimento = 12;
        Integer percaCalorica_aerobico = 20;
        Integer percaCalorica_musculacao = 25;

        Integer percaCalorica_total = (minutosAquecendo * percaCalorica_aquecimento) + (minutosAerobicos * percaCalorica_aerobico) + (minutosMusculacao * percaCalorica_musculacao);

        System.out.println("""
                Olá, Jorge. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias.
                """.formatted(minutosTotais, percaCalorica_total));
    }
}

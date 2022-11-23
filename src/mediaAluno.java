public class mediaAluno {
    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4, media;

        nota1 = 5;
        nota2 = 6;
        nota3 = 7;
        nota4 = 2;
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("As notas do aluno são: %.2f, %.2f, %.2f e %.2f.\n", nota1, nota2, nota3, nota4);

        if (media >= 6) {
            System.out.println("Parabéns voce passou com média: " + media);
        } else {
            System.out.println("Você não alcançou a média mínima, você ficou com: " + media);
        }
    }
}
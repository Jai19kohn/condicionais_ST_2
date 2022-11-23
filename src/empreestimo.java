public class empreestimo {
    public static void main(String[] args) {
        int idade = 18;
        int parcelas = 12;
        double renda = 1500;
        double emprestimo = 10000;
        double valorParcela = 333.33;
        double valorMaxParcela = renda * 0.3;

        System.out.printf("A pessoa que está solicitando o empréstimo tem %d anos de idade e tem o salário de %.2f reais.\n" +
                        "O valor solicitado é de %.2f reais para ser pago em %d parcelas.\n",
                idade, renda, emprestimo, parcelas);

        if ((idade >= 18 && idade <= 65) && (parcelas >= 3 && parcelas <= 24) && (valorParcela <= valorMaxParcela)) {
            System.out.println("Seu empréstimo foi aprovado.");
        } else if (idade < 18 || idade >65) {
            System.out.println("Seu empréstimo foi recusado, sua idade foi invalida.");
        } else if (parcelas < 3 || parcelas > 24) {
            System.out.println("Seu empréstimo foi recusado, a quantidade de parcelas é invalida.");
        } else if (valorParcela > valorMaxParcela) {
            System.out.println("Seu empréstimo foi recusado, ele irá comprometer sua renda.");
        }
    }
}
public class ex14 {
    public static void main(String[] args) {
        // definir os dois números com os quais deseja realizar as operações
        double numero1 = 10.0;
        double numero2 = 5.0;
        
        // calcular a soma
        double soma = numero1 + numero2;
        
        // calcular a diferença
        double diferenca = numero1 - numero2;
        
        // calcular o produto
        double produto = numero1 * numero2;
        
        // verificar se o segundo número é diferente de zero antes de calcular o quociente
        double quociente = 0;
        if (numero2 != 0) {
            quociente = numero1 / numero2;
        } else {
            System.out.println("Não é possível dividir por zero.");
        }
        
        // imprimir os resultados
        System.out.println("Soma: " + soma);
        System.out.println("Diferença: " + diferenca);
        System.out.println("Produto: " + produto);
        
        // verificar se o quociente foi calculado (não houve divisão por zero)
        if (numero2 != 0) {
            System.out.println("Quociente: " + quociente);
        }
    }
}


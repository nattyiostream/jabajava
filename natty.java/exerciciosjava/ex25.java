public class ex25 {
    public static void main(String[] args) {
        // inicializar os dois primeiros números da sequência de Fibonacci
        int n1 = 0, n2 = 1;
        
        // imprimir uma mensagem indicando o propósito do programa
        System.out.print("Sequência de Fibonacci até o número 10: ");
        
        // loop para gerar a sequência de Fibonacci até o número 10
        while (n1 <= 10) {
            // imprimir o valor atual da sequência
            System.out.print(n1 + " ");
            
            // calcular o próximo número da sequência somando os dois números anteriores
            int soma = n1 + n2;
            
            // atualizar os valores de n1 e n2 para os próximos números da sequência
            n1 = n2;
            n2 = soma;
        }
    }
}

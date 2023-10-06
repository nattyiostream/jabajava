public class ex15 {
    public static void main(String[] args) {
        // definir o número para o qual deseja encontrar o maior divisor
        int numero = 36; // alterar este valor para o número desejado
        
        // encontrar e imprimir o maior divisor
        int maiorDivisor = encontrarMaiorDivisor(numero);
        System.out.println("O maior divisor de " + numero + " é " + maiorDivisor);
    }
    
    // função para encontrar o maior divisor de um número
    public static int encontrarMaiorDivisor(int num) {
        int maiorDivisor = 1;
        
        // percorrer os números de 2 até num/2 e verifique se são divisores
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                maiorDivisor = i;
            }
        }
        
        return maiorDivisor;
    }
}


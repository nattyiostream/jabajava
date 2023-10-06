public class ex16 {
    public static void main(String[] args) {
        // definir o número para o qual deseja encontrar o menor divisor
        int numero = 36; // alterar este valor para o número desejado
        
        // encontrar e imprimir o menor divisor
        int menorDivisor = encontrarMenorDivisor(numero);
        System.out.println("O menor divisor de " + numero + " é " + menorDivisor);
    }
    
    // função para encontrar o menor divisor de um número
    public static int encontrarMenorDivisor(int num) {
        if (num <= 1) {
            return num; // 0 e 1 não têm divisores positivos
        }
        
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                return i;
            }
        }
        
        return num; // se nenhum divisor for encontrado, o próprio número é o menor divisor.
    }
}

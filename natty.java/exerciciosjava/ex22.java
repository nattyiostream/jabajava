public class ex22 {
    public static void main(String[] args) {
        // definir o número para o qual deseja calcular o fatorial
        int numero = 5; // alterar este valor para o número desejado
        
        // calcular o fatorial do número
        long fatorial = calcularFatorial(numero);
        
        // imprimir o resultado
        System.out.println("O fatorial de " + numero + " é igual a " + fatorial);
    }
    
    // função para calcular o fatorial de um número
    public static long calcularFatorial(int num) {
        if (num < 0) {
            return -1; // fatorial de número negativo não é definido.
        } else if (num == 0 || num == 1) {
            return 1; // o fatorial de 0 e 1 é 1.
        } else {
            long resultado = 1;
            for (int i = 2; i <= num; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
}

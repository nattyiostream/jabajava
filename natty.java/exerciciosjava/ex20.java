public class ex20 {
    public static void main(String[] args) {
        // definir o número para o qual deseja calcular a raiz quadrada
        double numero = 25.0; // alterar este valor para o número desejado
        
        // verifique se o número é não-negativo antes de calcular a raiz quadrada
        if (numero >= 0) {
            double raizQuadrada = Math.sqrt(numero);
            System.out.println("A raiz quadrada de " + numero + " é igual a " + raizQuadrada);
        } else {
            System.out.println("Não é possível calcular a raiz quadrada de um número negativo.");
        }
    }
}

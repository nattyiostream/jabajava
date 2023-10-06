public class ex21 {
    public static void main(String[] args) {
        // definir o número para o qual deseja calcular o logaritmo na base 10
        double numero = 100.0; // alterar este valor para o número desejado
        
        // verificar se o número é positivo antes de calcular o logaritmo
        if (numero > 0) {
            double logaritmoBase10 = Math.log10(numero);
            System.out.println("O logaritmo na base 10 de " + numero + " é igual a " + logaritmoBase10);
        } else {
            System.out.println("Não é possível calcular o logaritmo na base 10 de um número não-positivo.");
        }
    }
}

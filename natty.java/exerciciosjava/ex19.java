public class ex19 {
    public static void main(String[] args) {
        // definir o número que você deseja verificar
        int numero = 17; // alterar este valor para o número desejado
        
        // verificar se o número é primo e imprima o resultado
        boolean ehPrimo = verificarPrimo(numero);
        
        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
    
    // função para verificar se um número é primo
    public static boolean verificarPrimo(int num) {
        if (num <= 1) {
            return false; // números menores ou iguais a 1 não são primos
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // se for divisível por algum número, não é primo
            }
        }
        
        return true; // se não foi divisível por nenhum número, é primo
    }
}

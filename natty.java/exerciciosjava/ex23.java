public class ex23 {
    public static void main(String[] args) {
        // definir os dois números que você deseja comparar
        double numero1 = 25.0;
        double numero2 = 15.0;
        
        // encontrar e imprima o maior número
        double maiorNumero = encontrarMaior(numero1, numero2);
        System.out.println("O maior número entre " + numero1 + " e " + numero2 + " é " + maiorNumero);
    }
    
    // função para encontrar o maior número entre dois números
    public static double encontrarMaior(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}

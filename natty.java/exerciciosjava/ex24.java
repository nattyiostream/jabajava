public class ex24 {
    public static void main(String[] args) {
        // definir os dois números que você deseja comparar
        double numero1 = 25.0;
        double numero2 = 15.0;
        
        // encontrar e imprimir o menor número
        double menorNumero = encontrarMenor(numero1, numero2);
        System.out.println("O menor número entre " + numero1 + " e " + numero2 + " é " + menorNumero);
    }
    
    // função para encontrar o menor número entre dois números
    public static double encontrarMenor(double num1, double num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}

import java.util.*;
public class java_exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre o primeiro inteiro:");
        int primeiro = sc.nextInt();
        System.out.println("Entre o segundo inteiro:");
        int segundo = sc.nextInt();

        if (primeiro > segundo ) {
            System.out.println(primeiro+" é o maior numero");
        }
        else if (segundo > primeiro) {
            System.out.println(segundo+" é o maior numero");
        }
        else {
            System.out.println(primeiro+" e "+segundo+" sao iguais");
        }
    }
}
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Double tempoEntrePlacas, velocidadeObservada;
        int distanciaEntrePlacas;


        System.out.println("Tempo percorrido entre as placas foi de ");
        distanciaEntrePlacas = (1);
        tempoEntrePlacas = sc.nextDouble();
        velocidadeObservada = tempoEntrePlacas / distanciaEntrePlacas;
        System.out.printf( "Velocidade média do veículo calculada = %.2f  Km/h " , velocidadeObservada );
        // para o km aparecer depois da variael colocamos o %.2f sem o % no final.

        sc.close();
    }
}
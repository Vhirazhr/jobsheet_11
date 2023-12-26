import java.util.Scanner;

public class NestedLoop11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota: " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari " + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota: " + i);
            double totalSuhu = 0;

            for (int j = 0; j < temps[0].length; j++) {
                System.out.print(temps[i][j] + " ");
                totalSuhu += temps[i][j];
            }

            double rataRata = totalSuhu / temps[0].length;
            System.out.println("\nRata-rata Suhu: " + rataRata + "\n");
        }

        scanner.close();
    }
}

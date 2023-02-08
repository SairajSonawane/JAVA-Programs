import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of first matrix:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] firstMatrix = new int[m][n];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                firstMatrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number of rows and columns of second matrix:");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int[][] secondMatrix = new int[p][q];

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                secondMatrix[i][j] = sc.nextInt();
            }
        }

        if (n != p) {
            System.out.println("Matrices can't be multiplied with each other.");
        } else {
            int[][] resultMatrix = new int[m][q];
            System.out.println("Addition of two matrices:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    resultMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
                    System.out.print(resultMatrix[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Multiplication of two matrices:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    for (int k = 0; k < n; k++) {
                        resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                    }
                    System.out.print(resultMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

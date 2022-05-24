package Ejer2;

import java.util.Scanner;

public class MatrizInversa {
    private int nFilas;
    private int nColumnas;

    public MatrizInversa(int nFilas, int nColumnas) {
        this.nFilas = nFilas;
        this.nColumnas = nColumnas;
    }

    static void getCofactor(int A[][], int temp[][], int p, int q, int n) {
        int i = 0, j = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {

                if (row != p && col != q) {
                    temp[i][j++] = A[row][col];

                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    //determinante
    static int determinant(int A[][], int n) {
        int D = 0;

        if (n == 1)
            return A[0][0];

        int[][] temp = new int[n][n];

        int sign = 1;
        for (int f = 0; f < n; f++) {

            getCofactor(A, temp, 0, f, n);
            D += sign * A[0][f] * determinant(temp, n - 1);

            sign = -sign;
        }

        return D;
    }

    //adjunta
    static void adjoint(int A[][], int[][] adj, int r, int c) {
        if (r == 1) {
            adj[0][0] = 1;
            return;
        }
        int sign = 1;
        int[][] temp = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                getCofactor(A, temp, i, j, r);

                sign = ((i + j) % 2 == 0) ? 1 : -1;

                adj[j][i] = (sign) * (determinant(temp, r - 1));
            }
        }
    }

    //inversa
    static boolean inverse(int A[][], float[][] inverse, int r, int c) {

        int det = determinant(A, r);
        if (det == 0) {
            System.out.print("La determinante es 0, no puede encontrar su inversa.");
            return false;
        }

        int[][] adj = new int[r][c];
        adjoint(A, adj, r, c);

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                inverse[i][j] = adj[i][j] / (float) det;

        return true;
    }

    static void display(int A[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(A[i][j] + " ");
            System.out.println();
        }
    }

    static void display(float A[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.printf("%.6f ", A[i][j]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /*RESULTADOS*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa N° de filas: ");
        int row = sc.nextInt();
        System.out.println("Ingresa N° de columnas: ");
        int col = sc.nextInt();

        if (row != col) {
            System.out.println("El n° de filas y columnas tienen q ser iguales");
            return;
        }
        /*DECLARACION DE MATRIZ*/
        int A[][] = new int[row][col];
        System.out.println("Ingrese matriz de " + row + " " + "columnas");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Ingrese el elemento no. " + i + " " + j + " ");
                A[i][j] = sc.nextInt();
            }
        }

        int[][] adj = new int[row][col];

        float[][] inv = new float[row][col];

        System.out.print("\nLa matriz de entrada es :\n");
        display(A, row, col);

        System.out.print("\nLa determinante es :\n");
        int det = determinant(A, row);
        System.out.print(det + "\n");

        System.out.print("\nEl adjunto es :\n");
        adjoint(A, adj, row, col);
        display(adj, row, col);

        System.out.print("\nLa inversa es :\n");
        if (inverse(A, inv, row, col))
            display(inv, row, col);

    }
}

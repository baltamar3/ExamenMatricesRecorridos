/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author baltamar3
 */
public class Helper {

    public static void mensaje(Component ventana, String mensaje, int tipo) {
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                break;

        }
    }

    public static void limpiadoTabla(JTable tabla1) {
        int nf, nc;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", i, j);
            }
        }
    }

    public static void porDefectoTabla(JTable tabla1) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla1.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);
    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);

        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);

        }
    }

    public static void llenadoAutomatico(JTable tabla1) {
        int nf, nc, n;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                n = (int) (Math.random() * 99 + 1);
                tabla1.setValueAt(n, i, j);
            }
        }
    }

    public static int[][] pasoDeDatos(JTable tabla1) {
        int nf, nc;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        int m[][] = new int[nf][nc];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {

                m[i][j] = (int) tabla1.getValueAt(i, j);
            }

        }
        return m;

    }

    public static String recorridoHaciaArriba(int[][] m, int j) {
        int nf = m.length;
        String aux = "";
        for (int i = nf - 1; i >= 0; i--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaArriba(int[][] m, int j, int in, int fin) {

        String aux = "";
        for (int i = in; i >= fin; i--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaAbajo(int[][] m, int j) {
        int nf = m.length;
        String aux = "";
        for (int i = 0; i < nf; i++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaAbajo(int[][] m, int j, int in, int fin) {

        String aux = "";
        for (int i = in; i <= fin; i++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaIzquierda(int[][] m, int i) {
        int nc = m[0].length;
        String aux = "";
        for (int j = nc - 1; j >= 0; j--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaIzquierda(int[][] m, int i, int in, int fin) {

        String aux = "";
        for (int j = in; j >= fin; j--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaDerecha(int[][] m, int i) {
        int nc = m[0].length;
        String aux = "";
        for (int j = 0; j < nc; j++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaDerecha(int[][] m, int i, int in, int fin) {
        int nc = m[0].length;
        String aux = "";
        for (int j = in; j <= fin; j++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoDiagonalPrincipalAbajo(int[][] m) {
        int nf = m.length;
        String aux = "";
        for (int i = 0; i < nf; i++) {
            aux = aux + m[i][i] + ", ";

        }
        return aux;

    }

    public static String recorridoDiagonalPrincipalAbajo(int[][] m, int in, int fin) {
        String aux = "";
        for (int i = in; i <= fin; i++) {
            aux = aux + m[i][i] + ", ";

        }
        return aux;

    }

    public static String recorridoDiagonalPrincipalArriba(int[][] m) {
        int nf = m.length;
        String aux = "";
        for (int i = nf - 1; i >= 0; i--) {
            aux = aux + m[i][i] + ", ";

        }
        return aux;

    }

    public static String recorridoDiagonalPrincipalArriba(int[][] m, int in, int fin) {

        String aux = "";
        for (int i = in; i >= fin; i--) {
            aux = aux + m[i][i] + ", ";

        }
        return aux;

    }

    public static String recorridoDiagonalSecundariaAbajo(int[][] m) {
        int nf = m.length;
        int nc = m[0].length;
        String aux = "";
        for (int i = 0; i < nf; i++) {
            aux = aux + m[i][nc - 1 - i] + ", ";

        }
        return aux;

    }

    public static String recorridoDiagonalSecundariaArriba(int[][] m) {
        int nf = m.length;
        int nc = m[0].length;
        String aux = "";
        for (int i = nf - 1; i >= 0; i--) {
            aux = aux + m[i][nc - 1 - i] + ", ";

        }
        return aux;

    }

    public static String recorridoDiagonalSecundariaArriba(int[][] m, int in, int fin) {

        int nc = m[0].length;
        String aux = "";
        for (int i = in; i >= fin; i--) {
            aux = aux + m[i][nc - 1 - i] + ", ";

        }
        return aux;

    }

    public static String recorridoDiagonalSecundariaAbajo(int[][] m, int in, int fin) {

        int nc = m[0].length;
        String aux = "";
        for (int i = in; i <= fin; i++) {
            aux = aux + m[i][nc - 1 - i] + ", ";

        }
        return aux;

    }

    public static String promedio(JTable tabla1) {
        int nf, nc, aux, acum = 0, cont = 0, op;
        String promedio;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {

            for (int j = 0; j < nc; j++) {

                aux = (int) tabla1.getValueAt(i, j);
                if (aux % 2 != 0 && aux > 10 && aux < 20) {
                    acum = acum + aux;
                    cont = cont + 1;

                }
            }
        }
        op = acum / cont;
        promedio = "El promedio de numeros impares contenidos entre 10 y 20 es :" + op;
        return promedio;
    }

    public static void triangularInferiro(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {

            for (int j = 0; j < nc; j++) {

                aux = (int) tabla1.getValueAt(i, j);
                if (i >= j) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void TablaDeAjedrez(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {

            for (int j = 0; j < nc; j++) {

                aux = (int) tabla1.getValueAt(i, j);
                if (i % 2 == 0 && j % 2 == 0 || i % 2 != 0 && j % 2 != 0) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }

    }

    public static String recorridoUno(JTable tabla) {
        int m[][] = pasoDeDatos(tabla);
        int nf = m.length;
        int nc = m[0].length;

        String aux = "";

        int x = 0;
        int y = 1;

        while (x < nf) {
            aux = aux + Helper.recorridoHaciaArriba(m, x, nf - 1, x);
            aux = aux + Helper.recorridoHaciaDerecha(m, x, y, nc - 1);

            x = x + 1;
            y = y + 1;
        }

        aux = aux.substring(0, aux.length() - 2) + ".";
        return aux;
    }

    public static String recorridoDos(JTable tabla) {
        int m[][] = pasoDeDatos(tabla);
        int nf = m.length;
        int nc = m[0].length;

        String aux = "";
        aux = aux + Helper.recorridoDiagonalPrincipalAbajo(m);
        aux = aux + Helper.recorridoHaciaArriba(m, nc - 1, nf - 2, 0);
        aux = aux + Helper.recorridoHaciaIzquierda(m, 0, nc - 2, nc / 2);
        aux = aux + Helper.recorridoHaciaAbajo(m, (nc - 1) / 2, 1, nf - 1);
        aux = aux + Helper.recorridoHaciaIzquierda(m, nf - 1, (nc - 1) / 2 - 1, 0);
        aux = aux + Helper.recorridoHaciaArriba(m, 0, nf - 2, 0);

        aux = aux.substring(0, aux.length() - 2) + ".";
        return aux;
    }

}

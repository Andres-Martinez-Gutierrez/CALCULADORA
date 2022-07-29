/*1.Calcule las estaciones del año haciendo 
uso de las sentencias if y else
 */
package sentencia1;

import javax.swing.JOptionPane;

public class Sentencia1 {

    public static void main(String[] args) {

        var mes = Integer.parseInt(JOptionPane.showInputDialog("Digirte el mes del año en numero: "));
        var estacion = "Estacion desconocida";

        if (mes == 12 || mes == 1 || mes == 2) {
            estacion = "Invierno";

        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";

        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Otoño";

        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Verano";

        }
        JOptionPane.showMessageDialog(null,"La estacion es: " + estacion);
    }

}

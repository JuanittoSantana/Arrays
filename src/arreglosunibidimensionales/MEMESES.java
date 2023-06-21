package arreglosunibidimensionales;

import javax.swing.JOptionPane;

public class MEMESES {

    public static void main(String[] args) {

        String mes[] = new String[12];
        String pregunta = "";
        int nm = 0;
        
        mes[0] = "Enero";
        mes[1] = "Febrero";
        mes[2] = "Marzo";
        mes[3] = "Abril";
        mes[4] = "Mayo";
        mes[5] = "Junio";
        mes[6] = "Julio";
        mes[7] = "Agosto";
        mes[8] = "Septiembre";
        mes[9] = "Octubre";
        mes[10] = "Noviembre";
        mes[11] = "Diciembre";

            do{
                
                nm = Integer.parseInt(JOptionPane.showInputDialog(null, "Insertar numero mes "));
                if(nm <1 || nm > 12) {
                    
                }
                 System.out.println("Mes "+mes[nm-1]);
            pregunta = JOptionPane.showInputDialog(null, "¿Desea seguir capturando? (s/n)");
        } while (!pregunta.equals("n"));
           
    }
}



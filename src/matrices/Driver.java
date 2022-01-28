package matrices;

import java.util.logging.Level;
import java.util.logging.Logger;
import matrices.DimensionesIncompatibles;
import matrices.Matriz;

public class Driver {

    public static void main(String[] args) {
        Matriz m1 = new Matriz(3, 4, true);
        System.out.println(m1);
        Matriz m2 = new Matriz(3, 4, true);
        System.out.println(m2);
        Matriz m3 = new Matriz(6, 3, true);
        System.out.println(m3);
        try {
            // Suma de matrices
            System.out.println(Matriz.sumarDosMatrices(m1, m2));
            // Multiplicación de matrices
            System.out.println(Matriz.multiplicarDosMatrices(m1, m3));        
        } catch (DimensionesIncompatibles ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

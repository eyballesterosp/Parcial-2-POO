package bussinesLogic;

import Veterinaria.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class View {

    public View() {
    }
    

    public void menu() {
        
        String opcion
                = JOptionPane.showInputDialog(null, "1. Crear \n2. Guardar \n3. Leer");
        if (opcion.equals("1")) {
//            String name = JOptionPane.showInputDialog(null, "Name: ");
//            String email = JOptionPane.showInputDialog(null, "emal: ");
//            Pet player = new Player(name, email);
//            players.add(player);
        } else if (opcion.equals("2")) {
//            try {
//                this.dao.write(players);
//            } catch (FileNotFoundException ex) {
//                JOptionPane.showMessageDialog(null, "Error Escritura");
//            }
        } else if (opcion.equals("3")) {
//            try {
//                ArrayList<Player> playerss = this.dao.read();
//                for (Player p : playerss) {
//                    System.out.println(p);
//                }
//            } catch (FileNotFoundException ex) {
//                JOptionPane.showMessageDialog(null, "Error Lectura");
//            }
        }

    }
}

package bussinesLogic;

import Veterinaria.*;
import java.io.*;
import java.util.*;

public class Acciones {

    //1) Referencia A La Fuente de Imformacion  
    private File Pets;

    public Acciones() throws IOException {
        this.Pets = new File("petssssss.txt");
        if (!this.Pets.exists()) {
            this.Pets.createNewFile();
        }
    }

    public boolean write(ArrayList<Pet> pet, ArrayList<Person> person)
            throws FileNotFoundException {

        PrintStream salida = new PrintStream(this.Pets);
        if (0<3) {
            
        }
        for (Pet p : pet) {
            salida.println(p.getId()+ " " + p.getName() + " " + p.getHairColor() + " " + p.Sound());
        }
        salida.close();
        return true;
    }

    public ArrayList<Pet> read() throws FileNotFoundException {
        Scanner lectura = new Scanner(this.Pets);
        lectura.useDelimiter(" ");
        ArrayList<Pet> Players = new ArrayList<>();
        while (lectura.hasNext()) {
            String name = lectura.next();
            String email = lectura.next();
            
        }
        lectura.close();
        return Players;
    }
}



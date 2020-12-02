/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mochiila;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author asuka
 */
public class LeerData {
    
    public static ArrayList<Articulo> tokenizarDataSet(){
        
        File archivo;
        FileReader fr;
        BufferedReader br;
        ///Necesitamos la variable arratlist patrones para guardar los datos
        ArrayList<Articulo> instancias = new ArrayList<>();
        String texto, aux;
        LinkedList<String> lista = new LinkedList();
        try{
            //llamamos el metodo que permite cargar la ventana
            JFileChooser file = new JFileChooser();
            file.setCurrentDirectory(new File("./"));
            file.showOpenDialog(file);
            //abrimos el archivo seleccionado
            File abre = file.getSelectedFile();
            
            //recorremos el archivo y lo leemos
            if (abre != null) {
                FileReader archivos = new FileReader(abre);
                BufferedReader lee = new BufferedReader(archivos);

                while ((aux = lee.readLine()) != null) {
                    texto = aux;
                    lista.add(texto);// Aqui agrega todo el data set
                }
                lee.close();//cierra el archivo
                
                ArrayList<String> lista2 = new ArrayList<>();
                int peso;//////////////
                for (int i = 0; i < lista.size(); i++) {
                    StringTokenizer st = new StringTokenizer(lista.get(i), ",");

                    while (st.hasMoreTokens()) {
                        lista2.add(st.nextToken());
                    }
               int valor = Integer.parseInt(lista2.get(0));
               peso=Integer.parseInt(lista2.get(1));
               instancias.add(new Articulo(valor,peso));
                
                    lista2.clear();
                }
            }                         
        }catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex + ""
                    + "\nNo se ha encontrado el archivo",
                    "ADVERTENCIA!!!", JOptionPane.WARNING_MESSAGE);            
        }

        return instancias;
    }
    
}

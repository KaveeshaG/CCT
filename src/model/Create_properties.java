/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Controller;
import model.Inhert;
import model.Method;
import model.Size_weight;
import model.Variable_weight;
import model.coupling;

/**
 *
 * @author PK
 */
public class Create_properties {

    public static void main(String[] args) {
        searchFiles("Coup.prof");
    }

    public static void searchFiles(String file_name) {

        ReadCup(file_name);

    }

    public static void createFile(String file_name, Object vw) {
        System.out.println("waiting to write:" + file_name);
        try {

            FileOutputStream fileOut = new FileOutputStream(new File(file_name));
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(vw);
            objectOut.close();

            System.out.println("write");

        } catch (IOException ex) {
            Logger.getLogger(Create_properties.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Variable_weight ReadFileV(String file_name) {
        Variable_weight vw = null;
        try {
            FileInputStream fileIn = new FileInputStream(new File(file_name));
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            vw = (Variable_weight) objectIn.readObject();
            fileIn.close();
            objectIn.close();
            System.out.println(vw.getComposite_V());

        } catch (Exception ex) {
            vw = new Variable_weight();
            createFile(file_name, vw);
        }

        return vw;
    }

    public static Size_weight ReadSize(String file_name) {
        Size_weight sw = null;
        try {
            FileInputStream fileIn = new FileInputStream(new File(file_name));
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            sw = (Size_weight) objectIn.readObject();
            System.out.println(sw.getIdentifier());
            fileIn.close();
            objectIn.close();
        } catch (Exception ex) {
            sw = new Size_weight();
            createFile(file_name, sw);
        }

        return sw;
    }

    public static Method ReadMehtod(String file_name) {
        Method meth = null;
        try {
            FileInputStream fileIn = new FileInputStream(new File(file_name));
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            meth = (Method) objectIn.readObject();
            fileIn.close();
            objectIn.close();
//            System.out.println(sw.getIdentifier());
        } catch (Exception ex) {
            ex.printStackTrace();
            meth = new Method();
            createFile(file_name, meth);
        }

        return meth;
    }

    public static Inhert ReadInherit(String file_name) {
        Inhert inherit = null;
        try {
            FileInputStream fileIn = new FileInputStream(new File(file_name));
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            inherit = (Inhert) objectIn.readObject();
            fileIn.close();
            objectIn.close();
//            System.out.println(sw.getIdentifier());
        } catch (Exception ex) {
            ex.printStackTrace();
            inherit = new Inhert();
            createFile(file_name, inherit);
        }

        return inherit;
    }

    public static coupling ReadCup(String file_name) {
        coupling Coupling = null;
        try {
            FileInputStream fileIn = new FileInputStream(new File(file_name));
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Coupling = (coupling) objectIn.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
            Coupling = new coupling();
            createFile(file_name, Coupling);
        }

        return Coupling;
    }

    public static Controller ReadController(String file_name) {
        Controller cntrl = null;
        try {
            FileInputStream fileIn = new FileInputStream(new File(file_name));
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            cntrl = (Controller) objectIn.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
            cntrl = new Controller();
            createFile(file_name, cntrl);
        }

        return cntrl;
    }
}

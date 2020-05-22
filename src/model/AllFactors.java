/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PK
 */
public class AllFactors {

    public static void setToArray(DefaultTableModel df, int frm) {
        ArrayList<ArrayList> l = new ArrayList<>();
        System.out.println(frm);
        for (int i = 0; i < df.getRowCount(); i++) {
            ArrayList<Object> data = new ArrayList<>();
            for (int j = 0; j < df.getColumnCount(); j++) {
                data.add(df.getValueAt(i, j));
            }
            l.add(data);
            System.out.println("");
        }

        if (frm == 1) {

            model.Factors_data.size_Data = l;

        } else if (frm == 2) {

            model.Factors_data.variable_Data = l;
        } else if (frm == 3) {

            model.Factors_data.methods_Data = l;
        } else if (frm == 4) {

            model.Factors_data.coupling_Data = l;
        } else if (frm == 5) {

            model.Factors_data.controller_Data = l;
        } else if (frm == 6) {

            model.Factors_data.inheritance_Data = l;
        }

    }

}

package Compleity;

import Weight_structre.Inherite_weight;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import menu.Load_class;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PK
 */
public class Inheritance_Complexity extends javax.swing.JFrame {

    /**
     * Creates new form Inheritance_Complexity
     */
    public Inheritance_Complexity() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        total = new javax.swing.JLabel();
        total1 = new javax.swing.JLabel();
        total2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel1.setText("Complexity Of Inheritance");

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setText("Weight related To inheritance factor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Count", "Class Name", "Direct inheritances", "indirect inheritances", "Total inheritances", "Ci"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setMinWidth(50);
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable3.getColumnModel().getColumn(0).setMaxWidth(50);
            jTable3.getColumnModel().getColumn(2).setMinWidth(100);
            jTable3.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable3.getColumnModel().getColumn(2).setMaxWidth(100);
            jTable3.getColumnModel().getColumn(3).setMinWidth(100);
            jTable3.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable3.getColumnModel().getColumn(3).setMaxWidth(100);
            jTable3.getColumnModel().getColumn(4).setMinWidth(100);
            jTable3.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable3.getColumnModel().getColumn(4).setMaxWidth(100);
            jTable3.getColumnModel().getColumn(5).setMinWidth(50);
            jTable3.getColumnModel().getColumn(5).setPreferredWidth(50);
            jTable3.getColumnModel().getColumn(5).setMaxWidth(50);
        }

        total.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        total.setForeground(new java.awt.Color(204, 255, 204));
        total.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total.setText(" ");

        total1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        total1.setForeground(new java.awt.Color(204, 255, 204));
        total1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total1.setText(" ");

        total2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        total2.setForeground(new java.awt.Color(204, 255, 204));
        total2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total2.setText(" ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(total2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(total1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(473, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(total1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Inherite_weight iw = new Inherite_weight(this, true);
        iw.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inheritance_Complexity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inheritance_Complexity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inheritance_Complexity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inheritance_Complexity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inheritance_Complexity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JTable jTable3;
    public static javax.swing.JLabel total;
    public static javax.swing.JLabel total1;
    public static javax.swing.JLabel total2;
    // End of variables declaration//GEN-END:variables

    static DefaultTableModel defaultTableModel;
    static DefaultTableModel df;

    public static void filter_Inheritance() {
        defaultTableModel = (DefaultTableModel) jTable3.getModel();
        ArrayList list_data = new ArrayList();

        defaultTableModel.setRowCount(0);
        String all = Load_class.jTextArea1.getText().replaceAll(" ", "");
        String[] code_line = all.split("\\n");
        int last = 0;
        int count = 0;

        for (int i = 0; i < code_line.length; i++) {

            count++;

            String classrow[] = code_line[i].split("class");
            String inherow[] = code_line[i].split("extends");

            if (classrow.length > 1 && inherow.length == 1) {
//                 count++;
                String cl[] = classrow[1].split("[{]");

                Vector v2 = new Vector();
                v2.add(count);
                v2.add(cl[0]);
                v2.add("0");
                v2.add("0");
                v2.add("0");
                v2.add("0");
                defaultTableModel.addRow(v2);
                Object[] object_ary = new Object[3];
                object_ary[0] = cl[0];
                object_ary[1] = "";
                object_ary[2] = "0";
                list_data.add(object_ary);
                last = 2;
            } else if (classrow.length > 1 && inherow.length > 1) {
//                  count++;

                String cl[] = classrow[1].split("extends");

                String ex[] = cl[1].split("[{]");

                int in_val = 1;
                int v = 0;
                for (int j = 0; j < list_data.size(); j++) {
                    Object[] mv = (Object[]) list_data.get(j);

                    if (mv[0].equals(ex[0])) {

                        v++;
                        if (Integer.parseInt(mv[2].toString()) == 0) {

                        } else {
                            in_val = Integer.parseInt(mv[2].toString()) + 1;
                        }
                        break;
                    }
                }

                if (v == 0) {
                    in_val = 0;
                }

                Object[] object_ary = new Object[3];
//                Vector v1 = new Vector();
                object_ary[0] = cl[0];
                object_ary[1] = ex[0];

                if (in_val > 4) {
                    in_val = 4;
                }
                object_ary[2] = in_val;
                list_data.add(object_ary);

                Vector v2 = new Vector();
                v2.add(count);
                v2.add(cl[0]);

                if (in_val >= 1) {

                    v2.add(1);
                } else if (in_val == 0) {

                    v2.add(0);
                }

                if (in_val > 1) {

                    v2.add(in_val - 1);
                } else {
                    v2.add(0);
                }
                v2.add(in_val);

                model.Inhert in = model.Create_properties.ReadInherit("Inhrt.prof");

                int no_inht = in.getNo_in();
                int one_user = in.getOne_user();
                int two_user = in.getTwo_user();
                int three_user = in.getThree_user();
                int more_user = in.getMore_user();

                if (in_val == 0) {

                    v2.add(no_inht);
                } else if (in_val == 1) {
                    v2.add(one_user);

                } else if (in_val == 2) {
                    v2.add(two_user);

                } else if (in_val == 3) {

                    v2.add(three_user);
                } else if (in_val > 3) {

                    v2.add(more_user);
                }

                defaultTableModel.addRow(v2);

                last = in_val;

            }

        }
        total();
        set();
    }

    public static void total() {

        df = (DefaultTableModel) jTable3.getModel();
        set();
        int Direct_in = 0;
        int Indirect_in = 0;
        int Ci = 0;

        for (int i = 0; i < df.getRowCount(); i++) {
            if (!(df.getValueAt(i, 2).equals(""))) {

                Direct_in = Direct_in + Integer.parseInt(df.getValueAt(i, 2).toString());
            }
            if (!(df.getValueAt(i, 3).equals(""))) {

                Indirect_in = Indirect_in + Integer.parseInt(df.getValueAt(i, 3).toString());
            }
            if (!(df.getValueAt(i, 5).equals(""))) {

                Ci = Ci + Integer.parseInt(df.getValueAt(i, 5).toString());
            }

        }

        total.setText("Direct Inheritance : " + Direct_in);
        total1.setText("Indirect Inheritance : " + Indirect_in);
        total2.setText("Ci : " + Ci);

    }

    public static void set() {
        model.AllFactors.setToArray(df, 6);
    }
}

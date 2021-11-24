// importa los script script
import static java.lang.Boolean.toString;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author CASA03
 */
public class calculadora extends javax.swing.JPanel {

    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
    public calculadora() {
        initComponents();
    }
    // Metodo para escribir numeros tanto en la barra de operaciones como en la barra de proceso
    public void addNumber(String digito){
        txtOperacion.setText(txtOperacion.getText () + digito);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtResultado = new javax.swing.JLabel();
        txtOperacion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_division = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_ce = new javax.swing.JButton();
        btn_porcentaje = new javax.swing.JButton();
        btn_multiplicar = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_sumar = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_restar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 253, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(52, 59, 68));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 280, 51));

        txtOperacion.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(52, 59, 68));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 280, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 140));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_division.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_division.setForeground(new java.awt.Color(52, 59, 68));
        btn_division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        btn_division.setText("÷");
        btn_division.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_division.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn3.jpeg"))); // NOI18N
        btn_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisionActionPerformed(evt);
            }
        });
        jPanel2.add(btn_division, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 50, 50));

        btn_c.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_c.setForeground(new java.awt.Color(52, 59, 68));
        btn_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        btn_c.setText("C");
        btn_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_c.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn3.jpeg"))); // NOI18N
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });
        jPanel2.add(btn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        btn_ce.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_ce.setForeground(new java.awt.Color(52, 59, 68));
        btn_ce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        btn_ce.setText("<-");
        btn_ce.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ce.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn3.jpeg"))); // NOI18N
        btn_ce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ceActionPerformed(evt);
            }
        });
        jPanel2.add(btn_ce, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 50, 50));

        btn_porcentaje.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_porcentaje.setForeground(new java.awt.Color(52, 59, 68));
        btn_porcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        btn_porcentaje.setText("%");
        btn_porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_porcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn3.jpeg"))); // NOI18N
        btn_porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 50, 50));

        btn_multiplicar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_multiplicar.setForeground(new java.awt.Color(52, 59, 68));
        btn_multiplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        btn_multiplicar.setText("x");
        btn_multiplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_multiplicar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn3.jpeg"))); // NOI18N
        btn_multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_multiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 50, 50));

        btn_7.setBackground(new java.awt.Color(255, 255, 255));
        btn_7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_7.setForeground(new java.awt.Color(52, 59, 68));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn4.jpeg"))); // NOI18N
        btn_7.setText("7");
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn3.jpeg"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 50, 50));

        btn_8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_8.setForeground(new java.awt.Color(52, 59, 68));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn4.jpeg"))); // NOI18N
        btn_8.setText("8");
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn3.jpeg"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 50, 50));

        btn_9.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_9.setForeground(new java.awt.Color(52, 59, 68));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn4.jpeg"))); // NOI18N
        btn_9.setText("9");
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn3.jpeg"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 50, 50));

        btn_sumar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_sumar.setForeground(new java.awt.Color(52, 59, 68));
        btn_sumar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        btn_sumar.setText("+");
        btn_sumar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_sumar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn3.jpeg"))); // NOI18N
        btn_sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 50, 50));

        btn_5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_5.setForeground(new java.awt.Color(52, 59, 68));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn4.jpeg"))); // NOI18N
        btn_5.setText("5");
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn3.jpeg"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 50, 50));

        btn_6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_6.setForeground(new java.awt.Color(52, 59, 68));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn4.jpeg"))); // NOI18N
        btn_6.setText("6");
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn3.jpeg"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 50, 50));

        btn_1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_1.setForeground(new java.awt.Color(52, 59, 68));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn4.jpeg"))); // NOI18N
        btn_1.setText("1");
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn3.jpeg"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 50, 50));

        btn_2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_2.setForeground(new java.awt.Color(52, 59, 68));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn4.jpeg"))); // NOI18N
        btn_2.setText("2");
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn3.jpeg"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 50, 50));

        btn_3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_3.setForeground(new java.awt.Color(52, 59, 68));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn4.jpeg"))); // NOI18N
        btn_3.setText("3");
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn3.jpeg"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 50, 50));

        btn_4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_4.setForeground(new java.awt.Color(52, 59, 68));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn4.jpeg"))); // NOI18N
        btn_4.setText("4");
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn3.jpeg"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 50, 50));

        btn_igual.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.jpeg"))); // NOI18N
        btn_igual.setText("=");
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn3.jpeg"))); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel2.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 50, 50));

        btn_0.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_0.setForeground(new java.awt.Color(52, 59, 68));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn4.jpeg"))); // NOI18N
        btn_0.setText("0");
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn3.jpeg"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 50, 50));

        btn_punto.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_punto.setForeground(new java.awt.Color(52, 59, 68));
        btn_punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn4.jpeg"))); // NOI18N
        btn_punto.setText(".");
        btn_punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn3.jpeg"))); // NOI18N
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 50, 50));

        btn_restar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_restar.setForeground(new java.awt.Color(52, 59, 68));
        btn_restar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        btn_restar.setText("-");
        btn_restar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_restar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn3.jpeg"))); // NOI18N
        btn_restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_restar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 50, 50));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 290, 330));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisionActionPerformed
        // Añade la division a los label
        addNumber("÷");
    }//GEN-LAST:event_btn_divisionActionPerformed

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
        // Clear button
        txtOperacion.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btn_cActionPerformed

    private void btn_ceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ceActionPerformed
        // Añade el clear element (borra un elemento)
        String texto = txtOperacion.getText().substring(0, txtOperacion.getText().length()-1);
        txtOperacion.setText(texto);
    }//GEN-LAST:event_btn_ceActionPerformed

    private void btn_porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcentajeActionPerformed
       // Añade el porcentaje % a los label
        addNumber("%");
    }//GEN-LAST:event_btn_porcentajeActionPerformed

    private void btn_multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicarActionPerformed
        // Añade la multiplicacion los label
        addNumber("*");
    }//GEN-LAST:event_btn_multiplicarActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        // Añade el numero 7 a los label
        addNumber("7");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
       // Añade el numero 8 a los label
        addNumber("8");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        // Añade el numero 9 a los label
        addNumber("9");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumarActionPerformed
       // Añade el sumar + a los label
        addNumber("+");
    }//GEN-LAST:event_btn_sumarActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        // Añade el numero 5 a los label
        addNumber("5");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        // Añade el numero 6 a los label
        addNumber("6");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        // Añade el numero 1 a los label
        addNumber("1");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        // Añade el numero 2 a los label
        addNumber("2");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        // Añade el numero 3 a los label
        addNumber("3");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // Añade el numero 4 a los label
        addNumber("4");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        // Añade el igual a los label ()
        try {
            String resultado = se.eval(txtOperacion.getText()).toString();
            txtResultado.setText(resultado);
            } catch (Exception ex) {
             Logger.getLogger(calculadora.class.getName()).log(Level.SEVERE, null, ex);
             btn_c.doClick();
            }
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        // Añade el numero 0 a los label
        addNumber("0");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        // Añade el punto a los label
        addNumber(".");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_puntoActionPerformed

    private void btn_restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restarActionPerformed
       // Añade el numero 4 a los label
        addNumber("4");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_restarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_ce;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multiplicar;
    private javax.swing.JButton btn_porcentaje;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_restar;
    private javax.swing.JButton btn_sumar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jag.gui;

import com.jag.lexer.Lexer;
import com.jag.parser.parser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matt
 */
public class ScreenMain extends javax.swing.JFrame {

    /**
     * Creates new form ScreenMain
     */
    public ScreenMain() {
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

        jLabel_tittleScreen = new javax.swing.JLabel();
        jLabel_inputCode = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_code = new javax.swing.JTextArea();
        jButton_testCode = new javax.swing.JButton();
        jButton_txtFilePathEntry = new javax.swing.JButton();
        jButton_languageSintax = new javax.swing.JButton();
        jButton_exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_tittleScreen.setFont(new java.awt.Font("Umpush", 3, 48)); // NOI18N
        jLabel_tittleScreen.setText("Jaguar Compiler");

        jLabel_inputCode.setFont(new java.awt.Font("Umpush", 1, 18)); // NOI18N
        jLabel_inputCode.setText("Input code:");

        jTextArea_code.setColumns(20);
        jTextArea_code.setRows(5);
        jScrollPane1.setViewportView(jTextArea_code);

        jButton_testCode.setText("Test Code");
        jButton_testCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_testCodeActionPerformed(evt);
            }
        });

        jButton_txtFilePathEntry.setText("TXT File Path Entry");

        jButton_languageSintax.setText("Language Sintax");
        jButton_languageSintax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_languageSintaxActionPerformed(evt);
            }
        });

        jButton_exit.setText("Exit");
        jButton_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel_tittleScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_inputCode)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_testCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_txtFilePathEntry, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(jButton_languageSintax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel_tittleScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_inputCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_testCode)
                            .addComponent(jButton_exit))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_languageSintax)
                        .addGap(27, 27, 27)
                        .addComponent(jButton_txtFilePathEntry)
                        .addGap(148, 148, 148))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_testCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_testCodeActionPerformed

//        final String DIRECTORY = "/home/matt/eclipse-workspace/jaguar-compiler/examples/";
//        final String FILE_NAME = "file_test1.txt";
        String codeFromTextArea = jTextArea_code.getText();

        System.out.println("TEXTO" + codeFromTextArea);
        
        // se o textArea for vazio inserir uma mensagem

        String nameAbstractFile = "abstractFileCodeInput.txt";
        File fileCodeAbstract = new File(nameAbstractFile);

        try {
            PrintWriter modificarArq = new PrintWriter(fileCodeAbstract);
            // INSER��O DO C�DIGO NO ARQUIVO ABSTRATO
            modificarArq.print(codeFromTextArea);

            parser p = new parser(new Lexer(new FileReader("abstractFileCodeInput.txt")));

            System.out.println("TESTE");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ScreenMain.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            @SuppressWarnings("deprecation")
            parser p = new parser(new Lexer(new FileReader(nameAbstractFile)));
            p.parse();
            System.out.println("Success!");
        } catch (FileNotFoundException e1) {
            System.err.println("Arquivo n�o encontrado: " + e1.getMessage() + "\n");
        } catch (Exception e2) {
            System.err.println("Exce��o gen�rica. Erro: " + e2.getMessage() + "\n");
        } finally {
            System.out.println("Fim do teste.");
        }

        // APAGAR O ARQUIVO ABSTRATO
        fileCodeAbstract.delete();

//         System.out.printf("Informe o n�mero para a tabuada:\n");
//    n = ler.nextInt();
//        final String DIRECTORY = "/home/matt/eclipse-workspace/jaguar-compiler/examples/";
//        final String FILE_NAME = "file_test1.txt";
//        FileWriter arq;
//        try {
//            System.out.println("TESTE");
//            arq = new FileWriter("/home/matt/Desktop/tabfdvdfvduada.txt");
//            System.out.println("test2");
//            arq.close();
//            
//        } catch (IOException ex) {
//            System.out.println("ERRO");
//            Logger.getLogger(ScreenMain.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    PrintWriter gravarArq = new PrintWriter(arq);
// 
//    gravarArq.printf("+--Resultado--+%n");
//    for (i=1; i<=10; i++) {
//      gravarArq.printf("| %2d X %d = %2d |%n", i, n, (i*n));
//    }
//    gravarArq.printf("+-------------+%n");
// 
//    arq.close();
//        try {
//            @SuppressWarnings("deprecation")
////            parser p = new parser(new Lexer(new FileReader(DIRECTORY + FILE_NAME)));
//            parser p = new parser(new Lexer(new FileReader(entrada.next(codeFromTextArea))));
//            p.parse();
//            System.out.println("Success!");
//        } catch (FileNotFoundException e1) {
//            System.err.println("Arquivo n�o encontrado: " + e1.getMessage() + "\n");
//        } catch (Exception e2) {
//            System.err.println("Exce��o gen�rica. Erro: " + e2.getMessage() + "\n");
//        } finally {
//            System.out.println("Fim do teste.");
//        }

    }//GEN-LAST:event_jButton_testCodeActionPerformed

    private void jButton_languageSintaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_languageSintaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_languageSintaxActionPerformed

    private void jButton_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_exitActionPerformed
        //SAIR
        System.exit(0);
    }//GEN-LAST:event_jButton_exitActionPerformed

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
            java.util.logging.Logger.getLogger(ScreenMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_exit;
    private javax.swing.JButton jButton_languageSintax;
    private javax.swing.JButton jButton_testCode;
    private javax.swing.JButton jButton_txtFilePathEntry;
    private javax.swing.JLabel jLabel_inputCode;
    private javax.swing.JLabel jLabel_tittleScreen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_code;
    // End of variables declaration//GEN-END:variables
}

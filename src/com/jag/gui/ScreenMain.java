/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jag.gui;

import com.jag.lexer.Lexer;
import com.jag.parser.parser;
import java.io.BufferedReader;
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
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

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
        jLabel_text03 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_code = new javax.swing.JTextArea();
        jButton_testCode = new javax.swing.JButton();
        jButton_txtFilePathEntry = new javax.swing.JButton();
        jButton_languageSintax = new javax.swing.JButton();
        jButton_exit = new javax.swing.JButton();
        jTextField_directory = new javax.swing.JTextField();
        jLabel_text01 = new javax.swing.JLabel();
        jLabel_text02 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_tittleScreen.setFont(new java.awt.Font("Umpush", 3, 48)); // NOI18N
        jLabel_tittleScreen.setText("Jaguar Compiler");

        jLabel_text03.setFont(new java.awt.Font("Umpush", 1, 18)); // NOI18N
        jLabel_text03.setText("Input code:");

        jTextArea_code.setColumns(20);
        jTextArea_code.setRows(5);
        jScrollPane1.setViewportView(jTextArea_code);

        jButton_testCode.setFont(new java.awt.Font("Umpush", 0, 12)); // NOI18N
        jButton_testCode.setText("Test Code");
        jButton_testCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_testCodeActionPerformed(evt);
            }
        });

        jButton_txtFilePathEntry.setFont(new java.awt.Font("Umpush", 0, 12)); // NOI18N
        jButton_txtFilePathEntry.setText("TXT File");
        jButton_txtFilePathEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_txtFilePathEntryActionPerformed(evt);
            }
        });

        jButton_languageSintax.setFont(new java.awt.Font("Umpush", 0, 12)); // NOI18N
        jButton_languageSintax.setText("Language Sintax");
        jButton_languageSintax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_languageSintaxActionPerformed(evt);
            }
        });

        jButton_exit.setFont(new java.awt.Font("Umpush", 0, 12)); // NOI18N
        jButton_exit.setText("Exit");
        jButton_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_exitActionPerformed(evt);
            }
        });

        jTextField_directory.setEditable(false);

        jLabel_text01.setFont(new java.awt.Font("Umpush", 0, 12)); // NOI18N
        jLabel_text01.setText("Choose a txt file:");

        jLabel_text02.setFont(new java.awt.Font("Umpush", 0, 12)); // NOI18N
        jLabel_text02.setText("or");

        jLabel1.setFont(new java.awt.Font("Umpush", 0, 12)); // NOI18N
        jLabel1.setText("File directory:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton_testCode, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_tittleScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(398, 398, 398)
                                .addComponent(jButton_languageSintax, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jButton_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_text01)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel_text02))
                            .addComponent(jLabel_text03))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_txtFilePathEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_directory, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_tittleScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_text01)
                    .addComponent(jButton_txtFilePathEntry)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_directory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_text02)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_text03, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_languageSintax)
                        .addGap(6, 6, 6)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_exit)
                    .addComponent(jButton_testCode))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_testCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_testCodeActionPerformed
        String codeFromTextArea = jTextArea_code.getText();

        if (codeFromTextArea.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insert code! ");
        } else {
            // CRIO O ARQUIVO TXT
            FileWriter arq;
            File fileCodeAbstract = new File("temporaryFile.txt");

            try {
                arq = new FileWriter(fileCodeAbstract);
                PrintWriter gravarArq = new PrintWriter(arq);

                // INSIRO O TEXTO NO ARQUIVO TXT
                gravarArq.printf(codeFromTextArea);
                arq.close();
            } catch (IOException ex) {
                // ERRO AO CRIAR OU INSERIR O C�DIGO NO ARQUIVO TXT
                Logger.getLogger(ScreenMain.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                // PEGO O DIRET�RIO E NOME DO ARQUIVO TXT
                final String DIRECTORY_AND_NAME = fileCodeAbstract.getAbsolutePath();
                @SuppressWarnings("deprecation")
                parser p = new parser(new Lexer(new FileReader(DIRECTORY_AND_NAME)));
                p.parse();
                System.out.println("Success!");
                JOptionPane.showMessageDialog(null, "An�lise L�xica e Sint�tica Realizadas com Sucesso! ");
            } catch (FileNotFoundException e1) {
                System.err.println("Arquivo n�o encontrado: " + e1.getMessage() + "\n");
                JOptionPane.showMessageDialog(null, "Arquivo n�o encontrado: " + e1.getMessage() + "\n");
            } catch (Exception e2) {
                System.err.println("Exce��o gen�rica. Erro: " + e2.getMessage() + "\n");
                JOptionPane.showMessageDialog(null, "Exce��o gen�rica. Erro: " + e2.getMessage() + "\n");
            }

            // DELETO O ARQUIVO TXT
            fileCodeAbstract.delete();
        }
    }//GEN-LAST:event_jButton_testCodeActionPerformed

    private void jButton_languageSintaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_languageSintaxActionPerformed
        ScreenLanguageSintax screenLanguageSintax = new ScreenLanguageSintax();
        screenLanguageSintax.setLocationRelativeTo(null);
        screenLanguageSintax.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton_languageSintaxActionPerformed

    private void jButton_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_exitActionPerformed
        //SAIR
        System.exit(0);
    }//GEN-LAST:event_jButton_exitActionPerformed

    private void jButton_txtFilePathEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_txtFilePathEntryActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Find TXT File");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Processador de Texto", "txt");
        fileChooser.setFileFilter(filter);

        // RETORNA O QUE O USUARIO ESCOLHEU
        int retorno = fileChooser.showOpenDialog(this);

        if (retorno == JFileChooser.APPROVE_OPTION) {// QUER DIZER QUE CLICOU PARA ABRIR O ARQUIVO
            // PEGAR O ARQUIVO
            File file = fileChooser.getSelectedFile();

            FileReader arq;
            try {
                arq = new FileReader(file);
                BufferedReader lerArq = new BufferedReader(arq);

                String arquivo = "";
                String linha = lerArq.readLine(); // l� a primeira linha

                while (linha != null) {
                    //System.out.printf("%s\n", linha);
                    arquivo = arquivo + "\n" + linha;
                    linha = lerArq.readLine(); // l� da segunda at� a �ltima linha
                }

                arq.close();
                jTextArea_code.setText(arquivo);
                jTextField_directory.setText(file.getPath());
            } catch (FileNotFoundException ex) {
                // N�O FOI POSS�VEL LER O ARQUIVO TXT
                Logger.getLogger(ScreenMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                // N�O FOI POSS�VEL LER UMA LINHA DO ARQUIVO TXT
                Logger.getLogger(ScreenMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton_txtFilePathEntryActionPerformed

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
            java.util.logging.Logger.getLogger(ScreenMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_text01;
    private javax.swing.JLabel jLabel_text02;
    private javax.swing.JLabel jLabel_text03;
    private javax.swing.JLabel jLabel_tittleScreen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_code;
    private javax.swing.JTextField jTextField_directory;
    // End of variables declaration//GEN-END:variables
}
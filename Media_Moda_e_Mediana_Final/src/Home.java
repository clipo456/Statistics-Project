
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author yurim
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        jLabel1 = new javax.swing.JLabel();
        btCalcular = new javax.swing.JButton();
        lblDados = new javax.swing.JLabel();
        lblResultadoModa = new javax.swing.JLabel();
        lblResultadoMediana = new javax.swing.JLabel();
        lblResultadoMedia = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInput = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Trabalho de Estatísca e Cálculo - Yuri, Bruno Ramos, Guilherme Andrade e João Pedro Meneguesso");

        btCalcular.setText("Calcular");
        btCalcular.setBorder(null);
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        lblDados.setText("Dados:");
        lblDados.setToolTipText("");

        lblResultadoModa.setText("Moda:");

        lblResultadoMediana.setText("Mediana:");

        lblResultadoMedia.setText("Média:");

        txtInput.setColumns(20);
        txtInput.setRows(5);
        jScrollPane1.setViewportView(txtInput);

        jLabel2.setText("*Insira os valores separados por ponto e vírgula e espaço.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblDados, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblResultadoMediana, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblResultadoMedia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblResultadoModa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(326, 326, 326)))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(133, 133, 133))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblResultadoMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblResultadoModa, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDados, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblResultadoMediana, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        float media = 0;
        
        ArrayList<Float> dadosList;
        int qtd;
        String separador = ";";
        String dadosStr = txtInput.getText();
        String[] strArray = dadosStr.split(separador);
        qtd = strArray.length;
        dadosList = new ArrayList<>();
        media = 0;
        float[] dados = new float[qtd];

        // Parse the strings in strArray into floats and add them to dadosList
        for (int i = 0; i < qtd; i++) {
            dadosList.add(Float.parseFloat(strArray[i]));
        }

        //Transforma o array list em um array comum
        for (int i = 0; i < dadosList.size(); i++) {
            dados[i] = dadosList.get(i);
        }
        
        Arrays.sort(dados);
        
        // Constrói uma String para mostrar os dados inseridos
        StringBuilder mostrador = new StringBuilder();
        for(int i = 0; i<dados.length; i++){
            mostrador.append(dados[i]+"; ");
        }
        
        // Calcula media e imprime o resultado
        for (int i = 0; i < dados.length; i++) {
            media += dados[i];
        }
        lblResultadoMedia.setText("Média: " + media/qtd);
        
        //MODA-------------------------------------------
        List<Float> modas = calcularModa(dados);

        if (modas.size() == 1) {
            lblResultadoModa.setText("<html>A moda é: " + modas.get(0) + "." + "\n O conjunto de dados é unimodal. </html>");
        } else if (modas.size() == 2) {
            lblResultadoModa.setText("<html>As modas são: " + modas.get(0) + " e " + modas.get(1) + ".\n O conjunto de dados é bimodal.</html>");
        }
        else if (modas.size() == 3) {
            lblResultadoModa.setText("<html>As modas são: " + modas.get(0) + " e " + modas.get(1)+ " e " + modas.get(2) + ".\n O conjunto de dados é trimodal.</html>");
        } else {
            lblResultadoModa.setText("O conjunto de dados é multimodal ou amodal.");
        }
         
                float mediana = 0;
                
                //Faz o cálculo de mediana
                int meio = qtd/2;
                if(qtd%2 == 0){
                    mediana = (dados[meio-1] + dados[meio])/2;
                }else{
                    mediana = dados[meio];
                }

                lblDados.setText("<html>Dados inseridos:" + mostrador.toString() + "</html>");

                //Imprime os resultados
                lblResultadoMediana.setText("Mediana: " + mediana);
    }//GEN-LAST:event_btCalcularActionPerformed

    // Método para calcular a moda
   public static List<Float> calcularModa(float[] numeros) {
        Map<Float, Float> contagem = new HashMap<>();

        for (float numero : numeros) {
            contagem.put(numero, contagem.getOrDefault(numero, 0.00f) + 1);
        }

        List<Float> modas = new ArrayList<>();
        float maxContagem = 0;

        for (Map.Entry<Float, Float> entry : contagem.entrySet()) {
            float numero = entry.getKey();
            float frequencia = entry.getValue();

            if (frequencia > maxContagem) {
                modas.clear();
                modas.add(numero);
                maxContagem = frequencia;
            } else if (frequencia == maxContagem) {
                modas.add(numero);
            }
        }

        return modas;
    }


    
    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDados;
    private javax.swing.JLabel lblResultadoMedia;
    private javax.swing.JLabel lblResultadoMediana;
    private javax.swing.JLabel lblResultadoModa;
    private javax.swing.JTextArea txtInput;
    // End of variables declaration//GEN-END:variables
}

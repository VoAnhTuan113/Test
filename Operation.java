package baithuchanhso2;

import javax.swing.JOptionPane;

public class Operation extends javax.swing.JFrame {

    public Operation() {
        initComponents();
        this.setTitle("Phep toan");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        firstText = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        SecondLabel = new javax.swing.JLabel();
        secondText = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        ResultLabel = new javax.swing.JLabel();
        resultText = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        OperatorLabel = new javax.swing.JLabel();
        operatorComboBox = new javax.swing.JComboBox<>();
        ComputeButton = new javax.swing.JButton();
        ContinueButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(147, 176, 184));
        jPanel5.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(147, 176, 184));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(228, 223, 237));
        jLabel1.setText("Enter the first number");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 8, -1, -1));

        firstText.setBackground(new java.awt.Color(147, 176, 184));
        firstText.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        firstText.setForeground(new java.awt.Color(228, 223, 237));
        firstText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(228, 223, 237)));
        jPanel1.add(firstText, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 230, 36));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 510, -1));

        jPanel2.setBackground(new java.awt.Color(147, 176, 184));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SecondLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        SecondLabel.setForeground(new java.awt.Color(228, 223, 237));
        SecondLabel.setText("Enter the second number");
        jPanel2.add(SecondLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        secondText.setBackground(new java.awt.Color(147, 176, 184));
        secondText.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        secondText.setForeground(new java.awt.Color(228, 223, 237));
        secondText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(228, 223, 237)));
        jPanel2.add(secondText, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 230, 36));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 550, 36));

        jPanel3.setBackground(new java.awt.Color(147, 176, 184));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ResultLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        ResultLabel.setForeground(new java.awt.Color(228, 223, 237));
        ResultLabel.setText("Result");
        jPanel3.add(ResultLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        resultText.setEditable(false);
        resultText.setBackground(new java.awt.Color(147, 176, 184));
        resultText.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        resultText.setForeground(new java.awt.Color(228, 223, 237));
        resultText.setBorder(null);
        resultText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(resultText, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 230, 36));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 550, 36));

        jPanel4.setBackground(new java.awt.Color(147, 176, 184));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OperatorLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        OperatorLabel.setForeground(new java.awt.Color(228, 223, 237));
        OperatorLabel.setText("Choose the operator");
        jPanel4.add(OperatorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        operatorComboBox.setBackground(new java.awt.Color(147, 176, 184));
        operatorComboBox.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        operatorComboBox.setForeground(new java.awt.Color(228, 223, 237));
        operatorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "*" }));
        operatorComboBox.setBorder(null);
        jPanel4.add(operatorComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 230, 36));

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 550, 36));

        ComputeButton.setBackground(new java.awt.Color(241, 169, 75));
        ComputeButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 22)); // NOI18N
        ComputeButton.setForeground(new java.awt.Color(255, 255, 255));
        ComputeButton.setText("Compute");
        ComputeButton.setBorder(null);
        ComputeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComputeButtonActionPerformed(evt);
            }
        });
        jPanel5.add(ComputeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 130, 50));

        ContinueButton.setBackground(new java.awt.Color(241, 169, 75));
        ContinueButton.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 22)); // NOI18N
        ContinueButton.setForeground(new java.awt.Color(255, 255, 255));
        ContinueButton.setText("Continue");
        ContinueButton.setBorder(null);
        ContinueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueButtonActionPerformed(evt);
            }
        });
        jPanel5.add(ContinueButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 130, 50));

        ExitButton.setBackground(new java.awt.Color(241, 169, 75));
        ExitButton.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 22)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("Exit");
        ExitButton.setBorder(null);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jPanel5.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 130, 50));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("OPERATION");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ComputeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComputeButtonActionPerformed
        String str1 = firstText.getText();
        String str2 = secondText.getText();
        try {
            double result, num1, num2;
            num1 = Double.parseDouble(str1);
            num2 = Double.parseDouble(str2);
            String str;
            String selectOperator = (String) operatorComboBox.getSelectedItem();
            switch(selectOperator) {
                case "+":
                    result = num1 + num2;
                    str = String.valueOf(result);
                    resultText.setText(str);
                    break;
                case "-":
                    result = num1 - num2;
                    str = String.valueOf(result);
                    resultText.setText(str);
                    break;
                case "*":
                    result = num1 * num2;
                    str = String.valueOf(result);
                    resultText.setText(str);
                    break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(resultText, "Invavid Input");
        }
    }//GEN-LAST:event_ComputeButtonActionPerformed

    private void ContinueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueButtonActionPerformed
        firstText.setText(null);
        operatorComboBox.selectWithKeyChar('+');
        secondText.setText(null);
        resultText.setText(null);
    }//GEN-LAST:event_ContinueButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_ExitButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ComputeButton;
    private javax.swing.JButton ContinueButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel OperatorLabel;
    private javax.swing.JLabel ResultLabel;
    private javax.swing.JLabel SecondLabel;
    private javax.swing.JTextField firstText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JComboBox<String> operatorComboBox;
    private javax.swing.JTextField resultText;
    private javax.swing.JTextField secondText;
    // End of variables declaration//GEN-END:variables
}

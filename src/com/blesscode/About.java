package com.blesscode;

public class About extends javax.swing.JFrame {

    public About() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblJudul = new javax.swing.JLabel();
        lblVer = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        lblVerVal = new javax.swing.JLabel();
        lblAuthorVal = new javax.swing.JLabel();
        scrCopyright = new javax.swing.JScrollPane();
        txtCopyright = new javax.swing.JTextArea();
        btnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("jScanner | About");
        setResizable(false);

        lblJudul.setFont(new java.awt.Font("Segoe UI Symbol", 0, 48)); // NOI18N
        lblJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJudul.setText("jScanner");
        lblJudul.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblJudul.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblVer.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblVer.setText("Version:");

        lblAuthor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblAuthor.setText("Author:");

        lblVerVal.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblVerVal.setText("1.0");

        lblAuthorVal.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblAuthorVal.setText("Harditya Rahmat Ramadhan");

        txtCopyright.setColumns(20);
        txtCopyright.setEditable(false);
        txtCopyright.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtCopyright.setRows(5);
        txtCopyright.setText("You can use this software for free but you can not change the \nsource code. This software is released as freeware.");
        scrCopyright.setViewportView(txtCopyright);

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel1.setText("Copyright (c) 2012 Harditya Rahmat Ramadhan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrCopyright, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                    .addComponent(lblJudul, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVer)
                            .addComponent(lblAuthor))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAuthorVal)
                            .addComponent(lblVerVal))
                        .addGap(134, 134, 134))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVer)
                    .addComponent(lblVerVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAuthor)
                    .addComponent(lblAuthorVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrCopyright, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(jLabel1))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-441)/2, (screenSize.height-338)/2, 441, 338);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblAuthorVal;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblVer;
    private javax.swing.JLabel lblVerVal;
    private javax.swing.JScrollPane scrCopyright;
    private javax.swing.JTextArea txtCopyright;
    // End of variables declaration//GEN-END:variables

}

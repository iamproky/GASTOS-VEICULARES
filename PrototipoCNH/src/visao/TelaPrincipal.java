/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import java.awt.Color;

/**
 *
 * @author Aluno
 */
public class TelaPrincipal extends javax.swing.JFrame {

    Color DefaultColor,ClickedColor;
    
    public TelaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultColor = new Color(153,153,153);
        ClickedColor = new Color(204,204,204);
        
        jPanel_Proprietario.setBackground(DefaultColor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel_Proprietario = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel_Marca = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel_Modelo = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel_Sair = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel_Veiculo = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel_Gastos = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel_Relatorio = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projetogastos");
        setBackground(new java.awt.Color(204, 204, 204));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1400, 900));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jPanel_Proprietario.setBackground(new java.awt.Color(153, 153, 153));
        jPanel_Proprietario.setPreferredSize(new java.awt.Dimension(354, 68));
        jPanel_Proprietario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_ProprietarioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel_ProprietarioMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("CADASTRO DE PROPRIETARIO");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/adicionar-usuario.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_ProprietarioLayout = new javax.swing.GroupLayout(jPanel_Proprietario);
        jPanel_Proprietario.setLayout(jPanel_ProprietarioLayout);
        jPanel_ProprietarioLayout.setHorizontalGroup(
            jPanel_ProprietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ProprietarioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_ProprietarioLayout.setVerticalGroup(
            jPanel_ProprietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ProprietarioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel_ProprietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel_Marca.setBackground(new java.awt.Color(153, 153, 153));
        jPanel_Marca.setPreferredSize(new java.awt.Dimension(354, 68));
        jPanel_Marca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_MarcaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel_MarcaMousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("CADASTRO DE MARCA");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/adicionar-usuario.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_MarcaLayout = new javax.swing.GroupLayout(jPanel_Marca);
        jPanel_Marca.setLayout(jPanel_MarcaLayout);
        jPanel_MarcaLayout.setHorizontalGroup(
            jPanel_MarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MarcaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        jPanel_MarcaLayout.setVerticalGroup(
            jPanel_MarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MarcaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel_MarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel_Modelo.setBackground(new java.awt.Color(153, 153, 153));
        jPanel_Modelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_ModeloMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel_ModeloMousePressed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/adicionar-usuario.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("CADASTRO DE MODELO");

        javax.swing.GroupLayout jPanel_ModeloLayout = new javax.swing.GroupLayout(jPanel_Modelo);
        jPanel_Modelo.setLayout(jPanel_ModeloLayout);
        jPanel_ModeloLayout.setHorizontalGroup(
            jPanel_ModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ModeloLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_ModeloLayout.setVerticalGroup(
            jPanel_ModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ModeloLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel_ModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel_Sair.setBackground(new java.awt.Color(255, 51, 51));
        jPanel_Sair.setPreferredSize(new java.awt.Dimension(191, 76));
        jPanel_Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_SairMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel_SairMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair.png"))); // NOI18N
        jLabel6.setText("SAIR");

        javax.swing.GroupLayout jPanel_SairLayout = new javax.swing.GroupLayout(jPanel_Sair);
        jPanel_Sair.setLayout(jPanel_SairLayout);
        jPanel_SairLayout.setHorizontalGroup(
            jPanel_SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_SairLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_SairLayout.setVerticalGroup(
            jPanel_SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SairLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logosemfundo.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SYSTEM CORP");

        jPanel_Veiculo.setBackground(new java.awt.Color(153, 153, 153));
        jPanel_Veiculo.setPreferredSize(new java.awt.Dimension(354, 68));
        jPanel_Veiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_VeiculoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel_VeiculoMousePressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("VEÍCULO");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/silhueta-do-lado-preto-do-carro (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel_VeiculoLayout = new javax.swing.GroupLayout(jPanel_Veiculo);
        jPanel_Veiculo.setLayout(jPanel_VeiculoLayout);
        jPanel_VeiculoLayout.setHorizontalGroup(
            jPanel_VeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_VeiculoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_VeiculoLayout.setVerticalGroup(
            jPanel_VeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_VeiculoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel13)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_VeiculoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        jPanel_Gastos.setBackground(new java.awt.Color(153, 153, 153));
        jPanel_Gastos.setPreferredSize(new java.awt.Dimension(354, 68));
        jPanel_Gastos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_GastosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel_GastosMousePressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("GASTOS DO PROPRIETÁRIO");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/carrogastos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_GastosLayout = new javax.swing.GroupLayout(jPanel_Gastos);
        jPanel_Gastos.setLayout(jPanel_GastosLayout);
        jPanel_GastosLayout.setHorizontalGroup(
            jPanel_GastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_GastosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_GastosLayout.setVerticalGroup(
            jPanel_GastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_GastosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel_GastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel_Relatorio.setBackground(new java.awt.Color(153, 153, 153));
        jPanel_Relatorio.setPreferredSize(new java.awt.Dimension(354, 68));
        jPanel_Relatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_RelatorioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel_RelatorioMousePressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("RELATÓRIO");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/relatorio.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_RelatorioLayout = new javax.swing.GroupLayout(jPanel_Relatorio);
        jPanel_Relatorio.setLayout(jPanel_RelatorioLayout);
        jPanel_RelatorioLayout.setHorizontalGroup(
            jPanel_RelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_RelatorioLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_RelatorioLayout.setVerticalGroup(
            jPanel_RelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_RelatorioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel_RelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Proprietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_Marca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel_Veiculo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(jLabel4))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGap(94, 94, 94)
                                    .addComponent(jLabel2))
                                .addComponent(jPanel_Sair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                            .addComponent(jPanel_Gastos, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_Relatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(96, 96, 96)
                .addComponent(jPanel_Proprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_Veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_Gastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_Relatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                .addComponent(jPanel_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jDesktopPane1.setEnabled(false);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1125, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel_ProprietarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_ProprietarioMouseClicked
        // TODO add your handling code here:
        TelaDeCadastroDeProprietarios tela = new TelaDeCadastroDeProprietarios();
        jDesktopPane1.removeAll();      
        jDesktopPane1.add(tela).setVisible(true);
        
        
       
             
       
    }//GEN-LAST:event_jPanel_ProprietarioMouseClicked

    private void jPanel_ProprietarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_ProprietarioMousePressed
        // TODO add your handling code here:
        jPanel_Veiculo.setBackground(DefaultColor);
        jPanel_Marca.setBackground(DefaultColor);
        jPanel_Modelo.setBackground(DefaultColor);
        jPanel_Proprietario.setBackground(ClickedColor);
        jPanel_Gastos.setBackground(DefaultColor);
        jPanel_Relatorio.setBackground(DefaultColor);
        
    }//GEN-LAST:event_jPanel_ProprietarioMousePressed

    private void jPanel_MarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_MarcaMouseClicked
        // TODO add your handling code here:
        TelaCadastroMarcas tela = new TelaCadastroMarcas();
        jDesktopPane1.removeAll();      
        jDesktopPane1.add(tela).setVisible(true);
        
    }//GEN-LAST:event_jPanel_MarcaMouseClicked

    private void jPanel_MarcaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_MarcaMousePressed
        // TODO add your handling code here:
        jPanel_Veiculo.setBackground(DefaultColor);
        jPanel_Marca.setBackground(ClickedColor);
        jPanel_Modelo.setBackground(DefaultColor);
        jPanel_Proprietario.setBackground(DefaultColor);
        jPanel_Gastos.setBackground(DefaultColor);
        jPanel_Relatorio.setBackground(DefaultColor);
    }//GEN-LAST:event_jPanel_MarcaMousePressed

    private void jPanel_ModeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_ModeloMouseClicked
        // TODO add your handling code here
        TelaCadastroModelo tela = new TelaCadastroModelo();
        jDesktopPane1.removeAll();      
        jDesktopPane1.add(tela).setVisible(true);
    }//GEN-LAST:event_jPanel_ModeloMouseClicked

    private void jPanel_ModeloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_ModeloMousePressed
        // TODO add your handling code here:
        jPanel_Veiculo.setBackground(DefaultColor);
        jPanel_Marca.setBackground(DefaultColor);
        jPanel_Modelo.setBackground(ClickedColor);
        jPanel_Proprietario.setBackground(DefaultColor);
        jPanel_Gastos.setBackground(DefaultColor);
        jPanel_Relatorio.setBackground(DefaultColor);
    }//GEN-LAST:event_jPanel_ModeloMousePressed

    private void jPanel_SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_SairMouseClicked
        // TODO add your handling code here: 
        dispose();
    }//GEN-LAST:event_jPanel_SairMouseClicked

    private void jPanel_SairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_SairMousePressed
        // TODO add your handling code here:
        jPanel_Sair.setBackground(ClickedColor);
    }//GEN-LAST:event_jPanel_SairMousePressed

    private void jPanel_VeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_VeiculoMouseClicked
        TelaDeVeiculo telaveiculo = new TelaDeVeiculo();
        jDesktopPane1.removeAll();      
        jDesktopPane1.add(telaveiculo).setVisible(true);
       
    }//GEN-LAST:event_jPanel_VeiculoMouseClicked

    private void jPanel_VeiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_VeiculoMousePressed
        // TODO add your handling code here:
        jPanel_Gastos.setBackground(DefaultColor);
        jPanel_Veiculo.setBackground(ClickedColor);
        jPanel_Marca.setBackground(DefaultColor);
        jPanel_Modelo.setBackground(DefaultColor);
        jPanel_Proprietario.setBackground(DefaultColor);
        jPanel_Relatorio.setBackground(DefaultColor);
    }//GEN-LAST:event_jPanel_VeiculoMousePressed

    private void jPanel_GastosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_GastosMouseClicked
        TelaGastos gastos = new TelaGastos();
        jDesktopPane1.removeAll();      
        jDesktopPane1.add(gastos).setVisible(true);
    }//GEN-LAST:event_jPanel_GastosMouseClicked

    private void jPanel_GastosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_GastosMousePressed
        // TODO add your handling code here:
        jPanel_Gastos.setBackground(ClickedColor);
        jPanel_Veiculo.setBackground(DefaultColor);
        jPanel_Marca.setBackground(DefaultColor);
        jPanel_Modelo.setBackground(DefaultColor);
        jPanel_Proprietario.setBackground(DefaultColor);
        jPanel_Relatorio.setBackground(DefaultColor);
    }//GEN-LAST:event_jPanel_GastosMousePressed

    private void jPanel_RelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_RelatorioMouseClicked
        TelaRelatorios relatorios = new TelaRelatorios();
        jDesktopPane1.removeAll();      
        jDesktopPane1.add(relatorios).setVisible(true);
    }//GEN-LAST:event_jPanel_RelatorioMouseClicked

    private void jPanel_RelatorioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_RelatorioMousePressed
        // TODO add your handling code here:
        jPanel_Gastos.setBackground(DefaultColor);
        jPanel_Veiculo.setBackground(DefaultColor);
        jPanel_Marca.setBackground(DefaultColor);
        jPanel_Modelo.setBackground(DefaultColor);
        jPanel_Proprietario.setBackground(DefaultColor);
        jPanel_Relatorio.setBackground(ClickedColor);
    }//GEN-LAST:event_jPanel_RelatorioMousePressed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Gastos;
    private javax.swing.JPanel jPanel_Marca;
    private javax.swing.JPanel jPanel_Modelo;
    private javax.swing.JPanel jPanel_Proprietario;
    private javax.swing.JPanel jPanel_Relatorio;
    private javax.swing.JPanel jPanel_Sair;
    private javax.swing.JPanel jPanel_Veiculo;
    // End of variables declaration//GEN-END:variables
}
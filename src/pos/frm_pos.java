package pos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.Statement;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.text.Position;

public class frm_pos extends javax.swing.JFrame {

    float valortotal=0;
    
    DefaultListModel produtos=new DefaultListModel();
    DefaultListModel quantidade=new DefaultListModel();
    DefaultListModel preco=new DefaultListModel();
    DefaultListModel totais=new DefaultListModel();
      
    NumberFormat moeda=NumberFormat.getCurrencyInstance();
    
    public frm_pos() {
        initComponents();
        setLocationRelativeTo(null); //centralizar o formulário
        btn_pagar.setEnabled(false);
        btn_imprimir.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_cafeteria = new javax.swing.JPanel();
        btn_cafe = new javax.swing.JButton();
        btn_carioca = new javax.swing.JButton();
        btn_descafeinado = new javax.swing.JButton();
        btn_galao = new javax.swing.JButton();
        btn_garoto = new javax.swing.JButton();
        btn_cappuccino = new javax.swing.JButton();
        painel_pastelaria = new javax.swing.JPanel();
        btn_bolo = new javax.swing.JButton();
        btn_pizza = new javax.swing.JButton();
        btn_salgado = new javax.swing.JButton();
        btn_mista = new javax.swing.JButton();
        btn_folhado = new javax.swing.JButton();
        btn_tosta = new javax.swing.JButton();
        painel_bebidas = new javax.swing.JPanel();
        btn_agua = new javax.swing.JButton();
        btn_cola = new javax.swing.JButton();
        btn_sumo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn_mais = new javax.swing.JButton();
        btn_menos = new javax.swing.JButton();
        btn_quantidade = new javax.swing.JButton();
        btn_remover = new javax.swing.JButton();
        btn_pagar = new javax.swing.JButton();
        btn_imprimir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pedido = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_produto = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_quantidade = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lista_preco = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lista_total = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_novo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        numerario = new javax.swing.JLabel();
        troco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POS");
        setResizable(false);

        painel_cafeteria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cafeteria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        btn_cafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cafe.gif"))); // NOI18N
        btn_cafe.setText("Café");
        btn_cafe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cafe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cafeActionPerformed(evt);
            }
        });

        btn_carioca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carioca.gif"))); // NOI18N
        btn_carioca.setText("Carioca");
        btn_carioca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_carioca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_carioca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariocaActionPerformed(evt);
            }
        });

        btn_descafeinado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/descafeinado.gif"))); // NOI18N
        btn_descafeinado.setText("Descafeinado");
        btn_descafeinado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_descafeinado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_descafeinado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_descafeinadoActionPerformed(evt);
            }
        });

        btn_galao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/galao.gif"))); // NOI18N
        btn_galao.setText("Galão");
        btn_galao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_galao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_galao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_galaoActionPerformed(evt);
            }
        });

        btn_garoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/garoto.gif"))); // NOI18N
        btn_garoto.setText("Garoto");
        btn_garoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_garoto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_garoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_garotoActionPerformed(evt);
            }
        });

        btn_cappuccino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/capucino.gif"))); // NOI18N
        btn_cappuccino.setText("Cappuccino");
        btn_cappuccino.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cappuccino.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cappuccino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cappuccinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_cafeteriaLayout = new javax.swing.GroupLayout(painel_cafeteria);
        painel_cafeteria.setLayout(painel_cafeteriaLayout);
        painel_cafeteriaLayout.setHorizontalGroup(
            painel_cafeteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_cafeteriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_cafeteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painel_cafeteriaLayout.createSequentialGroup()
                        .addComponent(btn_cafe, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_carioca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_descafeinado))
                    .addGroup(painel_cafeteriaLayout.createSequentialGroup()
                        .addComponent(btn_galao, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_garoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cappuccino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_cafeteriaLayout.setVerticalGroup(
            painel_cafeteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_cafeteriaLayout.createSequentialGroup()
                .addGroup(painel_cafeteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_cafe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_descafeinado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_carioca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_cafeteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_galao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cappuccino, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_garoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        painel_pastelaria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pastelaria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        btn_bolo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bolo.gif"))); // NOI18N
        btn_bolo.setText("Bolo");
        btn_bolo.setActionCommand("");
        btn_bolo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_bolo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_bolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_boloActionPerformed(evt);
            }
        });

        btn_pizza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Untitled-7.gif"))); // NOI18N
        btn_pizza.setText("Pizza");
        btn_pizza.setActionCommand("");
        btn_pizza.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_pizza.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_pizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pizzaActionPerformed(evt);
            }
        });

        btn_salgado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salgado.gif"))); // NOI18N
        btn_salgado.setText("Salgado");
        btn_salgado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_salgado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_salgado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salgadoActionPerformed(evt);
            }
        });

        btn_mista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mista.gif"))); // NOI18N
        btn_mista.setText("Mista");
        btn_mista.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_mista.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_mista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mistaActionPerformed(evt);
            }
        });

        btn_folhado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Untitled-12_1.gif"))); // NOI18N
        btn_folhado.setText("Folhado");
        btn_folhado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_folhado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_folhado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_folhadoActionPerformed(evt);
            }
        });

        btn_tosta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Untitled-6.gif"))); // NOI18N
        btn_tosta.setText("Tosta");
        btn_tosta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_tosta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_tosta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tostaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_pastelariaLayout = new javax.swing.GroupLayout(painel_pastelaria);
        painel_pastelaria.setLayout(painel_pastelariaLayout);
        painel_pastelariaLayout.setHorizontalGroup(
            painel_pastelariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_pastelariaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_pastelariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_pastelariaLayout.createSequentialGroup()
                        .addComponent(btn_bolo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_pizza, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_salgado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painel_pastelariaLayout.createSequentialGroup()
                        .addComponent(btn_mista, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_folhado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_tosta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painel_pastelariaLayout.setVerticalGroup(
            painel_pastelariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_pastelariaLayout.createSequentialGroup()
                .addGroup(painel_pastelariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_bolo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_salgado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_pizza, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_pastelariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_mista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_tosta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_folhado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        painel_bebidas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bebidas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        btn_agua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/agua.gif"))); // NOI18N
        btn_agua.setText("Água");
        btn_agua.setActionCommand("");
        btn_agua.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_agua.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_agua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aguaActionPerformed(evt);
            }
        });

        btn_cola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Untitled-5.gif"))); // NOI18N
        btn_cola.setText("Cola");
        btn_cola.setActionCommand("");
        btn_cola.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cola.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_colaActionPerformed(evt);
            }
        });

        btn_sumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sumo.gif"))); // NOI18N
        btn_sumo.setText("Sumo");
        btn_sumo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_sumo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_sumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_bebidasLayout = new javax.swing.GroupLayout(painel_bebidas);
        painel_bebidas.setLayout(painel_bebidasLayout);
        painel_bebidasLayout.setHorizontalGroup(
            painel_bebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_bebidasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_agua, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cola, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_sumo, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addContainerGap())
        );
        painel_bebidasLayout.setVerticalGroup(
            painel_bebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_bebidasLayout.createSequentialGroup()
                .addGroup(painel_bebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_agua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_sumo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cola, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_mais.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn_mais.setText("+");
        btn_mais.setMaximumSize(new java.awt.Dimension(81, 71));
        btn_mais.setMinimumSize(new java.awt.Dimension(81, 71));
        btn_mais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_maisActionPerformed(evt);
            }
        });

        btn_menos.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn_menos.setText("-");
        btn_menos.setMaximumSize(new java.awt.Dimension(81, 71));
        btn_menos.setMinimumSize(new java.awt.Dimension(81, 71));
        btn_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menosActionPerformed(evt);
            }
        });

        btn_quantidade.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_quantidade.setText("Quantidade");
        btn_quantidade.setMaximumSize(new java.awt.Dimension(81, 34));
        btn_quantidade.setMinimumSize(new java.awt.Dimension(81, 34));
        btn_quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quantidadeActionPerformed(evt);
            }
        });

        btn_remover.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_remover.setText("Remover");
        btn_remover.setMaximumSize(new java.awt.Dimension(81, 34));
        btn_remover.setMinimumSize(new java.awt.Dimension(81, 34));
        btn_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removerActionPerformed(evt);
            }
        });

        btn_pagar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_pagar.setText("Pagar");
        btn_pagar.setMaximumSize(new java.awt.Dimension(81, 34));
        btn_pagar.setMinimumSize(new java.awt.Dimension(81, 34));
        btn_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pagarActionPerformed(evt);
            }
        });

        btn_imprimir.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_imprimir.setText("Imprimir");
        btn_imprimir.setMaximumSize(new java.awt.Dimension(81, 34));
        btn_imprimir.setMinimumSize(new java.awt.Dimension(81, 34));
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Nº do pedido");

        pedido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lista_produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lista_produtoMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(lista_produto);

        lista_quantidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lista_quantidadeMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(lista_quantidade);

        lista_preco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lista_precoMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(lista_preco);

        lista_total.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lista_totalMouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(lista_total);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Produto");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Qtd.");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Total");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Preço");

        btn_novo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Total");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Numerário");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Troco");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total.setText("0");
        total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        total.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        numerario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numerario.setText("0");
        numerario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        numerario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        troco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        troco.setText("0");
        troco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        troco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_pagar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_remover, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_quantidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                        .addComponent(btn_mais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_imprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_novo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numerario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(troco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(total))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numerario)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(troco)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_mais, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btn_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(painel_cafeteria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painel_pastelaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(painel_bebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painel_cafeteria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel_pastelaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel_bebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // criar uma classe para imprimir o talão
    class imprimir implements Printable{
        public int print(Graphics g, PageFormat f, int pageIndex ){
            if(pageIndex==0){
                Font f1=new Font("Verdana",Font.BOLD,12);
                Font f2=new Font("Verdana",Font.PLAIN,10);
                Font f3=new Font("Verdana",Font.PLAIN,5);
                
                g.setFont(f1);
                g.setColor(Color.blue);
                g.drawString("P.O.S - Pastelaria, Lda.",50,50);
                
                g.setFont(f3);
                g.setColor(Color.black);
                g.drawString("Rua Maria da Fonte, Nº 12 - A",50, 75);
                
                // apresentar o nº do pedido
                g.drawString("Nº Pedido:",250 , 75);
                g.drawString(pedido.getText(),250 , 85);
                
                g.drawString("1150-020 Lisboa - Contato: 913 234 567",50, 85);
                g.drawString("Email: past@mail.pt",50, 95);
                g.drawString("NIF: 501 234 567",50, 105);
                g.drawLine(50, 115, 300, 115);
                
                g.drawString("Descrição", 50, 125);
                g.drawString("Qtd.", 150, 125);
                g.drawString("Preço", 200, 125);
                g.drawString("Total", 280, 125);
                g.drawLine(50, 130, 300, 130);
                
                int y=140;
                for(int i=0;i<produtos.getSize();i++){
                    g.drawString(produtos.getElementAt(i).toString(), 50, y);
                    g.drawString(quantidade.getElementAt(i).toString(), 150, y);
                    g.drawString(preco.getElementAt(i).toString(), 200, y);
                    g.drawString(totais.getElementAt(i).toString(), 280, y);
                    y+=10;
                }
                g.drawLine(50, y, 300, y);
                g.drawString("Total:"+total.getText(), 50, y+10);
                g.drawString("Numerário:"+numerario.getText(), 50, y+20);
                g.drawString("Troco:"+troco.getText(), 50, y+30);
                g.drawLine(50, y+35, 300, y+35);
                
                g.setFont(f3);
                g.drawString("Obrigado e volte sempre.", 50, y+40);
                             
                Calendar cal=new GregorianCalendar();
                
                String DataHora=Integer.toString(cal.get(Calendar.DAY_OF_MONTH))+
                        "-"+Integer.toString(cal.get(Calendar.MONTH)+1)+
                        "-"+Integer.toString(cal.get(Calendar.YEAR));
                
                DataHora+=" / "+Integer.toString(cal.get(Calendar.HOUR_OF_DAY))+
                        ":"+Integer.toString(cal.get(Calendar.MINUTE)+1)+
                        ":"+Integer.toString(cal.get(Calendar.SECOND));
                
                
                g.drawString(DataHora, 50, y+45);
                
                
     
                
                return(PAGE_EXISTS);
            }
            else{
                return(NO_SUCH_PAGE);
            }
        }
    }
    private void btn_descafeinadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_descafeinadoActionPerformed
         adicionarProduto("Descafeinado", 2.8f);
    }//GEN-LAST:event_btn_descafeinadoActionPerformed

    private void btn_cappuccinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cappuccinoActionPerformed
         adicionarProduto("Cappuccino", 3.2f);
    }//GEN-LAST:event_btn_cappuccinoActionPerformed

    private void btn_salgadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salgadoActionPerformed
         adicionarProduto("Salgado", 1.5f);
    }//GEN-LAST:event_btn_salgadoActionPerformed

    private void btn_tostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tostaActionPerformed
         adicionarProduto("Tosta", 2.2f);
    }//GEN-LAST:event_btn_tostaActionPerformed

    private void btn_sumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumoActionPerformed
         adicionarProduto("Sumo", 2.0f);
    }//GEN-LAST:event_btn_sumoActionPerformed

    private void btn_maisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_maisActionPerformed
        int posicao = lista_produto.getSelectedIndex();
        if (posicao < 0) {
            JOptionPane.showMessageDialog(this, 
                    "Deve selecionar um item", 
                    "POS", 
                    JOptionPane.INFORMATION_MESSAGE);
        return;
}
        lista_quantidade.setSelectedIndex(posicao);
        int qtd=lista_quantidade.getSelectedValue()+1;
        quantidade.setElementAt(qtd, posicao);
        
        lista_preco.setSelectedIndex(posicao);
        String wprc=lista_preco.getSelectedValue().toString();
        wprc = wprc.substring(0, wprc.length() - 2);
        wprc=wprc.replace(",",".");
        float prc=Float.parseFloat(wprc);
        
        lista_total.setSelectedIndex(posicao);
        totais.setElementAt(moeda.format(qtd*prc), posicao);
        
        valortotal+=prc;
        total.setText(moeda.format(valortotal));

    }//GEN-LAST:event_btn_maisActionPerformed

    private void btn_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menosActionPerformed
        if(lista_produto.getSelectedIndex()<0){
            JOptionPane.showMessageDialog(this, 
                    "Deve selecionar um item",
                    "POS",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        int posicao=lista_produto.getSelectedIndex();
        lista_quantidade.setSelectedIndex(posicao);
        int qtd=lista_quantidade.getSelectedValue()-1;
        quantidade.setElementAt(qtd, posicao);
        
        lista_preco.setSelectedIndex(posicao);
        String wprc=lista_preco.getSelectedValue().toString();
        wprc = wprc.substring(0, wprc.length() - 2);
        wprc=wprc.replace(",",".");
        float prc=Float.parseFloat(wprc);
        
        lista_total.setSelectedIndex(posicao);
        totais.setElementAt(moeda.format(qtd*prc), posicao);
        
        valortotal-=prc;
        total.setText(moeda.format(valortotal));
        
        if(qtd==0){
            produtos.remove(lista_produto.getSelectedIndex());
            quantidade.remove(lista_quantidade.getSelectedIndex());
            preco.remove(lista_preco.getSelectedIndex());
            totais.remove(lista_total.getSelectedIndex());
        }
        
        if(lista_produto.getModel().getSize()==0){
            btn_pagar.setEnabled(false);
        }
    }//GEN-LAST:event_btn_menosActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        JButton btn = (JButton) evt.getSource();
        if (btn.getText().equals("Novo")) {
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyHHmmss");
            String dataHora = formatter.format(date);
            pedido.setText(dataHora);
            // Alterar cor do texto para verde
            btn.setForeground(new Color(0, 100, 0));
            btn.setText("Cancelar");
        } else {
            produtos.clear();
            quantidade.clear();
            preco.clear();
            totais.clear();
            pedido.setText("");
            // Alterar cor do texto para vermelho
            btn.setForeground(Color.RED);
            btn.setText("Novo");
            total.setText("0");
            numerario.setText("0");
            troco.setText("0");
            btn_pagar.setEnabled(false);
            valortotal=0;
        }
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_cafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cafeActionPerformed
            adicionarProduto("Café", 2.5f);
    }//GEN-LAST:event_btn_cafeActionPerformed

    private void lista_produtoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lista_produtoMouseReleased
        lista_quantidade.setSelectedIndex(lista_produto.getSelectedIndex());
        lista_preco.setSelectedIndex(lista_produto.getSelectedIndex());
        lista_total.setSelectedIndex(lista_produto.getSelectedIndex());
    }//GEN-LAST:event_lista_produtoMouseReleased

    private void lista_quantidadeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lista_quantidadeMouseReleased
        lista_produto.setSelectedIndex(lista_quantidade.getSelectedIndex());
        lista_preco.setSelectedIndex(lista_quantidade.getSelectedIndex());
        lista_total.setSelectedIndex(lista_quantidade.getSelectedIndex());
    }//GEN-LAST:event_lista_quantidadeMouseReleased

    private void lista_precoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lista_precoMouseReleased
        lista_produto.setSelectedIndex(lista_preco.getSelectedIndex());
        lista_quantidade.setSelectedIndex(lista_preco.getSelectedIndex());
        lista_total.setSelectedIndex(lista_preco.getSelectedIndex());
    }//GEN-LAST:event_lista_precoMouseReleased

    private void lista_totalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lista_totalMouseReleased
        lista_produto.setSelectedIndex(lista_total.getSelectedIndex());
        lista_quantidade.setSelectedIndex(lista_total.getSelectedIndex());
        lista_preco.setSelectedIndex(lista_total.getSelectedIndex());
    }//GEN-LAST:event_lista_totalMouseReleased

    private void btn_cariocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariocaActionPerformed
        adicionarProduto("Carioca", 3.0f);
    }//GEN-LAST:event_btn_cariocaActionPerformed

    private void btn_galaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_galaoActionPerformed
        adicionarProduto("Galão", 4.0f);
    }//GEN-LAST:event_btn_galaoActionPerformed

    private void btn_garotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_garotoActionPerformed
        adicionarProduto("Garoto", 3.5f);
    }//GEN-LAST:event_btn_garotoActionPerformed

    private void btn_boloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_boloActionPerformed
        adicionarProduto("Bolo", 2.0f);
    }//GEN-LAST:event_btn_boloActionPerformed

    private void btn_pizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pizzaActionPerformed
        adicionarProduto("Pizza", 8.0f);
    }//GEN-LAST:event_btn_pizzaActionPerformed

    private void btn_mistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mistaActionPerformed
        adicionarProduto("Mista", 3.0f);
    }//GEN-LAST:event_btn_mistaActionPerformed

    private void btn_folhadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_folhadoActionPerformed
        adicionarProduto("Folhado", 2.5f);
    }//GEN-LAST:event_btn_folhadoActionPerformed

    private void btn_aguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aguaActionPerformed
        adicionarProduto("Água", 1.0f);
    }//GEN-LAST:event_btn_aguaActionPerformed

    private void btn_colaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_colaActionPerformed
        adicionarProduto("Cola", 1.5f);
    }//GEN-LAST:event_btn_colaActionPerformed

    private void btn_quantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quantidadeActionPerformed
    if (lista_produto.getSelectedIndex() < 0) {
        JOptionPane.showMessageDialog(this, 
                "Deve selecionar um item",
                "POS",
                JOptionPane.INFORMATION_MESSAGE);
        return;
    }
    int novaQuantidade =0;
    try {
        novaQuantidade = Integer.parseInt(JOptionPane.showInputDialog(this, 
            "Insira a quantidade desejada:"));
        if (novaQuantidade <= 0) {
                JOptionPane.showMessageDialog(this, 
                        "Valor inválido! A quantidade deve ser maior que zero.", 
                        "Erro", 
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, 
                        "Valor inválido! Por favor, insira um número.", 
                        "Erro", 
                        JOptionPane.ERROR_MESSAGE);
                return;
        }
            int posicao = lista_produto.getSelectedIndex();
            lista_quantidade.setSelectedIndex(posicao);
            int qtd_ant=lista_quantidade.getSelectedValue();
            int qtd=lista_quantidade.getSelectedValue()+novaQuantidade;
            quantidade.setElementAt(qtd, posicao);

            lista_preco.setSelectedIndex(posicao);
            String wprc = lista_preco.getSelectedValue().toString();
            wprc = wprc.substring(0, wprc.length() - 2);
            wprc = wprc.replace(",", ".");
            float prc = Float.parseFloat(wprc);
            
            lista_total.setSelectedIndex(posicao);
            totais.setElementAt(moeda.format(qtd*prc), posicao);

            valortotal -= (qtd_ant*prc);
            valortotal += qtd*prc;
            total.setText(moeda.format(valortotal));
            
            lista_produto.setSelectedIndex(lista_quantidade.getSelectedIndex());
            lista_preco.setSelectedIndex(lista_quantidade.getSelectedIndex());
            lista_total.setSelectedIndex(lista_quantidade.getSelectedIndex());

    }//GEN-LAST:event_btn_quantidadeActionPerformed

    private void btn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirActionPerformed
        PrinterJob J=PrinterJob.getPrinterJob();
        J.setPrintable(new imprimir());
        J.printDialog();
        
        try{
            J.print();     
            
                // guardar os dados num base de dados
                ligacaoMySql bd=new ligacaoMySql();
                try{
                    Connection cn=bd.criarLigacao();
                    // A classe statement envia os comandos de SQL à base de dados
                    Statement st=cn.createStatement();
                    st.executeUpdate("insert into pedidos (id_pedido,total_pedido) values('"+
                            pedido.getText()+"','"+valortotal+"')");
                    
                    JOptionPane.showMessageDialog(this, 
                            "Pedido registado com sucesso.",
                            "POS",
                            JOptionPane.INFORMATION_MESSAGE);
                }    
                catch(Exception e){
                    JOptionPane.showMessageDialog(this, 
                            "Erro ao registar o pedido.",
                            "POS",
                            JOptionPane.ERROR_MESSAGE);
                }
                       
                // limpar o layout              
                btn_novo.setText(("Novo"));
                Color verde=new Color(0,153,51);
                btn_novo.setForeground(verde);
                pedido.setText("");
                
                // limpar as listas
                produtos.clear();
                quantidade.clear();
                preco.clear();
                totais.clear();
                
                total.setText("0");
                numerario.setText("0");
                troco.setText("0");
                btn_pagar.setEnabled(false);
                valortotal=0;
                btn_imprimir.setEnabled(false);
                        
        }
        catch(PrinterException e){
            JOptionPane.showMessageDialog(this,
                    "Erro ao imprimir.",
                    "Verificar a impressora.",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_imprimirActionPerformed

    private void btn_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removerActionPerformed
    if (lista_produto.getSelectedIndex() < 0) {
        JOptionPane.showMessageDialog(this, 
                "Deve selecionar um item para remover",
                "POS",
                JOptionPane.INFORMATION_MESSAGE);
        return;
    }
    
    int confirmacao = JOptionPane.showConfirmDialog(this, 
            "Tem certeza de que deseja remover este item?",
            "Remover Item",
            JOptionPane.YES_NO_OPTION);
    
        if (confirmacao == JOptionPane.YES_OPTION) {
            int posicao = lista_produto.getSelectedIndex();
            int qtd = lista_quantidade.getSelectedValue();

            lista_preco.setSelectedIndex(posicao);
            String wprc = lista_preco.getSelectedValue().toString();
            wprc = wprc.substring(0, wprc.length() - 2);
            wprc = wprc.replace(",", ".");
            float prc = Float.parseFloat(wprc);

            valortotal -= qtd * prc;
            total.setText(moeda.format(valortotal));

            // Remove o item das listas
            produtos.remove(posicao);
            quantidade.remove(posicao);
            preco.remove(posicao);
            totais.remove(posicao);

            // Limpa a seleção após a remoção
            lista_produto.clearSelection();
            lista_quantidade.clearSelection();
            lista_preco.clearSelection();
            lista_total.clearSelection();

            // Atualiza os modelos das listas
            lista_produto.updateUI();
            lista_quantidade.updateUI();
            lista_preco.updateUI();
            lista_total.updateUI();

            // Verifica se há itens na lista de produtos
            if (produtos.isEmpty()) {
                btn_pagar.setEnabled(false);
                    } else {
            // Atualiza os modelos das listas
            lista_produto.updateUI();
            lista_quantidade.updateUI();
            lista_preco.updateUI();
            lista_total.updateUI();
            }
        }
    }//GEN-LAST:event_btn_removerActionPerformed

    private void btn_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pagarActionPerformed
    try {
        // Solicita ao usuário o valor entregue
        String valorRecebidoStr = JOptionPane.showInputDialog(this, 
                "Digite o valor entregue para o pagamento:");
        
        if (valorRecebidoStr == null) {
            // Usuário cancelou a operação
            return;
        }
        
        // Converte o valor recebido para float
        float valorRecebido = Float.parseFloat(valorRecebidoStr);
        
        // Valida se o valor recebido é maior que zero
        if (valorRecebido <= 0) {
            JOptionPane.showMessageDialog(this, 
                    "Valor inválido! O valor deve ser maior que zero.", 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Verifica se o valor recebido é suficiente para o pagamento
        if (valorRecebido < valortotal) {
            JOptionPane.showMessageDialog(this, 
                    "Valor insuficiente! O valor entregue deve ser maior ou igual ao total.", 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Calcula o troco
        float trocoValor = valorRecebido - valortotal;
        
        // Atualiza o campo de numerário e troco
        numerario.setText(moeda.format(valorRecebido));
        troco.setText(moeda.format(trocoValor));
        
        // Habilita o botão de imprimir e desabilita os outros botões
        btn_imprimir.setEnabled(true);
        btn_pagar.setEnabled(false);
        btn_mais.setEnabled(false);
        btn_menos.setEnabled(false);
        btn_quantidade.setEnabled(false);
        btn_remover.setEnabled(false);
        
        // Exibe mensagem de pagamento concluído
        JOptionPane.showMessageDialog(this, 
                "Pagamento concluído com sucesso!\nTroco: " + moeda.format(trocoValor), 
                "Pagamento Concluído", 
                JOptionPane.INFORMATION_MESSAGE);
        
        } catch (NumberFormatException e) {
            // Caso o valor digitado não seja numérico
            JOptionPane.showMessageDialog(this, 
                    "Valor inválido! Por favor, insira um número.", 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_pagarActionPerformed
    
    private void adicionarProduto(String nomeProduto, float precoProduto){
        if(btn_novo.getText().equals("Novo")){
            JOptionPane.showMessageDialog(this, 
                    "Clique em novo para iniciar o pedido",
                    "Novo pedido",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        try{
            
            int posicao=lista_produto.getNextMatch(nomeProduto, 0, 
                Position.Bias.Forward);
        
            lista_quantidade.setSelectedIndex(posicao);
            int qtd=lista_quantidade.getSelectedValue()+1;
            quantidade.setElementAt(qtd, posicao);
            
            lista_total.setSelectedIndex(posicao);
            totais.setElementAt(moeda.format(qtd*precoProduto), posicao);
            valortotal+=precoProduto;
            total.setText(moeda.format(valortotal));
            
            lista_produto.setSelectedIndex(posicao);
            lista_preco.setSelectedIndex(posicao);
            lista_total.setSelectedIndex(posicao);

            return;
        }
        catch(Exception e){
        }
        
            produtos.addElement(nomeProduto);
            lista_produto.setModel(produtos);

            quantidade.addElement(1);
            lista_quantidade.setModel(quantidade);

            preco.addElement(moeda.format(precoProduto));
            lista_preco.setModel(preco);

            totais.addElement(moeda.format(precoProduto));
            lista_total.setModel(totais);

            // atualizar a variável total
            valortotal+=precoProduto;

            total.setText(moeda.format(valortotal));  
        
            btn_pagar.setEnabled(true);
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
            java.util.logging.Logger.getLogger(frm_pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_pos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agua;
    private javax.swing.JButton btn_bolo;
    private javax.swing.JButton btn_cafe;
    private javax.swing.JButton btn_cappuccino;
    private javax.swing.JButton btn_carioca;
    private javax.swing.JButton btn_cola;
    private javax.swing.JButton btn_descafeinado;
    private javax.swing.JButton btn_folhado;
    private javax.swing.JButton btn_galao;
    private javax.swing.JButton btn_garoto;
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_mais;
    private javax.swing.JButton btn_menos;
    private javax.swing.JButton btn_mista;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_pagar;
    private javax.swing.JButton btn_pizza;
    private javax.swing.JButton btn_quantidade;
    private javax.swing.JButton btn_remover;
    private javax.swing.JButton btn_salgado;
    private javax.swing.JButton btn_sumo;
    private javax.swing.JButton btn_tosta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> lista_preco;
    private javax.swing.JList<String> lista_produto;
    private javax.swing.JList<Integer> lista_quantidade;
    private javax.swing.JList<String> lista_total;
    private javax.swing.JLabel numerario;
    private javax.swing.JPanel painel_bebidas;
    private javax.swing.JPanel painel_cafeteria;
    private javax.swing.JPanel painel_pastelaria;
    private javax.swing.JLabel pedido;
    private javax.swing.JLabel total;
    private javax.swing.JLabel troco;
    // End of variables declaration//GEN-END:variables
}

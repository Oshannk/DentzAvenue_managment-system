/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;
import java.awt.Frame;
import javax.swing.JFrame;

/**
 *
 * @author Darkness
 */
public class user_reg extends javax.swing.JFrame {

    /**
     * Creates new form user_reg
     */
     int xMouse;
    int yMouse;
    public user_reg() {
        initComponents();
//        setExtendedState(user_reg.MAXIMIZED_BOTH); 

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMinimize = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        MoveBar = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_urname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_urname1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_urname2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_urname6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_urname7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_urname8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        txt_urname9 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        kButton1 = new keeptoo.KButton();
        kButton3 = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Registration");
        setName("user_reg"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mini.png"))); // NOI18N
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseClicked(evt);
            }
        });
        getContentPane().add(btnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, -1, -1));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, -1, -1));

        MoveBar.setBackground(new java.awt.Color(51, 51, 51));
        MoveBar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        MoveBar.setForeground(new java.awt.Color(255, 255, 255));
        MoveBar.setText("  User Registration");
        MoveBar.setToolTipText("");
        MoveBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MoveBarMouseDragged(evt);
            }
        });
        MoveBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MoveBarMousePressed(evt);
            }
        });
        getContentPane().add(MoveBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 30));

        kGradientPanel1.setkBorderRadius(25);
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 102));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 0, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create User");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(680, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 150));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Name: ");

        txt_urname.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txt_urname.setForeground(new java.awt.Color(102, 102, 102));
        txt_urname.setToolTipText("Enter Your Name");
        txt_urname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txt_urname.setCaretColor(new java.awt.Color(153, 0, 153));
        txt_urname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_urname.setName(""); // NOI18N
        txt_urname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_urnameMouseClicked(evt);
            }
        });
        txt_urname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_urnameActionPerformed(evt);
            }
        });
        txt_urname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_urnameKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("Surname:");

        txt_urname1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txt_urname1.setForeground(new java.awt.Color(102, 102, 102));
        txt_urname1.setToolTipText("Enter Your Name");
        txt_urname1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txt_urname1.setCaretColor(new java.awt.Color(153, 0, 153));
        txt_urname1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_urname1.setName(""); // NOI18N
        txt_urname1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_urname1MouseClicked(evt);
            }
        });
        txt_urname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_urname1ActionPerformed(evt);
            }
        });
        txt_urname1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_urname1KeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setText("NIC: ");

        txt_urname2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txt_urname2.setForeground(new java.awt.Color(102, 102, 102));
        txt_urname2.setToolTipText("Enter Your Name");
        txt_urname2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txt_urname2.setCaretColor(new java.awt.Color(153, 0, 153));
        txt_urname2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_urname2.setName(""); // NOI18N
        txt_urname2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_urname2MouseClicked(evt);
            }
        });
        txt_urname2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_urname2ActionPerformed(evt);
            }
        });
        txt_urname2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_urname2KeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setText("E-Mail: ");

        txt_urname6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txt_urname6.setForeground(new java.awt.Color(102, 102, 102));
        txt_urname6.setToolTipText("Enter Your Name");
        txt_urname6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txt_urname6.setCaretColor(new java.awt.Color(153, 0, 153));
        txt_urname6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_urname6.setName(""); // NOI18N
        txt_urname6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_urname6MouseClicked(evt);
            }
        });
        txt_urname6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_urname6ActionPerformed(evt);
            }
        });
        txt_urname6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_urname6KeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel10.setText("Mobile:");

        txt_urname7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txt_urname7.setForeground(new java.awt.Color(102, 102, 102));
        txt_urname7.setToolTipText("Enter Your Name");
        txt_urname7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txt_urname7.setCaretColor(new java.awt.Color(153, 0, 153));
        txt_urname7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_urname7.setName(""); // NOI18N
        txt_urname7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_urname7MouseClicked(evt);
            }
        });
        txt_urname7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_urname7ActionPerformed(evt);
            }
        });
        txt_urname7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_urname7KeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel11.setText("Home:");

        txt_urname8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txt_urname8.setForeground(new java.awt.Color(102, 102, 102));
        txt_urname8.setToolTipText("Enter Your Name");
        txt_urname8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txt_urname8.setCaretColor(new java.awt.Color(153, 0, 153));
        txt_urname8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_urname8.setName(""); // NOI18N
        txt_urname8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_urname8MouseClicked(evt);
            }
        });
        txt_urname8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_urname8ActionPerformed(evt);
            }
        });
        txt_urname8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_urname8KeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel12.setText("DOB:");

        jDateChooser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel13.setText("Home Address:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(jTextArea1);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel14.setText("Current Address:");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(jTextArea2);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel15.setText("User Name:");

        txt_urname9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txt_urname9.setForeground(new java.awt.Color(102, 102, 102));
        txt_urname9.setToolTipText("Enter Your Name");
        txt_urname9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txt_urname9.setCaretColor(new java.awt.Color(153, 0, 153));
        txt_urname9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_urname9.setName(""); // NOI18N
        txt_urname9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_urname9MouseClicked(evt);
            }
        });
        txt_urname9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_urname9ActionPerformed(evt);
            }
        });
        txt_urname9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_urname9KeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel16.setText("Password: ");

        jPasswordField1.setText("passwod");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel17.setText("Job role: ");

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Doctor", "Admin" }));

        kButton1.setBorder(null);
        kButton1.setForeground(new java.awt.Color(240, 240, 240));
        kButton1.setText("Add User");
        kButton1.setToolTipText("");
        kButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        kButton1.setkAllowGradient(false);
        kButton1.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        kButton1.setkBorderRadius(35);
        kButton1.setkHoverColor(new java.awt.Color(102, 102, 102));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));

        kButton3.setBorder(null);
        kButton3.setForeground(new java.awt.Color(240, 240, 240));
        kButton3.setText("Cancel");
        kButton3.setToolTipText("");
        kButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        kButton3.setkAllowGradient(false);
        kButton3.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        kButton3.setkBorderRadius(35);
        kButton3.setkHoverColor(new java.awt.Color(102, 102, 102));
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_urname6, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_urname7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_urname2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                        .addComponent(txt_urname9, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_urname, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(txt_urname1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(36, 36, 36)
                                                .addComponent(txt_urname8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 58, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(442, 442, 442)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_urname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_urname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txt_urname6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_urname7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)
                                .addComponent(txt_urname8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)))
                    .addComponent(txt_urname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txt_urname9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 1020, 590));

        setSize(new java.awt.Dimension(1039, 761));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MoveBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveBarMouseDragged
         int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_MoveBarMouseDragged

    private void MoveBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_MoveBarMousePressed

    private void btnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseClicked
        //login log = new login();
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMouseClicked

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void txt_urnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_urnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_urnameActionPerformed

    private void txt_urnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_urnameMouseClicked
       
    }//GEN-LAST:event_txt_urnameMouseClicked

    private void txt_urnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_urnameKeyTyped
       
    }//GEN-LAST:event_txt_urnameKeyTyped

    private void txt_urname1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_urname1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_urname1MouseClicked

    private void txt_urname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_urname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_urname1ActionPerformed

    private void txt_urname1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_urname1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_urname1KeyTyped

    private void txt_urname2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_urname2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_urname2MouseClicked

    private void txt_urname2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_urname2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_urname2ActionPerformed

    private void txt_urname2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_urname2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_urname2KeyTyped

    private void txt_urname6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_urname6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_urname6MouseClicked

    private void txt_urname6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_urname6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_urname6ActionPerformed

    private void txt_urname6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_urname6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_urname6KeyTyped

    private void txt_urname7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_urname7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_urname7MouseClicked

    private void txt_urname7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_urname7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_urname7ActionPerformed

    private void txt_urname7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_urname7KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_urname7KeyTyped

    private void txt_urname8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_urname8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_urname8MouseClicked

    private void txt_urname8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_urname8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_urname8ActionPerformed

    private void txt_urname8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_urname8KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_urname8KeyTyped

    private void txt_urname9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_urname9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_urname9MouseClicked

    private void txt_urname9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_urname9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_urname9ActionPerformed

    private void txt_urname9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_urname9KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_urname9KeyTyped

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
       this.dispose();
    }//GEN-LAST:event_kButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(user_reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_reg().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MoveBar;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txt_urname;
    private javax.swing.JTextField txt_urname1;
    private javax.swing.JTextField txt_urname2;
    private javax.swing.JTextField txt_urname6;
    private javax.swing.JTextField txt_urname7;
    private javax.swing.JTextField txt_urname8;
    private javax.swing.JTextField txt_urname9;
    // End of variables declaration//GEN-END:variables
}

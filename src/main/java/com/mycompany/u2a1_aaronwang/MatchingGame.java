/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.u2a1_aaronwang;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.Timer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author peixi
 */
public class MatchingGame extends javax.swing.JFrame{
    // ICONS:
    static final ImageIcon TITLE = new ImageIcon("resources/title.png");
    static final ImageIcon CARDBACK = new ImageIcon("resources/cardback.png");
    static final ImageIcon EEVEE = new ImageIcon("resources/eevee.png");
    static final ImageIcon EEVEE_GMAX = new ImageIcon("resources/eevee-gmax.png");
    static final ImageIcon FLAREON = new ImageIcon("resources/flareon.png");
    static final ImageIcon JOLTEON = new ImageIcon("resources/jolteon.png");
    static final ImageIcon VAPOREON = new ImageIcon("resources/vaporeon.png");
    static final ImageIcon ESPEON = new ImageIcon("resources/espeon.png");
    static final ImageIcon UMBREON = new ImageIcon("resources/umbreon.png");
    static final ImageIcon LEAFEON = new ImageIcon("resources/leafeon.png");
    static final ImageIcon GLACEON = new ImageIcon("resources/glaceon.png");
    static final ImageIcon SYLVEON = new ImageIcon("resources/sylveon.png");
    // Cards:
    static ArrayList<JButton> cardList;
    static ArrayList<ImageIcon> cardShuffle = new ArrayList<>(Arrays.asList(EEVEE, EEVEE, EEVEE_GMAX, EEVEE_GMAX, FLAREON, FLAREON, JOLTEON, JOLTEON, VAPOREON, VAPOREON, ESPEON, ESPEON, UMBREON, UMBREON, LEAFEON, LEAFEON, GLACEON, GLACEON, SYLVEON, SYLVEON));
    // Hashmap, storing card to icon combos:
    static HashMap<JButton, ImageIcon> cardToIcon = new HashMap<>();
    
    //Animation Timer:
    ActionListener startingAnimListener = new ActionListener() {
        int curCard = 0;
        @Override
        public void actionPerformed(ActionEvent evt) {
            if(curCard == 20) {
                startingAnim.stop();
                outputBox.setText("Pick your first card!");
                return;
            }
        outputBox.setText("Shuffling...");
        cardList.get(curCard).setIcon(CARDBACK);
        curCard++;
        }
    };
    Timer startingAnim = new Timer(75, startingAnimListener);
    // Card Flip Timer:
    ActionListener cardFlipListener;
    Timer cardFlip = new Timer(2000, cardFlipListener);
    
    // Info:
    static ArrayList<JButton> chosenCards = new ArrayList<>();
    int numMatched = 0;
    static boolean isPlaying = false;
    static boolean hasWon = false;

    /**
     * Creates new form MatchingGame
     */
    public MatchingGame() {
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
        jLabel1 = new javax.swing.JLabel();
        card1 = new javax.swing.JButton();
        card6 = new javax.swing.JButton();
        card11 = new javax.swing.JButton();
        card7 = new javax.swing.JButton();
        card16 = new javax.swing.JButton();
        card2 = new javax.swing.JButton();
        card12 = new javax.swing.JButton();
        card17 = new javax.swing.JButton();
        card8 = new javax.swing.JButton();
        card13 = new javax.swing.JButton();
        card18 = new javax.swing.JButton();
        card4 = new javax.swing.JButton();
        card3 = new javax.swing.JButton();
        card9 = new javax.swing.JButton();
        card19 = new javax.swing.JButton();
        card14 = new javax.swing.JButton();
        card10 = new javax.swing.JButton();
        card15 = new javax.swing.JButton();
        card20 = new javax.swing.JButton();
        card5 = new javax.swing.JButton();
        playBTN = new javax.swing.JButton();
        exitBTN = new javax.swing.JButton();
        outputBox = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eevee Shenanigans.");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 237, 217));
        jPanel1.setEnabled(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Find That Eeveelution!");

        card1.setBackground(new java.awt.Color(255, 255, 255));
        card1.setEnabled(false);
        card1.setFocusable(false);
        card1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card1ActionPerformed(evt);
            }
        });

        card6.setBackground(new java.awt.Color(255, 255, 255));
        card6.setEnabled(false);
        card6.setFocusable(false);
        card6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card6ActionPerformed(evt);
            }
        });

        card11.setBackground(new java.awt.Color(255, 255, 255));
        card11.setEnabled(false);
        card11.setFocusable(false);
        card11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card11ActionPerformed(evt);
            }
        });

        card7.setBackground(new java.awt.Color(255, 255, 255));
        card7.setEnabled(false);
        card7.setFocusable(false);
        card7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card7ActionPerformed(evt);
            }
        });

        card16.setBackground(new java.awt.Color(255, 255, 255));
        card16.setEnabled(false);
        card16.setFocusable(false);
        card16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card16ActionPerformed(evt);
            }
        });

        card2.setBackground(new java.awt.Color(255, 255, 255));
        card2.setEnabled(false);
        card2.setFocusable(false);
        card2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card2ActionPerformed(evt);
            }
        });

        card12.setBackground(new java.awt.Color(255, 255, 255));
        card12.setEnabled(false);
        card12.setFocusable(false);
        card12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card12ActionPerformed(evt);
            }
        });

        card17.setBackground(new java.awt.Color(255, 255, 255));
        card17.setEnabled(false);
        card17.setFocusable(false);
        card17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card17ActionPerformed(evt);
            }
        });

        card8.setBackground(new java.awt.Color(255, 255, 255));
        card8.setEnabled(false);
        card8.setFocusable(false);
        card8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card8ActionPerformed(evt);
            }
        });

        card13.setBackground(new java.awt.Color(255, 255, 255));
        card13.setEnabled(false);
        card13.setFocusable(false);
        card13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card13ActionPerformed(evt);
            }
        });

        card18.setBackground(new java.awt.Color(255, 255, 255));
        card18.setEnabled(false);
        card18.setFocusable(false);
        card18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card18ActionPerformed(evt);
            }
        });

        card4.setBackground(new java.awt.Color(255, 255, 255));
        card4.setEnabled(false);
        card4.setFocusable(false);
        card4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card4ActionPerformed(evt);
            }
        });

        card3.setBackground(new java.awt.Color(255, 255, 255));
        card3.setEnabled(false);
        card3.setFocusable(false);
        card3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card3ActionPerformed(evt);
            }
        });

        card9.setBackground(new java.awt.Color(255, 255, 255));
        card9.setEnabled(false);
        card9.setFocusable(false);
        card9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card9ActionPerformed(evt);
            }
        });

        card19.setBackground(new java.awt.Color(255, 255, 255));
        card19.setEnabled(false);
        card19.setFocusable(false);
        card19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card19ActionPerformed(evt);
            }
        });

        card14.setBackground(new java.awt.Color(255, 255, 255));
        card14.setEnabled(false);
        card14.setFocusable(false);
        card14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card14ActionPerformed(evt);
            }
        });

        card10.setBackground(new java.awt.Color(255, 255, 255));
        card10.setEnabled(false);
        card10.setFocusable(false);
        card10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card10ActionPerformed(evt);
            }
        });

        card15.setBackground(new java.awt.Color(255, 255, 255));
        card15.setEnabled(false);
        card15.setFocusable(false);
        card15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card15ActionPerformed(evt);
            }
        });

        card20.setBackground(new java.awt.Color(255, 255, 255));
        card20.setEnabled(false);
        card20.setFocusable(false);
        card20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card20ActionPerformed(evt);
            }
        });

        card5.setBackground(new java.awt.Color(255, 255, 255));
        card5.setEnabled(false);
        card5.setFocusable(false);
        card5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card5ActionPerformed(evt);
            }
        });

        playBTN.setBackground(new java.awt.Color(255, 255, 255));
        playBTN.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        playBTN.setForeground(new java.awt.Color(0, 0, 0));
        playBTN.setText("Play");
        playBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        playBTN.setFocusable(false);
        playBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBTNActionPerformed(evt);
            }
        });

        exitBTN.setBackground(new java.awt.Color(255, 255, 255));
        exitBTN.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        exitBTN.setForeground(new java.awt.Color(0, 0, 0));
        exitBTN.setText("Exit");
        exitBTN.setFocusable(false);
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        outputBox.setEditable(false);
        outputBox.setBackground(new java.awt.Color(255, 255, 255));
        outputBox.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        outputBox.setForeground(new java.awt.Color(0, 0, 0));
        outputBox.setText("Press \"Play\" to begin!");
        outputBox.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(playBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outputBox, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(card7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(card12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(card17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(card8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(card13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(card18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(card9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(card14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(card10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(card15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(card20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(card19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addComponent(card10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playBTN)
                    .addComponent(exitBTN)
                    .addComponent(outputBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void playBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playBTNActionPerformed
        // Puts all cards into list of cards.
        cardList = new ArrayList<>(Arrays.asList(card1, card6, card11, card16, card17, card18, card19, card20, card15, card10, card5, card4, card3, card2, card7, card12, card13, card14, card9, card8));
        // Shuffles the deck.
        Collections.shuffle(cardShuffle);
        
        // For each card: put the card and its shuffled icon into hashmap
        // Reset icon
        // Enable the card
        cardList.forEach((card) -> {
            cardToIcon.put(card, cardShuffle.get(cardList.indexOf(card)));
            card.setIcon(null);
            card.setEnabled(true);
        });
        // Plays the shuffling animation
        startingAnim.start();

        isPlaying = true;
        playBTN.setEnabled(false);
        playBTN.setToolTipText("You are already playing!");   

    }//GEN-LAST:event_playBTNActionPerformed

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBTNActionPerformed

    private void cardSelected(JButton userPickedCard) {
        // Adds picked card to the list of chosen cards.
        chosenCards.add(userPickedCard);

        // If first chosen card, prompt the user to pick 2nd card.
        if(chosenCards.size() == 1) {
            outputBox.setText("Please pick your second card!");
        // If second chosen card, determine:
        } else if (chosenCards.size() == 2) {
            // If user clicked same card again:
            if(chosenCards.get(1).equals(chosenCards.get(0))) {
                chosenCards.get(0).setIcon(CARDBACK);
                chosenCards.clear();
                outputBox.setText("You picked the same card twice!");
                return;
            }
            // If the two file paths are equal, the cards match. ImageIcon.toString() returns its filepath.
            if(cardToIcon.get(chosenCards.get(0)).toString().equals(cardToIcon.get(chosenCards.get(1)).toString())) {
                chosenCards.get(0).setEnabled(false);
                chosenCards.get(1).setEnabled(false);
                outputBox.setText("These two cards match!");
                chosenCards.clear();
                numMatched++;
                if(numMatched == 10) {
                    performUponWin();
                }
            } else {
                outputBox.setText("These two cards do not match!");
                chosenCards.forEach((card) -> {
                    card.setEnabled(true);
                    System.out.println(cardToIcon.get(card).toString());
                    card.setIcon(CARDBACK);
                });
                chosenCards.clear();
            }
        }
    }
    
    private void performUponWin() {
        numMatched = 0;
        outputBox.setText("You win!");
        playBTN.setText("Play Again");
        playBTN.setEnabled(true);
    }
    
    private void card1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card1ActionPerformed
        card1.setIcon(cardToIcon.get(card1));
        cardSelected(card1);

    }//GEN-LAST:event_card1ActionPerformed

    private void card2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card2ActionPerformed
        card2.setIcon(cardToIcon.get(card2));
        cardSelected(card2);
    }//GEN-LAST:event_card2ActionPerformed

    private void card3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card3ActionPerformed
        card3.setIcon(cardToIcon.get(card3));
        cardSelected(card3);
    }//GEN-LAST:event_card3ActionPerformed

    private void card4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card4ActionPerformed
        card4.setIcon(cardToIcon.get(card4));
        cardSelected(card4);
    }//GEN-LAST:event_card4ActionPerformed

    private void card5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card5ActionPerformed
        card5.setIcon(cardToIcon.get(card5));
        cardSelected(card5);
    }//GEN-LAST:event_card5ActionPerformed

    private void card6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card6ActionPerformed
        card6.setIcon(cardToIcon.get(card6));
        cardSelected(card6);
    }//GEN-LAST:event_card6ActionPerformed

    private void card7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card7ActionPerformed
        card7.setIcon(cardToIcon.get(card7));
        cardSelected(card7);
    }//GEN-LAST:event_card7ActionPerformed

    private void card8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card8ActionPerformed
        card8.setIcon(cardToIcon.get(card8));
        cardSelected(card8);
    }//GEN-LAST:event_card8ActionPerformed

    private void card9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card9ActionPerformed
        card9.setIcon(cardToIcon.get(card9));
        cardSelected(card9);
    }//GEN-LAST:event_card9ActionPerformed

    private void card10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card10ActionPerformed
        card10.setIcon(cardToIcon.get(card10));
        cardSelected(card10);
    }//GEN-LAST:event_card10ActionPerformed

    private void card11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card11ActionPerformed
        card11.setIcon(cardToIcon.get(card11));
        cardSelected(card11);
    }//GEN-LAST:event_card11ActionPerformed

    private void card12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card12ActionPerformed
        card12.setIcon(cardToIcon.get(card12));
        cardSelected(card12);
    }//GEN-LAST:event_card12ActionPerformed

    private void card13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card13ActionPerformed
        card13.setIcon(cardToIcon.get(card13));
        cardSelected(card13);
    }//GEN-LAST:event_card13ActionPerformed

    private void card14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card14ActionPerformed
        card14.setIcon(cardToIcon.get(card14));
        cardSelected(card14);
    }//GEN-LAST:event_card14ActionPerformed

    private void card15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card15ActionPerformed
        card15.setIcon(cardToIcon.get(card15));
        cardSelected(card15);
    }//GEN-LAST:event_card15ActionPerformed

    private void card16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card16ActionPerformed
        card16.setIcon(cardToIcon.get(card16));
        cardSelected(card16);
    }//GEN-LAST:event_card16ActionPerformed

    private void card17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card17ActionPerformed
        card17.setIcon(cardToIcon.get(card17));
        cardSelected(card17);
    }//GEN-LAST:event_card17ActionPerformed

    private void card18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card18ActionPerformed
        card18.setIcon(cardToIcon.get(card18));
        cardSelected(card18);
    }//GEN-LAST:event_card18ActionPerformed

    private void card19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card19ActionPerformed
        card19.setIcon(cardToIcon.get(card19));
        cardSelected(card19);
    }//GEN-LAST:event_card19ActionPerformed

    private void card20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card20ActionPerformed
        card20.setIcon(cardToIcon.get(card20));
        cardSelected(card20);
    }//GEN-LAST:event_card20ActionPerformed

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
            java.util.logging.Logger.getLogger(MatchingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatchingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatchingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatchingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MatchingGame gameFrame = new MatchingGame();
                gameFrame.setIconImage(TITLE.getImage());
                gameFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton card1;
    private javax.swing.JButton card10;
    private javax.swing.JButton card11;
    private javax.swing.JButton card12;
    private javax.swing.JButton card13;
    private javax.swing.JButton card14;
    private javax.swing.JButton card15;
    private javax.swing.JButton card16;
    private javax.swing.JButton card17;
    private javax.swing.JButton card18;
    private javax.swing.JButton card19;
    private javax.swing.JButton card2;
    private javax.swing.JButton card20;
    private javax.swing.JButton card3;
    private javax.swing.JButton card4;
    private javax.swing.JButton card5;
    private javax.swing.JButton card6;
    private javax.swing.JButton card7;
    private javax.swing.JButton card8;
    private javax.swing.JButton card9;
    private javax.swing.JButton exitBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField outputBox;
    private javax.swing.JButton playBTN;
    // End of variables declaration//GEN-END:variables
}

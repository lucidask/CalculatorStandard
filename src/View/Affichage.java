package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Affichage extends JFrame{
    public JButton getNextButton1() {
        return nextButton1;
    }

    public JButton getNextButton2() {
        return nextButton2;
    }

    public JButton getNextButton3() {
        return nextButton3;
    }

    public JButton getNextButton4() {
        return nextButton4;
    }

    public JButton getNextButton5() {
        return nextButton5;
    }

    public JButton getNextButton6() {
        return nextButton6;
    }

    public JButton getNextButton7() {
        return nextButton7;
    }

    public JButton getNextButton8() {
        return nextButton8;
    }

    public JButton getNextButton9() {
        return nextButton9;
    }

    public JButton getNextButton0() {
        return nextButton0;
    }

    public JButton getNextButtonparentouv() {
        return nextButtonparentouv;
    }

    public JButton getNextButtonparentferme() {
        return nextButtonparentferme;
    }

    public JButton getNextButtondel() {
        return nextButtonparentferme;
    }

    public JButton getNextButtonPoint() {
        return nextButtonPoint;
    }

    public JButton getNextButtonEgal() {
        return nextButtonEgal;
    }

    public JButton getNextButtonClear() {
        return nextButtonClear;
    }

    public JButton getNextButtonOperatorPlus() {
        return nextButtonOperatorPlus;
    }

    public JButton getNextButtonOperatorMoins() {
        return nextButtonOperatorMoins;
    }

    public JButton getNextButtonOperatorMult() {
        return nextButtonOperatorMult;
    }

    public JButton getNextButtonOperatorDiv() {
        return nextButtonOperatorDiv;
    }


    public void screenAff(String str){
        aff.setText(str);
    }

    JTextField aff=new JTextField("0");


    Font policebutton1= new Font("Arial", Font.BOLD, 17);
    Dimension dimbutt= new Dimension(76, 50);
    Color buttcolortext1= new Color(255,255,255);
    Font police= new Font("Arial", Font.PLAIN, 30);
    Color colorbackground= new Color(30,30,30);
    Dimension dimamoled= new Dimension(50,50);
    JButton nextButton1=new JButton("1");
    JButton nextButton2=new JButton("2");
    JButton nextButton3=new JButton("3");
    JButton nextButton4=new JButton("4");
    JButton nextButton5=new JButton("5");
    JButton nextButton6=new JButton("6");
    JButton nextButton7=new JButton("7");
    JButton nextButton8=new JButton("8");
    JButton nextButton9=new JButton("9");
    JButton nextButton0=new JButton("0");
    JButton nextButtonparentouv=new JButton(")");
    JButton nextButtonparentferme=new JButton("(");
    JButton nextButtonDelete=new JButton("Del");
    JButton nextButtonPoint=new JButton(".");
    JButton nextButtonEgal=new JButton("=");

    JButton nextButtonClear=new JButton("C");
    JButton nextButtonOperatorPlus=new JButton("+");
    JButton nextButtonOperatorMoins=new JButton("-");
    JButton nextButtonOperatorMult=new JButton("*");
    JButton nextButtonOperatorDiv=new JButton("/");


    public Affichage(){
        this.setTitle("Calculatrice");
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel buttonPanel=new JPanel();
        JPanel buttonPanel1=new JPanel();


        GridLayout layPrincipal=new GridLayout(5,3);
        GridLayout layPrincipal1=new GridLayout(5,0);
        aff.setPreferredSize(dimamoled);
        aff.setFont(police);
        aff.setBackground(colorbackground);
        aff.setHorizontalAlignment(JLabel.RIGHT);
        buttonPanel.setLayout(layPrincipal);
        nextButtonparentouv.setFont(policebutton1);
        nextButtonparentferme.setFont(policebutton1);
        nextButtonDelete.setFont(policebutton1);
        nextButton1.setFont(policebutton1);
        nextButton2.setFont(policebutton1);
        nextButton3.setFont(policebutton1);
        nextButton4.setFont(policebutton1);
        nextButton5.setFont(policebutton1);
        nextButton6.setFont(policebutton1);
        nextButton7.setFont(policebutton1);
        nextButton8.setFont(policebutton1);
        nextButton9.setFont(policebutton1);
        nextButton0.setFont(policebutton1);
        nextButtonEgal.setFont(policebutton1);
        nextButtonPoint.setFont(policebutton1);

        nextButtonClear.setFont(policebutton1);
        nextButtonOperatorMult.setFont(policebutton1);
        nextButtonOperatorPlus.setFont(policebutton1);
        nextButtonOperatorDiv.setFont(policebutton1);
        nextButtonOperatorMoins.setFont(policebutton1);

        nextButtonparentouv.setBackground(colorbackground);
        nextButtonparentferme.setBackground(colorbackground);
        nextButtonDelete.setBackground(colorbackground);
        nextButton1.setBackground(colorbackground);
        nextButton2.setBackground(colorbackground);
        nextButton3.setBackground(colorbackground);
        nextButton4.setBackground(colorbackground);
        nextButton5.setBackground(colorbackground);
        nextButton6.setBackground(colorbackground);
        nextButton7.setBackground(colorbackground);
        nextButton8.setBackground(colorbackground);
        nextButton9.setBackground(colorbackground);
        nextButton0.setBackground(colorbackground);
        nextButtonEgal.setBackground(colorbackground);
        nextButtonPoint.setBackground(colorbackground);

        nextButtonOperatorMult.setBackground(colorbackground);
        nextButtonOperatorMoins.setBackground(colorbackground);
        nextButtonOperatorDiv.setBackground(colorbackground);
        nextButtonOperatorPlus.setBackground(colorbackground);
        nextButtonClear.setBackground(colorbackground);

        nextButtonparentouv.setForeground(buttcolortext1);
        nextButtonparentferme.setForeground(buttcolortext1);
        nextButton1.setForeground(buttcolortext1);
        nextButton2.setForeground(buttcolortext1);
        nextButton3.setForeground(buttcolortext1);
        nextButton4.setForeground(buttcolortext1);
        nextButton5.setForeground(buttcolortext1);
        nextButton6.setForeground(buttcolortext1);
        nextButton7.setForeground(buttcolortext1);
        nextButton8.setForeground(buttcolortext1);
        nextButton9.setForeground(buttcolortext1);
        nextButton0.setForeground(buttcolortext1);
        nextButtonDelete.setForeground(buttcolortext1);
        nextButtonEgal.setForeground(buttcolortext1);
        nextButtonPoint.setForeground(buttcolortext1);

        nextButtonOperatorPlus.setForeground(buttcolortext1);
        nextButtonOperatorDiv.setForeground(buttcolortext1);
        nextButtonOperatorMoins.setForeground(buttcolortext1);
        nextButtonOperatorMult.setForeground(buttcolortext1);
        nextButtonClear.setForeground(buttcolortext1);



        buttonPanel.add(nextButtonparentferme);
        buttonPanel.add(nextButtonparentouv);
        buttonPanel.add(nextButtonDelete);
        buttonPanel.add(nextButton1);
        buttonPanel.add(nextButton2);
        buttonPanel.add(nextButton3);
        buttonPanel.add(nextButton4);
        buttonPanel.add(nextButton5);
        buttonPanel.add(nextButton6);
        buttonPanel.add(nextButton7);
        buttonPanel.add(nextButton8);
        buttonPanel.add(nextButton9);
        buttonPanel.add(nextButton0);
        buttonPanel.add(nextButtonPoint);
        buttonPanel.add(nextButtonEgal);

        buttonPanel1.setLayout(layPrincipal1);
        buttonPanel1.add(nextButtonClear);
        buttonPanel1.add(nextButtonOperatorPlus);
        buttonPanel1.add(nextButtonOperatorMoins);
        buttonPanel1.add(nextButtonOperatorMult);
        buttonPanel1.add(nextButtonOperatorDiv);


        aff.setEnabled(false);
        aff.setHorizontalAlignment(JTextField.RIGHT);
        Container paneContent = this.getContentPane();
        paneContent.add(aff, BorderLayout.NORTH);
        paneContent.add(buttonPanel1,BorderLayout.EAST);
        paneContent.add(buttonPanel, BorderLayout.CENTER);

    }
    public void addExpressionEcouteur(ActionListener action){
        nextButton1.addActionListener(action);
        nextButton2.addActionListener(action);
        nextButton3.addActionListener(action);
        nextButton4.addActionListener(action);
        nextButton5.addActionListener(action);
        nextButton6.addActionListener(action);
        nextButton7.addActionListener(action);
        nextButton8.addActionListener(action);
        nextButton9.addActionListener(action);
        nextButton0.addActionListener(action);
        nextButtonPoint.addActionListener(action);
        nextButtonparentouv.addActionListener(action);
        nextButtonparentferme.addActionListener(action);

        nextButtonOperatorPlus.addActionListener(action);
        nextButtonOperatorMoins.addActionListener(action);
        nextButtonOperatorMult.addActionListener(action);
        nextButtonOperatorDiv.addActionListener(action);
    }
    public void enableAllButton(boolean b){
        nextButton1.setEnabled(b);
        nextButton2.setEnabled(b);
        nextButton3.setEnabled(b);
        nextButton4.setEnabled(b);
        nextButton5.setEnabled(b);
        nextButton6.setEnabled(b);
        nextButton7.setEnabled(b);
        nextButton8.setEnabled(b);
        nextButton9.setEnabled(b);
        nextButton0.setEnabled(b);
        nextButtonparentferme.setEnabled(b);
        nextButtonparentouv.setEnabled(b);
        nextButtonPoint.setEnabled(b);

        nextButtonOperatorPlus.setEnabled(b);
        nextButtonOperatorMoins.setEnabled(b);
        nextButtonOperatorMult.setEnabled(b);
        nextButtonOperatorDiv.setEnabled(b);
    }
    public void enableSignButton(boolean b){
        nextButtonOperatorPlus.setEnabled(b);
        nextButtonOperatorMoins.setEnabled(b);
        nextButtonOperatorMult.setEnabled(b);
        nextButtonOperatorDiv.setEnabled(b);
    }
    public void addClearEcouteur(ActionListener action){
        nextButtonClear.addActionListener(action);
    }
    public void addDeleteEcouteur(ActionListener action){
        nextButtonDelete.addActionListener(action);
    }
    public void addEgalEcouteur(ActionListener action){
        nextButtonEgal.addActionListener(action);
    }
    public void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}

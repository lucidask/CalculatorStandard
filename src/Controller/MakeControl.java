package Controller;

import Model.Operation;
import View.Affichage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MakeControl {
    Affichage fenetre=new Affichage();
    String express="";
    public MakeControl(){
        fenetre.addExpressionEcouteur(new ListeningToExpression());
        fenetre.addClearEcouteur(new ListeningToClear());
        fenetre.addDeleteEcouteur(new ListeningToDelete());
        fenetre.addEgalEcouteur(new ListeningToEgal());
    }
    class ListeningToExpression implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton test =(JButton) e.getSource();
            String i=test.getText();
            switch (i){
                case "+":
                case "-":
                case "*":
                case "/":
                    fenetre.enableSignButton(false);
                    break;
                default:
                    fenetre.enableAllButton(true);
            }
            express+=test.getText();
            fenetre.screenAff(express);
        }
    }
    class ListeningToClear implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            express="";
            fenetre.screenAff("0");
        }
    }

    class ListeningToDelete implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            express=express.substring(0,express.length()-1);
            updateScreenExpress();
        }
    }

    class ListeningToEgal implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            express=String.valueOf(Operation.structuration(express));
            updateScreenExpress();
        }
    }
    public void errorMessage(String err){
        fenetre.displayErrorMessage(err);
    }
    private void updateScreenExpress(){
        fenetre.screenAff(express);
    }
    public  Affichage getFenetre(){
        return fenetre;
    }

}

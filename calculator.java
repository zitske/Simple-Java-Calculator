import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;

public class calculator {
   static double n1;
   static double n2;
   static int op;
  static JLabel texto;
  public static void main(String args[]) {
    n1 = 0;
    n2 = 0;
    
    JFrame janela = new JFrame("Calculator");

    List<JButton> buttons = new ArrayList<JButton>();
    
    JButton b0 = new JButton("0");
    JButton bL = new JButton("C");
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton bC = new JButton(".");
    JButton bP = new JButton("+");
    JButton bS = new JButton("-");
    JButton bM = new JButton("X");
    JButton bD = new JButton("/");
    JButton bR = new JButton("=");
    buttons.add(bL);
    buttons.add(b0);
    buttons.add(b1);
    buttons.add(b2);
    buttons.add(b3);
    buttons.add(b4);
    buttons.add(b5);
    buttons.add(b6);
    buttons.add(b7);
    buttons.add(b8);
    buttons.add(b9);
    buttons.add(bC);
    buttons.add(bP);
    buttons.add(bS);
    buttons.add(bM);
    buttons.add(bD);
    buttons.add(bR);


    texto = new JLabel ("0");
    JPanel painel = new JPanel();
    painel.setBackground(Color.WHITE);
    painel.setLayout(new GridLayout(5,5));
    painel.setBorder(new EmptyBorder(28, 28, 28, 28));
    painel.add(texto);
    for(int i =0;i<buttons.size();i++){
        painel.add(buttons.get(i));
    }

    b0.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        startText();
        String txt = texto.getText() + "0";
        texto.setText(txt);
        n1 = Double.parseDouble((texto.getText()));
      }
    });
    b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) { 
          startText();
          String txt = texto.getText() + "1";
          texto.setText(txt);
          n1 = Double.parseDouble((texto.getText()));
        }
      });
    b2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) { 
          startText();
          String txt = texto.getText() + "2";
          texto.setText(txt);
          n1 = Double.parseDouble((texto.getText()));
        }
      });
    b3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) { 
          startText();
          String txt = texto.getText() + "3";
          texto.setText(txt);
          n1 = Double.parseDouble((texto.getText()));
        }
      });
    b4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) { 
          startText();
          String txt = texto.getText() + "4";
          texto.setText(txt);
          n1 = Double.parseDouble((texto.getText()));
        }
      });
    b5.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) { 
          startText();
          String txt = texto.getText() + "5";
          texto.setText(txt);
          n1 = Double.parseDouble((texto.getText()));
        }
      });
    b6.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) { 
          startText();
          String txt = texto.getText() + "6";
          texto.setText(txt);
          n1 = Double.parseDouble((texto.getText()));
        }
      });
    b7.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) { 
          startText();
          String txt = texto.getText() + "7";
          texto.setText(txt);
          n1 = Double.parseDouble((texto.getText()));
        }
      });
    b8.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) { 
          startText();
          String txt = texto.getText() + "8";
          texto.setText(txt);
          n1 = Double.parseDouble((texto.getText()));
        }
      });
    b9.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) { 
          startText();
          String txt = texto.getText() + "9";
          texto.setText(txt);
          n1 = Double.parseDouble((texto.getText()));
        }
      });
    bC.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) { 
            if(texto.getText().indexOf('.')<=0){
                String txt = texto.getText() + ".";
                texto.setText(txt);
                n1 = Double.parseDouble((texto.getText()));
            }
        }
      });
    bP.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) { 
          String txt = 0+"";
          n2 = n1;
          n1 = 0;
          op = 0;
          texto.setText(txt);
        }
      });
    bS.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) { 
          String txt = 0+"";
          //n2 = Double.parseDouble((texto.getText()));
          n2 = n1;
          n1 = 0;
          op = 1;
          texto.setText(txt);
        }
      });
    bM.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) { 
          String txt = 0+"";
          //n2 = Double.parseDouble((texto.getText()));
          n2 = n1;
          n1 = 0;
          op = 2;
          texto.setText(txt);
        }
      });
    bD.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) { 
          String txt = 0+"";
          //n2 = Double.parseDouble((texto.getText()));
          n2 = n1;
          n1 = 0;
          op = 3;
          texto.setText(txt);
        }
      });
    bR.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) { 
          n1 = Double.parseDouble((texto.getText()));
          System.out.println("n1 = " + n1);  
          System.out.println("n2 = " + n2);  
          switch(op){
            case 0:
            texto.setText((n2+n1)+"");
            System.out.println("Result: " + (n2+n1)); 
            n1 =  n2+n1;
            break;
            case 1:
            texto.setText((n2-n1)+"");
            System.out.println("Result: " + (n2-n1));
            n1 =  n2-n1;  
            break;
            case 2:
            texto.setText((n2*n1)+"");
            System.out.println("Result: " + (n2*n1));  
            n1 =  n2*n1;
            break;
            case 3:
            texto.setText((n2/n1)+"");
            System.out.println("Result: " + (n2/n1)); 
            n1 =  n2/n1; 
            break;
          }
          ;
        }
      });
    bL.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) { 
          String txt = 0+"";
          n2 = 0;
          n1 = 0;
          texto.setText(txt);
        }
      });
    b0.setBackground(Color.GRAY);
    b1.setBackground(Color.GRAY);
    b2.setBackground(Color.GRAY);
    b3.setBackground(Color.GRAY);
    b4.setBackground(Color.GRAY);
    b5.setBackground(Color.GRAY);
    b6.setBackground(Color.GRAY);
    b7.setBackground(Color.GRAY);
    b8.setBackground(Color.GRAY);
    b9.setBackground(Color.GRAY);
    
  
    janela.getContentPane().add(painel);
    janela.pack();
    janela.setVisible(true);
  }
  static void startText(){
    if(texto.getText() == "0"){
      texto.setText("");
    } 
  } 
}

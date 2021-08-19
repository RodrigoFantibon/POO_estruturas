import javax.swing.JOptionPane;

public class OperadorTernario {
    
    public static void main (String[]args){

        byte idade = Byte.parseByte(JOptionPane.showInputDialog("qual a sua idade"));
        Boolean podeDirigir;
        
        podeDirigir = idade >= 18 ? true : false;

        //if (idade >= 18)
        //podeDirigir = true;
        //else
        //podeDirigir = false;

            String resultado;
            resultado = idade >= 18 ? "Sim, voce pode dirigir" : "não, ainda não";
           
           // System.out.printf("você %spode dirigir\n", idade >=18 ? "" : "não ");
            //JOptionPane.showMessageDialog(null,String.format("voce %spode dirigir\n", idade >= 18 ? "" : "não" ));
    }


}

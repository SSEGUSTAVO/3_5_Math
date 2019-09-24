import javax.swing.JOptionPane;

public class input {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Tu platillo favorito: ");
        System.out.println(input);
	int entrada = Integer.parseInt(input);
	entrada ++;
	System.out.println(entrada);
	int myinput = Integer.parseInt(JOptionPane.showInputDialog("Numero: ")+(1));
	System.out.println(myinput);
    }
}
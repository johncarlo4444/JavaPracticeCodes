import javax.swing.*;

public class JOption{
	public static void main (String[]args){
		
		
		
	//	String x;
		double xx=0;
		int sw=0;
		
		
		do{
		
			try{
				sw=0;
				xx=Double.parseDouble(JOptionPane.showInputDialog("Test"));
			} catch (Exception s){
				JOptionPane.showMessageDialog(null,"ERROR: Number Only!","Error MSG",0);
				sw=1;
			}
		}while (sw==1);
		
		
		JOptionPane.showMessageDialog(null,"You input : "+xx);
	}
}
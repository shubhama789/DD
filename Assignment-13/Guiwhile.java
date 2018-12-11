import javax.swing.JOptionPane;
public class Guiwhile{
	public static void main(String args[]){
		int x=0;
		while(x<5)
		{
			JOptionPane.showMessageDialog(null,"\n x= "+x);
			x+=2;
		}
	}
}
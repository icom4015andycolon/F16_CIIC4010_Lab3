import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Arnaldo  Colon");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(1024,576);
		myFrame.setSize(500,250);
		 MyPanelClass myPanel = new MyPanelClass();
         myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
	}
}
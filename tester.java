import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JApplet;
import java.awt.Container;
import java.awt.Font;

public class tester extends JApplet
{
	private JTextArea out = new JTextArea();

	public void init()
	{
		fillArray();
	}

	public void fillArray()
	{
		out.setFont(new Font("Monospaced", Font.PLAIN, 12));

		out.append("");
		Container container = getContentPane();
		container.add(out);
	}
}
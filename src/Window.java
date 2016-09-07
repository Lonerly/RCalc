import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Window extends JFrame implements ActionListener {

	private double firstField;
	private JTextField tfOne;
	private JTextPane pyramid;
	private JButton createPyramid, reset, plus, minus, undo;
	private int size = 7;
	private String undone;

	public Window() {

		setSize(1300, 900);
		setTitle("Piramidy Liczb");

		tfOne = new JTextField("");

		// tfTwo = new JTextField("Kolejna liczba.");
		// tfTwo.setBounds(130,55,250,35);
		// add(tfTwo);

		createPyramid = new JButton("CREATE");
		createPyramid.addActionListener(this);

		undo = new JButton("REMOVE");
		undo.addActionListener(this);

		plus = new JButton("+");
		plus.addActionListener(this);

		minus = new JButton("-");
		minus.addActionListener(this);

		reset = new JButton("RESET");
		reset.addActionListener(this);

		pyramid = new JTextPane();

		new JTextPane();

		// JPanel contentPane = new JPanel();
		// JScrollPane scroller = new JScrollPane();
		// contentPane.setLayout(new GridLayout(1, 2, 2, 2));
		// scroller.setViewportView(pyramid);
		// contentPane.add(scroller);

		SimpleAttributeSet attribs = new SimpleAttributeSet();
		StyleConstants.setForeground(attribs, Color.BLACK);
		StyleConstants.setFontSize(attribs, size);
		StyleConstants.setAlignment(attribs, StyleConstants.ALIGN_CENTER);
		pyramid.setParagraphAttributes(attribs, true);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(createPyramid, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(tfOne, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(undo, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(plus, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(minus, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(reset, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
				.addComponent(pyramid, GroupLayout.DEFAULT_SIZE, 1284, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(createPyramid, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfOne, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(undo, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(plus, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(minus, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(reset, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addComponent(pyramid, GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
	}

	public static void main(String[] args) {

		Window window = new Window();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object source = e.getSource();

		int amount = 0;

		firstField = Double.parseDouble(tfOne.getText());
		StyledDocument doc = pyramid.getStyledDocument();
		SimpleAttributeSet attribs = new SimpleAttributeSet();
		StyleConstants.setFontSize(attribs, size);

		if (source == createPyramid) {
			try {
				undone = pyramid.getText();

				while (amount < firstField) {
					doc.insertString(0, ".", null);
					amount++;
				}

				doc.insertString(0, "\n", null);
			} catch (BadLocationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();

			}

		} else if (source == reset) {

			pyramid.setText(null);
			size = 7;

			StyleConstants.setFontSize(attribs, size);
		} else if (source == plus) {

			if (size <= 100) {

				size++;

				StyleConstants.setFontSize(attribs, size);
				doc.setCharacterAttributes(0, doc.getLength() + 1, attribs, false);

			}

		} else if (source == minus) {

			if (size >= 2) {

				size--;

				StyleConstants.setFontSize(attribs, size);
				doc.setCharacterAttributes(0, doc.getLength() + 1, attribs, false);

			}

		} else if (source == undo) {

			pyramid.setText(undone);

		}

	}

}

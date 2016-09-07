import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window extends JFrame implements ActionListener {

	java.text.DecimalFormat df = new java.text.DecimalFormat("0.00");
	private double multipler = 1, sTolerance = 1;
	private int int1 = 0, int2 = 0, int3 = 0, codeM = 0, codeT = 0;
	private boolean bToggle = true;
	private JButton toggle, jB1, jB2, jB3, jBmultipler, jBtolerance;
	private JLabel jLscore;
	private Color BROWN = new Color(97, 51, 24);
	private Color VIOLET = new Color(111, 0, 255);
	private Color ORANGE2 = new Color(255, 69, 0);
	private String sMultipler = "Ω";

	public Window() {

		setSize(400, 300);
		setTitle("RCalc");
		setLayout(null);
		setVisible(true);

		try {

			this.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("resistor.png")))));

		} catch (IOException e) {

		}

		jLscore = new JLabel("");
		jLscore.setBounds(160, 170, 200, 35);
		add(jLscore);

		jB1 = new JButton("");
		jB1.setBounds(125, 83, 25, 61);
		jB1.addActionListener(this);
		jB1.setBackground(Color.BLACK);
		add(jB1);

		jB2 = new JButton("");
		jB2.setBounds(155, 83, 25, 61);
		jB2.addActionListener(this);
		jB2.setBackground(Color.BLACK);
		add(jB2);

		jB3 = new JButton("");
		jB3.setBounds(185, 83, 25, 61);
		jB3.addActionListener(this);
		jB3.setBackground(Color.BLACK);
		jB3.setVisible(false);
		add(jB3);

		jBmultipler = new JButton("");
		jBmultipler.setBounds(185, 83, 25, 61);
		jBmultipler.addActionListener(this);
		jBmultipler.setBackground(Color.BLACK);
		add(jBmultipler);

		jBtolerance = new JButton("");
		jBtolerance.setBounds(245, 83, 25, 61);
		jBtolerance.addActionListener(this);
		jBtolerance.setBackground(Color.BLACK);
		add(jBtolerance);

		toggle = new JButton("Toggle");
		toggle.setBounds(5, 5, 75, 25);
		toggle.addActionListener(this);
		add(toggle);

		// JComboBox colorCombo1;
		//
		// colorCombo1 = new JComboBox();
		// colorCombo1.addItem("czarny");
		// colorCombo1.addItem("czerwony");
		// colorCombo1.addItem("zielony");
		// colorCombo1.addItem("niebieski");
		// colorCombo1.addItem("różowy");
		// colorCombo1.setBounds(50, 5, 75, 20);
		//
		// add(colorCombo1);

	}

	// private static class JGradientButton extends JButton {
	// private JGradientButton() {
	// super("Gradient Button");
	// setContentAreaFilled(false);
	// setFocusPainted(false);
	//
	// @Override
	// protected void paintComponent(Graphics g) {
	// final Graphics2D g2 = (Graphics2D) g.create();
	// g2.setPaint(new GradientPaint(
	// new Point(0, 0),
	// Color.WHITE,
	// new Point(0, getHeight()),
	// Color.PINK.darker()));
	// g2.fillRect(0, 0, getWidth(), getHeight());
	// g2.dispose();
	//
	// super.paintComponent(g);
	// }

	public static void main(String[] args) {

		Window window = new Window();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setResizable(false);

	}

	public void actionPerformed(ActionEvent e) {

		Object source = e.getSource();

		// Replace with array.
		
		if (source == jB1) {
			switch (int1) {
			case 0:
				jB1.setBackground(BROWN);

				int1++;
				break;
			case 1:
				jB1.setBackground(Color.RED);

				int1++;
				break;
			case 2:
				jB1.setBackground(ORANGE2);

				int1++;
				break;
			case 3:
				jB1.setBackground(Color.YELLOW);

				int1++;
				break;
			case 4:
				jB1.setBackground(Color.GREEN);

				int1++;
				break;
			case 5:
				jB1.setBackground(Color.BLUE);

				int1++;
				break;
			case 6:
				jB1.setBackground(VIOLET);

				int1++;
				break;
			case 7:
				jB1.setBackground(Color.GRAY);

				int1++;
				break;
			case 8:
				jB1.setBackground(Color.WHITE);

				int1++;
				break;
			case 9:
				jB1.setBackground(Color.BLACK);

				int1 = 0;
				break;

			default:
				break;
			}
		} else if (source == jB2) {
			switch (int2) {
			case 0:
				jB2.setBackground(BROWN);

				int2++;
				break;
			case 1:
				jB2.setBackground(Color.RED);

				int2++;
				break;
			case 2:
				jB2.setBackground(ORANGE2);

				int2++;
				break;
			case 3:
				jB2.setBackground(Color.YELLOW);

				int2++;
				break;
			case 4:
				jB2.setBackground(Color.GREEN);

				int2++;
				break;
			case 5:
				jB2.setBackground(Color.BLUE);

				int2++;
				break;
			case 6:
				jB2.setBackground(VIOLET);

				int2++;
				break;
			case 7:
				jB2.setBackground(Color.GRAY);

				int2++;
				break;
			case 8:
				jB2.setBackground(Color.WHITE);

				int2++;
				break;
			case 9:
				jB2.setBackground(Color.BLACK);

				int2 = 0;
				break;

			default:
				break;
			}
		} else if (source == jB3) {
			switch (int3) {
			case 0:
				jB3.setBackground(BROWN);

				int3++;
				break;
			case 1:
				jB3.setBackground(Color.RED);

				int3++;
				break;
			case 2:
				jB3.setBackground(ORANGE2);

				int3++;
				break;
			case 3:
				jB3.setBackground(Color.YELLOW);

				int3++;
				break;
			case 4:
				jB3.setBackground(Color.GREEN);

				int3++;
				break;
			case 5:
				jB3.setBackground(Color.BLUE);

				int3++;
				break;
			case 6:
				jB3.setBackground(VIOLET);

				int3++;
				break;
			case 7:
				jB3.setBackground(Color.GRAY);

				int3++;
				break;
			case 8:
				jB3.setBackground(Color.WHITE);

				int3++;
				break;
			case 9:
				jB3.setBackground(Color.BLACK);

				int3 = 0;
				break;

			default:
				break;
			}
		} else if (source == jBmultipler) {
			switch (codeM) {
			case 0:
				jBmultipler.setBackground(BROWN);

				sMultipler = "Ω";
				multipler = 10;
				codeM++;
				break;
			case 1:
				jBmultipler.setBackground(Color.RED);

				sMultipler = "Ω";
				multipler = 100;
				codeM++;
				break;
			case 2:
				jBmultipler.setBackground(ORANGE2);

				sMultipler = "KΩ";
				multipler = 1;
				codeM++;
				break;
			case 3:
				jBmultipler.setBackground(Color.YELLOW);

				sMultipler = "KΩ";
				multipler = 10;
				codeM++;
				break;
			case 4:
				jBmultipler.setBackground(Color.GREEN);

				sMultipler = "KΩ";
				multipler = 100;
				codeM++;
				break;
			case 5:
				jBmultipler.setBackground(Color.BLUE);

				sMultipler = "MΩ";
				multipler = 1;
				codeM++;
				break;
			case 6:
				jBmultipler.setBackground(VIOLET);

				sMultipler = "MΩ";
				multipler = 10;
				codeM++;
				break;
			case 7:
				jBmultipler.setBackground(Color.ORANGE);

				sMultipler = "Ω";
				multipler = 0.1;
				codeM++;
				break;
			case 8:
				jBmultipler.setBackground(Color.lightGray);

				sMultipler = "Ω";
				multipler = 0.01;
				codeM++;
				break;
			case 9:
				jBmultipler.setBackground(Color.BLACK);

				sMultipler = "Ω";
				multipler = 1;
				codeM = 0;
				break;

			default:
				break;
			}
		} else if (source == jBtolerance) {
			switch (codeT) {
			case 0:
				jBtolerance.setBackground(Color.RED);

				sTolerance = 2;
				codeT++;
				break;
			case 1:
				jBtolerance.setBackground(Color.GREEN);

				sTolerance = 0.5;
				codeT++;
				break;
			case 2:
				jBtolerance.setBackground(Color.BLUE);

				sTolerance = 0.25;
				codeT++;
				break;
			case 3:
				jBtolerance.setBackground(VIOLET);

				sTolerance = 0.10;
				codeT++;
				break;
			case 4:
				jBtolerance.setBackground(Color.GRAY);

				sTolerance = 0.05;
				codeT++;
				break;
			case 5:
				jBtolerance.setBackground(Color.ORANGE);

				sTolerance = 5;
				codeT++;
				break;
			case 6:
				jBtolerance.setBackground(Color.lightGray);

				sTolerance = 10;
				codeT++;
				break;
			case 7:
				jBtolerance.setBackground(BROWN);

				sTolerance = 1;
				codeT = 0;
				break;

			default:
				break;
			}
		}

		else if (source == toggle) {

			if (bToggle == true) {

				bToggle = false;
				jB3.setVisible(true);

			} else {

				bToggle = true;
				jB3.setVisible(false);

			}
		}

		if (bToggle == true) {

			double sum = (int1 * 10 + int2) * multipler;
			System.out.println(sum + " " + sMultipler + ", " + sTolerance + "%");
			jLscore.setText(df.format(sum) + " " + sMultipler + ", " + sTolerance + "%");
			jBmultipler.setBounds(185, 83, 25, 61);

		} else {

			double sum = (int1 * 100 + int2 * 10 + int3) * multipler;
			System.out.println(sum + " " + sMultipler + ", " + sTolerance + "%");
			jLscore.setText(df.format(sum) + " " + sMultipler + ", " + sTolerance + "%");
			jBmultipler.setBounds(215, 83, 25, 61);

		}

	}

}
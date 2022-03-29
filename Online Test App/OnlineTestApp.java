import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

class OnlineTestApp extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;

	JLabel label;
	JRadioButton radioButton[] = new JRadioButton[5];
	JButton btnNext, btnBookmark;
	ButtonGroup bg;
	int count = 0, current = 0, x = 1, y = 1, now = 0;
	int m[] = new int[10];

	// create jFrame with radioButton and JButton
	OnlineTestApp(String s) {
		super(s);
		label = new JLabel();
		add(label);
		bg = new ButtonGroup();
		for (int i = 0; i < 5; i++) {
			radioButton[i] = new JRadioButton();
			add(radioButton[i]);
			bg.add(radioButton[i]);
		}
		btnNext = new JButton("Next");
		btnBookmark = new JButton("Bookmark");
		btnNext.addActionListener(this);
		btnBookmark.addActionListener(this);
		add(btnNext);
		add(btnBookmark);
		set();
		label.setBounds(30, 40, 450, 20);
		//radioButton[0].setBounds(50, 80, 200, 20);
		radioButton[0].setBounds(50, 80, 450, 20);
		radioButton[1].setBounds(50, 110, 200, 20);
		radioButton[2].setBounds(50, 140, 200, 20);
		radioButton[3].setBounds(50, 170, 200, 20);
		btnNext.setBounds(100, 240, 100, 30);
		btnBookmark.setBounds(270, 240, 100, 30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250, 100);
		setVisible(true);
		setSize(600, 350);
	}

	// handle all actions based on event
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNext) {
			if (check())
				count = count + 1;
			current++;
			set();
			if (current == 9) {
				btnNext.setEnabled(false);
				btnBookmark.setText("Result");
			}
		}
		if (e.getActionCommand().equals("Bookmark")) {
			JButton bk = new JButton("Bookmark" + x);
			bk.setBounds(480, 20 + 30 * x, 100, 30);
			add(bk);
			bk.addActionListener(this);
			m[x] = current;
			x++;
			current++;
			set();
			if (current == 9)
				btnBookmark.setText("Result");
			setVisible(false);
			setVisible(true);
		}
		for (int i = 0, y = 1; i < x; i++, y++) {
			if (e.getActionCommand().equals("Bookmark" + y)) {
				if (check())
					count = count + 1;
				now = current;
				current = m[y];
				set();
				((JButton) e.getSource()).setEnabled(false);
				current = now;
			}
		}

		if (e.getActionCommand().equals("Result")) {
			if (check())
				count = count + 1;
			current++;
			JOptionPane.showMessageDialog(this, "correct answers= " + count);
			System.exit(0);
		}
	}

	// SET Questions with options
	void set() {
		radioButton[4].setSelected(true);
		if (current == 0) {
			label.setText("Que1:  What is the size of int variable?");
			radioButton[0].setText("8 bit");
			radioButton[1].setText("16 bit");
			radioButton[2].setText("32 bit");
			radioButton[3].setText("64 bit");
		}
		if (current == 1) {
			label.setText("Que2:  Inheritance Represents...");
			radioButton[0].setText("HAS-A Relationship");
			radioButton[1].setText("IS-A Relationship");
			radioButton[2].setText("Both of the above");
			radioButton[3].setText("None of these");
		}
		if (current == 2) {
			label.setText("Que3: What of the following is the default value of an instanse variable?");
			radioButton[0].setText("Null");
			radioButton[1].setText("0");
			radioButton[2].setText("Depends upon the type of variable");
			radioButton[3].setText("Not-assigned");
		}
		if (current == 3) {
			label.setText("Que4: Which methods must be implemented by all threads?");
			radioButton[0].setText("Wait()");
			radioButton[1].setText("Start()");
			radioButton[2].setText("Stop()");
			radioButton[3].setText("Run()");
		}
		if (current == 4) {
			label.setText("Que5:  Which of the following is fatser,StringBuilder or StringBuffer?");
			radioButton[0].setText("StringBuilder");
			radioButton[1].setText("StringBuffer");
			radioButton[2].setText("Both of the above");
			radioButton[3].setText("None of these");
		}
		if (current == 5) {
			label.setText("Que6: Which of the following is not a java features?");
			radioButton[0].setText("Dynamic");
			radioButton[1].setText("Architecture Neutral");
			radioButton[2].setText("Use of pointers");
			radioButton[3].setText("Object-oriented");
		}
		if (current == 6) {
			label.setText("Que7:  Which package contains the Random class?");
			radioButton[0].setText("Java.util package");
			radioButton[1].setText("Java.lang package");
			radioButton[2].setText("Java.awt package");
			radioButton[3].setText("Java.io package");
		}
		if (current == 7) {
			label.setText("Que8:  Which of the following is reserved keyword in java?");
			radioButton[0].setText("object");
			radioButton[1].setText("strictfp");
			radioButton[2].setText("main");
			radioButton[3].setText("System");
		}
		if (current == 8) {
			label.setText("Que9: What is the return type of the hashCode() method in the object class?");
			radioButton[0].setText("Object");
			radioButton[1].setText("int");
			radioButton[2].setText("long");
			radioButton[3].setText("void");
		}
		if (current == 9) {
			label.setText("Que10: Which of the following is a valid long literal?");
			radioButton[0].setText("ABH8097");
			radioButton[1].setText("L990023");
			radioButton[2].setText("904423");
			radioButton[3].setText("0xnfo2al");
		}
		label.setBounds(30, 40, 450, 20);
		for (int i = 0, j = 0; i <= 90; i += 30, j++)
			radioButton[j].setBounds(50, 80 + i, 200, 20);
	}

	// declare right answers.
	boolean check() {
		if (current == 0)
			return (radioButton[2].isSelected());
		if (current == 1)
			return (radioButton[1].isSelected());
		if (current == 2)
			return (radioButton[2].isSelected());
		if (current == 3)
			return (radioButton[3].isSelected());
		if (current == 4)
			return (radioButton[0].isSelected());
		if (current == 5)
			return (radioButton[2].isSelected());
		if (current == 6)
			return (radioButton[0].isSelected());
		if (current == 7)
			return (radioButton[1].isSelected());
		if (current == 8)
			return (radioButton[1].isSelected());
		if (current == 9)
			return (radioButton[3].isSelected());
		return false;
	}

	public static void main(String s[]) {
		new OnlineTestApp("Online Test App");
	}

}

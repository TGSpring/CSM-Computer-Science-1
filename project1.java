package project_1;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
import java.util.*;

/**
 * @author tyler spring 
 * Project 1 
 * This program uses JFileChooser to select and
 *         read a file that uses the correct grammar in order to parse, using
 *         recursive descent, a GUI definition language defined in an input file
 *         and generates the GUI that it defines.
 *
 */
public class project1 {
//Instances of this classes used to create lists for objects of GUI, object of other class.
	static ArrayList<JButton> buttons;
	static ArrayList<JLabel> labels;
	static ArrayList<JRadioButton> radios;
	static labelComp labeler;
	static JFrame fr;
	static JPanel p1, p2, p3, p4;
	static Container cont;
	static JTextField textbox;

	/**
	 * Method that builds the GUI. It creates the frame object and calls the
	 * labelComp class to get the numbers needed to build the GUI. I found that
	 * adding a space in the window name throws off how it sizes the window and I am
	 * beyond trying to fix that.
	 **/

	public void generator() {
		fr = new JFrame();

		fr.setSize(this.labeler.getwinWidth(), this.labeler.getwindHeight());

		fr.setTitle(this.labeler.winName());
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		cont = fr.getContentPane();

		if (this.labeler.getwindNum() == 0) {
			cont.setLayout(new FlowLayout());
		} else {
			if (this.labeler.geth() != 0 && this.labeler.getv() != 0) {
				cont.setLayout(new GridLayout(this.labeler.getrows(), this.labeler.getcol(), this.labeler.geth(),
						this.labeler.getv()));
			} else {
				cont.setLayout(new GridLayout(this.labeler.getrows(), this.labeler.getcol()));
			}
		}
		// Each of these panels are for each of the objects to be added to the Window
		// when made.
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();

		if (this.labeler.getpanelNum() == 0) {
			p1.setLayout(new FlowLayout());
			p2.setLayout(new FlowLayout());
			p3.setLayout(new FlowLayout());
		} else {
			// Dimensions for each panel created for the GUI
			if (this.labeler.geth() != 0 && this.labeler.getv() != 0) {
				p1.setLayout(new GridLayout(this.labeler.getrows(), this.labeler.getcol(), this.labeler.geth(),
						this.labeler.getv()));
				p2.setLayout(new GridLayout(this.labeler.getrows(), this.labeler.getcol(), this.labeler.geth(),
						this.labeler.getv()));
				p3.setLayout(new GridLayout(this.labeler.getrows(), this.labeler.getcol(), this.labeler.geth(),
						this.labeler.getv()));
				p4.setLayout(new GridLayout(this.labeler.getrows(), this.labeler.getcol(), this.labeler.geth(),
						this.labeler.getv()));
			} else {
				p1.setLayout(new GridLayout(this.labeler.getrows(), this.labeler.getcol()));
				p2.setLayout(new GridLayout(this.labeler.getrows(), this.labeler.getcol()));
				p3.setLayout(new GridLayout(this.labeler.getrows(), this.labeler.getcol()));
				p4.setLayout(new GridLayout(this.labeler.getrows(), this.labeler.getcol()));
			}
		}

		textbox = new JTextField("", this.labeler.gettextNum());
		cont.add(textbox);
		p1.add(textbox);
		/**
		 * Here the lists that are created are iteratored through in order to create and
		 * add buttons to the GUI. Their is one for the buttons, labels, and radio
		 * buttons.
		 */
		Iterator<String> buttonIt = this.labeler.getbuttons().iterator();
		int i = 0;
		while (buttonIt.hasNext()) {
			buttons.add(new JButton(buttonIt.next()));
			cont.add(buttons.get(i));
			p2.add(buttons.get(i));
			i++;

		}
		// Radio buttons ran through.
		i = 0;
		buttonIt = this.labeler.getradios().iterator();
		while (buttonIt.hasNext()) {
			radios.add(new JRadioButton(buttonIt.next()));
			cont.add(radios.get(i));
			p3.add(radios.get(i));
			i++;

		}
		// Labels ran through
		i = 0;
		buttonIt = this.labeler.getlabels().iterator();
		while (buttonIt.hasNext()) {
			labels.add(new JLabel(buttonIt.next()));
			cont.add(labels.get(i));
			p4.add(labels.get(i));
			i++;
		}
		// Panels of different objects added to the gui to be created.
		fr.add(p1);
		fr.add(p2);
		fr.add(p3);
		fr.add(p4);
		fr.setVisible(true);
	}

//Main method of program. Creates all 3 Arraylists used, an object of labelComp, and an object to run the program.
	public static void main(String[] args) throws Exception {
		labeler = new labelComp();
		buttons = new ArrayList<JButton>();
		labels = new ArrayList<JLabel>();
		radios = new ArrayList<JRadioButton>();
		project1 driver = new project1();
		driver.generator();

	}
}
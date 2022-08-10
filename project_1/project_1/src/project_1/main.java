
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
public class main {
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
	 * labelComp class to get the numbers needed to build the GUI. Why it chose to
	 * not read those numbers correctly is beyond me.
	 **/

	public void generator() {
		fr = new JFrame();

		fr.setSize(labelComp.getwinWidth(), labelComp.getwindHeight());

		fr.setTitle(labelComp.winName());
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		cont = fr.getContentPane();

		if (main.labeler.getwindNum() == 0) {
			cont.setLayout(new FlowLayout());
		} else {
			if (main.labeler.geth() != 0 && main.labeler.getv() != 0) {
				cont.setLayout(new GridLayout(main.labeler.getrows(), main.labeler.getcol(), main.labeler.geth(),
						main.labeler.getv()));
			} else {
				cont.setLayout(new GridLayout(main.labeler.getrows(), main.labeler.getcol()));
			}
		}
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();

		if (labelComp.getpanelNum() == 0) {
			p1.setLayout(new FlowLayout());
			p2.setLayout(new FlowLayout());
			p3.setLayout(new FlowLayout());
		} else {
			if (main.labeler.geth() != 0 && main.labeler.getv() != 0) {
				p1.setLayout(new GridLayout(main.labeler.getrows(), main.labeler.getcol(), main.labeler.geth(),
						main.labeler.getv()));
				p2.setLayout(new GridLayout(main.labeler.getrows(), main.labeler.getcol(), main.labeler.geth(),
						main.labeler.getv()));
				p3.setLayout(new GridLayout(main.labeler.getrows(), main.labeler.getcol(), main.labeler.geth(),
						main.labeler.getv()));
				p4.setLayout(new GridLayout(main.labeler.getrows(), main.labeler.getcol(), main.labeler.geth(),
						main.labeler.getv()));
			} else {
				p1.setLayout(new GridLayout(main.labeler.getrows(), main.labeler.getcol()));
				p2.setLayout(new GridLayout(main.labeler.getrows(), main.labeler.getcol()));
				p3.setLayout(new GridLayout(main.labeler.getrows(), main.labeler.getcol()));
				p4.setLayout(new GridLayout(main.labeler.getrows(), main.labeler.getcol()));
			}
		}

		textbox = new JTextField("", main.labeler.gettextNum());
		cont.add(textbox);
		p1.add(textbox);
		/**
		 * Here the lists that are created are iteratored through in order to create and
		 * add buttons to the GUI. Their is one for the buttons, labels, and radio
		 * buttons.
		 */
		Iterator<String> buttonIt = labelComp.getbuttons().iterator();
		int i = 0;
		while (buttonIt.hasNext()) {
			buttons.add(new JButton(buttonIt.next()));
			cont.add(buttons.get(i));
			p2.add(buttons.get(i));
			i++;

		}

		i = 0;
		buttonIt = labelComp.getradios().iterator();
		while (buttonIt.hasNext()) {
			radios.add(new JRadioButton(buttonIt.next()));
			cont.add(radios.get(i));
			p3.add(radios.get(i));
			i++;

		}

		i = 0;
		buttonIt = labelComp.getlabels().iterator();
		while (buttonIt.hasNext()) {
			labels.add(new JLabel(buttonIt.next()));
			cont.add(labels.get(i));
			p4.add(labels.get(i));
			i++;
		}
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
		main driver = new main();
		driver.generator();

	}
}

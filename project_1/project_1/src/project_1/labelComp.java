package project_1;

import java.io.*;
import javax.swing.*;
import java.util.*;
import java.util.regex.*;

/**
 * @author tyler spring 
 * project 1
 * This is the labelComp class. It is called in the main class and implements the JFileChooser, StringTokenizer, and creates more instances of the ArrayLists
 * needed except here they have string parameters in order to have recursion easily done to them.
 * 
 *
 */
public class labelComp {
	static String winName, list;
	static int windNum, textNum, panelNum, winWidth, windHeight;
	static int rows, col, h, v;
	static ArrayList<String> buttons;
	static ArrayList<String> labels;
	static ArrayList<String> radios;
	static StringTokenizer tokens;

//Creates objects needed to read and store the selected file. Once it is approved.
	@SuppressWarnings("resource")
	labelComp() throws Exception {
		buttons = new ArrayList<String>();
		labels = new ArrayList<String>();
		radios = new ArrayList<String>();
		JFileChooser input = new JFileChooser();
		String word = null;
		StringTokenizer tokens;
		Scanner sc = new Scanner("");
		input = new JFileChooser(new File("."));
		input.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		input.setCurrentDirectory(null);
//Approves file and reads through and adds it to one string that is then passed to the tokenizer object.
		int opt = input.showOpenDialog(null);
		if (opt == JFileChooser.APPROVE_OPTION) {
			File file = input.getSelectedFile();
			sc = new Scanner(file);

			while (sc.hasNext()) {
				word = word + " " + sc.next();
			}

		}
		/**
		 * This is the start of the probably most annoying nesting I have ever done and
		 * I am so glad I am deciding to be done with it. It reads each token of the
		 * tokenizer validating first if it needs to end. If not it continues and checks
		 * each token to see if it requires to be further nested or onto the next token.
		 */
		tokens = new StringTokenizer(word);
		while (tokens.hasMoreTokens()) {
			list = tokens.nextToken();
			if (list.equalsIgnoreCase("End.")) {
				break;
			}

			while (tokens.hasMoreTokens()) {
				list = tokens.nextToken();
				if (list.equalsIgnoreCase("End;")) {
					break;
				} else if (list.equalsIgnoreCase("Window")) {
					list = tokens.nextToken();
					winName = list.replaceAll("\"", "");
					list = tokens.nextToken();
					setWindow(list);
					list = tokens.nextToken();
					if (list.equalsIgnoreCase("Layout")) {
						while (!list.contains(":")) {
							list = tokens.nextToken();
							if (list.contains("Flow")) {
								windNum = 0;
							} else if (list.equalsIgnoreCase("Grid")) {
								panelNum = 1;
								setGrid(list);
							}
						}
					}
				} else if (list.equalsIgnoreCase("TextField")) {
					while (!list.contains(";")) {
						list = tokens.nextToken();
						textNum = Integer.parseInt(list.replaceFirst(";", ""));
					}
				} else if (list.equalsIgnoreCase("Panel")) {
					list = tokens.nextToken();
					while (!list.contains(";")) {
						list = tokens.nextToken();
						if (list.contains("Flow")) {
							panelNum = 0;
						} else if (list.contains("Grid")) {
							panelNum = 1;
							setGrid(list);
						}
					}
				} else if (list.equalsIgnoreCase("Button")) {
					while (!list.contains(";")) {
						list = tokens.nextToken();
						buttons.add(list.replaceAll("\"|;", ""));
					}

				} else if (list.equalsIgnoreCase("Label")) {
					while (!list.contains(";")) {
						list = tokens.nextToken();
						labels.add(list.replaceAll("\"|;", ""));
					}
				} else if (list.equalsIgnoreCase("Radio")) {
					list = tokens.nextToken();
					while (!list.contains(";")) {
						list = tokens.nextToken();
						radios.add(list.replaceAll("\"|;", ""));
					}
				}
			}
		}
		sc.close();
	}

	/**
	 * Here the Matcher object is used to find the numbers that define the size of
	 * the GUI window. I am not sure why I was not able to make it work.
	 */
	private static void setWindow(String list) {
		Matcher windowSize = Pattern.compile("[0-9]+").matcher(list);
		for (int i = 0; i < 2; i++) {
			if (windowSize.find()) {
				if (i == 0) {
					winWidth = Integer.parseInt(windowSize.group());
				} else {
					windHeight = Integer.parseInt(windowSize.group());
				}
			}
		}

	}

	/**
	 * The same logic is used here in order to find the numbers needed to define the
	 * rows, columns, and the vertical and horizontal gaps between the objects.
	 */
	private static void setGrid(String list) {
		Matcher gridSize = Pattern.compile("[0-9]+").matcher(list);
		for (int i = 0; i < 2; i++) {
			if (gridSize.find()) {
				if (i == 0) {
					rows = Integer.parseInt(gridSize.group());
				} else if (i == 1) {
					col = Integer.parseInt(gridSize.group());
				} else if (i == 2) {
					h = Integer.parseInt(gridSize.group());
				} else {
					v = Integer.parseInt(gridSize.group());
				}
			}
		}

	}

//All of the setters that were needed for this project. I did the generate getters and setters.
	public static String winName() {
		return winName;
	}

	public int getwindNum() {
		return windNum;
	}

	public static int getpanelNum() {
		return panelNum;
	}

	public int gettextNum() {
		return textNum;
	}

	public static int getwinWidth() {
		return winWidth;
	}

	public static int getwindHeight() {
		return windHeight;
	}

	public int getrows() {
		return rows;
	}

	public int getcol() {
		return col;
	}

	public int geth() {
		return h;
	}

	public int getv() {
		return v;
	}

	public static ArrayList<String> getbuttons() {
		return buttons;
	}

	public static ArrayList<String> getlabels() {
		return labels;
	}

	public static ArrayList<String> getradios() {
		return radios;
	}
}

package cst8284.wordsort;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;

public class SortByStringLength implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
			Collections.sort(WordSorter.getListOfStrings(), (a, b) -> a.length() - b.length()); // 2nd parameter is lambda function (that is a comparator)
			WordSorter.reloadJTextArea();
	}
}

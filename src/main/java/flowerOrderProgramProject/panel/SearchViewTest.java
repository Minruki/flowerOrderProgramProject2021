package flowerOrderProgramProject.panel;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

@SuppressWarnings("serial")
public class SearchViewTest extends JFrame {
	private JTextField jtf;
	private JLabel searchLbl;
	private TableModel model;
	private JTable table;
	private TableRowSorter sorter;
	private JScrollPane jsp;

	public SearchViewTest() {
   setTitle("JTableSearch Test");
   String[] columnNames = {"id","member_name","phone_number","cumulative_amount, membership_title "};
   Object[][] rowData = {{"lee.daeung","이대응", "010-5678-1234", "10,000", ""},{"Vineet","Java Script"},{"Archana","Python"},{"Krishna","Scala"},{"Adithya","AWS"},{"Jai",".Net"}};
   model = new DefaultTableModel(rowData, columnNames);
   sorter = new TableRowSorter<>(model);
   getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
   searchLbl = new JLabel("Search");
   getContentPane().add(searchLbl);
   jtf = new JTextField(15);
   getContentPane().add(jtf);
   jtf.getDocument().addDocumentListener(new DocumentListener() {
   
	@Override
    public void insertUpdate(DocumentEvent e) {
      search(jtf.getText());
    }
    @Override
    public void removeUpdate(DocumentEvent e) {
      search(jtf.getText());
    }
    @Override
    public void changedUpdate(DocumentEvent e) {
      search(jtf.getText());
    }
    public void search(String str) {
      if (str.length() == 0) {
       sorter.setRowFilter(null);
      } else {
       sorter.setRowFilter(RowFilter.regexFilter(str));
      }
    }
   });
   table = new JTable(model);
   table.setRowSorter(sorter);
   
   jsp = new JScrollPane(table);
   getContentPane().add(jsp);
  
   setSize(490, 569);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setLocationRelativeTo(null);
   setResizable(false);
   setVisible(true);
 }

	public static void main(String[] args) {
		new SearchViewTest();
	}
}
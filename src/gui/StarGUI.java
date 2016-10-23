package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class StarGUI {
	
	JList<String> jlist;
	
	public void startGUI(){
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_All = new JPanel();
		panel_All.setLayout(new BorderLayout());
//---------------------------------------------------------	
		JPanel panel_Center = new JPanel();
		panel_Center.setLayout(new BorderLayout());
		
		JPanel panel_C_Left = new JPanel();
		panel_C_Left.setLayout(new FlowLayout(FlowLayout.LEFT,20,40));
		
		JLabel label1 = new JLabel("상품명　");
		JTextField textFiled1 = new JTextField(10);

		JLabel label2 = new JLabel("상품가격");
		JTextField textFiled2 = new JTextField(10);
		
		JPanel panel_C_Left_Top = new JPanel();
		panel_C_Left_Top.add(label1);
		panel_C_Left_Top.add(textFiled1);
		
		JPanel panel_C_Left_Bottom = new JPanel();
		panel_C_Left_Bottom.add(label2);
		panel_C_Left_Bottom.add(textFiled2);

		panel_C_Left.add(panel_C_Left_Top);
		panel_C_Left.add(panel_C_Left_Bottom);
		
		JPanel panel_C_Right = new JPanel();
		panel_C_Right.setBackground(Color.BLUE);
		panel_C_Right.setLayout(new BorderLayout());
		
		String[] listData = {"aaa","bbb","ccc","ddd"};
		jlist = new JList<String>(listData);

		jlist.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if(!e.getValueIsAdjusting()){
					System.out.println(jlist.getSelectedIndex() + " : " + jlist.getSelectedValue());
				}
			}
		});
		
		panel_C_Right.add(jlist, BorderLayout.CENTER);
		
		panel_Center.add(panel_C_Left, BorderLayout.WEST);
		panel_Center.add(panel_C_Right, BorderLayout.CENTER);

		panel_C_Left.setPreferredSize(new Dimension(350, 200));
		panel_C_Right.setPreferredSize(new Dimension(150,200));
		panel_Center.setPreferredSize(new Dimension(500, 200));
//---------------------------------------------------------	
		
		JPanel panel_Bottom = new JPanel();
		panel_Bottom.setBackground(Color.DARK_GRAY);
		panel_Bottom.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		
		JButton button_insert = new JButton("등록");
		JButton button_update = new JButton("수정");
		JButton button_delete = new JButton("삭제");
		
		panel_Bottom.add(button_insert);
		panel_Bottom.add(button_update);
		panel_Bottom.add(button_delete);
		
		panel_All.add(panel_Center, BorderLayout.CENTER);
		panel_All.add(panel_Bottom, BorderLayout.SOUTH);
		
		frame.add(panel_All);
		
		frame.setTitle("StartBucks");
		frame.setSize(500, 300);
		frame.setVisible(true);
	}
}

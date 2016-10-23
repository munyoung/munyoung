package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javafx.scene.layout.BorderWidths;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class StarGUI {
	
	public static void main(String args[]){
		
		startGUI();
		
	}
	
	public static void startGUI(){
		
		JFrame frame = new JFrame();
		
		JPanel panel_All = new JPanel();
		panel_All.setLayout(new BorderLayout());
	//---------------------------------------------------------	
		JPanel panel_Center = new JPanel();
		panel_Center.setLayout(new BorderLayout());
		
		JPanel panel_C_Left = new JPanel();
		panel_C_Left.setLayout(new GridLayout(2,1));
		panel_C_Left.setBackground(Color.LIGHT_GRAY);
		
		JLabel label1 = new JLabel("상품명");
		JTextField textFiled1 = new JTextField();
		JLabel label2 = new JLabel("상품가격");
		JTextField textFiled2 = new JTextField();
		
		panel_C_Left.add(label1);
		panel_C_Left.add(textFiled1);
		panel_C_Left.add(label2);
		panel_C_Left.add(textFiled2);
		
		JPanel panel_C_Right = new JPanel();
		panel_C_Right.setBackground(Color.BLUE);
		
		panel_Center.add(panel_C_Left, BorderLayout.WEST);
		panel_Center.add(panel_C_Right, BorderLayout.EAST);
	//---------------------------------------------------------	
		
		JPanel panel_Bottom = new JPanel();
		panel_Bottom.setBackground(Color.DARK_GRAY);
		
		
		panel_All.add(panel_Center, BorderLayout.CENTER);
		panel_All.add(panel_Bottom, BorderLayout.SOUTH);
		
		
		JButton button_insert = new JButton("등록");
		JButton button_update = new JButton("수정");
		JButton button_delete = new JButton("삭제");
		
		panel_Bottom.add(button_insert);
		panel_Bottom.add(button_update);
		panel_Bottom.add(button_delete);
		
		frame.add(panel_All);
		
		frame.setTitle("StartBucks");
		frame.setSize(800, 500);
		frame.setVisible(true);
	}
}

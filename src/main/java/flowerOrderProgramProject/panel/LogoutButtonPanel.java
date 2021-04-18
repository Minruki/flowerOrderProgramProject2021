package flowerOrderProgramProject.panel;

import javax.swing.JPanel;

import flowerOrderProgramProject.ui.FlowerLoginView;
import flowerOrderProgramProject.ui.FlowerMainProgram;
import flowerOrderProgramProject.ui.content.LogoutPageMain;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class LogoutButtonPanel extends JPanel {
	  private FlowerMainProgram main;
	  private LogoutPageMain logout;
	
	public LogoutButtonPanel() {

		initialize();
	}
	private void initialize() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel);
		
		JButton btnNewButton = new JButton("Back to Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton(e);
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Close Program");
		panel.add(btnNewButton_1);
	}
	
	
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		
		FlowerMainProgram main = new FlowerMainProgram();
        main.flowerloginView = new FlowerLoginView(); // 로그인창 보이기
        main.flowerloginView.setMain(main); // 로그인창에게 메인 클래스보내기
        
      }
	
	
}

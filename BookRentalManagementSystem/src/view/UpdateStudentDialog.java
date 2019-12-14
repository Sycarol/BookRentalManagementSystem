package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UpdateStudentDialog extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JTextField txtName = new JTextField();
	private JButton btnSubmit = new JButton("Submit");
	private JButton btnReset = new JButton("Reset");

	public UpdateStudentDialog(ManageStudentsDialog dialog, String selectedMatricNo) 
	{
		super(dialog,"Update Student",true);
		
		JPanel pnlCenter = new JPanel(new GridLayout(3,2,10,10));
		JPanel pnlSouth = new JPanel(new FlowLayout(FlowLayout.RIGHT,10,0));
		
		pnlCenter.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 10));
		pnlSouth.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));
		pnlCenter.add(new JLabel("Selected Book: ", JLabel.LEFT));
		pnlCenter.add(new JLabel(selectedMatricNo));
		pnlCenter.add(new JLabel("Name: ", JLabel.LEFT));
		pnlCenter.add(txtName);
		
		pnlSouth.add(btnSubmit);
		pnlSouth.add(btnReset);
		
		this.add(pnlCenter);
		this.add(pnlSouth,BorderLayout.SOUTH);
		
		btnSubmit.addActionListener(this);
		btnReset.addActionListener(this);
		
		this.getRootPane().setDefaultButton(btnSubmit);
		this.setResizable(false);
		this.pack();
		this.setLocationRelativeTo(dialog);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) 
	{
		Object source=event.getSource();
		
		if(source==btnSubmit)
		{
			
		}
		else if(source==btnReset)
		{
			txtName.setText("");
		}
		

	}

}

package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Calculateorcontroller implements Initializable {
	@FXML Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
	@FXML Button btnCL,btnEQ,btnPL,btnMI,btnMU,btnDI;
	@FXML Label lblr,lblD;
	String num="";
	int n,x,y,result;
	String op;
	private Calmodel model = new Calmodel();
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
		}
	public void btn0Action(ActionEvent event) {
		n=0;
		makenum(n);
	}
	public void btn1Action(ActionEvent event) {
		n=1;
		makenum(n);
	}
	public void btn2Action(ActionEvent event) {
		n=2;
		makenum(n);
	}
	public void btn3Action(ActionEvent event) {
		n=3;
		makenum(n);
	}
	public void bt4Action(ActionEvent event) {
		n=4;
		makenum(n);
	}
	public void btn5Action(ActionEvent event) {
		n=5;
		makenum(n);
	}
	public void btn6Action(ActionEvent event) {
		n=6;
		makenum(n);
	}
	public void btn7Action(ActionEvent event) {
		n=7;
		makenum(n);
	}
	public void btn8Action(ActionEvent event) {
		n=8;
		makenum(n);
	}
	public void btn9Action(ActionEvent event) {
		n=9;
		makenum(n);
	}
	public void btnEQAction(ActionEvent event) {
		y= Integer.parseInt(lblr.getText());				
		num = lblD.getText();
		
		lblD.setText(num + y + " = ");
	result = model.calculate(op, x, y);

		lblr.setText(Integer.toString(result));
		
		num = lblD.getText();
		lblD.setText(num+result);
		}
	public void btnCLAction(ActionEvent event) {
		lblr.setText("");
		lblD.setText("");
	}
	public void btnDIAction(ActionEvent event) {
		op="/";
		makelog(op);
	}
	public void btnMUAction(ActionEvent event) {
		op="x";
		makelog(op);
	}
	public void btnMIAction(ActionEvent event) {
		op="-";
		makelog(op);
	}
	public void btnPLAction(ActionEvent event) {
		op="+";
		makelog(op);
	}
	public void makenum(int n) {
		num = lblr.getText();
		lblr.setText(num+Integer.toString(n));
	}
	public void makelog(String op) {
		x = Integer.parseInt(lblr.getText());
		lblr.setText("");
		lblD.setText(Integer.toString(x) + " " + op + " ");
	}
	}


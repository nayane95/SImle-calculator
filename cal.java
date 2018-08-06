import java.awt.*;
import java.awt.event.*;

class Calculator extends Frame implements ActionListener{
	
	Button bMC,bMR,bMS,bMpls,bMmin,but,bCE,bC,bpm,bsqrt,b7,b8,b9,bdiv,bpercent,b4,b5,b6,bmul,bX,b1,b2,b3,bmin,beq,bZ,bw,bdeci,bpls,bo;
	TextField tf;
	double fno,sno,ans;
	String op;

	Calculator(){
		setSize(275,350);
		setTitle("Calculator");
		BorderLayout bl=new BorderLayout();
		Panel p1=new Panel();
		Panel p2=new Panel();
		add(p1,bl.NORTH);
		add(p2,bl.CENTER);

		Color c1=new Color(192,192,192);
		setBackground(c1);

		tf=new TextField(30);
		tf.setText("");
		p1.add(tf);
		
	
		p2.setLayout(new GridLayout(6,5,5,5));
		bMC=new Button("MC");
		bMR=new Button("MR");
		bMS=new Button("MS");
		bMpls=new Button("M+");
		bMmin=new Button("M-");
		but=new Button("<--");
		bCE=new Button("CE");
		bC=new Button("C");
		bpm=new Button("+/-");
		bsqrt=new Button("\u221a");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		bdiv=new Button("/");
		bpercent=new Button("%");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		bmul=new Button("*");
		bX=new Button("1/X");
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		bmin=new Button("-");
		beq=new Button("=");
		bZ=new Button("0");
		bw=new Button("");
		bdeci=new Button(".");
		bpls=new Button("+");
		bo=new Button("");


		p2.add(bMC);
		p2.add(bMR);
		p2.add(bMS);
		p2.add(bMpls);
		p2.add(bMmin);
		p2.add(but);
		p2.add(bCE);
		p2.add(bC);
		p2.add(bpm);
		p2.add(bsqrt);
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(bdiv);
		p2.add(bpercent);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(bmul);
		p2.add(bX);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(bmin);		
		p2.add(beq);
		p2.add(bZ);
		p2.add(bw);
		p2.add(bdeci);
		p2.add(bpls);
		p2.add(bo);


		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bdiv.addActionListener(this);
		bpercent.addActionListener(this);
		bmul.addActionListener(this);
		beq.addActionListener(this);
		bmin.addActionListener(this);
		bpls.addActionListener(this);
		bdeci.addActionListener(this);
		bC.addActionListener(this);
		bCE.addActionListener(this);
		bpm.addActionListener(this);
		bsqrt.addActionListener(this);
		bZ.addActionListener(this);
		bpercent.addActionListener(this);

		MenuBar mb=new MenuBar();

		Menu m1=new Menu("View");
		MenuItem mi1=new MenuItem("Scientific");
		MenuItem mi2=new MenuItem("Converter");
		MenuItem mi3=new MenuItem("Exit");
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		mb.add(m1);

		Menu m2=new Menu("Edit");
		MenuItem mi4=new MenuItem("New Calculator");
		MenuItem mi5=new MenuItem("Clear");
		MenuItem mi6=new MenuItem("Color");
		m2.add(mi4);
		m2.add(mi5);
		m2.add(mi6);
		mb.add(m2);

		Menu m3=new Menu("Help");
		MenuItem mi7=new MenuItem("View Help F1");
		MenuItem mi8=new MenuItem("About Calculator");
		m3.add(mi7);
		m3.add(mi8);
		mb.add(m3);

		setMenuBar(mb);

		setVisible(true);

	addWindowListener(new WindowAdapter(){
		
		public void windowClosing(WindowEvent x){
				System.exit(0);

			
		}

	});

	}

	public void actionPerformed(ActionEvent e){
		Object o=e.getSource();
		if(o.equals(b1)){

			tf.setText(tf.getText()+e.getActionCommand());
		}
		else if(o.equals(b2)){

			tf.setText(tf.getText()+e.getActionCommand());
		}
		else if(o.equals(b3)){

			tf.setText(tf.getText()+e.getActionCommand());
		}
		else if(o.equals(b4)){

			tf.setText(tf.getText()+e.getActionCommand());
		}
		else if(o.equals(b5)){

			tf.setText(tf.getText()+e.getActionCommand());
		}
		else if(o.equals(b6)){

			tf.setText(tf.getText()+e.getActionCommand());
		}
		else if(o.equals(b7)){

			tf.setText(tf.getText()+e.getActionCommand());
		}
		else if(o.equals(b8)){

			tf.setText(tf.getText()+e.getActionCommand());
		}
		else if(o.equals(b9)){

			tf.setText(tf.getText()+e.getActionCommand());
		}
		else if(o.equals(bZ)){

			tf.setText(tf.getText()+e.getActionCommand());
		}
		else if(o.equals(bdeci)){
			tf.setText(tf.getText()+e.getActionCommand());
		}
		else if(o.equals(bpls)){
			fno=Double.parseDouble(tf.getText());
			op=e.getActionCommand();
			tf.setText(null);
		}
		else if(o.equals(bmin)){
			fno=Double.parseDouble(tf.getText());
			op=e.getActionCommand();
			tf.setText(null);
		}
		else if(o.equals(bmul)){
			fno=Double.parseDouble(tf.getText());
			op=e.getActionCommand();
			tf.setText(null);
		}
		else if(o.equals(bdiv)){
			fno=Double.parseDouble(tf.getText());
			op=e.getActionCommand();
			tf.setText(null);
		}
		else if(o.equals(bsqrt)){
			fno=Double.parseDouble(tf.getText());
			ans=Math.sqrt(fno);
			tf.setText(""+ans);
		}
		else if(o.equals(bpercent)){
			fno=Double.parseDouble(tf.getText());
			op=e.getActionCommand();
			tf.setText(null);
		}
		else if(o.equals(bC)){
			if (tf.getText().length()>0){
            			int x=tf.getText().length()-1;
           		 	tf.setText(tf.getText().substring(0, x));
          			if(tf.getText().length()==0){
                			tf.setText("0");
            			}     
       			 }
		}
		else if(o.equals(bCE)){
			tf.setText("0");
		}
		else if(o.equals(bpm)){
			double d=Double.parseDouble(tf.getText())*-1;
			tf.setText(""+d);
		}
		
		else if(o.equals(beq)){
			sno=Double.parseDouble(tf.getText());
			if(op.equals("+")){
				ans=fno+sno;
			}
			else if(op.equals("-")){
				ans=fno-sno;
			}
			else if(op.equals("/")){
				ans=fno/sno;
			}
			else if(op.equals("*")){
				ans=fno*sno;
			}
			else if(op.equals("%")){
				ans=fno/sno*100;
			}
			tf.setText(""+ans);
		}
	
	}

}
class TestCal{
	public static void main(String args[]){
	Calculator c=new Calculator();
	
	}

}
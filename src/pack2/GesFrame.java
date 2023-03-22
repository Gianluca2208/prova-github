package pack2;
import javax.swing.*;
import java.awt.*;

public class GesFrame {
JPanel p = new JPanel();
JPanel p2 = new JPanel();
JPanel p3 = new JPanel();
JPanel p4 = new JPanel();
JPanel p5 = new JPanel();

JButton on_off = new JButton("accendi/spegni");
JButton dx = new JButton("freccia dx");
JButton fr = new JButton("frena");
JButton ac = new JButton("accellera");
JButton sx = new JButton("freccia sx");

JLabel light = new JLabel("luci");
ButtonGroup luci = new ButtonGroup();
JRadioButton posizioni = new JRadioButton("posizioni");
JRadioButton anab = new JRadioButton("abbaglianti");
JRadioButton abb = new JRadioButton("abbaglianti");

JLabel source = new JLabel("alimentazione");
String opzioni[] = {"","gasolio", "diesel"};
JComboBox alimentazione = new JComboBox(opzioni);

JLabel vel = new JLabel("velocità");
JLabel cont = new JLabel("0");


	public GesFrame() {
		p.setLayout(new GridLayout(4,1));
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		
		
		p2.setLayout(new GridLayout(1,1));
		p2.add(on_off);
		on_off.setBackground(Color.red);
		
		p3.setLayout(new GridLayout(1,1));
		p3.add(dx);
		p3.add(fr);
		p3.add(ac);
		p3.add(sx);
		
		p4.setLayout(new GridLayout(1,1));
		p4.add(light);
		luci.add(posizioni);
		luci.add(anab);;
		luci.add(abb);
		p4.add(anab);
		p4.add(abb);
		p4.add(posizioni);
		
		p5.setLayout(new GridLayout(2,1));
		p5.add(source);
		p5.add(alimentazione);
		p5.add(vel);
		p5.add(cont);
		
	   this.getContentPane().add(p);
	   this.setSize(1280, 720);
	   this.setVisible(true);
	   this.setTitle(title);
	
	
	}

}

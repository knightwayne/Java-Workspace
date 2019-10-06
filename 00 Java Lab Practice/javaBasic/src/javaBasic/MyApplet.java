package javaBasic;
import java.applet.*;
import java.awt.*;
public class MyApplet extends Applet
{
Label l1 = new Label("Name");
Label l2 = new Label("Course");
Label l3 = new Label("Gender");
Label l4 = new Label("Address");
Label l5 = new Label("Semester");
TextField t1 = new TextField();
List l11 = new List();
Checkbox cb = new Checkbox();
TextArea add = new TextArea();
List l12 = new List();
public void init()
{
setLayout(new GridLayout());
	setBackground(Color.DARK_GRAY);
	setForeground(Color.LIGHT_GRAY);
	//t1.setBounds(100, 10, 40, 10);
add(l1);
add(t1);
add(l2);
add(l11);
add(l3);
add(cb);
add(l4);
add(add);
add(l5);
add(l12);
}

}

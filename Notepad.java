import java.awt.*;
//import java.awt.menushortcut;
//import java.awt.event.keyevent;

public class Notepad extends Frame{
Notepad() 
{
setLayout(null);
setVisible(true);
setTitle("Notepad");

TextArea ta=new TextArea("");
add(ta);
ta.setBounds(10,40,1920,960);

MenuBar mb=new MenuBar();
setMenuBar(mb);

Menu m1=new Menu("  File  ");
Menu m2=new Menu("   Edit   ");
Menu m3=new Menu("   View   ");

mb.add(m1);
mb.add(m2);
mb.add(m3);

MenuItem mi1=new MenuItem(" New                        Ctrl+N");
MenuItem mi2=new MenuItem(" New Window         Ctrl+Shift+N");
MenuItem mi3=new MenuItem(" Open                       Ctrl+O");
MenuItem mi4=new MenuItem(" Save                        Ctrl+S");
MenuItem mi5=new MenuItem(" Save as                   Ctrl+Shift+S");
MenuItem mi6=new MenuItem(" Page setup");
MenuItem mi7=new MenuItem(" Print                        Ctrl+P");
MenuItem mi8=new MenuItem(" Exit");

m1.add(mi1);
m1.add(mi2);
m1.add(mi3);
m1.add(mi4);
m1.add(mi5);
m1.add(mi6);
m1.add(mi7);
m1.add(mi8);

MenuItem mi9=new MenuItem(" Undo                     Ctrl+Z");
MenuItem mi10=new MenuItem("Cut                      Ctrl+X");
MenuItem mi11=new MenuItem("Copy                    Ctrl+C");
MenuItem mi12=new MenuItem("Paste                    Ctrl+V");
MenuItem mi13=new MenuItem("Delete                  Del");
MenuItem mi14=new MenuItem("Find                     Ctrl+F");
MenuItem mi15=new MenuItem("Find Next            F3");
MenuItem mi16=new MenuItem("Find Previous     Shift+F3");
MenuItem mi17=new MenuItem("Replace               Ctrl+H");
MenuItem mi18=new MenuItem("Go to                   Ctrl+G");
MenuItem mi19=new MenuItem("Select all             Ctrl+A");
MenuItem mi20=new MenuItem("Time/Date           F5");
MenuItem mi21=new MenuItem("Font");

m2.add(mi9);
m2.add(mi10);
m2.add(mi11);
m2.add(mi12);
m2.add(mi13);
m2.add(mi14);
m2.add(mi15);
m2.add(mi16);
m2.add(mi17);
m2.add(mi18);
m2.add(mi19);
m2.add(mi20);
m2.add(mi21);

MenuItem mi22=new MenuItem("Zoom");
MenuItem mi23=new MenuItem("Status bar");
MenuItem mi24=new MenuItem("Word wrap");

m3.add(mi22);
m3.add(mi23);
m3.add(mi24);

Choice ch1=new Choice();
ch1.add("Zoom in");
ch1.add("Zoom out");
ch1.add("Restore default zoom");

Font f1=new Font("Arial",Font.BOLD,18);
m1.setFont(f1);
m2.setFont(f1);
m3.setFont(f1);
}

public static void main(String args[])
{
Notepad n=new Notepad();
}
}

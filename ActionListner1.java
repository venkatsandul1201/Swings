import javax . swing . * ;
import java . awt . event . * ;
import java . awt . * ;
class Action1 extends JPanel { int 
count = 0;
JLabel label = new JLabel ( "0" , JLabel .CENTER) ;
public Action1 () {
JButton inc = new JButton ( "+" ) ; 
JButton dec = new JButton ( "−" ) ;
inc . addActionListener (new IncListener ( ) ) ; dec . 
addActionListener (new DecListener ( ) ) ; this . 
setLayout(new BorderLayout ( ) ) ;
this . add( inc , BorderLayout .LINE_START) ;
this . add( label ) ;
this . add(dec, BorderLayout .LINE_END) ;
}
class IncListener implements ActionListener { public void 
actionPerformed(ActionEvent e) {
label . setText ( "" + (++count ) ) ;
}
}
class DecListener implements ActionListener { public 
void actionPerformed(ActionEvent e) {
label . setText ( "" + (−−count ) ) ;
}
}
public static void main( String args [ ] ) { JFrame . 
setDefaultLookAndFeelDecorated( true ) ; JFrame 
frame = new JFrame( "Inc /Dec" ) ;
JPanel panel = new Action1 ( ) ; frame . 
setDefaultCloseOperation (
JFrame .EXIT_ON_CLOSE) ;
frame . getContentPane ( ) . add(panel ) ; 
frame . pack ( ) ;
frame . setVisible ( true ) ;
}
}
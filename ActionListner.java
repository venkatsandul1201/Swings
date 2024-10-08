import javax . swing . * ;
import java . awt . event . * ;
import java . awt . * ;
class Action2 extends JPanel { int 
count = 0;
JLabel label = new JLabel ( "0" , JLabel .CENTER) ;
public Action2 () {
JButton inc = new JButton ( "+" ) ; 
JButton dec = new JButton ( "−" ) ;
ActionListener al = new IncDecListener ( ) ; inc . 
setActionCommand( "inc" ) ;
inc . addActionListener ( al ) ;
dec . setActionCommand( "dec" ) ;
dec . addActionListener ( al ) ;
this . setLayout(new BorderLayout ( ) ) ;
this . add( inc , BorderLayout .LINE_START) ;
this . add( label ) ;
this . add(dec, BorderLayout .LINE_END) ;
}
class IncDecListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
String s = e .getActionCommand ( ) ;
i f (s . equals( "inc" )) {
count++;
} else i f (s . equals( "dec" ))
{
count−−;
}
label . setText ( "" + count ) ;
}
}
public static void main( String
args [ ] ) {
JFrame . setDefaultLookAndFeelDecorated( true ) ;
JFrame frame = new JFrame( "Inc /Dec" ) ;
JPanel panel = new Action2 ( ) ;
frame . setDefaultCloseOperation (
JFrame .EXIT_ON_CLOSE) ;
frame . getContentPane ( ) . add(panel ) ;
frame . pack ( ) ;
frame . setVisible ( true ) ;
}
}
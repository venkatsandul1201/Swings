import javax . swing . * ;
class ShowPanel {
public static void main( String args [ ] ) {
JFrame frame = new JFrame( "ShowJPanel" ) ;
JPanel panel = new JPanel ( ) ;
JLabel label = new JLabel (
"This is a label with some text in i t . " ) ;
JButton button = new JButton ( "Click Me" ) ;
panel . add( label ) ;
panel . add(button ) ;
frame . getContentPane ( ) . add(panel ) ; 
frame . pack ( ) ;
frame . setVisible ( true ) ;
}
}
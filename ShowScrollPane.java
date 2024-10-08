import javax . swing . * ;
class ShowScrollPane {
public static void main( String args [ ] ) {
JFrame frame = new JFrame( "ShowScrollPane" ) ;
JPanel panel = new JPanel ( ) ;
JLabel label = new JLabel (
"This is a label with some text in i t . " ) ;
JButton button = new JButton ( "Click Me" ) ;
panel . add( label ) ; 
panel . add(button ) ;
JScrollPane sp = new JScrollPane (panel ) ; frame 
. getContentPane ( ) . add(sp ) ;
frame . pack ( ) ;
frame . setVisible ( true ) ;
}
}
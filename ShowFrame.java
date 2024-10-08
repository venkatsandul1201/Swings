import javax . swing . * ;
class ShowFrame {
public static void main( String args [ ] ) {
JFrame frame = new JFrame( "ShowJFrame" ) ;
frame . setDefaultCloseOperation (JFrame .EXIT_ON_CLOSE) ; 
JLabel label = new JLabel ( "This is a label " ) ;
frame . getContentPane ( ) . add( label ) ; 
frame . pack ( ) ;
frame . setVisible ( true ) ;
}
}

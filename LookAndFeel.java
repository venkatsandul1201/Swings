import javax . swing . * ;
class LookAndFeel {
public static void main( String args [ ] ) {
try {
UIManager. setLookAndFeel( "com. sun . java . swing . plaf . gtk .GTKLookAndFeel" ) ;
} catch (Exception e) {
e . printStackTrace ( ) ;
}
JFrame frame = new JFrame( "Metal" ) ;
JPanel rootPanel = new JPanel ( ) ;
JPanel panel1 = new JPanel ( ) ;
panel1 . add(new JButton ( "Button" ) ) ;
panel1 . add(new JLabel ( "Label" ) ) ;
panel1 . add(new JTextArea( "Text Area" ) ) ;
JPanel panel2 = new JPanel ( ) ;
panel2 . add(new JCheckBox( "Check" ) ) ;
panel2 . add(new JRadioButton( "Option" ) ) ;
rootPanel . add(panel1 ) ;
rootPanel . add(panel2 ) ;
frame . setDefaultCloseOperation (JFrame .EXIT_ON_CLOSE) ; 
frame . getContentPane ( ) . add( rootPanel ) ;
frame . pack ( ) ;
frame . setVisible ( true ) ;
}
}
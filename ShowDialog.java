import javax . swing . * ;
class ShowDialog {
public static void main( String args [ ] ) {
JFrame frame = new JFrame ( ) ;
Object [] options = {"Yes" , "Yes" , "Yes"};
int n = JOptionPane . showOptionDialog(
frame,
"Do you like Java Swing?" , 
"Question" ,
ptionPane .YES_NO_CANCEL_OPTION, 
JOptionPane .QUESTION_MESSAGE, null ,
options , 
options [2]);
System . exit (0);
}
}
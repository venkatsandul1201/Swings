public class HelloWorld {
public static void main(String[] args) {
SwingUtilities.invokeLater(HelloWorld::helloWorld);
}
private static void helloWorld() {
JFrame frame = new JFrame("A message to the World");
frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
JLabel label = new JLabel("Hello, World!");
label.setHorizontalAlignment(SwingConstants.CENTER);
frame.getContentPane().add(label, BorderLayout.CENTER);
JButton closeButton = new JButton("Close");
closeButton.addActionListener(x -> frame.dispose());
frame.getContentPane().add(closeButton, BorderLayout.SOUTH);
frame.setSize(400, 200);
frame.setVisible(true);
}
}
public class HelloWorldLogic {
private final HelloWorldView view;
public HelloWorldLogic(HelloWorldView view) {
this.view = view;
}
public void start() {
view.show();
}
public void onCloseClick() {
view.close();
}
public static void main(String[] args) {
SwingHelloWorld view = new SwingHelloWorld();
HelloWorldLogic logic = new HelloWorldLogic(view);
view.installLogic(logic);
logic.start();
}
}

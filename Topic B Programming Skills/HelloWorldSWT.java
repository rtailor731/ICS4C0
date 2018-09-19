import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class SWTHelloWorld {

private static ResourceBundle resHello = ResourceBundle.getBundle("examples_helloworld"); 
 
 public static void main(String[] args) { 
  Display display = new Display(); 
  Shell shell = new HelloWorld2().open(display); 
  while (!shell.isDisposed()) 
   if (!display.readAndDispatch()) 
    display.sleep(); 
  display.dispose(); 
 } 
 
 public Shell open(Display display) { 
  Shell shell = new Shell(display); 
  shell.setLayout(new FillLayout()); 
  Label label = new Label(shell, SWT.CENTER); 
  label.setText(HelloWorld2.resHello.getString("Hello_world")); 
  shell.pack(); 
  shell.open(); 
  return shell; 
 } 
}

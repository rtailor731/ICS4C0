package org.eclipse.swt.examples.helloworld; 
 
import java.util.ResourceBundle; 
 
import org.eclipse.swt.SWT; 
import org.eclipse.swt.layout.FillLayout; 
import org.eclipse.swt.widgets.Display; 
import org.eclipse.swt.widgets.Label; 
import org.eclipse.swt.widgets.Shell; 
 
/*
 * This example builds on HelloWorld2 and demonstrates how to resize the Label when the Shell resizes using a Layout. 
 */ 
public class HelloWorld2 { 
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

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class inputWay {
    
    public static void main(String[] arg)throws IOException{
          
        //via console
        /*String str= System.console().readLine("enter");
        System.out.println(str);
        */

        //via GUI
        /*String strr= JOptionPane.showInputDialog("enter");
        JOptionPane.showMessageDialog( null,strr);
       // JOptionPane.showMessageDialog(null, str, strr,0);
       JOptionPane.showMessageDialog(null, strr.replaceAll(" ", "\n"));
       */

       //via File
       /*for(String str: Files.readAllLines(Paths.get("inputWa.txt")))
       System.out.println(str);
       */
      

    } 
}

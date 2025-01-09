import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class inputWay {
    
    public static void main(String[] arg)throws IOException{
        //via scanner class
        /*Scanner cc= new Scanner(System.in);
        int a= cc.nextInt();
        //for string (next() or nextLine())
        System.out.println(a);  
        */
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

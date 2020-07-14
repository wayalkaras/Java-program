/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmnet;
import java.io.*;
import java.util.*;
/**
 *
 * @author Acer
 */
public class assignment {
    public static void main(String[] args)   
{  
  
String line = "";  
String splitBy = ",";  
try   
{ 
    
    
BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Acer\\Downloads\\Javaproject.csv"));  

double cost=0;
int hours=0;



int i=0;
while ((line = br.readLine()) != null)   
{  
    String[] project = line.split(splitBy);   
    if(line.contains("\""))
    {
         StringBuffer temp_line=new StringBuffer(""+line);
       project[8] =temp_line.substring(temp_line.indexOf("\"")+1,temp_line.lastIndexOf("\""));
    }
    
  
  if(i>=2)
   {
       System.out.println(project[0] + "\t \t \t" + project[1] + "\t \t \t \t" + project[2] + "\t \t \t \t" + project[8] + "\t \t \t \t" + project[10]);  
     cost+=Double.parseDouble(project[8].replace('$', ' ').trim());
     hours+=Integer.parseInt(project[10].trim());
   }
   
   else
      {
        
              System.out.println(project[0] + "\t \t \t \t" + project[1] + "\t \t \t" + project[2] + "\t \t \t" + project[8] + "\t \t \t" + project[10]); 
       }
   i++;
} 

System.out.println("\n\nTotal cost = $"+cost+"\t \t  Actual hours="+hours);



}   
catch (IOException e)   
{  
e.printStackTrace();  
}

}  
}



 
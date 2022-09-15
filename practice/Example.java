
//  example of Encaputation 

import java.util.Scanner;
class MyDetails{
  private String name;
  private int rollNo;

  public void setDetail(int rollNo,String name){
    this.name = name;
    this.rollNo = rollNo;
  }

  public String getName(){
    return(name); 
  }

  public int getRollNo(){
    return(rollNo); 
  }
}

public class Example{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);     
    MyDetails md = new MyDetails();
     String name;
     int  rollNo;
     System.out.println("Enter the name");
     name = sc.next();
     System.out.println("Enter the Roll No");
     rollNo = sc.nextInt();
     md.setDetail(rollNo,name);
     System.out.println(md.getName());
     System.out.println(md.getRollNo());
    //  System.out.println(md.name);
  
    }
}
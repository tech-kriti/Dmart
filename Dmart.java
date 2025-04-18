import java.util.*;
class Dmart{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("Welcome to Dmart");

  Date d1 = new Date();
 System.out.println("Enter your name:");
 String name = sc.nextLine();
 System.out.println("Customer Name: " +name+"               Date;" +d1 );
    
  System.out.println("item name 1:");
  String i_name1= sc.next();
  System.out.println("quantity ");
  int q1 = sc.nextInt();
  int cost1 = 10;
  System.out.println("price " +cost1);
  double total = q1*cost1;
  System.out.println("total" +total);
  double t = 0;
  
  if (q1>4){
          t =(total-((total*5)/100));
      System.out.println(" After discount : " +t);
      }
  else{
     System.out.println(total);}
     
  System.out.println("item name 2:");
  String i_name2= sc.next();
  System.out.println("quantity :");
  int q2 = sc.nextInt();
  int cost2 = 20;
  System.out.println("price : "+cost2);
  int total1 = q2*cost2;
  System.out.println("total" +total1);
  
   System.out.println("item name 3: ");
  String i_name3= sc.next();
  System.out.println("quantity : ");
  int q3 = sc.nextInt();
  int cost3 = 30;
  System.out.println("price "+cost3);
  int total2 = q3*cost3;
  System.out.println("total : " +total2);
  
 
   System.out.println(" item name 4:");
  String i_name4= sc.next();
  System.out.println("quantity : ");
  int q4 = sc.nextInt();
  int cost4 = 40;
  System.out.println("price : "+cost4);
  int total3 = q4*cost4;
  System.out.println("total : " +total3);
  
   System.out.println("item name 5:");
  String i_name5= sc.next();
  System.out.println("quantity : ");
  int q5 = sc.nextInt();
  int cost5 = 50;
  System.out.println("price : "+cost5);
  int total4 = q5*cost5;
  System.out.println("total" +total4);
  double aff_dis = total4-((total4*10)/100);
  System.out.println("After discount : "+aff_dis);
  
   System.out.println("item name 6:");
  String i_name6= sc.next();
  System.out.println("quantity : ");
  int q6 = sc.nextInt();
  int cost6 = 60;
  System.out.println("price : "+cost6);
  int total5 = q6*cost6;
  System.out.println("total : " +total5);
  
  System.out.println("item name 7:");
  String i_name7= sc.next();
  System.out.println("quantity : ");
  int q7 = sc.nextInt();
  int cost7 = 70;
  System.out.println("price : "+cost7);
  int total6 = q7*cost7;
  System.out.println("total" +total6);
  
   System.out.println("item name 8:");
  String i_name8= sc.next();
  System.out.println("quantity : ");
  int q8 = sc.nextInt();
  int cost8 = 80;
  System.out.println("price : "+cost8);
  int total7 = q8*cost8;
  System.out.println("total" +total7);
  
   System.out.println("item name 9:");
  String i_name9= sc.next();
  System.out.println("quantity : ");
  int q9 = sc.nextInt();
  int cost9 = 90;
  System.out.println("price : " +cost9);
  int total8 = q9*cost9;
  System.out.println("total" +total8);
  
   System.out.println("Enter item name 10:");
  String i_name10= sc.next();
  System.out.println("quantity : ");
  int q10 = sc.nextInt();
  int cost10 = 100;
  System.out.println("price : " +cost10);
  int total9 = q10*cost10;
  System.out.println("total" +total9);
  
  double aff_dis2 = total9-((total9*15)/100);
  System.out.println("After discount : "+aff_dis2);
  
  double total_bill = total+total1+total2+total3+total4+total5+total6+total7+total8+total9;
  System.out.println("total bill : " +total_bill);
  
  double aft_d = total+total2+total3+aff_dis+total5+total6+total7+total8+aff_dis2;

  System.out.println("After discount: " +aft_d);
  if (aft_d>10000){
      aft_d = aft_d-((aft_d*15)/100);
      System.out.println("After 15% discount bill to paid : " +aft_d);
     }
     
  else if(aft_d>5000&&aft_d<=10000){
      aft_d = aft_d-((aft_d*10)/100);
    System.out.println("After 10% discount bill to paid : " +aft_d);
    }
   else {
     System.out.println("total bill to paid : " +aft_d);}
    double gst = (aft_d*10)/100;
    System.out.println(gst);
    double total_amt = gst+aft_d;
    System.out.println("ammount: "+total_amt);

   System.out.print("you want carry beg: ");
   char carry = sc.next().charAt(0);
   if(carry=='y'||carry=='Y'){
      double d = total_amt+10;
      System.out.println(d);}
    else if (carry=='n'||carry=='N'){
      System.out.println(total_amt);}
     else {
      System.out.println("enter valid choice");
      }
   
     System.out.print("Gender:");
  char gen = sc.next().charAt(0);
  
  if(gen=='f'||gen=='F'){
      String gift ="cadeburry";
     System.out.println("gift:"+gift);
          }
   else if (gen=='m'||gen=='M'){
          String gift ="leather wallet";
     System.out.println("gift:"+gift);
   } 
  else {
    System.out.println("ivalid choice");}

  System.out.println("                  Welcom to Dmart                ");
   System.out.println("Customer Name: " +name+"               Date;" +d1 );
  
  




  System.out.println("----------------------------------------------------------------------------------");
  
   System.out.printf("%-15s %-15s %-15s %-15s %15s\n","item","quantity","Price","total","after Discount");
 
   System.out.printf("%-15s %-15d %-15d %-15.2f %-15.2f\n",i_name1,q1,cost1,total,t);
  System.out.printf("%-15s %-15d %-15d %-15d %-15d\n",i_name2,q2,cost2,total1,total1);
  System.out.printf("%-15s %-15d %-15d %-15d %-15d\n",i_name3,q3,cost3,total2,total2);
  System.out.printf("%-15s %-15d %-15d %-15d %-15d\n",i_name4,q4,cost4,total3,total3);
  System.out.printf("%-15s %-15d %-15d %-15d %-15.2f\n",i_name5,q5,cost5,total4,aff_dis);
  System.out.printf("%-15s %-15d %-15d %-15d %-15d\n",i_name6,q6,cost6,total5,total5);
  System.out.printf("%-15s %-15d %-15d %-15d %-15d\n",i_name7,q7,cost7,total6,total6);
  System.out.printf("%-15s %-15d %-15d %-15d %-15d\n",i_name8,q8,cost8,total7,total7);
  System.out.printf("%-15s %-15d %-15d %-15d %-15d\n",i_name9,q9,cost9,total8,total8);
  System.out.printf("%-15s %-15d %-15d %-15d %-15.2f\n",i_name10,q10,cost10,total9,aff_dis2);
  System.out.println("----------------------------------------------------------------------------------");
  System.out.printf("\t\t\t\t\t\tA.p\t\tD.p\n");
  System.out.printf("\t\t\t\t\t\t%.2f\t\t%.2f\n",total_bill,aft_d);
  if(gen=='f'||gen=='F'){
      System.out.println("Gift:-cadeburry\t\t\t\t\t0.00\t\t0.00");}
  else if(gen=='m'||gen=='M'){
      System.out.println("Gift:-lather beg\t\t\t\t0.00\t\t0.00");}
    else{System.out.println("press validchoice");}
   if(carry=='y'||carry=='Y'){
      System.out.println("carry beg:-yes\t\t\t\t\t10.00\t\t10.00");}
   else if(carry=='n'||carry=='N'){
        System.out.println("carry beg:-no\t\t\t\t\t0.00\t\t0.00");}
    else{}
  System.out.printf("GST(10%%):\t\t\t\t\t%.2f\t\t%.2f\n",gst,gst);
  System.out.println("----------------------------------------------------------------------------------");
  System.out.printf("\t\t\t\t\t\t%.2f\t\t%.2f\n",total_bill+gst,aft_d+gst);
  System.out.println("                              Thankyou      ");
   System.out.println("                             To visit     ");
   System.out.println("                               Dmart     ");
    System.out.println("----------------------------------------------------------------------------------");
  }
 }

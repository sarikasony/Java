import java.util.Scanner;


public class contactList {
String name;
int[] phone;
static contactList[] c=new contactList[50];
   public contactList(String n,int[] p){
       phone=new int[p.length];
       System.arraycopy( p, 0, phone, 0, p.length );
       name=n.toLowerCase();
   }
   public static void main(String[] args) {
       int count=0;
       int opt=0;
       while(opt!=5){
       System.out.println("Enter the option you want perform:");
       System.out.println("1.Add a contact");
       System.out.println("2.Delete a contact");
       System.out.println("3.print all contacts");
       System.out.println("4.search a contact");
       System.out.println("5.exit");
       Scanner s=new Scanner(System.in);
       opt=s.nextInt();
       switch(opt){
       case 1:
          
           Acontact(count);
           count++;
           break;
       case 2:
           Dcontact(count);
           break;
       case 3:
           Pcontact(count);
           break;
       case 4:
           Scontact(count);
           break;
       default:
           System.out.println("Exiting byeeeee");
       }
       }
   }
   private static void Acontact(int n) {
       System.out.println("enter name:");
       Scanner s=new Scanner(System.in);
       String name=s.next();
       System.out.println("enter number of phone numbers:");
       int no=s.nextInt();
       int[] phn=new int[no];
       System.out.println("enter phone numbers:");
       for(int i=0;i<no;i++){
           phn[i]=s.nextInt();
       }
       c[n]=new contactList(name,phn);
      
   }
   private static void Dcontact(int n) {
       if(n==0){
           System.out.println("No contacts:");
       }
       else{
       System.out.println("enter name you want to delete:");
       Scanner s=new Scanner(System.in);
       String name=s.next();
       name=name.toLowerCase();
       for(int i=0;i<n;i++){
           if(c[i].name.equals(name)){
               c[i]=null;
           }
                  
       }
       }
   }
   private static void Pcontact(int n) {
       if(n==0){
           System.out.println("No contacts:");
       }
       else{
       System.out.println("enter name you want to print:");
       Scanner s=new Scanner(System.in);
       String name=s.next();
       name=name.toLowerCase();
       for(int i=0;i<n;i++){
          
               System.out.println("Name:"+name);
               System.out.println("Phone numbers:");
               for(int j=0;j<c[i].phone.length;j++){
                   System.out.println(c[i].phone[j]);
               }
          
                  
       }
       }
      
   }
   private static void Scontact(int n) {
       if(n==0){
           System.out.println("No contacts:");
       }
       else{
       System.out.println("enter name you want to search:");
       Scanner s=new Scanner(System.in);
       String name=s.next();
       name=name.toLowerCase();
       for(int i=0;i<n;i++){
           if(c[i].name.equals(name)){
               System.out.println("Name:"+name);
               System.out.println("Phone numbers:");
               for(int j=0;j<c[i].phone.length;j++){
                   System.out.println(c[i].phone[j]);
               }
           }
                  
       }
      
       }
   }

}
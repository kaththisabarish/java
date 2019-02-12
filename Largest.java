import java.util.Scanner; 
class Largest
{ 
public static void main(String[] args) 
{ 
int a,b,c; 
Scanner s=new Scanner(System.in);  
System.out.println("Enter the values:");
a=s.nextInt(); 
b=s.nextInt(); 
c=s.nextInt(); 
if(a>=b && a>=c) 
{ 
System.out.println(+a); 
} 
if(b>=a && b>=c) 
{ 
System.out.println(+b); 
} 
if(c>=a && c>=b) 
{ 
System.out.println(+c); 
} } }
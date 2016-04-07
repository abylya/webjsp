package ru.com.klinika;


import java.util.Scanner;

public class VodVivod {
	 Scanner sc=new Scanner(System.in);
	 
	 public int printMenu(String st){
		 int a=0;
		 int it=0;
		 String s;
		 boolean b=true;
		while(b){ 
			
	 System.out.println("Ведите номер "+st);
	  s=sc.next();
	 char[]chArr=s.toCharArray();
	 for(char ch:chArr) {
		 if(!(Character.isDigit(ch))){
			 it++;
			 System.out.println("Неправильный ввод >"+ch); break;
		 }
		 	
	 }
	 if(it==0){
		 a=Integer.valueOf(s);
		 b=false;
	 }
		}
		return a;
	 }
	 
	
	
	//------------------------------------------------

	
//--------------------------------------------------------------------------	
	
public String addNabrPasport() {
		
		boolean b=true;
	String s="";
	
			while (b) {
				int p=0;
	
				s=addString("pervie dve bykvi pasporta");
				s= s.toUpperCase(); 
				 int a=s.length();    	
			    	  if(a!=2){
			    		  p++;
			    		  System.out.println("STOP: dve bykvi");
			    	  }		      
			       if(p==0){
			    	   b=false;}		      
			}
			
		 b=true;	
			while (b) {
				
				 System.out.println("Vedite  4 zifri");
				int p=0;
				
				String sn=sc.next(); 
			
				 char[] chArr = sn.toCharArray();
				 
			       for(char i:chArr){
			    	  if (!(Character.isDigit(i))){  
			    		   p++;
			    		  
			    	   System.out.println("Неправильный ввод > "+i+"-");break;
			    	  
			       } 
			    	  if(chArr.length!=4){
			    		  p++;
			    		  System.out.println("STOP: 4 zifri");break;
			    	  }
			      
			       }if(p==0){
			    	  s= s.concat(sn);	    	
	    	          b=false;
	    	          }	       		      
			}			
		return s;
	}

//-------------------------------------------------------------

public  String addString(String nm) {
	
	String s="";
	boolean b=true;
	
		while (b) {
		
		 System.out.println("Vedite "+nm);
		int p=0;
		 s=sc.next();
	
		 char[] chArr = s.toCharArray();
		 
	       for(char i:chArr){
	    	  if (!(Character.isLetter(i))){
	    		  p++;
	    	   System.out.println("Неправильный ввод >"+i+"-");}
	       }
	       if(p==0)b=false;
		}

	return s;
}

//-------------------------------------------------------------------------




}

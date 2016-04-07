package ru.com.klinika;

public class App 
{

    public static void main( String[] args )
    {
    	ClinikRobota kl=new ClinikRobota();
    	VodVivod v=new VodVivod();
    	
    	boolean b=true;
    	while(b){
    		Minu.minu();
    		int n=v.printMenu("из меню");
    		if(n>0&&n<10){
    		switch(n){
    		case 1:
    			if(ClinikRobota.cpicok.isEmpty()){
    				System.out.println("Список пуст");break;
    			}else{
    			System.out.println(ClinikRobota.cpicok);
    			break;}
    		case 2:
    			kl.addKlient();
    			break;
    		case 3:
    			kl.removeKlient();
    			break;
            case 4:
            	 System.out.println(kl.getKlient());
            	 break;
            case 5:
            	System.out.println(kl.getJivotnoe());
            	break;
            case 6:
            	kl.lechenie();
            	break;
            case 7:	
            	kl.removeJivotnoe();
            	break;
            case 8:
            	kl.redactor();break;
            case 9:
            	b=false;break;
    		}
    		
    		}else{
    			System.out.println("Неправилный ввод >"+n);
    				
    			
    		}
    	}
    
   		
    }
}

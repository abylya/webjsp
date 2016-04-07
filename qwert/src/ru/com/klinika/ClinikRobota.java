package ru.com.klinika;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ClinikRobota {
public final static	List<Klient> cpicok=new LinkedList<Klient>();
VodVivod v=new VodVivod();
Scanner sc=new Scanner(System.in);


public void addKlient(){
	boolean b=true;
	
	while (b) {
		String imya=v.addString("imya klienta");
		String pasport=v.addNabrPasport();
		cpicok.add(new Klient(imya,pasport,addJivotnoe()));
		System.out.println("Vixod najat- 'X'\n prodoljitn zapic klienta 'Z'");
		String s=sc.next();
		if(s.equals("x")||s.equals("X")||s.equals("Х")||s.equals("х")){b=false;}
				
	}
	
}
// -------------------------------------------------------------
private List<Jivotnie> addJivotnoe(){
	boolean d=true;
	final  List<Jivotnie>pit=new ArrayList<Jivotnie>();
	
	
	while (d) {
		 String vid=v.addString("vid pitomza");
		String klichka=v.addString("klichky pitomza");
	     Jivotnie p=new Jivotnie(vid,klichka,false);
	     
	     pit.add(p);
	     System.out.println("Vixod najat- 'X'-\n prodoljit zapic pitomzev 'Z'");
	     String s=sc.next();
		if(s.equals("x")||s.equals("X")||s.equals("Х")||s.equals("х")){d=false;}
	}
	  
	return pit;	
}
	//--------------------------------------------------------------

public Jivotnie getJivotnoe(){
	Jivotnie j=null;
	boolean b=true;
	int n=0;
	while(b){
	n=v.printMenu("для выбора поиска\n 1-по номеру в очереди \n 2-по имени клиента и клички "
			+ "питомца");
	switch (n) {
	case 1:
		int ocher=v.printMenu("из очереди");
		j= getJivotnoe(ocher);
		b=false;
		break;
	case 2:
		String si=v.addString("imya klienta");
    	String sk=v.addString("klichky pitomza");
    	j= getJivotnoe(si,sk);
    	b=false;
		break;
	default:
		System.out.println("Неправильный ввод >"+n);
		break;
	}
	
		
	}
	return j;
}


//---------------------------------------------------
private Jivotnie getJivotnoe(int i){
	Jivotnie pit=null;
	if(cpicok.isEmpty()){
		System.out.println("Список пуст");
	}else{		
		try{
		
           if(i>cpicok.size()){
	          throw new Exception("вышли за пределы списка");
       }
           if(cpicok.get(i-1).getPitomez().isEmpty()){
      			throw new	IndexOutOfBoundsException("Нет питомцев");
      		}else{
      			String s;
      			if(cpicok.get(i-1).getPitomez().size()>1){
           boolean b=true;
           while (b) {
           System.out.println(cpicok.get(i-1));
           
            s=v.addString("klichky pitomza");
           int n=0;
        for(Jivotnie g:cpicok.get(i-1).getPitomez()){		
        	if(g.getKlichka().equals(s)){
        		pit=g;b=false;
        		n++;
        	}
        	}
        if(n==0){
        System.out.println("В списке нет такого питомца");
        }
        }
   		   
        }else{
        	s=v.addString("klichky pitomza");
        if(cpicok.get(i-1).getPitomez().get(0).getKlichka().equals(s)){
        	pit=cpicok.get(i-1).getPitomez().get(0);
        }else{
        	System.out.println("В списке нет такого питомца");
        }
      			}
      		
      		}
	}catch(IndexOutOfBoundsException e){
		System.out.println(e.getMessage());
		}
	catch(Exception e){
		System.out.println(e.getMessage());
		}
	}
	return pit;
	
}
//-------------------------------------------------------
private Jivotnie getJivotnoe(String i,String k){
	Jivotnie pit=null;
	
	if(!(cpicok.isEmpty())){
		int itr=0;
		for(Klient ki:cpicok){
			if(ki.getImya().equals(i)){
				itr++;
				if(ki.getPitomez().isEmpty()){
					int it=0;
				for(Jivotnie j:ki.getPitomez()){				
					if(j.getKlichka().equals(k)){
						pit=j;
						it++;
					}
				}
				if(it==0){
					System.out.println("нет токого питомца");
				}
				}else{
					System.out.println("список питомцев пуст");
			}
				}
		}if(itr==0){
			System.out.println("нет токого клиента");
		}
	}else{
		System.out.println("список  пуст");
	}
	return pit;
}
//------------------------------------------------------


public	void lechenie(){
	Jivotnie j=getJivotnoe();
	
	try{
		if(j==null){
			throw new	IndexOutOfBoundsException();
		}
					
			if(j.isZdorovie()==true){
				System.out.println("Ваш питомец здоров");
			}else{

				j.setZdorovie(true);
			}
		}catch(IndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
	}
		

//-----------------------------------------------------
public Klient getKlient(){
	Klient kl=null;
	if(cpicok.isEmpty()){
		System.out.println("Список пуст");
	}else{
		System.out.println(cpicok);
	String s=v.addString("imya klienta");
	String sp=v.addNabrPasport();
	int p=0;
	for(Klient k:cpicok){
		
		if(k.getImya().equals(s)&&k.getPasport().equals(sp)){
			 kl=k;
			 p++;
		}		
	}
	if(p==0){
		System.out.println("В списке нет такова клиента");
	}
	}
	
	return kl;
}

//--------------------------------------------------------	
	
	public void removeKlient(){
		Klient k= getKlient();
		if(k!=null){
	cpicok.remove(k);
		}
	}
	//------------------------------------------------------------------
	
	public void removeJivotnoe(){
		System.out.println(cpicok);
		Jivotnie j=getJivotnoe();
			if(j!=null){
			for(Klient k:cpicok){
				for(Jivotnie jiv:k.getPitomez()){
					if(jiv.equals(j)){
						k.getPitomez().remove(jiv);
					}
				}
			}
			}
	}
	//----------------------------------------------------------
	public void redactor(){
		Klient kl=getKlient();
		if(kl!=null){
			boolean b=true;
			String s;
			Jivotnie j=null;
			while(b){
			Minu.minuredactor();
			int n=v.printMenu("номер из меню");
			if(n>0&&n<6){
			switch(n){
			case 1:
				s=v.addString("новое имя клиента");
				kl.setImya(s);break;
			case 2:
				s=v.addNabrPasport();
				kl.setPasport(s);break;
			case 3:
				 j=getPitomezs(kl);
				if(j!=null){
				 s=v.addString("новую кличку");
				 j.setKlichka(s);
				}break;
			case 4:
				 j=getPitomezs(kl);
				if(j!=null){
				 s=v.addString("название породы");
				 j.setVid(s);
				}break;
			case 5:
				b=false;break;
			}
			}else{
				System.out.println("неправильный ввод"+n);
			}
			}
		}
	}
	// ---------------------------------------------------------------
	private Jivotnie getPitomezs(Klient k){
		Jivotnie j=null;
		if(k.getPitomez().isEmpty()){
			String s=v.addString("кличку питомца для редактирования");
			for(Jivotnie jivotnie:k.getPitomez()){
				if(jivotnie.getKlichka().equals(s)){
					j=jivotnie;
				}
			}
		}else{
			System.out.println("у клиента нет животных");
		}
		
		return j;
		
	}
	}



import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{   
	    Scanner ler = new Scanner(System.in);
	    
	    int opcao;
	    
	    
		System.out.println("**** Escolha uma Estação ****");
		System.out.println("1-Verão");
		System.out.println("2-Outono");
		System.out.println("3-Primavera");
		System.out.println("4-Inverno");
		opcao=ler.nextInt();
		
		switch(opcao)
		{
		 case 1:
		     System.out.println("Verão");
		     break;
		 case 2:
		     System.out.println("Outono");
		     break;
		 case 3:
		     System.out.println("Primavera");
		     break;
		 case 4:
		     System.out.println("Inverno");
		     break;
		 default:
		     System.out.print("Invalido");
		     break;
		}
		  
	}
}

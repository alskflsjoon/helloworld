package helloworld;

public class HelloWorld {

	public static void game(int input){
		System.out.print(input+": ");
		int a = input;
		
		while(a>0){
			int b=a%10;
			if(b==3||b==6||b==9){
				System.out.print("짝");
				if(a<10){
					System.out.println("");
					game(input-1);
					break;
				}
			}
			if(a<10){
				System.out.println("");
				game(input-1);
				break;
			}
			a/=10;
		}
		
		
	}
	
	
	
	public static void main(String[] args){
		game(100);
	}
}

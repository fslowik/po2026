//import java.util.Scanner;

public class Choinka{
	public static void main(String[] args){
		int i = 0;
		//Scanner myObj = new Scanner(System.in);
		//System.out.println("Podaj wysokosc choinki");
		//int h = myObj.nextInt();
		int h =10;
		if(args.length >0){
			h = Integer.parseInt(args[0]);
		}
		while(i<h){
			int j = i;
			while(j >= 0){
				System.out.print('*');
				j--;
			}
			System.out.println();
			i++;
			
		}
	};
}
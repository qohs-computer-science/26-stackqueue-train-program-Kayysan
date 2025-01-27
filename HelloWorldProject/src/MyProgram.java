/*
 * TODO: Name
 * TODO: Date
 * TODO: Class Period
 * TODO: Program Description
 */
import java.util.Scanner;
import java.io.File;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class MyProgram {
	public static int val = 0;
	public static void main(String[] args) {

		int limitTrackA = 100000, limitTrackB = 100000, limitTrackC = 100000;
		Stack <Train> all = new Stack<>() ;
		Stack <Train> trackA = new Stack<>() ;
		Stack <Train> trackB = new Stack<>() ;
		Stack <Train> trackC = new Stack<>() ;
		Stack <Train> trackD = new Stack<>() ;

		int engLim= 10000;
		
		int aWeight = 0;
		int bWeight = 0;
		int cWeight = 0;
		int dWeight = 0;

		Queue <Train> cars = new LinkedList<Train>();
		String t ="";
	
		Scanner x = new Scanner(System.in);
		try{
			File f = new File("HelloWorldProject/src/data.txt");
			x = new Scanner (f);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}



		t=x.nextLine();
		//Scanner x =  Scanner(System.in);

		while(!t.equals("END")){
			System.out.println(t);

			if (t.substring(0,3).equals("CAR")){
				//String na= x.nextLine();
				String pr= x.nextLine();
				String or= x.nextLine();
				String de= x.nextLine();
				int we= x.nextInt();
				int mi= x.nextInt();
				x.nextLine();
				cars.add(new Train(t, pr, or, de,we,mi));
				//t=x.nextLine();
				
			}
			else{
				cars.add(new Train(t,x.nextLine()));
				//t=x.nextLine();
			}
			t=x.nextLine();
		}// end while

		while(!cars.isEmpty()){
			Train temp=cars.remove();
			System.out.println(temp);
			if(temp.getMiles()<=700){
				if ((temp.getDestination().equals("Baltimore"))){
					cWeight+=temp.getWeight();
					if (cWeight<limitTrackC){
						trackC.push(temp);
					}
					else{
						cWeight-=temp.getWeight();
						trackC.push(new Train("ENG00000", "Baltimore"));

						System.out.println(trackC.toString());
						
						while (trackC.size()>0){
							Train tempCar=trackC.pop();
							System.out.println(tempCar.getName()+" contains the product: "+ tempCar.getProduct());
						}
						cWeight=0;
					}

				}//end balt
				else if ((temp.getDestination().equals("Charlotte"))){
				bWeight+=temp.getWeight();
					if (bWeight<limitTrackB){
						trackB.push(temp);
					}
					else{
						bWeight-=temp.getWeight();
						trackB.push(new Train("ENG00000", "Charlotte"));

						System.out.println(trackB.toString());
						
						while (trackB.size()>0){
							Train tempCar=trackB.pop();
							System.out.println(tempCar.getName()+" contains the product: "+ tempCar.getProduct());
						}
						bWeight=0;
					}

				}//end Char
				else if ((temp.getDestination().equals("Trenton"))){
					aWeight+=temp.getWeight();
					if (aWeight<limitTrackA){
						trackA.push(temp);
					}
					else{
						aWeight-=temp.getWeight();
						trackA.push(new Train("ENG00000", "Charlotte"));

						System.out.println(trackA.toString());
						
						while (trackA.size()>0){
							Train tempCar=trackA.pop();
							System.out.println(tempCar.getName()+" contains the product: "+ tempCar.getProduct());
						}
						aWeight=0;
					}

				}//end Tren
				else{
					while(trackD.size()>0){
						Train tempCar =trackD.pop();
						System.out.println(tempCar.getName()+" contains the product: "+ tempCar.getProduct());
					}
				}



			}//ed big if

		}//end big while
		System.out.println("Departing all tracks");

		if(!trackA.isEmpty()){
			trackA.push(new Train ("ENG00000", "Trenton"));
			System.out.println(trackA.peek().getName()+" leaving for "+trackA.peek().getDestination()+" with the following cars: ");
			while(trackA.size()>0){
				trackA.pop();
				Train temp=trackA.pop();
				System.out.println(temp.getName()+ " containing "+ temp.getProduct());
			}//end while
			aWeight=0;
			System.out.println("The Trenton line is empty...");
		
		}
		else
			System.out.println("The Trenton line is empty...");
		//end trackA

		if(!trackB.isEmpty()){
			trackB.push(new Train ("ENG00000", "Charlotte"));
			System.out.println(trackB.peek().getName()+" leaving for "+trackB.peek().getDestination()+" with the following cars: ");
			while(trackB.size()>0){
				trackA.pop();
				Train temp=trackB.pop();
				System.out.println(temp.getName()+ " containing "+ temp.getProduct());
			}//end while
			bWeight=0;
			System.out.println("The Charlotte line is empty...");
		
		}
		else
			System.out.println("The Charlotte line is empty...");
		//end trackA

		if(!trackC.isEmpty()){
			trackC.push(new Train ("ENG00000", "Baltimore"));
			System.out.println(trackC.peek().getName()+" leaving for "+trackC.peek().getDestination()+" with the following cars: ");
			while(trackC.size()>0){
				trackC.pop();
				Train temp=trackC.pop();
				System.out.println(temp.getName()+ " containing "+ temp.getProduct());
			}//end while
			cWeight=0;
			System.out.println("The Baltimore line is empty...");
		
		}
		else
			System.out.println("The Baltimore line is empty...");
		//end trackA

		while(trackD.size()>0)
		{
			Train temp= trackD.pop();
			System.out.println(temp.getName()+ " containing "+ temp.getProduct());
		}

	}//end main
}//end class

	


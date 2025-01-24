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
		Stack <Train> all = new LinkedList <Train> (); 
		Stack <Train> trackA = new LinkedList <Train> ();
		Stack <Train> trackB = new LinkedList <Train> ();
		Stack <Train> trackC = new LinkedList <Train> ();
		Stack <Train> trackD = new LinkedList <Train> ();

		int engLim= 10000;
		
		int aWeight = 0;
		int bWeight = 0;
		int cWeight = 0;
		int dWeight = 0;

		Queue <Train> cars = new LinkedList<Train>();
 
	
		Scanner x = new Scanner(System.in);
		try{
			File f = new File("HelloWorldProject/src/data.txt");
			x = new Scanner (f);
			String name = x.nextLine();
			System.out.println(name);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}



		String t=x.nextLine();


		while(!t.equals("END")){
			if (name.substring(0,3).equals("CAR")){
				cars.add(new Train(t, x.nextLine(),x.nextLine(),x.nextLine(),x.nextLine(),x.nextLine()));
				t=x.nextLine();
				t=x.nextLine();
			}
			else{
				cars.add(new Train(t,x.nextLine()));
				t=x.nextLine();
			}
		}// end while

		while(cars.size()>0){
			Train temp=carlist.remove();
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
						
						while (trackC.size>0){
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
						
						while (trackB.size>0){
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
						
						while (trackA.size>0){
							Train tempCar=trackA.pop();
							System.out.println(tempCar.getName()+" contains the product: "+ tempCar.getProduct());
						}
						aWeight=0;
					}

				}//end Tren


			}//ed big if

		}//end big while


		





		if(getName().equals("Baltinore")){
			train();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}




	}
}

	


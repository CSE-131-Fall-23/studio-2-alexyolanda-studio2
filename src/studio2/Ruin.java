package studio2;
import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		new java.util.Random();
		
		int startAmount,winLimit,tot;
		double winChance;
		double nowprob = 0;
		int mon,simNo,ruin=0;
		
		startAmount = in.nextInt();
		winChance = in.nextDouble();
		winLimit = in.nextInt();
		tot = in.nextInt();
		
		for(int i=1;i<=tot;i++){
			simNo=0;
			mon=startAmount;
			while(mon>0 && mon<winLimit) {
				nowprob = Math.random();
//				if(nowprob >= winChance)
//					mon--;
//				else
//					mon++;
				mon = mon + ((nowprob >= winChance) ? -1 : 1);
				simNo++;
			}
			System.out.println("Simulation " + i + ": " + simNo + ((mon==0) ? " LOSE" : " WIN") );
			if(mon==0)
				ruin++;
		}
		System.out.println("Losses: "+ruin+" Simulations: "+tot);
		
		
		double a=(1.0-winChance)/winChance;
		double expR;
		
		if(winChance==0.5)
			expR=1-((startAmount*1.0)/(winLimit*1.0));
		else
			expR=(Math.pow(a,startAmount)-Math.pow(a,winLimit))/(1.0-Math.pow(a,winLimit));
		
		System.out.println("Ruin Rate from Simulation: "+(ruin/1.0)/(tot/1.0)+" Expected Ruin Rate: "+expR);
	}

}

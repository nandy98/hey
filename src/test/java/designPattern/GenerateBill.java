package designPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
	
	public static void main(String [] args) throws IOException {
		GetPlanFactory planFactory = new GetPlanFactory();
		System.out.println("Enter the Plan");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String planName = br.readLine();
		
		int units= Integer.parseInt(br.readLine());
		 Plan p = planFactory.getPlan(planName);
		
		System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
		p.getRate();
		p.calculateBill(units);
	}

}

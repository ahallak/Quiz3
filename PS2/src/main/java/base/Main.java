package base;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		TuitionCalculator totalCost = new TuitionCalculator();
		
		//Setting user-input variables
		System.out.println("Enter initial tuition cost: ");
		totalCost.setTuition(input.nextDouble());
		System.out.println("Enter the percent increase for tuition: ");
		totalCost.setPayIncrease(input.nextDouble());
		System.out.println("Enter repayment APR: ");
		totalCost.setRepayAPR(input.nextDouble());
		
		//Calling of calculation methods
		double totalTuition = TuitionCalculator.calculateTotalCost(totalCost.getTuition(), totalCost.getPayIncrease(), totalCost.getYear());
		double repaymentPerMonth = TuitionCalculator.repaymentPerMonthCalculator(totalTuition, totalCost.getRepayAPR(), totalCost.getYear());
		
		System.out.println("Total loan amount: $" + totalTuition);
		System.out.println("\nCalculated repayment amount per month: $" + repaymentPerMonth);
	}
}

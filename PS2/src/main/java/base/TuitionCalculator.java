package base;
import java.lang.Math;
public class TuitionCalculator {
	
	//Variable Declaration
	private double initialTuition;
	private double tuitionPercentIncrease;
	private double repaymentAPR;
	private int years = 4;
	
	//getters
	public double getTuition(){
		return initialTuition;
	}
	public double getPayIncrease(){
		return tuitionPercentIncrease;
	}
	public double getRepayAPR(){
		return repaymentAPR;
	}
	public int getYear(){
		return years;
	}
	
	//setters
	public void setTuition(double newTuition){
		initialTuition = newTuition;
	}
	public void setPayIncrease(double payInc){
		payInc /= 100;
		tuitionPercentIncrease = payInc;
	}
	public void setRepayAPR(double setAPR){
		setAPR /= 100;
		repaymentAPR = setAPR;
	}
	//This method calculates the total cost for tuition among all four years
	public static double calculateTotalCost(double initialTuition, double tuitionPercentIncrease, int years){
		int loopCount = 0;
		double totalTuition = 0;
		while (loopCount < years){
			totalTuition += initialTuition;
			totalTuition += (totalTuition*tuitionPercentIncrease);
			loopCount += 1;
		}
		double roundedTuition = Math.round((totalTuition * 100));
		roundedTuition /= 100;
		return roundedTuition;
	}
	//This method calculates how much the user will need to repay each month
	public static double repaymentPerMonthCalculator(double totalTuition, double repaymentAPR, int years){
		double monthlyRate = repaymentAPR / 12.0;
		double terms = years * 12;
		double monthlyPayment = (totalTuition*monthlyRate) / (1-Math.pow(1+monthlyRate, -terms));
		double roundedPayment = Math.round((monthlyPayment * 100));
		roundedPayment /= 100;
		return roundedPayment;
		
	}
}

class Profit_Loss
{
	public static void main(String args[])
	{	
		int costPrice=129;
		int sellingPrice=191;
		
		int profit=sellingPrice-costPrice;
	
		System.out.println("Total Profit :- "+profit);
		
		int  percentage=(profit*100)/costPrice;
		
		System.out.println("Profit percentage :- "+percentage);
	}
}
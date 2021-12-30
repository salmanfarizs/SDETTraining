package fifthday.fifth;

import org.junit.Test;

public class BookStore {
	
	
	
	//12:07
	//13:10
	
	@Test
	public void grumpy() {
		
		int cust[]= {1,0,1,2,1,1,7,5};
		int grumpy[] = {0,1,0,1,0,1,0,1};
		int minutes =3;
		
		System.out.println(customerSatisfied(cust,grumpy,minutes));
	}
	
	
	private int customerSatisfied(int cust[], int grumpy[], int minutes) {

		int satisfiedCustomers = 0;

		for (int i = 0; i < cust.length; i++) {

			if (grumpy[i] == 0) {

				satisfiedCustomers += cust[i];
			}
		}

		int totalCustomers = satisfiedCustomers, totalSatisfiedCustomers = satisfiedCustomers;
		/*int j = 0;
		while (j <= grumpy.length - minutes) {
			for (int i = j; i < minutes + j; i++) {

				if (grumpy[i] == 1) {
					totalCustomers += cust[i];
					totalSatisfiedCustomers = Math.max(totalCustomers, totalSatisfiedCustomers);

				}
			}

			totalCustomers = satisfiedCustomers;
			j++;

		}*/
		
		int left=0;
		
		for(int right=0;right<=cust.length-minutes;right++) {
			
			while(left-right<minutes) {
				
				if(grumpy[left]==1) {
				totalCustomers += cust[left];
				totalSatisfiedCustomers = Math.max(totalCustomers, totalSatisfiedCustomers);
				
			}
				left++;}
			totalCustomers = satisfiedCustomers;
			left=right+1;
		}
		
		
		return totalSatisfiedCustomers;
	}

}

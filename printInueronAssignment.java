package com.coreJava.assignments;

class printIt{

	 int n = 5;

	// Number of character width in each line
	 int width = (2 * n) - 1;

	// Function to find the absolute value
	// of a number D
	 int abs(int d)
	{
		return d < 0 ? -1 * d : d;
	}



	void printE()
	{
		int i, j;
		for (i = 0; i < n; i++)
		{
			System.out.printf("*");
			for (j = 0; j < n; j++)
			{
				if ((i == 0 || i == n - 1)
					|| (i == n / 2
						&& j <= n / 2))
					System.out.printf("*");
					else
					System.out.printf(" ");
			}
			System.out.printf("\n");
		}
	}


	 void printI()
	{
		int i, j;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (i == 0 || i == n - 1)
					System.out.printf("*");
				else if (j == n / 2)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
		}
	}


	void printN()
	{
		int i, j ;
		for (i = 0; i < n; i++)
		{
			System.out.printf("*");
			for (j = 0; j <= n; j++)
			{
				if (j == n||j==i)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			
			System.out.printf("\n");
		}
	}


	void printO()
	{
		int i, j, space = (n / 3);
		int width = n / 2 + n / 5 + space + space;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j <= width; j++)
			{
				if (j == width - abs(space)
					|| j == abs(space))
					System.out.printf("*");
				else if ((i == 0
						|| i == n - 1)
						&& j > abs(space)
						&& j < width - abs(space))
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			if (space != 0
				&& i < n / 2)
			{
				space--;
			}
			else if (i >= (n / 2 + n / 5))
				space--;
			System.out.printf("\n");
		}
	}





	void printR()
	{
	    int i, j, half = (n / 2);
	    for (i = 0; i < n; i++)
	    {
	        System.out.printf("*");
	        for (j = 0; j < width; j++)
	        {
	            if ((i == 0 || i == half)
	                && j < (width - 2))
	                System.out.printf("*");
	            else if (j == (width - 2)
	                    && !(i == 0 || i == half))
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        System.out.printf("\n");
	    }
	}


	void printU()
	{
		int i, j;
		for (i = 0; i < n; i++)
		{
			if (i != 0 && i != n - 1)
				System.out.printf("*");
			else
				System.out.printf(" ");
			for (j = 0; j < n; j++)
			{
				if (((i == n - 1)
					&& j >= 0
					&& j < n - 1))
					System.out.printf("*");
				else if (j == n - 1 && i != 0
						&& i != n - 1)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
		}
	}




}

public class printIneuronAssignment {
    
    	



public static void main(String[] args)
{

	
	printIt p = new printIt();
	p.printI();
	p.printN();
	p.printE();
	p.printU();
	p.printR();
	p.printO();
	p.printN();
}
}

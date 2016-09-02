package sampleprograms;



public class SampleProgramming {

	int factorial(int n){
		int sum=1;

		for(int i=1;i<=n;i++){

			sum=sum*i;


		}
		System.out.println(sum);
		return sum;

	}
	boolean isPrime(int m)
	{

		for(int i=2;i<=m;){
			if(m%i==0)

				System.out.println("entered number is not a prime number");

			else
				System.out.println("entered number is prime number");
			break;

		}
		return false ;
	}
	int[] listOfPrimes(int n)
	{
		int[] a=new int[n];	

		for(int i=1; i < n; i++){

			boolean isPrime = true;


			//check to see if the number is prime
			for(int j=2; j < i ; j++){

				if(i % j == 0){
					isPrime = false;

					break;
				}
			}
			// print the number
			if(isPrime)
				System.out.println(i + " ");


		}


		return a;	

	}

	long sumOfNumbers(int n)
	{
		int sum = 0;
		n = n * (n + 1) / 2;// calculate the sum N number
		for (int i = 0; i <= n; i++) {
			sum = sum + i;// calculate sum of i
		}
		System.out.println("sum:" + sum);// display the value of sum

		return sum;
	}	

	boolean palindrome(String[] s)
	{
		String[] b=new String[1]; 
		for(int i=0;i<=s.length;i--){

			for(int j=0;j<=i;j++){
				b[j]=s[i];
				//System.out.println(b[j]);
				if(s[i].equals(b[j]))
					System.out.println("s[i] is a palindrome");
				else
					System.out.println("s[i] is not a palindrome");

			}	  

		}	
		return false;
	}		
	boolean isArmstrong(int n)
	{
		int sum=0;
		int temp=n;
		int r;
		while(temp!=0){
			r=temp%10;
			sum=sum+r*r*r;
			temp=temp/10;
		}
		if(n==sum)
			System.out.println("armstrong number");
		else
			System.out.println("not an armstrong Number");
		return false;



	}
	public static void main(String[] args) {
		SampleProgramming t=new SampleProgramming();

		t.factorial(20);
		t.isPrime(25);
		t.listOfPrimes(20);
		t.sumOfNumbers(20);
		String[] a={"vikatakavi"};
		t.palindrome(a);
		t.isArmstrong(153);

	}

}

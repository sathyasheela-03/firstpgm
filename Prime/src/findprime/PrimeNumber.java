package findprime;

public class PrimeNumber {
	public void getprime() {
		for (int i=2; i<=29;i++)
		{
			for(int j=2; j<=i;j++)
			{
				if(i==j)
				{
					System.out.println(i);
				}
				if (i%j==0)
				{
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber pm=new PrimeNumber();
		pm.getprime();
	}
}

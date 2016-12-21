import java.util.Scanner;
class Demo9 
{
	public static void main(String[] args) 
	{
		int i,j;
		int[][] a = new int[2][2];

		a[0][0] = 10;
		a[0][1] = 20;
		a[1][0] = 30;
		a[1][1] = 40;
		System.out.println("a[0][0] = " + a[0][0]);
		System.out.println("a[0][1] = " + a[0][1]);
		System.out.println("a[1][0] = " + a[1][0]);
		System.out.println("a[1][1] = " + a[1][1]);
		System.out.println();

		int[][] b = new int[][]{{11,12},{21,22}};
		for(i=0; i<2; i++)
		{
			for(j=0; j<2; j++)
			{
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		Scanner s = new Scanner(System.in);
		int[][] c = new int[2][2];
		for(i=0; i<2; i++)
		{
			for(j=0; j<2; j++)
			{
				System.out.print("Enter a value for c["+i+"]["+j+"] : ");
				c[i][j] = s.nextInt();
			}
		}
		System.out.println();

		for(i=0; i<2; i++)
		{
			for(j=0; j<2; j++)
			{
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		int x=11;
		int[][] d = new int[5][5];
		for(i=0; i<5; i++)
		{
			for(j=0; j<5; j++)
			{
				d[i][j] = x++;
			}			
		}
		for(i=0; i<5; i++)
		{
			for(j=0; j<5; j++)
			{
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();		
	}
}

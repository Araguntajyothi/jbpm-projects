package wrapper;
import java.util.Scanner;

class Addition 
{
	public static void main(String[] args) 
	{
		int i, j, r1, c1, r2, c2;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Matrix A row and column size\n");
		r1 = s.nextInt();
		c1 = s.nextInt();

		System.out.println("Enter Matrix B row and column size\n");
		r2 = s.nextInt();
		c2 = s.nextInt();

		if (r1 == r2 && c1 == c2)
		{
			int A[][] = new int[r1][c1];
			int B[][] = new int[r2][c2];
			int C[][] = new int[r1][c1];

			System.out.println("Enter Matrix A elements");
			for (i = 0; i < r1; i++)
			{
				for (j = 0; j < c1; j++)
				{
					A[i][j] = s.nextInt();
				}
			}

			System.out.println("Enter Matrix B elements");
			for (i = 0; i < r2; i++)
			{
				for (j = 0; j < c2; j++)
				{
					B[i][j] = s.nextInt();
				}
			}
			
			for (i = 0; i < r1; i++)
			{
				for (j = 0; j < c1; j++)
				{
					C[i][j] = A[i][j] + B[i][j];
				}
			}

			System.out.println("Matrix A elements are");
			for (i = 0; i < r1; i++)
			{
				for (j = 0; j < c1; j++)
				{
					System.out.print(A[i][j] + " ");
				}
				System.out.println();
			}

			System.out.println("Matrix B elements are");
			for (i = 0; i < r1; i++) 
                             {
				for (j = 0; j < c1; j++) 
                                       {
					System.out.print(B[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("Addition Matrix C elments are");
			for (i = 0; i < r1; i++)
			{
				for (j = 0; j < c1; j++)
				{
					System.out.print(C[i][j] + " ");
				}
				System.out.println();
			}
		} 
		else
		{
			System.out.println("Matrices Adition is not possible");
		}
	}
}


#include<stdio.h>
// #include<conio.h>
int MCM(int p[],int n)
{
	int m[5][5];
	int i,j,k,L,q;
	for(i=1;i<n;i++)
	m[i][i]=0;
	for(L=2;L<n;L++)
	{
		for(i=1;i<n-L+1;i++)
		{
			j=i+L-1;
			m[i][j]=100;
			for(k=i;k<=j-1;k++)
			{
				q=m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j];
				if(q<m[i][j])
				m[i][j]=q;
			}
		}
	}
	return m[1][n-1];
}
int main()
{
	// clrscr();
	int arr[]={1,2,3,4,5};
	int size=5;
	printf("\n Minimum Number of Multiplications are : %d ",MCM(arr,size));
	// getchar();
	return 0;
}
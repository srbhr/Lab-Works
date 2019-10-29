#include <iostream>
using namespace std;

void calc_LCS(char* X, char* Y, int m, int n)
{

    int C[m+1][n+1];


    for(int i=0; i<m; i++)
    {
        C[i][0] = 0;
    }
    for(int j=0; j<n; j++)
    {
        C[0][j] = 0;
    }

    for (int i=0; i<=m; i++)
    {
        for (int j=0; j<=n; j++)
        {
            if (X[i] == Y[j])
            {
                C[i][j] = C[i-1][j-1]+1;
            }
            else if (C[i][j-1] > C[i-1][j])
            {
                C[i][j] = C[i][j-1];
            }
            else 
            {
                C[i][j] = C[i-1][j];
            }
        }
    }

    for(int i=1; i<=m; i++)
    {
        for(int j=1; j<=n; j++)
        {
            cout << C[i][j] << " ";
        }
        cout << endl;
    }

    cout << endl << C[m][n] << endl;

    cout << endl;

}

int main()
{
    char X[] = "AGTAB";
    char Y[] = "GXTXAYB";

    int m = strlen(X);
    int n = strlen(Y);

    calc_LCS(X, Y, m, n);

    return 0;
}
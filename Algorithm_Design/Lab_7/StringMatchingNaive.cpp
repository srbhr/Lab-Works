#include <bits/stdc++.h> 
using namespace std; 

void search(char* pat, char* txt) 
{ 
	int M = strlen(pat); 
	int N = strlen(txt); 


	for (int i = 0; i <= N - M; i++) { 
		int j; 


		for (j = 0; j < M; j++) 
			if (txt[i + j] != pat[j]) 
				break; 

		if (j == M) 
			cout << "Pattern found at index "
				<< i << endl; 
	} 
} 

 
int main() 
{ 

	char txt[] = "ABBACCABBABBCBBAAABACACABCBCB"; 
    cout<<"The Text is : "<<txt<<endl;
	char pat[] = "ABC"; 
    cout << "The Pattern is: "<<pat<<endl;
	search(pat, txt);
	return 0; 
} 


//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;
void printPat(int n);

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
	int n;
	cin>>n;
    printPat(n);
    cout<<endl;
	}
}
// } Driver Code Ends


/*You are required to complete this method*/


/*You are required to complete this method*/
void printPat(int n)
{
//Your code here

for ( int c = n; c > 0; c--){
    for ( int i = n; i >=1; i--){
        for ( int j = c; j >0; j--){
            cout << i;
            cout <<" ";
        }
        
       
        
    }
     cout << "$";
    
}

}
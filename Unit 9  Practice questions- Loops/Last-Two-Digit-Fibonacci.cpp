#include<bits/stdc++.h>
using namespace std;
typedef long long int ll;
void precomput(ll f[])
{
	
	f[0] = 0;
	f[1] = 1;
	for (ll i = 2; i < 500; i++)
		f[i] = (f[i-1] + f[i-2])%100;
}

int findLastDigit(ll f[], int n)
{
	return f[n%500];
}
int main ()
{
	ll f[500] = {0};
	precomput(f);
	ll n;
    cin>>n;
	if(n<8){
        cout <<"0"<< findLastDigit(f, n) << endl;
    }else{
        cout << findLastDigit(f, n) << endl;
    }
	return 0;
}
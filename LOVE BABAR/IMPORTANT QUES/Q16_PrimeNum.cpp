#include <iostream>
using namespace std;

bool isPrime(int n)
{

    // optimization -> loop start kro 2 se root n tak
    for (int i = 2; i < n; i++)
    {
        if (n % i == 0)
        {
            // divide hogya hai
            return false;
        }
        else
        {
            return true;
        }
    }
}
int main()
{
    int n;
    cin >> n;

    if (isPrime(n))
    {
        cout << "Prime " << endl;
    }
    else
    {
        cout << "Not a Prime " << endl;
    }
}
#include <iostream>
using namespace std;

int bitwiseComplement(int n)
{

    int m = n;
    int mask = 0;

    //  Edge case
    if (n == 0)
    {
        return 1; // compliment of 0 is 1
    }

    while (m != 0)
    {
        mask = (mask << 1) | 1;
        m = m >> 1;
    }

    int ans = ~(n)&mask;
    return ans;
}

int main()
{
    int n;
    cin >> n;
}
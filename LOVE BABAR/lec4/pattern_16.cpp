#include <iostream>
using namespace std;

int main()
{
    int n;
    cout << "Enter the number n " << endl;
    cin >> n;

    int i = 1;
    char count = 'A';
    while (i <= n)
    {
        int j = 1;
        while (j <= i)
        {
            cout << count << " ";
            count++;
            j++;
        }

        cout << endl;
        i++;
    }
    return 0;
}
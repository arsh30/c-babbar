#include <iostream>
using namespace std;
int main()
{

    int n;
    cin >> n;

    int i = 1;
    while (i <= n)
    {
        // print space
        int space = 1;
        while (space <= n - i)
        {
            cout << " ";
            space++;
        }

        // print 1st triangle
        int j = 1;
        int count = 1;
        while (j <= i)
        {
            cout << count;
            count++;
            j++;
        }

        // print 2nd triangle
        int start = i - 1;
        while (start)
        {
            cout << start;
            start--;
        }
        cout << endl;
        i++;
    }
}

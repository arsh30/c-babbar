#include <iostream>
#include <vector>
using namespace std;

void display(vector<int> &arr)
{
    //  passing array as an parameter  vector<int>& arr(n, 0);
    for (int i = 0; i < arr.size(); i++)
    {
        cout << arr[i] << " ";
    }
}

void test1()
{
    int n;
    cin >> n;
    vector<int> arr(n, 0); // -> we create this vector

    // take input
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    // through output
    // for (int i = 0; i < n; i++)
    // {
    //     cout << arr[i];
    // }
    display(arr);
}

int findmaximum(vector<int> &arr)
{
    int maxEle = -(int)1e9;
    for (int ele : arr)
    {
        if (ele > maxEle)
        {
            maxEle = ele;
        }
    }
    return maxEle;
}
int main()
{
    int n;
    cin >> n;
    vector<int> arr(n, 0);
    // test1();
    cout << findmaximum(arr);
    return 0;
}

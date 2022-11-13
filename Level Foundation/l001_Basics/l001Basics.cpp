#include <iostream>
using namespace std;

int multiply(int a, int b)
{ // -> integer me input liya tha isliye input bhi integer me denge
    return a * b;
}

void add(int a, int b)
{
    cout << (a + b);
}

int subtract(int a, int b)
{
    return a - b;
}

int divide(int a, int b)
{
    return a / b;
}

// Portal ques start

// ques 1
void printZ()
{
    cout << ("*****") << endl;
    cout << ("   *") << endl;
    cout << ("  *") << endl;
    cout << (" *") << endl;
    cout << ("*****") << endl;
}

// ques 2
void gradingSystem(int marks)
{
    if (marks > 90)
    {
        cout << ("excellent");
    }
    else if (marks > 80 && marks <= 90)
    {
        cout << ("good");
    }
    else if (marks > 70 && marks <= 80)
    {
        cout << ("fair");
    }
    else if (marks > 60 && marks <= 70)
    {
        cout << ("meets expectations");
    }
    else
    {
        cout << ("below par");
    }
}

//  dec 23

//  ques1
void printNTime(int n)
{
    for (int i = 0; i <= n; i++)
    {
        cout << ("Hello printing N times loop") << endl;
    }
}

//  ques2
void printTableOfN(int n)
{
    for (int i = 1; i <= 10; i++)
    {
        // cout << n << " X " << i << " = " << n * i << endl;  //Note -> in java instead of " + " operator we use " << " in cpp to print something
        cout << to_string(n) + " X " + to_string(i) + " = " + to_string(n * i) << endl; // or to take same feel like in java
    }
}

//  ques 3
void printTableTillM(int m)
{

    for (int i = 1; i <= m; i++)
    {
        printTableOfN(i);
        cout << endl;
    }
}

//  ques 4
void oddEven(int n)
{
    if (n % 2 == 0)
    {
        cout << to_string(n) + " -> Even" << endl;
    }
    else
    {
        cout << to_string(n) + " -> Odd" << endl;
    }
}

void checkOddEven()
{
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        int a; // A numbers means 1, by 1 numbers will come
        cin >> a;
        oddEven(a);
    }
}

//  ques 5
bool primeNumber(int n)
{
    for (int i = 2; i * i <= n; i++)
    {
        if (n % i == 0)
        {
            return false;
        }
    }
    return true;
}

void checkPrimeOrNot()
{
    int t;
    cin >> t;
    for (int i = 1; i <= t; i++)
    {
        int a;
        cin >> a;

        if (primeNumber(a))
        {
            cout << "prime" << endl;
        }
        else
        {
            cout << "Not Prime" << endl;
        }
    }
}

//  ques 6
void printAllPrimeTillN(int low, int high)
{
    // print prime in between the low and high range
    for (int i = low; i <= high; i++)
    {
        if (primeNumber(i))
            cout << (i) << endl;
    }
}

//  ques 7
void fibonacciTillM(int n)
{
    int a = 0;
    int b = 1;
    for (int i = 0; i <= n; i++)
    {
        cout << a << endl;
        int c = a + b;
        a = b;
        b = c;
    }
}

//  ques 8
int countDigits(int n)
{
    int count = 0;
    while (n != 0)
    {
        n /= 10;
        count++;
    }
    return count;
}

//  ques 9
void printInReverse(int n)
{
    while (n != 0)
    {
        int lastDigit = n % 10;
        n /= 10;
        cout << lastDigit << endl;
    }
}

//  ques 10
int reverseNumber(int n)
{
    // Formula to reverse a number -> res = res * 10 + lastDigit
    int ans = 0;
    while (n != 0)
    {
        int lastDigit = n % 10;
        n /= 10;

        ans = ans * 10 + lastDigit;
    }
    return ans;
}

int main()
{
    // cout<< "Hello ";
    // cout << "World";
    // int a;
    // int b;

    // cin >> a >> b; // take input
    // cout << multiply(a, b) << endl;
    // cout << subtract(a, b) << endl;
    // cout << divide(a, b) << endl;
    // add(a, b);

    // int n;
    // cin >> n;
    // printNTime(n);
    // printTableOfN(n);
    // printTableTillM(n);
    // checkOddEven();
    // checkPrimeOrNot();

    // int low;
    // cin >> low;
    // int high;
    // cin >> high;
    // printAllPrimeTillN(low, high);

    int n;
    cin >> n;
    // cout << countDigits(n) << endl;
    // printInReverse(n);
    // cout << reverseNumber(n) << endl;
    fibonacciTillM(n);

    return 0;
}

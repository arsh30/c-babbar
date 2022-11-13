/*Theory

*/
#include<iostream>
#include<vector>
using namespace std;


 bool isPalindrome(string str)
{
    // check string is palindrome or not
    // abc cba means aisi string jo fold ho ske
    int i = 0;
    int j = str.length() - 1;

    while (i < j)
    {
        if (str[i] != str[j])
        {
            i++;
            j--;
            return false;
        }
    }
    return true;
}

int main(){
    return 0;
}

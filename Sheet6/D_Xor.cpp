#include <iostream>
using namespace std;

int func(long a, long b, long n)
{
    if (n == 1)
        return a;
    else if (n == 2)
        return b;
    else
        return func(a, b, n - 1) ^ func(a, b, n - 2);
}

int main()
{
    long a, b, n;
    cin >> a;
    cin >> b;
    cin >> n;

    

    long ans = func(a, b, n);
    cout << ans << endl;

    return 0;
}
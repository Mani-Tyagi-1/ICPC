#include <iostream>
using namespace std;

int main()
{
    int a, b;
    cin >> a >> b;
    if (a == 0 && b == 0)
        cout << "NO" << endl;
    else if (abs(a - b) == 1 || abs(a - b) == 0)
        cout << "YES\n";
    else
        cout << "NO\n";
    return 0;
}
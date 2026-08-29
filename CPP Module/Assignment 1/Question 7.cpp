#include <iostream>
using namespace std;

int main()
{
    int statusReg = 0b10110001;  // const to int pointer
    int controlReg = 0b00000000; // const pointer
    int dataReg = 0b11001010;    // const to const pointer

    const int *regPtr1 = &statusReg;
    cout << "Status Register: " << *regPtr1 << endl;

    int *const regPtr2 = &controlReg;
    *regPtr2 = 45;
    cout << "Control Register after write: " << *regPtr2 << endl;

    const int *const regPtr3 = &statusReg;
    cout << "ROM Config / Fixed Register: " << *regPtr3 << endl;

    return 0;
}

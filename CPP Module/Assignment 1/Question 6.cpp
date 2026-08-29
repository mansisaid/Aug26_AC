#include <iostream>
using namespace std;
#include <cmath>

double computeRMS(double *signal, int N)
{
    double sum = 0;
    double *ptr = signal;

    for (int i = 0; i < N; i++)
    {

        sum += (*ptr) * (*ptr);
        ptr++;
    }

    double rms = sqrt(sum / N);

    return rms;
}

void normalise(double *signal, int N)
{
    double maxValue = fabs(*signal);
    for (int i = 0; i < N; i++)
    {
        if (fabs(*(signal + i)) > maxValue)
        {
            maxValue = fabs(*(signal + i));
        }
    }

    for (int i = 0; i < N; i++)
    {
        *(signal + i) = *(signal + i) / maxValue;
    }
}


int countZeroCrossings(double *signal, int n)
{
    int count = 0;

    for (int i = 0; i < n - 1; i++)
    {
        if (*(signal + i) * *(signal + i + 1) < 0)
        {
            count++;
        }
    }

    return count;
}

void applyGain(double *signal, int n, double gainFactor)
{
    for (int i = 0; i < n; i++)
    {
        *(signal + i) = *(signal + i) * gainFactor;
    }
}

int main()
{
    double signal[7] = {0.5, -1.2, 0.8, -0.3, 1.0, -0.9, 0.1};
    int n = 7;

    cout << "Print original array: " << endl;

    for (int i = 0; i < n; i++)
    {
        cout << *(signal + i) << " ";
    }

    cout << endl;

    double rms = computeRMS(signal, n);
    cout << "RMS: " << rms << endl;

    normalise(signal, n);

    cout << "After normalise:" << endl;

    for (int i = 0; i < n; i++)
    {
        cout << *(signal + i) << " ";
    }

    cout << endl;

    int crossings = countZeroCrossings(signal, n);
    cout << "Zero Crossings: " << crossings << endl;

    double gainFactor = 2;

    applyGain(signal, n, gainFactor);

    cout << "After gain:" << endl;

    for (int i = 0; i < n; i++)
    {
        cout << *(signal + i) << " ";
    }

    cout << endl;

    return 0;
}

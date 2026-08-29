//============================================================================
// Name        : 2.cpp
// Author      : Mansi
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {
    int N;
    double arr[100];

    int skip = 0;

    cout << "Enter the reading: " << endl;
    cin >> N;

    for(int i = 0; i < N; i++) {
        cin >> arr[i];
    }

    cout << "Valid Readings: ";

    for(int i = 0; i < N; i++) {
        if(arr[i] < 0) {
            skip++;
            continue;
        }

        cout << arr[i] << " ";
    }

    cout << endl;
    cout << "Skipped(errors): " << skip << endl;

    for(int i = 0; i < N; i++){
    	if(arr[i] >= 45){
    		cout << "First Critical: Index "<< i << endl;
    		break;
    	}
    }

    double min = arr[0];
    double max = arr[0];
    double sum = 0;
    int count = 0;

    for(int i = 0; i < N; i++){
    	if(arr[i] < 0){
    		continue;
    	}

    	if(arr[i] < min){
    	    min = arr[i];
    	}

    	if(arr[i] > max){
    	   max = arr[i];
    	}

    	sum = sum + arr[i];
    	count ++;
    }
    double avg = sum/count;

    cout << "Min: " << min <<endl;
    cout << "Max: " << max <<endl;
    cout << "Average: " << avg <<endl;

    int normal = 0;
    int warning = 0;
    int critical = 0;
    int shutdown = 0;

    for(int i = 0; i < N; i++) {

        if(arr[i] < 0) {
            continue;
        }

        if(arr[i] < 30) {
            normal++;
        }
        else if(arr[i] < 40) {
            warning++;
        }
        else if(arr[i] < 50) {
            critical++;
        }
        else {
            shutdown++;
        }
    }

    cout << "Normal: " << normal << endl;
    cout << "Warning: " << warning << endl;
    cout << "Critical: " << critical << endl;
    cout << "Shutdown: " << shutdown << endl;

	return 0;
}

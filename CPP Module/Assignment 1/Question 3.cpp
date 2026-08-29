#include <iostream>
using namespace std;

int main() {
	double temp[3][3];

	for(int i = 0; i < 3; i++){
		for(int j= 0; j < 3; j++){
			cin >> temp[i][j];
		}
	}

	cout << "	Room1 Room2 Room3" << endl;
	for(int i = 0; i < 3; i++){
		cout << "Floor:" << i + 1 << " ";

			for(int j= 0; j < 3; j++){
				cout << temp[i][j] << " ";
			}
			cout << endl;
	}

	double max = temp[0][0];
	int maxFloor = 0;
	int maxRoom = 0;

	for(int i = 0; i < 3; i++) {

	    for(int j = 0; j < 3; j++) {

	        if(temp[i][j] > max) {
	            max = temp[i][j];
	            maxFloor = i;
	            maxRoom = j;
	        }
	    }
	}

	cout << "______Hottest Room______" << endl;
	cout << "Floor: " << maxFloor + 1 << endl;
	cout << "Room: " << maxRoom + 1 << endl;
	cout << "Temperature: " << max << " C" << endl;

	double highestAvg = 0;
	int highestFloor = 0;

	for(int i = 0; i < 3; i++){
		double sum = 0;

		for(int j=0; j < 3; j++){
			sum = sum + temp[i][j];
		}

		double avg = sum/3;

		if(avg > highestAvg){
			highestAvg = avg;
			highestFloor = i;
		}
	}

	cout << "_____Hottest Floor_____" << endl;
	cout << "Floor: " << highestFloor+1 << endl;
	cout << "Average: " << highestAvg << "C" << endl;

	int warningCount = 0;

	for(int i = 0; i < 3; i++){
		for(int j=0; j < 3; j++){
			if(temp[i][j] >= 30){
				warningCount++;
			}
		}
	}

	cout << "Rooms at WARNING or above: " << warningCount << endl;

	return 0;
}

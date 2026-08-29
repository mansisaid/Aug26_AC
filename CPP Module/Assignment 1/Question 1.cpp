#include <iostream>
using namespace std;

int main(){
	double temp;
	int StatusCode;
	cout << "Enter temp in Degree";
	cin >> temp;

	if(temp < 0){
		StatusCode = -1;
	}
	else if(temp > 0 && temp <= 29){
		StatusCode = 0;
	}
	else if(temp > 30 && temp <= 44){
			StatusCode = 1;
	}
	else if(temp > 45 && temp <= 59){
			StatusCode = 2;
	}
	else{
		StatusCode = 3;
	}

	switch(StatusCode){
	case -1:
			cout << "SENSOR_ERROR" << endl;
			cout << "Sensor fault - check wiring" << endl;
			break;
	case 0:
			cout << "NORMAL" << endl;
			cout << "No action required" << endl;
			break;
	case 1:
			cout << "WARNING" << endl;
			cout << "Alert sent to supervisor" << endl;
			break;
	case 2:
			cout << "CRITICAL" << endl;
			cout << "Cooling system triggered" << endl;
			break;
	case 3:
			cout << "SHUTDOWN" << endl;
			cout << "Emergency shutdown initiated" << endl;
			break;
	default:
			"Invalid Status code";
	}

		double F = temp;
		F = (temp * 9 / 5) + 32;

	cout << "Reading: " << ((temp >= 25) ? "Above Average" : "Below Average") << endl;

	cout << "Temperature in Fahrenheit: " << F;

	return 0;
}

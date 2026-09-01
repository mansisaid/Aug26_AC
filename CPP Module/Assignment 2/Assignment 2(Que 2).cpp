#include <iostream>
#include<string>
using namespace std;

class Patient{
private:
	int patientId;
	string name;
	int age;
	string ward;
	const string bloodGroup;

public:
	Patient() : bloodGroup("O+"){
		    this->patientId = 0;
		    this->name = "Unknown";
		    this->age = 0;
		    this->ward = "General";

		    cout << "[Constructor] Default patient registered." << endl;
		}

	Patient(int id, const string& name): bloodGroup("O+"), age(0), ward("General"){
	    this->patientId = id;
	    this->name = name;

	    cout << "[Constructor] Emergency: "
	         << this->name << endl;
	}

	Patient(int id, const string& name, int age,const string& ward, const string& bg): bloodGroup(bg){
	    this->patientId = id;
	    this->name = name;
	    this->age = age;
	    this->ward = ward;

	    cout << "[Constructor] Full admission: "<< this->name << endl;
	}

	~Patient()
	{
	    cout << "[Destructor] Patient " << this->name << " discharged." << endl;
	}

	void displayRecord() const
	{
	    cout << "Patient Record:" << endl;
	    cout << "ID : " << this->patientId << endl;
	    cout << "Name : " << this->name << endl;
	    cout << "Age : " << this->age << endl;
	    cout << "Ward : " << this->ward << endl;
	    cout << "Blood Grp : " << this->bloodGroup << endl;
	}

	void transferWard(const string& newWard)
	{
	    cout << "Ward Transfer: " << this->name
	         << " -> " << newWard << endl;

	    this->ward = newWard;
	}
};

int main()
{
    Patient p;
    Patient p1(101, "Mansi Said");
    Patient p2(102, "Mira Kumar", 34, "Cardiology", "B+");

    p2.displayRecord();

    Patient *arr = new Patient[4];

    for(int i = 0; i < 4; i++)
    {
        arr[i].displayRecord();
    }

    arr[0].transferWard("ICU");

    delete[] arr;

    return 0;
}


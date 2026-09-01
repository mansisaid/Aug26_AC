#include <iostream>
#include<string>
using namespace std;

class Product{
private:
	int productId;
	string name;
	double price;
	int quantity;

public:
	void acceptDetails(){
		cout << "Enter Product ID: ";
		cin >> productId;

		cout << "Enter Name: ";
		cin >> name;

		cout << "Enter Price: ";
		cin >> price;

		cout << "Enter Quantity: ";
		cin >> quantity;
	}

	void displayDetails() const{
		cout << " " << productId << " " << name << " " << price << " " << quantity << " " << totalValue() <<endl;
	}

	double totalValue() const{
		return price * quantity;
	}

	bool isLowStock(int threshold) const
	{
	    return quantity < threshold;
	}
};

int main() {
	Product arr[5];
	for(int i = 0; i < 5; i++)
	    {
	        arr[i].acceptDetails();
	    }

		cout<<"===== INVENTORY REPORT ====="<<endl;
		cout<<"ID Name Price Qty Total Value"<<endl;

	for(int i = 0; i < 5; i++)
		{
			arr[i].displayDetails();
		}

	double max = 0;
	int maxIndex = 0;

	for(int i = 0; i < 5; i++)
	{
	    if(arr[i].totalValue() > max)
	    {
	        max = arr[i].totalValue();
	        maxIndex = i;
	    }
	}
	cout << "Highest Value Product: ";
	arr[maxIndex].displayDetails();

	int threshold;

	cout << "Enter threshold: ";
	cin >> threshold;

	for(int i = 0; i < 5; i++)
	{
	    if(arr[i].isLowStock(threshold))
	    {
	        arr[i].displayDetails();
	    }
	}
	cout<<"Low Stock "<<"Threshold: "<< threshold <<": ";

	return 0;
}

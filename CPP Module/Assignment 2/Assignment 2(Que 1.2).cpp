#include <iostream>
using namespace std;

double reorderCost(int qty,double unitPrice){
	    return qty * unitPrice;
	}

double reorderCost(double qty, double unitPrice){
    	return qty * unitPrice;
	}

double reorderCost(int qty, double unitPrice, double taxRate){
		return qty * unitPrice * (1 + taxRate);
	}

double applyDiscount(double price, double discountPercent = 10.0){
		return price - (price * (discountPercent/100));
	}

int main() {
		cout << reorderCost(10,300) << endl;
	    cout << reorderCost(20,120) << endl;
	    cout << reorderCost(35,250,10) << endl;
	    cout << applyDiscount(2500,10) << endl;

	return 0;
}

#include <iostream>
#include <string>
#include <cstdlib>
using namespace std;

class Entity
{
private:
    string name;
    int health;
    int level;
    string type;

public:

    Entity& setName(const string& name)
    {
        this->name = name;
        return *this;
    }

    Entity& setHealth(int health)
    {
        this->health = health;
        return *this;
    }

    Entity& setLevel(int level)
    {
        this->level = level;
        return *this;
    }

    Entity& setType(const string& type)
    {
        this->type = type;
        return *this;
    }

    string getName() const
    {
        return this->name;
    }

    int getHealth() const
    {
        return this->health;
    }

    int getLevel() const
    {
        return this->level;
    }

    string getType() const
    {
        return this->type;
    }

    void displayInfo() const
    {
        cout << "Name : " << this->name << endl;
        cout << "Health : " << this->health << endl;
        cout << "Level : " << this->level << endl;
        cout << "Type : " << this->type << endl;
    }
};

namespace Physics
{
    double clamp(double val, double min, double max)
    {
        if (val < min)
            return min;
        if (val > max)
            return max;
        return val;
    }

    double lerp(double a, double b, double t)
    {
        return a + (b - a) * t;
    }
}

namespace GameMath
{
    int clamp(int val, int min, int max)
    {
        if (val < min)
            return min;
        if (val > max)
            return max;
        return val;
    }

    double lerp(double a, double b, double t)
    {
        return a + (b - a) * t;
    }
}

int main()
{
    Entity player;
    Entity enemy;
    Entity item;

    player.setName("Aragorn").setHealth(100).setLevel(10).setType("Player");

    enemy.setName("Orc").setHealth(60).setLevel(5).setType("Enemy");

    item.setName("HealthPotion").setHealth(0).setLevel(1).setType("Item");

    player.displayInfo();
    enemy.displayInfo();
    item.displayInfo();

    cout << "Physics Clamp: "<< Physics::clamp(120.5, 0, 100) << endl;
    cout << "Physics Lerp: "<< Physics::lerp(0, 100, 0.5) << endl;

    cout << "GameMath Clamp: "<< GameMath::clamp(120, 0, 100) << endl;
    cout << "GameMath Lerp: "<< GameMath::lerp(0, 100, 0.5) << endl;

    {
        using namespace Physics;

        cout << "Clamp: " << clamp(120.5, 0, 100) << endl;
        cout << "Lerp: " << lerp(0, 100, 0.5) << endl;
    }

    int R, C;

    cout << "Enter number of rows: ";
    cin >> R;

    cout << "Enter number of columns: ";
    cin >> C;

    int** map = new int*[R];
    for(int i = 0; i < R; i++)
    {
        map[i] = new int[C];
    }

    for(int i = 0; i < R; i++)
    {
        for(int j = 0; j < C; j++)
        {
            map[i][j] = rand() % 5;
        }
    }

    cout << "===== GAME MAP (" << R << " x " << C << ") =====" << endl;

    for(int i = 0; i < R; i++)
    {
        for(int j = 0; j < C; j++)
        {
            cout << map[i][j] << " ";
        }
        cout << endl;
    }

    cout << "Legend:" << endl;
    cout << "0=Grass 1=Water 2=Mountain 3=Forest 4=Dungeon" << endl;

    int count[5] = {0};

    for(int i = 0; i < R; i++)
    {
        for(int j = 0; j < C; j++)
        {
            count[map[i][j]]++;
        }
    }

    cout << "Tile Count:" << endl;
    cout << "Grass : " << count[0] << endl;
    cout << "Water : " << count[1] << endl;
    cout << "Mountain : " << count[2] << endl;
    cout << "Forest : " << count[3] << endl;
    cout << "Dungeon : " << count[4] << endl;

    for(int i = 0; i < R; i++)
    {
        delete[] map[i];
    }

    delete[] map;

    return 0;
}

#include <iostream>
using namespace std;

struct Peoples
{
    string name;
    int age;
    string job;
    string description;

    void insert_values(string stname, int stage, string stjob, string stdescription){
        name = stname;
        age = stage;
        job = stjob;
        description = stdescription;
    }

    void imprime(){
        cout << "Name: " << name << endl;
        cout << "Age: " << age << endl;
        cout << "Job: " << job << endl;
        cout << "Description: " << description << endl;
        cout << "----------------------------------" << endl;
    }
};

int main(){
    Peoples *peoples = new Peoples[5];
    Peoples p1, p2, p3;
    peoples[0] = p1;
    peoples[1] = p2;
    peoples[2] = p3;

    peoples[0].insert_values("Macim", 17, "youtuber music", "divulgation music remix.");
    peoples[1].insert_values("Wkerlyson", 28, "Analyst of System", "job home Office.");
    peoples[2].insert_values("Andrey", 16, "Student", "love futbol");
    
    for (int i = 0; i < 3; i++)
    {
        peoples[i].imprime();
    }
    

    return 0;
}
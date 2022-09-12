#include <iostream>

using namespace std;

int main()
{
    int* vetor = new int[6];

    for(int i = 0; i < 6; i++){
        cout << "Digite o Valor para a posicao " << i << " do Vetor." << endl;
        cin >> vetor[i];
    }

    for (int i = 0; i <6; i++){
        cout << vetor[i]<< " ";
    }
    
    

    return 0;
}
#include <iostream>

using namespace std;

int main()
{
    int* vetor = new int[5];
    int soma = 0;

    for(int i = 0; i < 5; i++){
        cout << "Digite o Valor para a posicao " << i << " do Vetor." << endl;
        cin >> vetor[i];
    }

    for (int i = 0; i <5; i++){
        soma = soma + vetor[i];
    }
    
    cout << "Soma dos Valores do Vetor: " << soma << endl;
    

    return 0;
}
#include <iostream>
#include <string>
using namespace std;

// https://www.programiz.com/cpp-programming/virtual-functions

class Veiculo {
    public:
        string placa;
        string marca;
        string modelo;
        int ano;

        string toString() {
            return placa + string(", ") + marca + string(", ") + 
            modelo + string(", ") + std::to_string(ano);
        }
};

// SUBCLASSE (herança)
class Carro : public Veiculo {
    private:
        // criando referência para o "pai"
        typedef Veiculo Super;
    public:
        int portas;
        string toString() {
            // chamando o toString do pai para reaproveitar código :-)
            return Super::toString() + string(", ") + std::to_string(portas);
        }
};

int main() {
    Carro fox;

    fox.placa = "FFF 001";
    fox.marca = "Volkswagem";
    fox.modelo = "Fox";
    fox.ano = 2010;
    fox.portas = 4;

    cout << fox.toString();

    /* PROBLEMA: Se instanciar um objeto da subclasse 
    e associar a uma superclasse... */

    Veiculo* ponteirao;
    ponteirao = &fox;

    // ... não vai ser mostrado o número de portas,
    // pois chamou o toString do "pai" :-(
    cout << ponteirao->toString();
}
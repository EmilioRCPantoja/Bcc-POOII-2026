#include <iostream>
#include <string>
using namespace std;

// https://www.programiz.com/cpp-programming/virtual-functions
// https://patorjk.com/software/taag/#p=display&f=Standard&t=Sobrecarga

/*

sobreescrita

*/

class Veiculo {
    public:
        string placa;
        string marca;
        string modelo;
        int ano;

        // exigindo que a classe filha REDEFINA o método!,
        // com uso da palavra "virtual"
        virtual string toString() {
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

    /* RESOLVIDO: Se instanciar um objeto da subclasse 
    e associar a uma superclasse... */

    Veiculo* ponteirao;
    ponteirao = &fox;

    /* ... VAI ser mostrado o número de portas,
    pois chamou o toString do "filho";
    isso aconteceu porque a função toString foi "obrigatoriamente"
    redefinida, devido ao uso da palavra "virtual"
    */
    cout << ponteirao->toString();

    /* a classe Veiculo ainda é concreta :-/
    vamos ver...
    */
    Veiculo outro;
    outro.placa = "KKK 002";
    outro.marca = "Ford";
    outro.modelo = "KA";
    outro.ano = 2003;
    // outro.portas = 2;
    // NÃO DÁ PRA DEFINIR O NÚMERO DE PORTAS!
    // a classe Veiculo não tem esse atributo!
    cout << outro.toString(); 
    /*  um carro sem número do portas :-(
    não devia ser permitido criar um objeto do tipo Veiculo
    para representar um carro >-(
    */
}
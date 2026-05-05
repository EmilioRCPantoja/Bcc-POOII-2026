#include <iostream>
#include <string>
using namespace std;

// https://www.tutorialspoint.com/cplusplus/cpp_interfaces.htm

/*
    ____ _                                
  / ___| | __ _ ___ ___  ___             
 | |   | |/ _` / __/ __|/ _ \            
 | |___| | (_| \__ \__ \  __/            
  \____|_|\__,_|___/___/\___|   _        
   __ _| |__  ___| |_ _ __ __ _| |_ __ _ 
  / _` | '_ \/ __| __| '__/ _` | __/ _` |
 | (_| | |_) \__ \ |_| | | (_| | || (_| |
  \__,_|_.__/|___/\__|_|  \__,_|\__\__,_|
                                                                           
*/

/* a classe abaixo será tornada ABSTRATA!! 
daí não será permitido criar instância dela :-) */
class Veiculo {
    public:
        string placa;
        string marca;
        string modelo;
        int ano;

        /* A class is made abstract by declaring at least one of its functions as pure virtual function */
        virtual void nada() = 0;

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
            return Super::toString() + string(", ") + std::to_string(portas) + string("\n");
        }
        void nada() {
            // nada :-/
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

    /* VAI tentar criar um objeto a partir de veículo, vai lá!! 
    descomenta a linha abaixo pra você ver que vai dar ruim :-) */
    // Veiculo outro;  
}
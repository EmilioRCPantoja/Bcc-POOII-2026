#include <iostream>
#include <string>
using namespace std;

// https://www.tutorialspoint.com/cplusplus/cpp_interfaces.htm

/* 
  ___       _             __                
 |_ _|_ __ | |_ ___ _ __ / _| __ _  ___ ___ 
  | || '_ \| __/ _ \ '__| |_ / _` |/ __/ _ \
  | || | | | ||  __/ |  |  _| (_| | (_|  __/
 |___|_| |_|\__\___|_|  |_|  \__,_|\___\___|
                                  
*/


/* interface que é aplicável a veículo */
class IPropaganda {
    public:
        virtual string descricaoParaVenda() = 0;
};

/* classe abstrata */
class Veiculo {
    public: 
        string placa;
        string marca;
        string modelo;
        int ano;

        // ===> método que torna a classe abstrata
        virtual void nada() = 0;

        virtual string toString() {
            return placa + string(", ") + marca + string(", ") + 
            modelo + string(", ") + std::to_string(ano);
        }
};

// SUBCLASSE (herança) com INTERFACE
class Carro : public Veiculo, public IPropaganda {
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
        // implementando a interface
        virtual string descricaoParaVenda() {
            return string("Este veículo da marca ") + Super::marca + 
            string(" é excelente! Possui ") + std::to_string(portas) + 
            string(" portas.");
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
}
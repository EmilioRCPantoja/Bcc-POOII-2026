#include <iostream>
#include <string>
using namespace std;

// definição da classe
class Pessoa {
    public:
        string cpf;
        string nome;
        string email;
};

int main() {

    // instanciando um objeto
    Pessoa alguem;

    // atribuindo valores
    alguem.cpf = "123456789-10";
    alguem.nome = "João da Silva";
    alguem.email = "josilva@gmail.com";

    // exibindo
    cout << "CPF: "   << alguem.cpf   << "\n";
    cout << "Nome: "  << alguem.nome  << "\n";
    cout << "Email: " << alguem.email << "\n";

    return 0;
}

// https://www.w3schools.com/cpp/cpp_classes.aspclass

/*

$ g++ Pessoa.cpp -o pessoa
$ ./pessoa

*/
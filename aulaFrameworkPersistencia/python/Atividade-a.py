class Animal:
    def __init__(self, nome, raca):
        self.nome = nome
        self.raca = raca

class Cachorro(Animal):
    def __init__(self, nome, raca, vacinas_realizadas):
        super().__init__(nome, raca)

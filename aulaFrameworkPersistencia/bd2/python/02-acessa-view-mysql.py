import sqlite3

# 1. Conectar ao SQLite (Cria o arquivo 'meu_banco.db' se não existir)
# Use ':memory:' para testar sem criar arquivos
conn = sqlite3.connect('hylson_pessoa.db')
cursor = conn.cursor()

# 2. Criar estrutura (Apenas para demonstração do script completo)
cursor.executescript('''
DROP TABLE IF EXISTS pessoa;
DROP VIEW IF EXISTS vw_pessoa;

CREATE TABLE pessoa (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  nome TEXT,
  email TEXT,
  data_nascimento DATE
);

INSERT INTO pessoa (nome, email, data_nascimento) VALUES
('Maria Oliveira', 'maoliv@gmail.com', '1985-03-22'),
('João Silva', 'josilva@gmail.com', '1990-07-15'),
('Ana Costa', 'acosta@gmail.com', '1978-11-30'),
('Pedro Santos', 'pesantos@gmail.com', '1995-05-10');

CREATE VIEW vw_pessoa AS
SELECT nome, email FROM pessoa 
WHERE strftime('%Y', data_nascimento) >= '1990' 
ORDER BY nome;
''')
conn.commit()

# 3. Acessar a VIEW (Igual ao que você faria no MySQL)
query = "SELECT * FROM vw_pessoa"
cursor.execute(query)
rows = cursor.fetchall()

print("Pessoas que nasceram a partir de 1990 (SQLite):")
for row in rows:
    print(f"Nome: {row[0]}, Email: {row[1]}")

# Fechar conexões
cursor.close()
conn.close()
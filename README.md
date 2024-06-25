Este projeto utiliza Árvore Binária para que a implementação seja capaz de inserir e remover senhas e usuários, além de
permitir validar o par login e senha informado.
Lógica Aplicada para Desenvolvimento do Programa: 
Podemos usar uma árvore binária, onde cada nó representa um dígito de senha, para
implementar um sistema de senhas usando apenas os símbolos "0" e "1." O dígito "0" é
representado pelo nó esquerdo e o dígito "1" é representado pelo nó direito. Cada folha da
árvore terá um endereço de login de usuário. As funções de inserção, remoção e validação de
login estão incluídas nesta implementação Java.
Na inserção, a árvore é percorrida de acordo com os caracteres da senha, criando novos nós
conforme necessário. Ao final da senha, o usuário é associado ao nó correspondente.
O método de remoção percorre a árvore de acordo com a senha, remove o usuário associado
no nó final e retorna um booleano indicando o sucesso da operação.
O método de validação percorre a árvore de acordo com a senha, verifica se o usuário no nó
final corresponde ao usuário fornecido e retorna um booleano indicando se o par login e
senha é válido.
      Exemplo Prático
      Inserindo o login "0011" com o usuário "Maria":
      Senha: "0011":
      Começa na raiz.
      Primeiro caractere: '0'
      Filho esquerdo da raiz é nulo, cria um novo nó à esquerda e move atual para lá.
      Segundo caractere: '0'
      Filho esquerdo do nó atual é nulo, cria um novo nó à esquerda e move atual para lá.
      Terceiro caractere: '1'
      Filho direito do nó atual é nulo, cria um novo nó à direita e move atual para lá.
      Quarto caractere: '1'
      Filho direito do nó atual é nulo, cria um novo nó à direita e move atual para lá.
      Define o usuário "Maria" no nó atual.

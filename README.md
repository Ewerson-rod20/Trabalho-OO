# Trabalho-OO
Repositório criado para o trabalho da disciplina DCC025 - Orientação a Objetos.

O arquivo de README serve para os alunos responsáveis pelo projeto se organizarem.

1: Jogo de luta
	1.1: Batalha em perspectiva (tipo pokemon) ou 2D (a ser decidido)
	1.2: Implementar cenários diferentes.

2: Sistema de classes: mago, cavaleiro e assassino

3: Probabilidade atrelada aos movimentos de atk, defesa...
	3.1: Danos podem variar de acordo com uma porcentagem de sorte.

4: Pontos de atributos para vida, atk, defesa e conhecimento...

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

CLASSES:
1 - Jogador:
    - Nome(Nick) - Login
    - Senha
    - Personagem
    - Criar Personagem () {}
    - Excluir Personagem () {}

2 - Login:
    - Lista de Jogadores
    - Criar Jogador () {}
    - Excluir Jogador () {}

3 - Personagem:
    - Classe // (MAGO - CAVALEIRO - ASSASSINO) - Interfere nos atributos
    - Nome personagem
    - Vida
    - Atk fraco
    - Atk Forte
    - Dfs
    - Conhecimento
    - PntAtributos (pnt pra aumentar os outros atributos) - 5 iniciais e ganha nas lutas

4 - Combate (em turnos):
    - QuemInicia () {}
    - Ataque () {}
    - Defesa () {}
    - Modificador atk // qnt de acordo com a classe
    - Modificador dfs // qnt de acordo com a classe

5 - Master(menu):
    - Login j1 () {}
    - Login j2 () {}
    - Cadastro () {}
    - Instrucoes () {}

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

ENTREGA DE SEGUNDA AGORA

    - Fazer telas no paint!
    - Explicando a ideia inicial do jogo, lembrando de modificadores e etc...
    - Classes com os atributos e metodos
    - Explicacao dos metodos e atributos das classes, Pacote único, explicacao de onde os botoes levam(instrucoes leva pra aa de instrucoes q mostra e tem o voltar......)
    - GITHUB
    - Enviar em PDF

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    - UPSTREAM - Repositorio original
    - Fork gera a ORIGIN local de cada um
    - Cria a branch e entra nela
    - Edita os arquivos
    - git add .
    - git commit -m "..."
    - git push
    - Fazer o pull request

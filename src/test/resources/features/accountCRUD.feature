#language:pt
@CRUD
Funcionalidade:  Account CRUD

  @cadastroConta
  Cenario: Cadastro nova conta
    Dado que a pagina new account esteja sendo exibida
    Quando os campos de cadastro estiverem preenchidos com
      | username | chronosRods3             |
      | email    | rodspersonal22@gmail.com |
      | password | Senha123                 |
      | country  | Brazil                   |
    Então deve ser possivel logar no sistema apos o cadastro

  @loginCRUD
  Cenario: Realizar login crud
    Dado que a modal esteja sendo exibida
    Quando os campos de login sejam preenchidos da seguinte forma
      | login    | chronosRods3  |
      | password | Senha123     |
      | remember | false        |
    Quando for realizado o clique no botao sign in
    Entao deve ser possivel logar no sistema

  @alteracaoCRUD
  Cenario: Realizar alteracao conta
    Dado que esteja logado no sistema com
      | login    | chronosRods3  |
      | password | Senha123     |
      | remember | false        |
    Dado que esteja na pagina de alteracao de conta
    Quando altero os valores dos seguintes campos
      | firstName | chronos |
      | lastName  | Rods   |
    Quando  for realizado o clique em salvar
    Entao a alteracao foi exibida na pagina myAccount

  @exclusaoCRUD
  Cenario: Deletar usuario
    Dado que esteja logado no sistema com
      | login    | chronosRods3 |
      | password | Senha123     |
      | remember | false        |
    Dado que esteja na pagina myAccount
    Quando for efetuado a acao do clique delete e em yes
    Entao o usuario deve ser deletado





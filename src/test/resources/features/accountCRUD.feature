#language:pt
Funcionalidade:  Account CRUD

  @cadastroConta
  Cenario: Cadastro nova conta
    Dado que a pagina new account esteja sendo exibida
    Quando os campos de cadastro estiverem preenchidos com
      | username | chronosRods              |
      | email    | rodspersonal22@gmail.com |
      | password | Senha123                 |
      | country  | Brazil                   |
    Então deve ser possivel logar no sistema apos o cadastro

  @loginCRUD
  Cenario: Realizar login crud
    Dado que a modal esteja sendo exibida
    Quando os campos de login sejam preenchidos da seguinte forma
      | login    | chronosRods |
      | password | Senha123    |
      | remember | false       |
    Quando for realizado o clique no botao sign in
    Entao deve ser possivel logar no sistema

  @alteracaoCRUD
  Cenario: Realizar alteracao conta
    Dado que esteja logado no sistema com
      | login    | chronosRods |
      | password | Senha123    |
      | remember | false       |





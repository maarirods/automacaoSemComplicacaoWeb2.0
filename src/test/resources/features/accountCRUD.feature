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


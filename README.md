## Membros estáticos 

- Também chamados membros de classe
- Ele funciona independentes de objetos diferentes, são chamados a partir do próprio nome da classe.
- Dentro de classes estáticas só pode chamar métodos estáticos.
- Não precisam saber se membros e atributos internos da classes, por isso podem ser uma `util`

#### Aplicações comuns:

- Classes utilitárias. -> Ex: `Math.sqrt(double)`
- Declaração de constantes.

#### Uma classe que possui somentre memos estáticos, pode ser uma classe estática também, essa classe não pode ser instanciada.

## Membros não estáticos

- Dependem dos valores de cada objeto!

## Constructor

- É uma operação especial da classe que executa no momento da instaciação do objeto.
- É possivel especificar mais de um construtor na mesma classe (sobrecarga).
- Product = new Product(); -> Construtor padrão.

## This

- É uma referencia para o próprio objeto (classe)


## Encapsulamento

- É um principio que consiste em esconder detalhes de implementação de uma classe, expondo apenas operações seguras e que mantenham os objetos em um estado consistente.

- Regra de ouro: o objeto deve sempre estar em um estado consistente, e a própria classe deve garantir isso.

#### Regra geral básica
- Um objeto NÃO deve expor nenhum atributo (usar private)
- Os atributos devem ser acessador por meio de métodos get e set
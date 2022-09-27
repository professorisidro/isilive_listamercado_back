# Sistema Lista de Mercado
## Requisitos
- Ser capaz de gerenciar várias listas de mercado (e marcar seu status como concluída ou não)
- Ser capaz de cadastrar produtos e consultá-los
- Ser capaz de incluir produtos nas listas e especificar suas quantidades, bem como marcar se o item já foi comprado ou não
- Ser capaz de atribuir valores aos itens comprados para depois ter uma gestão dos custos da lista
- Ser capaz de adicionar quantidades (kg, unidades, litros, etc)

## Casos de Uso - Produto
### Cadastrar Produtos
Informar o nome de um determinado produto e o sistema o armazena no banco

Entrada esperada
  - nome do produto

Saída esperada
  - id do produto
  - nome do produto

### Consultar produtos
informar palavras chaves para consultar ou mesmo buscar produtos a partir de uma lista

Entrada esperada
  - palavra-chave

Saída esperada
  - lista com produtos que contenham esta palavra chave

### Consultar produtos pelo ID
informar o ID do produto e receber sua descrição

Entrada esperada
  - id do produto

Saída esperada
  - id do produto
  - nome do produto

Saída alternativa
  - vazio (produto não encontrado)

## Casos de Uso - Lista
### Criação de listas
Criar uma nova lista inserindo a data e o local onde foi feita a compra (nome do supermercado/feira, etc)

Entrada esperada: 
  - nome do local

Saída esperada:
  - numero da lista
  - data da criação
  - nome do local
  - valor total = 0

### Apagar uma lista
Remover uma lista que foi criada por engano e remover todos os seus itens que foram criados

Entrada esperada:
  - ID da lista

Saída esperada
  - nenhuma

### Inserção de itens na lista
Criar um item associando a uma lista e a um produto, bem como deixar disponível a possibilidade de modificar quantidade e preço que foi pago

Entrada esperada:
  - código do produto
  - quantidade (opcional)
  - número da lista

Saída esperada
  - numero sequencial do item
  - quantidade (opcional)
  - preço zerado
  - número da lista correspondente

### alteração de itens da lista
Alterar apenas quantidade, preço pago e status

Entrada esperada
  - numero sequencial do item
  - novo preço
  - nova quantidade
  - codigo do produto
  - numero da lista

Saída esperada
  - numero sequencial do item
  - novo preço
  - nova quantidade
  - codigo do produto
  - numero da lista

### remoção de itens da lista
poder remover um item que foi cadastrado na lista

Entrada esperada
  - numero sequencial do item

Saída esperada
  - nenhum
### fechamento da lista
concluir a lista como sendo completa e gerar seu custo total a partir dos itens comprados

Entrada esperada
  - numero da lista
Saída esperada
  - Objeto Lista contendo todos os seus atributos e com o valor total correspondente à somatória dos itens




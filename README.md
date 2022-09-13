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

### Consultar produtos
informar palavras chaves para consultar ou mesmo buscar produtos a partir de uma lista
### Alterar dados de produtos
basicamente alterar o nome do produto e termos sua efetivação no banco de dados

## Casos de Uso - Lista
### Criação de listas
Criar uma nova lista inserindo a data e o local onde foi feita a compra (nome do supermercado/feira, etc)
### Apagar uma lista
Remover uma lista que foi criada por engano e remover todos os seus itens que foram criados
### Inserção de itens na lista
Criar um item associando a uma lista e a um produto, bem como deixar disponível a possibilidade de modificar quantidade e preço que foi pago
### alteração de itens da lista
Alterar apenas quantidade, preço pago e status
### remoção de itens da lista
poder remover um item que foi cadastrado na lista
### fechamento da lista
concluir a lista como sendo completa e gerar seu custo total a partir dos itens comprados




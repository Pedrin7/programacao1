qtd = int(input("Informe quantos itens serão comprados: "))
listaCompras = []

for i in range(0, qtd):

    listaCompras.append(input("Nome do produto: "))

print("Lista de compras:",listaCompras)
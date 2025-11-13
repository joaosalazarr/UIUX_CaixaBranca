# Tarefa Caixa Branca UI/UX

## Notação de grafo de fluxo

![Grafo de Fluxo UIUX.png](images/Grafo_de_fluxo_UIUX.png)

## Cálculo de complexidade ciclomática
M = E - N + 2P  
E = 15 (arestas)  
N = 13 (nós)  
P = 1 (programa)

M = 4

## Caminhos básicos

### **Caminho básico 1** - Falha imediatamente:
N1 → N2 → N4 → N5 → N6 → N7 → N9 → N13

### **Caminho básico 2** - Conexão funciona, mas query falha
N1 → N2 → N3 → N5 → N6 → N7 → N9 → N13

### **Caminho básico 3** - Conexão ok, query ok, porém usuário não é encontrado
N1 → N2 → N3 → N5 → N6 → N7 → N8 → N11 → N13

### **Caminho básico 4** - Conexão ok, query ok
N1 → N2 → N3 → N5 → N6 → N7 → N8 → N10 → N12 → N13

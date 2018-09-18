# Algoritmo de Ordenação "Dividir e Conquistar"

## Merge Sort

A classificação de mesclagem é baseada no paradigma de divisão e conquista. O algoritmo consiste em dividir 
recursivamente a lista não classificada no meio, classificando cada sublist e, em seguida, mesclá-los em uma única 
lista classificada. Notar que se a lista tiver comprimento == 1, ela já está classificada.

![Merge Sort](https://github.com/juliafealves/leda-ordenacao-comparacao-recursivo/blob/master/merge_sort.gif "Merge Sort")

## Quick Sort

O Quicksort é baseado no paradigma de divisão e conquista. O algoritmo escolhe um elemento pivot e reorganiza os 
elementos do intervalo de tal forma que todos os elementos menores que o pivô vão para a parte esquerda da matriz e 
todos os elementos maiores que o pivô, vão para a parte direita do array. Então classifica recursivamente as partes 
esquerda e direita. Observe que, se a lista tem comprimento == 1, já está classificado.

![Quick Sort](https://github.com/juliafealves/leda-ordenacao-comparacao-recursivo/blob/master/quick_sort.png "Quick Sort")

## Three Way Quick Sort

No algoritmo de quicksort, selecionamos um elemento como pivot, particionamos o array colocando os menores a esquerda do 
pivot e os maiores a direita do pivot, e depois aplicamos a mesma estrategia recursivamente na particao a esquerda do 
pivot e na particao a direita do pivot.
Considerando um array com muitoe elementos repetidos, a estrategia do quicksort pode ser otimizada para lidar de forma 
mais eficiente com isso. Essa melhoria eh conhecida como quicksort tree way e consiste da seguinte ideia:
```
- selecione o pivot e particione o array de forma que
* arr[l..i] contem elementos menores que o pivot
* arr[i+1..j-1] contem elementos iguais ao pivot.
* arr[j..r] contem elementos maiores do que o pivot.
```
Obviamente, ao final do particionamento, existe necessidade apenas de ordenar as particoes contendo elementos menores e 
maiores do que o pivot. Isso eh feito recursivamente.

![Three Way Quick Sort](https://github.com/juliafealves/leda-ordenacao-comparacao-recursivo/blob/master/3way.png "Three Way Quick Sort")

### Gráfico de Execução

![Gráfico](https://github.com/juliafealves/leda-ordenacao-comparacao-recursivo/blob/master/chart.png "Gráfico")

## Representação de cores

Toda imagem é representada por pixels (pontos gráficos) que carregam informações de cor. Tradicionalmente, cada pixel é definido pelas cores vermelho, verde e azul e um valor entre 0 e 255 (inclusive) associado a cada uma delas. Quanto mais escuro um pixel, menor o valor de vermelho, verde e azul que esse pixel tem.

Quando se deseja aplicar um filtro de cores, o que se costuma fazer é alterar tais valores de forma que a cor da imagem é alterada. Um exemplo de filtro clássico é o "preto e branco". Quando se deseja transformar uma imagem colorida em preto e branco, uma alternativa é pegar cada pixel e, se o valor de vermelho, verde ou azul dela for menor do que 128, o pixel é convertido para preto. Se, no entanto, esses três valores estiverem acima de 128, o pixel é convertido para branco.

Faça um programa que representa 3 entradas, R G B, entre 0 e 255. Se pelo menos um dos valores estiver abaixo de 128, o programa deve imprimir PRETO indicando que aquele pixel deve ser convertido para preto. Caso os 3 valores estejam igual ou acima de 128, o programa deve exibir BRANCO. Veja o exemplo

Input
```
255
0
0
```
Output
```
PRETO
```
Input
```
128
128
128
```
Output
```
BRANCO
```


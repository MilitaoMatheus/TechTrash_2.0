# TechTrash_2.0
## Aplicativo criado por Matheus Militão e Livia Rodrigues Cremonez   2 DS   
## Trabalho de PAM - Profa Aline   

### Tópicos  
- Intuito do projeto.
- Processo de criação.  

### Intuito do projeto  
O projeto TecTrash foi criado com o intuito de poder conscientizar e auxiliar o usuário em relação ao lixo eletrônico, que se descartado de maneira incorreta, acaba sendo extremamente prejudicial ao meio ambiente, podendo reduzir a vida de aterros sanitários, contaminar os solos, fauna e flora, por conta da quantidade de metais pesados.   
Sabendo-se disso, juntamente com a conscientização, viriam telas que ensinasse a maneira correta do descarte desse tipo de lixo, seja em pontos de coleta, ou até mesmo entrando em contato com o fabricante. 

<br>

### Processo de criação  
O aplicativo conta com 6 telas, com 1 delas sendo a de inicio, 1 sendo para a escolha do usuário(para decidir em qual sessão ele irá), e as outras 4 sendo sobre o conteúdo proposto.  
Foi utilizado a linguagem Java, e os recursos do Android Studio, como TextViews, Buttons(e ImageButtons), transição de uma tela para a outra, entre outros.  
Em relação ao design, preferimos utilizar as cores branco e verde, para ppoder simbolizar de maneira mais fiel sobre a importância do bem estar da natureza, e simbolos como o de reciclagem, que foi um dos mais utilizados no aplicativo.  

![diagrama 2 0](https://github.com/MilitaoMatheus/TechTrash_2.0/assets/127455174/9fb7a8b0-7a0b-44ba-96c7-bc9c24f6b8b0)

### Ao total foram:
- 5 Buttons
- 4 ImageButtons
- Diversas TextViews
- Simbolos e Imagens
- 6 Telas
- Entre outros.

<br>

# Itens que serão adcionados no aplicativo

### Tela de login (não adcionada no momento, já que o aplicativo é informativo)
``` 
Pensamos em fazer um tela de login, mas que no momento não será aplicada ao aplicativo, pois não tivemos uma ideia concreta sobre o que colocar no aplicativo que dependesse de um login. 
Algumas ideias futuras para algo que dependesse do login:
- Cadastro para um questionário sobre as informações vistas no aplicativo.
- Um local de comentários que receberiam o cadastro da pessoa e mostrasse seu nome e foto junto com o comentário (padrão do comentário do Facebook, Instagram, em resumo, padrão dos comentários das redes sociais).
```

### Questionário (idéia não concretizada)
```
Basicamente um questionário que desafiaria o usuário a usar todo seu conhecimento e aprendizado que viu na aplicação. Ao final do questionário, dependendo da pontuação, o usuário ganharia uma espécie de "brinde", seja uma medalha, ou algum icon.
```

### Perfil (idéia futura)
```
Uma nova tela onde o usuário poderia ter o seu próprio perfil na aplicação, assim podendo adicionar, atualizar ou retirar informações, além disso, poderia mudar a cor do aplicativo (modo claro e modo noturno). E por fim, poderia ver uma parte exclusiva para os criadores da aplicação utilizada.
```

### Localização
```
Essa parte seria adicionada exclusivamente na tela que informa sobre onde descartar o lixo eletrônico. Assim mostrando os pontos de descarte perto de sua localização atual. E caso o usuário ainda fique com dúvida sobre aonde descartar o Lixo eletrônico, deixaremos um botão ou um link que o direcione para um site que permite o agendamento para a coleta do lixo. Site:http://www.sardobrasil.com.br/compra-sucata-lixo-eletronico/?gclid=Cj0KCQjwldKmBhCCARIsAP-0rfyxcxRQv3pbQVW8KKe_9KwOnX74tKFDN83xTHM0L36poE8Nbrlewj4aAsuxEALw_wcB
```

## Diagrama de classes - TechTrash
![Diagrama de classes - TechTrash](https://github.com/MilitaoMatheus/TechTrash_2.0/assets/127455174/28897f93-ed05-4ba3-8591-980feb059791)

### Classe Lixos
```
É a classe principal (até o momento) do aplicativo. Todas as outras classes dependeriam dela, pois toda as informações "sairiam" de lá.
```

### classe Curiosidades
```
É uma classe que recebrá uma nova tela que conterá curiosidades sobre o lixo eletrônico 
```

### Classe pontos de descarte
```
Entraria como uma informação que não ficaria diretamente dentro da classe Lixo, mas sim dentro de um dos atributos da classe Lixo
```

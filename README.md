O que é uma View no Android Framework?

R: Uma View no Android é o que aparece na tela para o usuário interagir. Basicamente é um componente visual retangular, como um botão, um campo de texto ou uma imagem. A função dela é se desenhar na tela, controlar sua própria visibilidade e responder aos comandos do usuário, como cliques e toques.


O que é um ViewGroup no contexto da interface Android?

R: O ViewGroup funciona como uma caixa invisível que serve para agrupar e organizar essas Views ou até outros ViewGs. Enquanto a View é o componente em si, o ViewGroup decide onde cada coisa vai ficar, formando uma espécie de árvore de elementos na tela. Exemplos disso são o LinearLayout e o ConstraintLayout.


Qual é a função dos LayoutParams dentro de um ViewGroup?

R: Os LayoutParams são as configurações que uma View filha manda para o ViewGroup pai para dizer como ela quer ser mostrada. É através deles que a View avisa ao "pai" qual deve ser sua largura, sua altura e suas margens, usando regras como wrap_content ou match_parent. Sem isso, o gerenciador de layout não saberia como dimensionar o espaço de cada elemento


Por que diferentes ViewGroups, como LinearLayout, ConstraintLayout e FrameLayout, utilizam subclasses específicas de LayoutParams?

R: Diferentes ViewGroups usam subclasses específicas de LayoutParams porque cada tipo de layout organiza a tela de um jeito totalmente diferente. 

Por exemplo, o LinearLayout organiza tudo em fila e precisa do peso dos elementos para dividir o espaço. O ConstraintLayout funciona por amarrações e âncoras entre os componentes, enquanto o FrameLayout só empilha as coisas usando a gravidade. Como cada um tem uma lógica matemática própria, as Views filhas precisam usar parâmetros que o layout pai consiga entender.
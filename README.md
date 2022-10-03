# Cobertura de testes com EclEmma


## Teste de cobertura

 Testes de softwares é um processo de execução, que determina se um produto está atingindo as especificações e funcionalidades a qual foi desenvolvido (Rios & Moreira, 2006).

 No âmbito de testes de softwares, existe uma técnica conhecida como Cobertura, que tem o papel de auxiliar na qualidade do software que está em desenvolvimento. Esta técnica consiste na definição do percentual de código fonte que está sendo coberto pelos testes desenvolvidos para o projeto. Tal porcentagem é uma métrica obtida pela quantidade de código fonte que é executado durante os testes.

## EclEmma

Existem algumas ferramentas que possibilitam realizar os testes de cobertura nos projetos de softwares. Uma delas, a que vamos tratar, é a EclEmma. 

EclEmma é um ferramenta de cobertura de código, gratuito, disponível sobre Licença Pública Eclipse. Essa ferramenta, traz uma análise de cobertura diretamente na IDE Eclipse. A partir da versão 2.0, a ferramenta foi baseada na biblioteca de cobertura de código, JaCoCo.

Uma das principais características da ferramenta, é que a mesma funciona de forma independente no projeto, podendo ser executada a qualquer momento. Também dá suporte a diversos frameworks de testes, como:

- Junit Test
- TestNg Test
- SWTbot Test
- etc …

Vamos trabalhar com o framework Junit na versão 4. Também utilizaremos da técnica de desenvolvimento de testes TDD (Test Driven Development). 

Utilizaremos a Eclipse IDE 2022-09, com a JDK na versão 1.5. Por padrão, o EclEmma já vem instalado nessa IDE.

## Projeto simples - Calculadora 

Desenvolvemos um pequeno e simples projeto de exemplo para analisarmos o funcionamento da ferramenta de cobertura.

O projeto consiste em uma calculadora simples, que realiza as quatro operações básicas. 

Utilizou-se a técnica de TDD, para desenvolvimento do projeto. Basicamente a técnica consiste na escrita dos testes antes da escrita do código fonte da aplicação.

Todo o código desenvolvido neste trabalho, está disponível em um repositório público do GitHub.

Na imagem abaixo, pode-se ver a estrutura do projeto elaborado.

### Imagem 1
![zyro-image (1)](https://user-images.githubusercontent.com/37565620/193324395-6ba68c6e-9268-42a9-8520-ff2d636eb176.png)

Na class CalculadoraTest(), Link 1, pode-se verificar o código da classe CalculadoraTest. Esta classe contém os códigos gerados para testar as quatro operações básicas da matemática. Foi elaborado testes simples, que basicamente, por meio de uma operação matemática verifica o resultado esperado. 

Como nosso foco principal, é entender e verificar o funcionamento do EclEmma na cobertura dos testes, não traremos maiores detalhes sobre o TDD ou a ferramenta Junit.

### Link 1
[https://github.com/otnirodrigues/TesteActivity/blob/main/src/test/java/com/teste/CalculadoraTest.java](url)

No Link 2, pode-se verificar o código da classe CalculadoraTest. Esta classe contém os códigos gerados para testar as quatro operações básicas da matemática. Foi elaborado testes simples, que basicamente, por meio de uma operação matemática verifica o resultado esperado. 

Como nosso foco principal, é entender e verificar o funcionamento do EclEmma na cobertura dos testes, não traremos maiores detalhes sobre o TDD ou a ferramenta Junit.

### Link 2
[https://github.com/otnirodrigues/TesteActivity/blob/main/src/test/java/com/teste/CalculadoraTest.java](url)

No Link 3, pode-se verificar a Class Calculadora. Nesta, está desenvolvido os métodos das quatro operações básicas da matemática.

### Link 3
[https://github.com/otnirodrigues/TesteActivity/blob/main/src/main/java/com/teste/Calculadora.java](url)

Após a escrita dos testes, e dos métodos a serem testados, podemos executar o EclEmma para analisar a cobertura de testes que nosso projeto possui. Para isso, basta selecionar a opção Converge As da IDE Eclipse. Na imagem 2, está ilustrada a opção Converge As.

### Imagem 2
![Capturar](https://user-images.githubusercontent.com/37565620/193340575-0959b742-01ff-43bc-8618-25d279087d94.PNG)

Após selecionar a opção, será aberta uma aba denominada Converge, como ilustrado na Imagem 3. Nela pode-se analisar a porcentagem de cobertura do projeto, que está em 94.0%. Também pode-se verificar a quantidade de linhas de códigos analisadas, a quantidade de linhas não analisadas e o total de linhas de códigos de cada arquivo.

### Imagem 3
![55](https://user-images.githubusercontent.com/37565620/193340975-d3dd8d20-59ae-4428-a738-3d6eb4fb1de2.png)

Podemos verificar que o código das Class Calculadora e CalculadoraTest, agora estão coloridos:

- Verde - Linha de código executada
- Amarelo - Ponto de decisão
- Vermelho - Código não executado
	
Na Imagem 4, podemos verificar melhor quais linhas foram executadas, quais não foram, e quais estão marcadas como ponto de decisão.

Isso mostra como o Eclemma funciona. Ele executa todos os testes, e a classe de de métodos criados a partir dos testes, e retorna a porcentagem de cobertura que nosso código fonte possui.

Vamos agora testar o que acontece se apagarmos o test testSomar() da Class CalculadoraTest. 

### Imagem 4
![77](https://user-images.githubusercontent.com/37565620/193341194-061f7c5f-6993-4eff-b9ad-15699d599dd3.png)

Ao apagarmos esse test, temos uma queda no percentual de cobertura dos testes. Na imagem 5, pode-se notar o percentual de cobertura do projeto, agora em 88,4%. Também nota-se que o EclEmma mostra que a 0,0% de testes para o método somar(), da classe Calculadora.

### Imagem 5
![44](https://user-images.githubusercontent.com/37565620/193341342-d0f3b081-ea86-4774-93f3-08ef10487436.png)

## Conclusão

Logo, podemos concluir que o Eclemma, é uma ferramenta de cobertura de código muito eficaz e viável para testarmos projetos a qualquer momento do ciclo de desenvolvimento.

É importante ressaltar que a cobertura de código, não indica que mais testes não precisam ser implementados. Se as linhas de código estão todas em verde, indica que todas as linhas foram executadas durante algum teste, mas não indica que existem testes específicos para tal método. E mesmo que existam testes específicos para determinado método, não significa que ele está totalmente coberto.

Por isso, os testes devem ser bem planejados, pois a cobertura de testes não está relacionada apenas à quantidade de testes, mas também à qualidade.

## Referência

Rios, E., & Moreira, T. (2006). Teste de software. Alta Books Editora.


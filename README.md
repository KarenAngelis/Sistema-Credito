<h1>request-credit-system</h1>
<p align="center">API Rest para um Sistema de Analise de Solicitação de Crédito</p>
<p align="center">
     <a alt="Java">
        <img src="https://img.shields.io/badge/Java-v17-blue.svg" />
    </a>
    <a alt="Kotlin">
        <img src="https://img.shields.io/badge/Kotlin-v1.7.22-purple.svg" />
    </a>
    <a alt="Spring Boot">
        <img src="https://img.shields.io/badge/Spring%20Boot-v3.0.3-brightgreen.svg" />
    </a>
    <a alt="Gradle">
        <img src="https://img.shields.io/badge/Gradle-v7.6-lightgreen.svg" />
    </a>
    <a alt="H2 ">
        <img src="https://img.shields.io/badge/H2-v2.1.214-darkblue.svg" />
    </a>
    <a alt="Flyway">
        <img src="https://img.shields.io/badge/Flyway-v9.5.1-red.svg">
    </a>
</p>

<h3>Descrição do Projeto</h3>
<p><a href="https://gist.github.com/cami-la/560b455b901778391abd2c9edea81286">https://gist.github.com/cami-la/560b455b901778391abd2c9edea81286</a></p>
<figure>
<p align="center">
  <img src="https://i.imgur.com/7phya16.png" height="350" width="450" alt="API para Sistema de Avaliação de Créditos"/><br>
  Diagrama UML Simplificado de uma API para Sistema de Avaliação de Crédito
</p>
</figure>

<h3>Instrução de Uso</h3>
<p>No Terminal/Console:</p>
<ol>
	<li>Faça um clone do projeto na sua máquina: <code>git clone git@github.com:cami-la/credit-application-system.git</code></li>
	<li>Entre na pasta raiz do projeto: <code>cd </code></li> 
	<li>Execute o comando: <code>./gradlew bootrun</code></li>
</ol>
<h6>** Visando facilitar a demostração da aplicação, recomendo instalar apenas o IntelliJ IDEA e executar o projeto através da IDE **</h6>

<h3>Autor</h3>

<a href="https://www.linkedin.com/in/cami-la/">
 <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/64323124?v=4" width="100px;" alt=""/>
 <br />
 <sub><b>Camila Cavalcante</b></sub></a> <a href="https://www.instagram.com/camimi_la/" title="Instagram"></a>

Feito com ❤️ por Cami-la 👋🏽 Entre em contato!

[![Linkedin Badge](https://img.shields.io/badge/-Camila-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/cami-la/)](https://www.linkedin.com/in/cami-la/)
[![Gmail Badge](https://img.shields.io/badge/-camiladsantoscavalcante@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:camiladsantoscavalcante@gmail.com)](mailto:camiladsantoscavalcante@gmail.com)
<hr>
<h3>Contribuindo</h3>

Este repositório foi criado para fins de estudo, então contribua com ele.<br>
Se te ajudei de alguma forma, ficarei feliz em saber. Caso você conheça alguém que se identifique com o conteúdo, não
deixe de compatilhar.


🔍 Possíveis Erros e Soluções
Se os testes falharem, aqui estão algumas possíveis causas e como corrigi-las:

Erro	
mvn: command not found	
Solução: Verifique se o Maven foi instalado corretamente e reinicie o terminal.

Erro	
Tests failed	
Solução: Verifique a mensagem de erro específica, pode ser um problema no código ou no banco de dados.

Erro	
No tests were found	
Solução: Confirme que os arquivos de teste estão dentro de src/test/kotlin/.

Erro	
ClassNotFoundException	
Solução: O teste pode estar chamando uma classe que não foi importada corretamente.

🎯 Resultado Esperado
Se tudo estiver correto, ao rodar mvn test, você verá uma saída semelhante a esta:

bash

[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running me.dio.credit.application.system.service.CreditServiceTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.34 sec
[INFO] -------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] Total time: 5.123s
Isso significa que todos os testes passaram com sucesso! ✅🎉


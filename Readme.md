# POS Application

## Descrição do Projeto
Este projeto foi proposto na UFCD de Programação Avançada em Java, do Curso de Ciências Informáticas - Técnico/a de Informática - Sistemas do IEFP de Alcoitão, de uma aplicação POS (Point of Sale) desenvolvida em Java, um sistema de ponto de venda simples, neste caso de uma Pastelaria. A aplicação permite gerenciar produtos, quantidades, preços, processar pagamentos, imprimir recibos e registrar os pedidos na base de dados, proporcionando uma solução eficiente e prática para pequenas empresas. 
Foi desenvolvido utilizando a IDE Apache NetBeans 15 e o MySQL (XAMPP v3.3.0) como base de dados.

## Funcionalidades
- 🛒 **Adicionar Produtos**: Adicione diferentes produtos com seus respectivos preços.
- 📊 **Gerenciar Quantidades**: Aumente ou diminua as quantidades de produtos no carrinho.
- 💵 **Processar Pagamentos**: Calcule o valor total da compra e processe o pagamento, incluindo cálculo de troco.
- 🧾 **Imprimir Recibos**: Gere e imprima recibos de pagamento.
- 💽 **Registro Automático**: Após a impressão do recibo, o pedido é registrado automaticamente na base de dados.

## Tecnologias Utilizadas
- **IDE**: Apache NetBeans IDE 15
- **Base de Dados**: MySQL (via XAMPP v3.3.0)
- **Linguagem de Programação**: Java

## Como Executar a Aplicação
1. **Compilação**:
    - Quando compila o projeto Java que possui uma classe principal, a IDE automaticamente copia todos os arquivos JAR no classpath do projeto para a pasta `dist/lib`.
    - A IDE também adiciona cada um dos arquivos JAR ao elemento Class-Path no arquivo de manifesto do JAR da aplicação (MANIFEST.MF).

2. **Execução**:
    - Para executar o projeto a partir da linha de comando, vá para a pasta `dist` e digite o seguinte comando:
      ```bash
      java -jar "POS.jar"
      ```

3. **Distribuição**:
    - Para distribuir este projeto, compacte a pasta `dist` (incluindo a pasta `lib`) e distribua o arquivo ZIP.

## Observações
- Se dois arquivos JAR no classpath do projeto tiverem o mesmo nome, apenas o primeiro arquivo JAR será copiado para a pasta `lib`.
- Somente arquivos JAR são copiados para a pasta `lib`. Se o classpath contiver outros tipos de arquivos ou pastas, esses arquivos (ou pastas) não serão copiados.
- Se uma biblioteca no classpath do projeto também tiver um elemento Class-Path especificado no manifesto, o conteúdo do elemento Class-Path deve estar no caminho de execução do projeto.
- Para definir uma classe principal em um projeto Java padrão, clique com o botão direito no nó do projeto na janela de Projetos e escolha Propriedades. Em seguida, clique em Executar e insira o nome da classe no campo Classe Principal. Alternativamente, pode digitar manualmente o nome da classe no elemento Main-Class.

## Contato
Para mais informações, sugestões ou dúvidas, entre em contato comigo através do [meu perfil no GitHub](https://github.com/NathSantos2024).

Aproveite a aplicação! 😊

---

**Nota**: Este projeto é distribuído sob a licença MIT. Para mais detalhes, consulte o arquivo LICENSE no repositório.

---

## Screenshots

![Tela Principal](https://raw.github.com/NathSantos2024/POS_Application/master/Testando/Aplicação.png)
![Tela de Pagamento](https://raw.github.com/NathSantos2024/POS_Application/master/Testando/Pedidofinalizado.png)  

---

## Requisitos do Sistema
- **Java JDK** 8 ou superior
- **MySQL** (via XAMPP ou outro servidor de banco de dados)

---

## Estrutura do Projeto

pos-application/<br>
│<br>
├── src/                       # Código fonte<br>
│   ├── pos/                   # Pacote principal<br>
│   │   ├── frm_pos.java       # Classe principal da aplicação<br>
│   │   └── ...                # Outras classes e arquivos<br>
│<br>
├── dist/                      # Pasta de distribuição<br>
│   ├── lib/                   # Bibliotecas necessárias<br>
│   ├── POS.jar                # Arquivo executável da aplicação<br>
│<br>
├── README.md                  # Este arquivo<br>
├── LICENSE                    # Licença do projeto<br>
└── ...                        # Outros arquivos<br>


---

Se gostou deste projeto, por favor, considere dar uma estrela ⭐ no [repositório no GitHub](https://github.com/NathSantos2024/POS_Application). Isso ajuda muito!

**Divirta-se com a aplicação POS!** 🛍️💳

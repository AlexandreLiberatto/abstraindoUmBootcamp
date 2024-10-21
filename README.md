---

# 🚀 **Desafio: Aprendendo na Prática o Paradigma de Orientação a Objetos (POO)**

Bem-vindo ao repositório deste projeto desenvolvido como parte de um desafio da [Digital Innovation One](https://www.dio.me/). Este desafio visa consolidar conceitos fundamentais de **Programação Orientada a Objetos (POO)** por meio de um projeto prático em Java, abordando conceitos essenciais como **Abstração**, **Encapsulamento**, **Herança** e **Polimorfismo**.

---

## 📝 **Descrição do Projeto**

O desafio propõe a criação de um sistema que modela o domínio de um **Bootcamp**, aplicando conceitos de **POO** para garantir código legível, organizado e com boa manutenibilidade. O projeto envolve a criação e o relacionamento entre várias classes e objetos que refletem o funcionamento de um Bootcamp, como cursos, mentorias e desenvolvedores.

---

## 🛠️ **Tecnologias Utilizadas**
- **Java 17+**
- Paradigma de Programação Orientada a Objetos (POO)
- Ferramentas para desenvolvimento Java:
  - JDK e IntelliJ IDEA / VS Code
  - Git e GitHub para controle de versão

---

## 📂 **Estrutura do Projeto**

```bash
📦 Projeto-Desafio-POO
├── src
│   ├── Bootcamp.java        # Classe que representa o Bootcamp
│   ├── Curso.java           # Classe de cursos com título e carga horária
│   ├── Mentoria.java        # Classe que representa uma mentoria
│   ├── Dev.java             # Classe para desenvolvedores inscritos no Bootcamp
│   └── Main.java            # Classe principal para execução do programa
├── README.md                # Documentação do projeto
└── .gitignore               # Arquivos a serem ignorados pelo Git
```

---

## 🔧 **Como Executar o Projeto**

1. **Pré-requisitos:**  
   Certifique-se de ter o **JDK** instalado. [Clique aqui](https://www.oracle.com/java/technologies/javase-downloads.html) para baixar.

2. **Clonando o Repositório:**
   ```bash
   git clone https://github.com/AlexandreLiberatto/abstraindoUmBootcamp.git
   cd abstraindoUmBootcamp
   ```

3. **Compilando e Executando:**
   Navegue até a pasta `src` e execute:
   ```bash
   javac Main.java
   java Main
   ```

---

## 📋 **Funcionalidades Implementadas**

- **Cadastrar Bootcamp:** Criar um bootcamp contendo cursos e mentorias.
- **Inscrever Devs:** Inscrever desenvolvedores e acompanhar seu progresso.
- **Concluir Atividades:** Marcar cursos e mentorias como concluídos e calcular XP acumulado.
- **Mostrar Ranking:** Listar os devs com maior XP adquirido.

---

## 🎯 **Conceitos de POO Aplicados**

- **Abstração:**  
  Identificação das características essenciais de cada entidade (curso, mentoria, dev, bootcamp).

- **Encapsulamento:**  
  Controle de acesso aos atributos das classes por meio de **getters** e **setters**.

- **Herança:**  
  Criação de uma estrutura reutilizável, com as classes filhas herdando atributos e métodos.

- **Polimorfismo:**  
  Implementação de comportamentos diferentes com base em um mesmo método nas classes derivadas.

---

## 👨‍💻 **Exemplo de Código**

```java
Bootcamp bootcamp = new Bootcamp();
bootcamp.setNome("Java Developer Bootcamp");

Curso cursoJava = new Curso();
cursoJava.setTitulo("Curso de Java");
cursoJava.setCargaHoraria(8);

Mentoria mentoriaJava = new Mentoria();
mentoriaJava.setTitulo("Mentoria de Java Avançado");

bootcamp.getConteudos().add(cursoJava);
bootcamp.getConteudos().add(mentoriaJava);

Dev dev = new Dev();
dev.setNome("João Silva");
dev.inscreverBootcamp(bootcamp);

System.out.println("Conteúdos Inscritos: " + dev.getConteudosInscritos());
dev.progredir();
System.out.println("Conteúdos Concluídos: " + dev.getConteudosConcluidos());
```

---

## 🚀 **Melhorias Futuras**

- Implementação de uma interface gráfica (GUI).
- Persistência de dados usando um banco de dados (ex.: SQLite).
- Testes automatizados com **JUnit**.
- Relatórios de progresso dos desenvolvedores.

---

## 📅 **Roadmap**

- **Sprint 1:** Modelagem das classes principais e atributos.
- **Sprint 2:** Implementação dos métodos de progresso e cálculo de XP.
- **Sprint 3:** Testes e refinamento do código.
- **Sprint 4:** Documentação e melhorias finais.

---

## 🤝 **Contribuições**

Contribuições são sempre bem-vindas! Se você quiser melhorar algo no projeto:
1. **Fork** este repositório.
2. Crie uma **branch** para a feature:  
   ```bash
   git checkout -b feature/nova-feature
   ```
3. Envie suas alterações:  
   ```bash
   git push origin feature/nova-feature
   ```
4. Abra um **pull request** e descreva suas alterações.

---

## 🛡️ **Licença**

Este projeto está licenciado sob a **MIT License**. Veja o arquivo [LICENSE](https://opensource.org/licenses/MIT) para mais detalhes.

---

## 🏅 **Desafio Original**

Este projeto faz parte do desafio **"Aprendendo na Prática o Paradigma de Orientação a Objetos"**, co-criado com a **DIO**. A proposta é incentivar o uso de conceitos de **POO** de forma prática e consolidar conhecimentos fundamentais de desenvolvimento em Java.

---

## 📬 **Contato**

- **Autor:** [Alexandre Liberato](https://www.linkedin.com/in/alexandre-liberato-32179624b/)
- **E-mail:** alexandreliberatto@gmail.com  
- **WhatsApp:** +55 48 99160-4054

---

## 👨‍💻 **Autor**

Feito com ❤️ por [Alexandre Liberato](https://github.com/AlexandreLiberatto).  
Vamos nos conectar no [LinkedIn](https://www.linkedin.com/in/alexandre-liberato-32179624b/)!

---

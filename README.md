# 🔄 Atividades de Sobrescrita e Polimorfismo em Java

## 🎯 Sobre o Projeto

Este repositório contém exercícios práticos sobre **Sobrescrita e Polimorfismo em Java**, desenvolvidos durante as aulas com o **Professor Bruno**. O objetivo principal foi consolidar os conceitos avançados de Programação Orientada a Objetos (POO), especificamente:

- **Sobrescrita (Override)** - Personalização de métodos herdados
- **Polimorfismo** - Comportamento dinâmico baseado no tipo do objeto
- **toString()** - Representação textual personalizada de objetos

## 🧠 Conceitos Aprendidos

### ✏️ Sobrescrita (Override)
- **Definição**: Personalizar métodos herdados da superclasse
- **@Override**: Anotação que indica sobrescrita de método
- **toString()**: Método especial para representação textual do objeto
- **Vantagens**: Controle total sobre como o objeto é exibido

### 🔄 Polimorfismo
- **Definição**: "Muitas formas" - mesmo método com comportamentos diferentes
- **Tipos**: Polimorfismo de sobrescrita (override)
- **Benefícios**: Flexibilidade e extensibilidade do código
- **Aplicação**: Coleções e arrays com tipos base

### Palavras-chave Importantes
- `@Override`: Indica sobrescrita de método
- `toString()`: Método para representação textual
- `List<Superclasse>`: Coleções polimórficas
- `System.out.println()`: Chama toString() automaticamente

### Vantagens dos Conceitos
- 🎯 **Flexibilidade na implementação**
- 🔧 **Código mais limpo e legível**
- 🧩 **Representação personalizada de objetos**
- 🔁 **Comportamento dinâmico**
- 📝 **Saída de dados mais útil**

## 📁 Estrutura dos Projetos

Cada projeto segue uma estrutura padronizada:
```
ProjetoNome/
├── src/
│   └── br.com.appNome/
│       ├── Main.java
│       ├── [Classe1].java
│       ├── [Classe2].java
│       └── ...
│   └── br.com.appNome.service/
│       └── CadastroService.java
```

## 🎮 Projetos Desenvolvidos

### 1. 🐾 **ProjetoAnimais** - Animais de Estimação
- **Classe Base**: `Animal` (nome)
- **Subclasses**:
  - `Cachorro` (toString: "Cachorro: <nome> - Au Au!")
  - `Gato` (toString: "Gato: <nome> - Miau!")
- **Conceito**: Polimorfismo com List<Animal>
- **Funcionalidade**: Lista de animais com representação personalizada

### 2. 🚙 **ProjetoVeiculos** - Sistema de Veículos
- **Classe Base**: `Veiculo` (marca)
- **Subclasses**:
  - `Carro` (número de portas)
  - `Moto` (tem carenagem - boolean)
- **Conceito**: toString() personalizado para cada tipo
- **Funcionalidade**: Exibição específica baseada no tipo de veículo

### 3. 🏦 **ProjetoContas** - Contas Bancárias
- **Classe Base**: `Conta` (número)
- **Subclasses**:
  - `ContaCorrente` (limite do cheque especial)
  - `ContaPoupanca` (taxa de juros)
- **Conceito**: Representação textual específica para cada tipo de conta
- **Funcionalidade**: Informações bancárias formatadas

### 4. 💻 **ProjetoDispositivos** - Dispositivos Eletrônicos
- **Classe Base**: `Dispositivo` (nome)
- **Subclasses**:
  - `Smartphone` (sistema operacional)
  - `Notebook` (tamanho da tela em polegadas)
- **Conceito**: Polimorfismo com coleções
- **Funcionalidade**: Lista de dispositivos com características específicas

## 🔧 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior
- Compilador Java

### Compilação e Execução
```bash
# Navegar para o projeto desejado
cd ProjetoNome

# Compilar
javac *.java

# Executar
java Main
```

## 📝 Exemplos de Código

### Sobrescrita do toString()
```java
@Override
public String toString() {
    return "Cachorro: " + nome + " - Au Au!";
}
```

### Polimorfismo com List
```java
List<Animal> pets = new ArrayList<>();
pets.add(new Cachorro("Rex"));
pets.add(new Gato("Mimi"));

for (Animal pet : pets) {
    System.out.println(pet); // Chama toString() específico de cada classe
}
```

### Classe Base Animal
```java
public class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Animal: " + nome;
    }
}
```

### Subclasse Cachorro
```java
public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return "Cachorro: " + nome + " - Au Au!";
    }
}
```

## 🎓 Objetivos de Aprendizagem

1. **Sobrescrever Métodos**: Personalizar comportamento de métodos herdados
2. **Implementar toString()**: Criar representações textuais úteis dos objetos
3. **Aplicar Polimorfismo**: Usar o mesmo método com comportamentos diferentes
4. **Trabalhar com Coleções**: Utilizar List e arrays com polimorfismo
5. **Compreender @Override**: Entender a importância da anotação
6. **Desenvolver Flexibilidade**: Criar código que se adapta a diferentes tipos
7. **Melhorar Legibilidade**: Tornar a saída de dados mais clara e útil

## 📋 Padrões Implementados

### Sobrescrita
- Uso da anotação `@Override`
- Personalização do método `toString()`
- Manutenção da assinatura do método original

### Polimorfismo
- Referências de superclasse para objetos de subclasse
- Comportamento dinâmico baseado no tipo real do objeto
- Uso de coleções polimórficas

### Organização de Código
- Estrutura simples e clara
- Separação lógica entre classes
- Código reutilizável e extensível

## 🔍 Conceitos Detalhados

### O que é o método toString()?
- É um método que existe em todas as classes, mesmo que você não crie
- Ele vem da superclasse Object, que é a "mãe" de todas as classes em Java
- Serve para mostrar um objeto como texto (por exemplo, quando usamos System.out.println(obj))

### Sem sobrescrever o toString():
```
Pessoa@4e25154f
```
Ou seja, uma informação interna sem utilidade.

### Com sobrescrita do toString():
Podemos escrever nossa própria versão do método toString() para que o objeto mostre uma mensagem útil.

### O que é Polimorfismo?
Polimorfismo é uma palavra grega que significa "muitas formas". Na programação, isso quer dizer que um mesmo método pode se comportar de formas diferentes dependendo do contexto.

## 📝 Observações Importantes

- **@Override** garante que estamos sobrescrevendo corretamente
- **Polimorfismo** permite flexibilidade e extensibilidade
- **toString()** é chamado automaticamente pelo System.out.println()
- **List<Superclasse>** permite armazenar objetos de diferentes subclasses
- **Comportamento dinâmico** é determinado em tempo de execução
- **Flexibilidade** permite adicionar novos tipos sem modificar código existente

## 👨‍🏫 Professor Responsável
**Professor Bruno**

---

*Desenvolvido com foco no aprendizado prático dos conceitos avançados de Programação Orientada a Objetos, especificamente sobrescrita e polimorfismo, através de projetos práticos e contextualizados.*

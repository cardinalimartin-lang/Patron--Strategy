# Patrón de Diseño: Strategy

## Descripción
Este repositorio contiene la implementación y el análisis del patrón de diseño de comportamiento **Strategy**. El proyecto demuestra cómo encapsular distintos algoritmos o lógicas de negocio en clases separadas, permitiendo que el objeto cliente intercambie el comportamiento dinámicamente en tiempo de ejecución sin alterar su estructura.

## Tecnologías Utilizadas
* **Entorno de Desarrollo (Java):** IntelliJ IDEA.

## Estructura del Proyecto
El código está organizado para separar claramente el contexto, la interfaz de la estrategia y sus implementaciones concretas, respetando los principios de la Programación Orientada a Objetos:

* `Contexto`: La clase principal que mantiene una referencia a la estrategia y ejecuta el comportamiento.
* `IStrategy` (o clase base abstracta): La interfaz común que define el contrato para todos los algoritmos.
* `Estrategias Concretas`: Las distintas variaciones del algoritmo implementadas en clases separadas.

## Cómo ejecutarlo

### Java
1. Clonar el repositorio: `git clone https://github.com/cardinalimartin-lang/Patron-Strategy.git`
2. Abrir el proyecto en IntelliJ IDEA.
3. Ejecutar la clase `Main` (o la clase que contenga el método `main`) para ver el intercambio de estrategias en la consola.



** Autores: Martín Cardinali & Mateo Rodríguez
** Docente: Santos Silva Martín Fidel




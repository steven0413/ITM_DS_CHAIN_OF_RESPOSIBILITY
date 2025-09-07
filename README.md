# DESIGN PATTERN: Chain of Responsibility – Cajero Automático

Este proyecto implementa un **cajero automático** aplicando el patrón de diseño **Chain of Responsibility (Cadena de Responsabilidad)**.  
Forma parte del curso de **Diseño de Software** de la **Universidad Instituto Tecnológico Metropolitano (ITM)**.

---

## Enunciado del ejercicio

> Uno de los grandes ejemplos del patrón de Cadena de Responsabilidad es la máquina dispensadora de un cajero automático.  
> El usuario ingresa la cantidad a dispensar y la máquina devuelve la cantidad en términos de billetes de moneda definidos:  
> **100.000, 50.000, 20.000, 10.000 y 5.000.** 
> 
> - Si la cantidad no es múltiplo de **5.000**, se arroja un error.   
> - La cadena debe procesar la solicitud en orden descendente (100k → 50k → 20k → 10k → 5k).

---

## Objetivos de aprendizaje

- Comprender y aplicar el patrón **Chain of Responsibility** en un contexto real.  
- Implementar una solución orientada a objetos siguiendo principios **SOLID**.  
- Documentar el diseño con **UML (diagrama de clases y diagrama de secuencia)**.  
- Usar buenas prácticas de validación y responsabilidad única en las clases.

---

## Estructura del proyecto

Chain_Of_Responsibility/
│
├── Manejadores/
│ ├── IHandler.java # Interfaz común de la cadena
│ ├── Dispenser100k.java # Handler para billetes de 100.000
│ ├── Dispenser50k.java # Handler para billetes de 50.000
│ ├── Dispenser20k.java # Handler para billetes de 20.000
│ ├── Dispenser10k.java # Handler para billetes de 10.000
│ └── Dispenser5k.java # Handler para billetes de 5.000
│
├── App.java # Cliente: construye la cadena y recibe input del usuario
└── README.md # Documentación del proyecto


## UML - Diagrama de clases
- `IHandler` → interfaz que define `setNext()` y `dispense()`.  
- `DispenserX` → manejadores concretos para cada denominación.  
- `App` → cliente que construye y ejecuta la cadena.

## Diagrama de secuencia
Representa el flujo de un retiro, donde cada dispensador procesa lo que puede y pasa el resto al siguiente.

## Materia
Diseño de Software
Universidad: Instituto Tecnológico Metropolitano – ITM
Tema: Patrones de diseño (Chain of Responsibility)

## Autor
Estudiante: Steven
Carrera: Ingeniería en Sistemas / Desarrollo de Software
Año: 2025

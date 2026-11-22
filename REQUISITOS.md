# Requisitos del Sistema de Triaje Médico

## 1. Requisitos funcionales

- **RF01:** El sistema debe permitir registrar pacientes con nombre, cédula, síntoma y puntaje de riesgo.
- **RF02:** El primer paciente registrado debe convertirse en la raíz del árbol binario.
- **RF03:** El sistema debe ubicar a la izquierda los pacientes con menor puntaje de riesgo.
- **RF04:** El sistema debe ubicar a la derecha los pacientes con puntaje mayor o igual.
- **RF05:** El sistema debe mostrar la estructura jerárquica del árbol.
- **RF06:** El sistema debe listar los pacientes de menor a mayor riesgo mediante recorrido inorden.
- **RF07:** El sistema debe permitir buscar pacientes por puntaje de riesgo.
- **RF08:** El sistema debe identificar al paciente con mayor puntaje de riesgo.
- **RF09:** El sistema debe guardar un respaldo de los pacientes en un archivo TXT.

## 2. Requisitos no funcionales

- **RNF01:** El sistema debe ejecutarse mediante una aplicación de consola.
- **RNF02:** El sistema debe estar implementado en C# y Java.
- **RNF03:** El código debe estar organizado mediante clases.
- **RNF04:** El menú debe ser sencillo y fácil de utilizar.
- **RNF05:** El respaldo de información debe almacenarse en un archivo de texto TXT.
- **RNF06:** El sistema debe utilizar un árbol binario de búsqueda para organizar los pacientes.

## 3. Requisitos de dominio

- **RD01:** Cada paciente debe tener nombre, cédula, síntoma y puntaje de riesgo.
- **RD02:** El primer paciente registrado será la raíz del árbol.
- **RD03:** Los pacientes con menor puntaje de riesgo se ubican en el subárbol izquierdo.
- **RD04:** Los pacientes con puntaje mayor o igual se ubican en el subárbol derecho.
- **RD05:** El recorrido inorden debe mostrar los pacientes en orden ascendente según su puntaje de riesgo.
- **RD06:** El paciente más crítico será el que tenga el mayor puntaje de riesgo.

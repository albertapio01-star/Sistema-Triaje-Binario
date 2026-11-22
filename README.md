# Sistema de Triaje Médico - Árbol Binario

## Descripción del proyecto

Este proyecto consiste en desarrollar un sistema de triaje médico que permite organizar pacientes según su puntaje de riesgo clínico, utilizando una estructura de datos llamada árbol binario de búsqueda.

El sistema fue desarrollado en dos lenguajes de programación: C# y Java.

## Objetivo

Implementar un árbol binario que permita registrar, organizar, buscar y consultar pacientes según su nivel de riesgo.

## Funcionalidades

- Registrar pacientes.
- Organizar pacientes mediante un árbol binario.
- Visualizar la estructura jerárquica del árbol.
- Listar pacientes de menor a mayor riesgo.
- Buscar pacientes por puntaje de riesgo.
- Identificar al paciente más crítico.
- Guardar un respaldo de los pacientes en un archivo TXT.

## Tecnologías utilizadas

- C#
- .NET
- Java
- JDK 21
- Visual Studio Code
- GitHub

## Estructura del proyecto

El proyecto se divide en clases:

- **Paciente:** almacena los datos del paciente.
- **NodoArbol:** representa cada nodo del árbol.
- **ArbolBinarioTriaje:** administra las operaciones del árbol binario.
- **Program.cs / Main.java:** ejecutan el menú principal.

## Regla de organización

- El primer paciente registrado se convierte en la raíz.
- Los pacientes con menor puntaje se ubican a la izquierda.
- Los pacientes con puntaje mayor o igual se ubican a la derecha.

## Autores

Proyecto académico desarrollado para la asignatura de Estructura de Datos.

# Parcial 1 – Estructuras de Datos

Este repositorio contiene la solución al **Parcial 1 de Estructuras de Datos**, implementado en **Java** usando Sublime Text.  
El programa gestiona información de estudiantes de una universidad y aplica algoritmos de **ordenamiento** y **búsqueda**.

---

## 📚 Contenido

- `Main.java` → Código principal con la creación de estudiantes y pruebas.
- `Student.java` → Clase que representa a un estudiante.
- `SortingAlgorithms.java` → Implementación de Bubble Sort y Selection Sort.
- `SearchingAlgorithms.java` → Implementación de Linear Search y Binary Search.
- `video_explicacion.txt` → Archivo con el enlace al video explicativo.

---

## 📝 Descripción del programa

Cada estudiante tiene la siguiente información:
- Edad (`age`)
- Semestre actual (`semester`)
- Estrato socioeconómico (`socioEconomicStratum`)
- Materias cursadas (`coursesCompleted`)
- Materias pendientes (`coursesPending`)
- Nombre del programa (`program`)
- Código del programa (`programId` – 6 dígitos)

### Funcionalidades principales

1. **Ordenamiento**
   - Bubble Sort → por edad (de menor a mayor).  
   - Selection Sort → por semestre (de mayor a menor).  

2. **Búsqueda**
   - Linear Search → por `programId`.  
   - Binary Search → por `age` (lista previamente ordenada).  

3. **Pruebas**
   - Se crearon **10 estudiantes** con datos coherentes (edades entre 18 y 27, semestres entre 1 y 10, estratos de 1 a 6).  
   - El programa imprime la lista original, la lista ordenada con cada algoritmo y el resultado de las búsquedas.  

---

## ⚙️ Ejecución

Clona este repositorio y compila el programa con:

```bash
javac Main.java

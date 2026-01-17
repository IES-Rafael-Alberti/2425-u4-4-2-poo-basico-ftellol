[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/rI46BDue)
# Práctica 4.1: Programación orientada a objetos

Apóyate en los siguientes recursos para realizar la práctica:

[U4: 1. POO](./EjerciciosSencillosPOO.md)

> ATENCIÓN: DURANTE LA DOCUMENTACIÓN DE LA PRÁCTICA, ELIMINA TODO AQUELLO QUE NO APLIQUE. PEEEEEEEROOOOOOO, ANTES DE ELIMINAR ALGO, PIENSA SI APLICA O NO.

---

# Título de la Actividad

## Identificación de la Actividad

- **ID de la Actividad:** [4.1 Ejercicios POO basico]
- **Módulo:** [PROG]
- **Unidad de Trabajo:** [Unidad 4: POO basico]
- **Fecha de Creación:** [14/01/2026]
- **Fecha de Entrega:** [16/01/2026]
- **Alumno(s):**
  - **Nombre y Apellidos:** [Fabio Tello Lopez]
  - **Correo electrónico:** [ftellop678@g.educaand.es]
  - **Iniciales del Alumno/Grupo:** [FTL]

## Descripción de la Actividad
Esta actividad tiene como objetivo aplicar los principios básicos de la Programación Orientada a Objetos (POO) utilizando el lenguaje Kotlin.

## Instrucciones de Compilación y Ejecución

1. **Requisitos Previos:**

- Lenguaje: Kotlin
- Versión recomendada: Kotlin 1.9 o superior
- JDK: JDK 17
- Entorno de desarrollo: IntelliJ IDEA
- Sistema de construcción: Gradle

## Desarrollo de la Actividad

### Descripción del Desarrollo
El desarrollo de la actividad se llevó a cabo siguiendo los diagramas UML proporcionados para cada ejercicio y se prestó especial atención a proteger los atributos mediante modificadores de acceso privados, asegurando que los datos solo se pudieran modificar a través de los métodos definidos. Además, se incluyeron validaciones en los constructores y en los setters para garantizar que los valores fueran correctos desde el inicio y durante la ejecución. Para manejar posibles errores o situaciones no permitidas se emplearon excepciones controladas de manera que el programa pudiera reaccionar adecuadamente sin detenerse inesperadamente. Se buscó mantener la claridad y legibilidad del código para que fuera fácil de entender y mantener, y cada ejercicio se implementó en su propia clase con una función main que permitiera probar su funcionamiento y verificar que todo operaba según lo esperado.

### Código Fuente
Repositorio GitHub:
https://github.com/IES-Rafael-Alberti/2425-u4-4-2-poo-basico-ftellol

Estructura principal:

- CuentaBancaria.kt = "src/main/kotlin/CuentaBancaria.kt"
- Vehiculo.kt = "src/main/kotlin/Vehiculo.kt"
- Libro.kt = "src/main/kotlin/Libro.kt"
- Estudiante.kt = "src/main/kotlin/Estudiante.kt"
- Producto.kt = "src/main/kotlin/Producto.kt"

[Si hay varios ejercicios, habrá una documentación, por cada uno de los ejercicios.]
[Por cada ejercicio, habrá enlaces embebidos de código a las clases principales y programa principal `main` ]

### Ejemplos de Ejecución
Ejemplo: Clase Estudiante

1. Entrada:
- Crear un estudiante
- Asignar una nota válida
- Intentar asignar una nota fuera de rango

2. Salida Esperada:
- Estudiante: Antonio, Nota: 4.5
- Error: La nota debe ir desde el 0 hasta el 10

## Referencias y Fuentes
- Apuntes del profesorado
- Referencias a otros ejercicios hechos
- Busqueda en kotlin oficial
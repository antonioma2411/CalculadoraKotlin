# UD01_Actividad03_Calculadora
 
Calculadora básica de consola desarrollada en **Kotlin** con **IntelliJ IDEA**.
Actividad 03 de la unidad UD01 (Introducción) del módulo PMDM.
 
**Autor:** Antonio Manuel González Martínez
**Contacto:** antonio.ma.2411@alumnos.ilerna.com
 
---
 
## Descripción
 
El programa muestra un menú por consola, pide dos números al usuario y realiza la operación elegida. El menú se repite hasta que el usuario selecciona la opción de salir.
 
## Funcionalidades
 
- Menú interactivo gestionado con la estructura `when`.
- Cinco operaciones con números decimales (`Double`): suma, resta, multiplicación, división y resto.
- Validación de los datos introducidos: si el usuario escribe algo que no es un número, se vuelve a pedir.
- Control de la división entre cero y del resto entre cero: se muestra un error en rojo y se vuelve a pedir el segundo número.
- Control de opciones inexistentes del menú (`Opción no válida`).
- Repetición del menú con un bucle `while` hasta elegir la opción **6. Salir**.
## Menú
 
```
===== CALCULADORA BÁSICA =====
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Calcular resto
6. Salir
Seleccione una opción:
```
 
## Requisitos
 
- JDK 17 o superior (o el que use tu versión de IntelliJ IDEA).
- IntelliJ IDEA con el plugin de Kotlin.
## Cómo ejecutarlo
 
1. Clona el repositorio o descomprime el proyecto ZIP.
2. Abre la carpeta del proyecto en IntelliJ IDEA.
3. Espera a que termine de cargar y compilar el proyecto.
4. Ejecuta la función `main` con el botón verde de *Run*.
5. Usa la consola de IntelliJ para elegir opciones e introducir números.
## Ejemplo de uso
 
```
Seleccione una opción:
1
Introduzca el primer número
10
Introduzca el segundo numero
5
El resultado de la suma es: 15.0
```
 
## Estructura del código
 
| Elemento | Qué hace |
|---|---|
| `main()` | Punto de entrada. Solo llama a `Calculadora.menuPrincipal()`. |
| `Calculadora.menuPrincipal()` | Contiene el bucle principal y el `when` que decide qué operación hacer. |
| `pintarMenu()` | Escribe el menú de opciones por consola. |
| `sumar`, `restar`, `multiplicar`, `dividir`, `resto` | Funciones que reciben dos `Double` y devuelven el resultado. |
| `Depurar.leerDouble(mensaje)` | Lee un número por consola y repite la petición hasta que el dato es válido. |
 
## Cómo funciona
 
1. `menuPrincipal()` declara las variables (`num1`, `num2`, `res` y `salirValido`).
2. Un bucle `while (!salirValido)` muestra el menú y lee la opción con `readln()`.
3. El `when` compara la opción con `"1"` … `"6"`:
   - **1 a 3:** pide los dos números, calcula y muestra el resultado.
   - **4 y 5:** pide el primer número y repite la petición del segundo mientras sea `0.0`.
   - **6:** pone `salirValido` a `true` y el bucle termina.
   - **else:** muestra `Opción no válida`.
## Validaciones
 
| Caso | Comportamiento |
|---|---|
| Opción distinta de 1–6 | Muestra `Opción no válida` y vuelve al menú. |
| Dato que no es un número | Muestra un aviso en rojo y vuelve a pedir el dato. |
| División con segundo número 0 | Muestra un error en rojo y vuelve a pedir el segundo número. |
| Resto con segundo número 0 | Muestra un error en rojo y vuelve a pedir el segundo número. |
 
## Conceptos practicados
 
Variables y tipos numéricos, lectura por consola, funciones, objetos (`object`), estructura `when`, bucles `while` y `do-while`, y validación de entradas.

 

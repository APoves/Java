# Java

<p align="center">
  <img src="https://raw.githubusercontent.com/APoves/Java/main/claro.png#gh-light-mode-only" alt="Logo modo claro" width="200">
  <img src="https://raw.githubusercontent.com/APoves/Java/main/oscuro.png#gh-dark-mode-only" alt="Logo modo oscuro" width="200">
</p>


# Ejercicio 6:
Pide al usuario un año por teclado e indica si es bisiesto o no. 
(Un año es bisiesto cuando es divisible entre 4 y no es divisible por 100 o es divisible por 400.
Por ejemplo, los años 2000, 2008 y 2020 son años bisiestos.
<br>

(Ojo, con ser divisible, aquí nos referimos a que su división da un resultado distinto a 0).
<br>
<br>
# Aclaración curiosa sobre años bisiestos en el calendario gregoriano (si, el nuestro):

**Datos a tener en cuenta:**
- Duración del año solar real: 365.2422 días (aproximadamente 365 días, 5 horas, 48 minutos y 45 segundos).
- Año gregoriano normal: 365 días.
- Objetivo del año bisiesto: Compensar el desfase acumulado de ~0.2422 días por año.

**Reglas para calcular años bisiestos:**
Un año es bisiesto si es divisible entre 4 (NORMALMENTE).
EXCEPCIÓN: si es divisible entre 100, solo es bisiesto si también es divisible entre 400.


| Año   | ¿Es bisiesto? | ¿Por qué?                                |
|-------|------------|--------------------------------------------|
| 2000  | Sí         | Divisible entre 4, 100 **y** 400           |
| 1900  | No         | Divisible entre 4 y 100, **pero no** 400   |
| 2020  | Sí         | Divisible entre 4, **no** divisible entre 100 |
| 2100  | No         | Divisible entre 4 y 100, **pero no** 400   |
| 1700  | No         | Divisible entre 4 y 100, **pero no** 400   |
| 2400  | Sí         | Divisible entre 4, 100 **y** 400           |



Resumen
Si un año termina en 00 (ejemplo: 1900, 2100): sólo es bisiesto si también es divisible entre 400 (como 2000).
Si el año no termina en 00 (ejemplo: 2024, 2028): sólo es necesario que sea divisible entre 4.




En el calendario gregoriano un año normal tiene 365 días, pero la duración real de un año sideral (tiempo que la Tierra tarda en dar la vuelta completa al Sol es de 365,2425 días).
Por esto y para eliminar ese error de cálculo se creó el año bisiesto de 366 días, PERO, hay un pequeño error de cálculo que debe tenerse en cuenta:
Para eliminar este error, el calendario gregoriano estipula que un año que es divisible por 100 (por ejemplo, 1900) es un año bisiesto solo si también es divisible por 400.

Por ejemplo, los años 1700, 1800, 1900, 2100, 2200, 2300, 2500 y 2600 (entre otros) no son años bisiestos, porque, aunque son divisibles entre 100, no lo son entre 400.

Un año es bisiesto si es divisible entre 4, excepto los años que a su vez son divisibles entre 100 pero no son divisibles entre 400.
 


<p align="center">
<img src="https://github.com/APoves/APoves/blob/main/logo.png" alt="Mi Logo" width="150"/>
</p>

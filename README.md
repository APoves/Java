<p align="center">
  <img src="https://raw.githubusercontent.com/APoves/Java/main/claro.png#gh-light-mode-only" alt="Logo modo claro" width="100">
  <img src="https://raw.githubusercontent.com/APoves/Java/main/oscuro.png#gh-dark-mode-only" alt="Logo modo oscuro" width="100">
</p>

### Ejercicio 6:
Pide al usuario un año por teclado e indica si es bisiesto o no. 

(Un año es bisiesto cuando es divisible entre 4 y no es divisible por 100 o es divisible por 400.
Por ejemplo, los años 2000, 2008 y 2020 son años bisiestos.
<br>
<br>
(Ojo, con ser divisible, aquí nos referimos a que su división da un resultado distinto a 0).
<br>
<br>
### Aclaración curiosa sobre años bisiestos en el calendario gregoriano (si, el nuestro):

**Datos a tener en cuenta:**
- Duración del año solar real: 365.2422 días (aproximadamente 365 días, 5 horas, 48 minutos y 45 segundos).
- Año gregoriano normal: 365 días.
- Objetivo del año bisiesto: Compensar el desfase acumulado de ~0.2422 días por año.

**Reglas para calcular años bisiestos:**
Un año es bisiesto si es divisible entre 4 (REGLA GENERAL).
EXCEPCIÓN: si es divisible entre 100, solo es bisiesto si también es divisible entre 400.


| Año   | ¿Es bisiesto? | ¿Por qué?                                |
|-------|------------|--------------------------------------------|
| 2000  | Sí         | Divisible entre 4, 100 **y** 400           |
| 1900  | No         | Divisible entre 4 y 100, **pero no** 400   |
| 2020  | Sí         | Divisible entre 4, **no** divisible entre 100 |
| 2100  | No         | Divisible entre 4 y 100, **pero no** 400   |
| 1700  | No         | Divisible entre 4 y 100, **pero no** 400   |
| 2400  | Sí         | Divisible entre 4, 100 **y** 400           |



En resumen:
- Sí es bisiesto → Si es divisible entre 4 (y no termina en 00) → es bisiesto.
Ejemplos: años 2024 y 2028.

- Si termina en 00 y es divisible entre 400 → es bisiesto.
Ejemplo: años 2000 y 2400.

3️⃣ No es bisiesto → Si termina en "00" pero no es divisible entre 400 → NO es bisiesto.
Ejemplo: años 1900 y 2100.


<br>
<br>
<br>

<p align="center">
<img src="https://github.com/APoves/APoves/blob/main/logo.png" alt="Mi Logo" width="120"/>
</p>







 

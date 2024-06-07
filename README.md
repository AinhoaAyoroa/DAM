# Calculadora

La clase `Calculadora` implementa una calculadora simple con operaciones de suma, resta, multiplicación, división y comparación de mayor que.

## Métodos

### `getLastResult()`
- **Descripción**: Obtiene el último resultado calculado.
- **Retorno**: El último resultado calculado.

### `getLastOp()`
- **Descripción**: Obtiene la última operación realizada.
- **Retorno**: La última operación realizada.

### `suma(float op1, float op2)`
- **Descripción**: Realiza una suma entre dos números.
- **Parámetros**:
  - `op1`: El primer operando.
  - `op2`: El segundo operando.
- **Retorno**: El resultado de la suma.

### `resta(float op1, float op2)`
- **Descripción**: Realiza una resta entre dos números.
- **Parámetros**:
  - `op1`: El primer operando.
  - `op2`: El segundo operando.
- **Retorno**: El resultado de la resta.

### `multiplica(float op1, float op2)`
- **Descripción**: Realiza una multiplicación entre dos números.
- **Parámetros**:
  - `op1`: El primer operando.
  - `op2`: El segundo operando.
- **Retorno**: El resultado de la multiplicación.

### `divideix(float op1, float op2)`
- **Descripción**: Realiza una división entre dos números.
- **Parámetros**:
  - `op1`: El dividendo.
  - `op2`: El divisor.
- **Retorno**: El resultado de la división.

### `majorQue(float op1, float op2)`
- **Descripción**: Comprueba si el primer número es mayor que el segundo.
- **Parámetros**:
  - `op1`: El primer número.
  - `op2`: El segundo número.
- **Retorno**: `true` si el primer número es mayor que el segundo, `false` de lo contrario.

### `restablecer()`
- **Descripción**: Restablece los valores del último resultado y la última operación.

## Clase de Prueba: CalculadoraTest

Esta clase contiene métodos de prueba utilizando JUnit para verificar el correcto funcionamiento de los métodos de la clase `Calculadora`.

### Métodos de Prueba

- **`testSuma()`**
- **`testResta()`**
- **`testMultiplica()`**
- **`testDivideix()`**
- **`testMajorQue()`**
- **`testDivideixPerZero()`** (Nota: Asegúrate de tener este método implementado para probar la división por cero si es necesario)

- `testMultiplica()`
- `testDivideix()`
- `testMajorQue()`
- `testDivideixPerZero()`


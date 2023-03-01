# Proyecto del Segundo Cuatrimestre Fundamentos de Programación (Curso  22/23)
Autor: José Manuel Amador Gallardo &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;  UVUS: SMT4497

El dataset consta de varias propiedades de coches (como pueden ser fabricante, modelo, color, tamaño del motor, capacidad de combustible, etc). 

## Estructura de las carpetas del proyecto

* **/src**: Contiene los diferentes archivos que forman parte del proyecto.
  * **fp.coches**: Paquete que contiene los tipos del proyecto.
  * **fp.coches.test**: Paquete que contiene las clases de test del proyecto.
  * **fp.common**: Paquete que contiene los tipos auxiliares del proyecto
  * **fp.utiles**:  Paquete que contiene las clases de utilidad. 
* **/data**: Contiene el dataset del proyecto
    * **coches.csv**: Datos sobre coches de varios fabricantes.
    
## Estructura del *dataset*

El dataset está compuesto por 20 columnas, con la siguiente descripción:

* **Manufacturer**: de tipo ``String``, representa el nombre del fabricante.
* **Model**: de tipo ``String``, representa el modelo del vehículo.
* **Sales in thousands**: de tipo ``Integer``, representa el número de ventas en miles.
* **4-year resale value**: de tipo ``Float/Double``, representa el valor de reventa a los cuatro años.
* **Vehicle type**: de tipo ``String``, representa el tipo de vehículo.
* **Price in thousands**: de tipo ``Float/Double``, representa el precio en miles del vehículo.
* **Engine size**: de tipo ``Float/Double``, representa el tamaño del motor en L.
* **Horsepower**: de tipo Integer, representa la potencia del vehículo en CV.
* **Wheelbase**: de tipo ``Float/Double``, representa la distancia entre los dos ejes de las ruedas.
* **Width**: de tipo ``Float/Double``, representa el ancho del vehículo.
* **Length**: de tipo ``Float/Double``, representa el largo del vehículo.
* **Curb weight**: de tipo ``Float/Double``, representa el peso en vacío del vehículo.
* **Fuel capacity**: de tipo ``Float/Double``, representa la capacidad de combustible del vehículo.
* **Fuel efficiency**: de tipo ``Integer``, representa la eficiencia del combustible.
* **Latest launch**: de tipo ``String``, representa el último lanzamiento del vehículo.
* **Color 1**: de tipo ``String``, representa el primer color disponible del vehículo.
* **Color 2**: de tipo ``String``, representa el segundo color disponible del vehículo.
* **Color 3**: de tipo ``String``, representa el tercer color disponible del vehículo.
* **Color 4**: de tipo ``String``, representa el cuarto color disponible del vehículo.
* **Color 5**: de tipo ``String``, representa el quinto color disponible del vehículo.

## Tipos implementados

### Tipo Base
Tipo Coche con sus getters y setters, a parte del toString, equals y compareTo. 

**Propiedades**:

- fabricante, de tipo ``String``, consultable y modificable. 
- modelo, de tipo ``String``, consultable y modificable. 
- potencia, de tipo ``Integer``, consultable y modificable.
- tamañoMotor, de tipo ``Float``, consultable y modificable.
- tipo, de tipo ``TipoCoche``, consultable y modificable.
- precio, de tipo ``Integer``, consultable y modificable.
- salidaMercado,  de tipo ``LocalDate``, consultable y modificable.
- listaColores, de tipo ``List<ColorCoche>``, consultable y modificable.

**Constructores**: 

- C1: Un parámetro por cada propiedad.
- C2: Sólo recibe como parámetros el fabricante, el modelo y la lista de colores.

**Restricciones**:

- R1: el precio no puede ser negativo.
- R2: la lista de colores no puede ser ```null```.

**Criterio de igualdad**: Sirve para saber si dos objetos tipo Coche son iguales.

**Criterio de ordenación**: Compara el nombre del fabricante para ordenar por nombre de fabricante.

**Otras operaciones**:
 
-	tipoCocheParser: Convierte el tipo de vehículo para el toString (ej.) ``TipoCoche.PASSENGER`` a ``"Passenger"``.
- salidaMercadoParser: Convierte el formato ``YYYY-MM-dd`` a ``dd/MM/YYYY``.
- getFormatoCorto: Devuelve el toString en un formato más comprimido "one-line".

#### Tipos auxiliares
- **TipoCoche**: Enumerado para el tipo de vehículo, si es Passenger o Car.
- **ColorCoche**: Enumerado para los colores.

# Proyecto del Segundo Cuatrimestre Fundamentos de Programación (Curso  22/23)
## 👤 Autor: José Manuel Amador Gallardo &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;  🪪 UVUS: SMT4497

El dataset consta de varias propiedades de coches (como pueden ser fabricante, modelo, color, tamaño del motor, capacidad de combustible, etc). 

## 🟥 Estructura de las carpetas del proyecto
├─ **📁 src**: Contiene los diferentes archivos que forman parte del proyecto.<br>
&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├─ **📦 fp.coches**: Paquete que contiene los tipos del proyecto.<br>
&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├─ 📄 Coche.java<br>
&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├─ 📄 Concesionario.java<br>
&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ 📄 FactoriaCoches.java<br>
&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├─ **📦 fp.coches.test**: Paquete que contiene las clases de test del proyecto.<br>
&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├─ 📄 TestCoche.java<br>
&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├─ 📄 TestConcesionario.java<br>
&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ 📄 TestFactoriaCoches.java<br>
&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├─ **📦 fp.common**: Paquete que contiene los tipos auxiliares del proyecto.<br>
&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├─ 📄 ColorCoche.java<br>
&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├─ 📄 Motor.java<br>
&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ 📄 TipoCoche.java<br>
&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ **📦 fp.utiles**:  Paquete que contiene las clases de utilidad.<br>
&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├─ 📄 Checkers.java<br>
&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├─ 📄 Fichero.java<br>
&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├─ 📄 Mostrar.java<br>
&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ 📄 Parsers.java<br>
├─ **📁 data**: Contiene el dataset del proyecto.<br>
&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;└─ **📄 coches.csv**: Datos sobre coches de varios fabricantes.
<br>
└─ **📁 docs**: Contiene la documentación del proyecto.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ **📄 README.md**
: Documentación.    

## 🟥 Estructura del *dataset*
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

## 🟥 Tipos implementados
### 🔷 **Tipo Coche**
Tipo base con métodos básicos:
Constructor/es, Getters & Setters, toString, equals, compareTo

**PROPIEDADES**:
| Propiedad   | Tipo                  | Descripción                            |
|-------------|-----------------------|----------------------------------------|
fabricante    | ``String``            | consultable y modificable. 
modelo        | ``String``            | consultable y modificable. 
potencia      | ``Integer``           | consultable y modificable.
tamañoMotor   | ``Float``             | consultable y modificable.
tipo          | ``TipoCoche``         | consultable y modificable.
precio        | ``Integer``           | consultable y modificable.
salidaMercado | ``LocalDate``         | consultable y modificable.
listaColores  | ``List<ColorCoche>``  | consultable y modificable.

**CONSTRUCTORES**: 
- **C1:** Un parámetro por cada propiedad.
- **C2:** Sólo recibe como parámetros el fabricante, el modelo y la lista de colores.

**RESTRICCIONES**:
- **R1:** el precio no puede ser negativo.
- **R2:** la lista de colores no puede ser ```null```.

**CRITERIO DE IGUALDAD**:
- Sirve para saber si dos objetos tipo Coche son iguales.

**CRITERIO DE ORDENACIÓN**: 
- Compara el nombre del fabricante para ordenar por nombre de fabricante.

**OTRAS OPERACIONES**:
-	tipoCocheParser: Convierte el tipo de vehículo para el toString (ej.) ``TipoCoche.PASSENGER`` a ``"Passenger"``.
- salidaMercadoParser: Convierte el formato ``YYYY-MM-dd`` a ``dd/MM/YYYY``.
- getFormatoCorto: Devuelve el toString en un formato más comprimido "one-line".
-	toString: Formatea el tipo en un String legible.
- hashCode: Generea un hashcode.

### 🔷 **Tipo Concesionario**
Tipo contenedor de tipos Coche con métodos básicos (L58).

**PROPIEDADES**:
| Propiedad   | Tipo                  | Descripción                            |
|-------------|-----------------------|----------------------------------------|
coches        | ``Set<Coche>``        | consultable y modificable. 

**CONSTRUCTORES**: 
- **C1:** Un parámetro por cada propiedad.
- **C2:** Constructor vacío que devuelve un Set&lt;Coche&gt; vacío.

**CRITERIO DE IGUALDAD**:
- Sirve para saber si dos objetos tipo Concesionario son iguales.

**OTRAS OPERACIONES**:
- getNumeroCoches: Devuelve el número total de tipos Coche en coches.
- añadirCoche: Añade un tipo Coche a coches.
- eliminarCoche: Elimina un tipo Coche de coches.
- añadirColCoches: Añade una colección de tipos Coche a coches.
- existeCochePrecioMenor: Devuelve un ``Boolean`` que es ``true`` si existe un tipo Coche con un precio menor a uno dado.
- getMediaLitros: Devuelve un ``Integer`` que es la media de capacidad del motor de los coches.
- getCochesPorMarca: Devuelve una ``List<Coche>`` con los tipos Coche que sean de la marca dada.
- getCochesPorFecha: Devuelve un ``Map<LocalDate,Set<Coche>>`` que agrupa los tipos Coche por fecha.
- getNumeroCochesPorAnyo: Devuelve un ``Map<Integer,Long>`` que cuenta el número de tipos Coche y los agrupa por año.
-	toString: Formatea el tipo en un String legible.
- hashCode: Generea un hashcode.

### 🔷 **Tipo FactoriaCoches**
Tipo para leer fichero CSV y parsear cadenas del CSV.
**MÉTODOS**:
-	leerCoches: Lee el fichero CSV y devuelve un tipo Concesionario.
- parseaCoches: Parsea un string tipo ``"Fabricante;Modelo;Tamaño;Potencia;Capacidad;Eficiencia;Tipo;Precio;salidaMercado;listaColores"`` para crear un tipo Coche.

## 🟥 Tipos auxiliares
### 🔷 **Motor**
Tipo auxiliar que funciona como subtipo de los tipos Coche para definir el Motor de los coches.

**PROPIEDADES**:
| Propiedad   | Tipo                  | Descripción                            |
|-------------|-----------------------|----------------------------------------|
tamaño        | ``Double``            | consultable y modificable. 
potencia      | ``Integer``           | consultable y modificable. 
capacidad     | ``Double``            | consultable y modificable.
eficiencia    | ``Integer``           | consultable y modificable.

**CONSTRUCTORES**: 
- **C1:** Un parámetro por cada propiedad.
- **C2:** Constructor a partir de String.

**CRITERIO DE IGUALDAD**:
- Sirve para saber si dos objetos tipo Motor son iguales.

**CRITERIO DE ORDENACIÓN**: 
- Compara propiedad por propiedad de dos tipos Motor.

**OTRAS OPERACIONES**:
-	toString: Formatea el tipo en un String legible.
- hashCode: Generea un hashcode.

### 🔷 **TipoCoche**
Enumerado para el tipo de vehículo, si es Passenger o Car.

### 🔷 **ColorCoche**
Enumerado para los colores.

## 🟥 Tipos útiles
### 🔷 **Checkers**:
Métodos para lanzar excepciones con mensajes de error custom.
### 🔷 **Fichero**:
Métodos para leer ficheros y manejar sus datos.
### 🔷 **Mostrar**:
Método para mostrar n elementos de una colección.
### 🔷 **Parsers**:
Método para parsear algunos tipos.
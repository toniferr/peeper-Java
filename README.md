# PeeperJava

Proyecto enfocado en la práctica de las distintas versiones jdk desde la 8 hasta la más actual.

<div>
    <ul>
        <li><a href="#jdk8">JDK 8 (Marzo 2014)</a></li>
            <ul>
                <li>LTS - Soporte extendido Diciembre 2030</li>
            </ul>
        <li><a href="#jdk9">JDK 9 (Septiembre 2017)</a></li>
        <li><a href="#jdk10">JDK 10 (Marzo 2018)</a></li>
        <li><a href="#jdk11">JDK 11 (Septiembre 2018)</a></li>
            <ul>
                <li>LTS - Soporte extendido Enero 2032</li>
            </ul>
        <li><a href="#jdk12">JDK 12 (Marzo 2019)</a></li>
        <li><a href="#jdk13">JDK 13 (Septiembre 2019)</a></li>
        <li><a href="#jdk14">JDK 14 (Marzo 2020)</a></li>
        <li><a href="#jdk15">JDK 15 (Septiembre 2020)</a></li>
        <li><a href="#jdk16">JDK 16 (Marzo 2021)</a></li>
        <li><a href="#jdk17">LTS JDK 17 (Septiembre 2021)</a></li>
        <ul>
            <li>LTS - Soporte extendido Septiembre 2029</li>
        </ul>
        <li><a href="#jdk18">JDK 18 (Marzo 2022)</a></li>
        <li><a href="#jdk19">JDK 19 (Septiembre 2022)</a></li>
        <li><a href="#jdk20">JDK 20 (Marzo 2023)</a></li>
        <li><a href="#jdk21">JDK 21 (Septiembre 2023)</a></li>
        <ul>
            <li>LTS - Soporte extendido Septiembre 2031</li>
        </ul>
        <li><a href="#jdk22">JDK 22 (Marzo 2024)</a></li>
        <li>JDK 23 (Septiembre 2024)</li>
        <li>JDK 24 (Marzo 2025)</li>
        <li>JDK 25 (Septiembre 2025)</li>
        <ul>
            <li>LTS - Soporte extendido Septiembre 2033</li>
        </ul>
    </ul>
</div>

## JDK8
- **Expresiones lambda**: Introducción de expresiones lambda para programación funcional. Permite escribir funciones anónimas de manera concisa.
- **Streams**: API para procesar secuencias de datos de manera eficiente.
- **Mejora en la gestión de fechas**: Introducción de las clases LocalDate, LocalTime y LocalDateTime.
- **Optional**: Introducción de la clase Optional para prevenir nullpointers.
- **Motor de JS Nashorn**
- **Base64**

## JDK9
- **Módulos - jigsaw**: Se introdujo el sistema de módulos para modularizar el código y mejorar la seguridad y el rendimiento.
- **JShell**: Un intérprete interactivo para probar fragmentos de código.
- **List.of, Map.of, Set.of**
- **ProcessHandle**: Información de procesos
- **Mejoras en stream**: DropWhile, TakeWhile e Iterate.

## JDK10
- **Inferencia de Tipo de Variable Local**: Se agregó la palabra clave var para inferir automáticamente el tipo de variables locales.
- **Mejoras en Streams y Optional**: Se añadieron nuevos métodos a las clases Stream como toUnmodifiableSet y a Optional como orElseThrow.

## JDK11
- **HTTP Client**: Se introdujo un cliente HTTP nativo.
- **Var en Parámetros Lambda**: Se permitió el uso de var en parámetros de expresiones lambda.
- **Mejoras en string**: Se añadieron funciones como isBlank, strip, repeat y lines.count.

## JDK12
- **MicroBenchMark Suite**: Introdujo una suite de pruebas de rendimiento dentro del propio JDK. Salió visualvm del jdk.
- **Mejoras en garbage collector**: Optimizaciones en la recolección de basura en G1. Nuevo algoritmo Shenandoah.
- **Archivos class data sharing (CDS) por defecto**: JVM guarda version de aplicaciones en classes.jsa para mejorar consumo memoria y tiempo arranque.
- **API de constantes JVM**: JVM tiene pila de constantes manipulada por memoria cargadas en tiempo de ejecución.
- **Mejoras de switch**: Experimental. Se añade multicase y return de valor de un switch.

## JDK13
- **Dynamic CDS Archives**
- **ZGC: Uncommit Unused Memory**
- **Reimplement the Legacy Socket API**
- **Switch Expressions**: Mejoró las expresiones switch para permitir bloques de sentencias para cada rama case y retornar yield.
- **Text Blocks**: Facilitó la escritura de cadenas de texto largas y formateadas con 3 comillas.

## JDK14
- **ZGC**: Mejora del garbage collector para sistemas de windows y macOS
- **Records**: De forma experimental. Introdujo registros como una forma concisa de definir clases inmutables.
- **Pattern Matching**: Mejoró la coincidencia de patrones en expresiones instanceof.
- **Mejoras en trazas de NullPointerException**

## JDK15
- **Algoritmo de firma digital Edwards-Curve (EdDSA)**: Se añade nuevo algoritmo de cifrado seguro.
- **Sealed Classes**: Permitió restringir las subclases de una clase.
- **Text Blocks Mejorados**: Agregó mejoras a los bloques de texto.
- **Clases ocultas**: Experimental. Clases que no pueden usarse por otras. hidden classes. 
- **API DatagramSocket**: Se remplazan las implementaciones de bajo nivel para la comunicación por red con una impl. más moderna y simple.
- **Foreign-Memory Access**: Permite a los programas acceder de froma segura y eficiente a memoria externa fuera de heap.

## JDK16
- **Invocar métodos predeterminados desde instancias de proxy**: Antes de Java 16, no podíamos invocar métodos predeterminados de interfaces a través de reflexión en instancias de proxy.
- **Soporte para períodos del día**: El nuevo símbolo “B” en DateTimeFormatter permite representar períodos del día.
- **Método Stream.toList**: Ahora puedes usar toList() en lugar de collect(Collectors.toList()).
- **API Vector**: Introdujo un módulo de nivel “incubador” para expresar cálculos vectoriales en tiempo de ejecución.

## JDK17
- **Clases Selladas (Sealed)**: Estable. Permiten restringir la extensibilidad de las clases.
- **Semántica de Coma Flotante Estricta**: Restauró la consistencia en operaciones de coma flotante.

## JDK18
- **Patrón de coincidencia en instanceof**: Facilita la comprobación de tipos.
- **Mejoras en recolección de basura (ZGC)**: Mayor eficiencia.

## JDK19
- **Patrones de Registro (Record Patterns)**: Facilita la creación de clases de registro con patrones más expresivos.
- **Correspondencia de Patrones para Sentencias Switch**: Mejora la coincidencia de patrones en expresiones y declaraciones switch.

## JDK20
- **Patrón de coincidencia en expresiones lambda**: Mayor concisión en el código.
- **API de patrones**: Introduce patrones personalizados.

## JDK21
- **Características Estables, Preview y Beta**: Incluye diversas características como parte del proyecto Amber.
- **Project Loom (Virtual Threads y Structured Concurrency)**: Facilita la escritura de aplicaciones concurrentes de alto rendimiento.
- **Patrón de coincidencia en interfaces**: Mayor flexibilidad en interfaces.
- **API de recolección de registros**: Mejoras en el manejo de registros.

## JDK22
- **Mejoras de Lenguaje de OpenJDK Project Amber**: Incluye Statements before super, Unnamed Variables & Patterns, String Templates y Implicitly Declared Classes and Instance Main Methods.
- **Project Panama (Foreign Function & Memory API y Vector API)**: Mejora la interoperabilidad con código no Java y aprovecha instrucciones vectoriales.
- **Actualizaciones de Rendimiento**: Introduce Region Pinning para G1.
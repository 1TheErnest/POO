# ⚠️ Excepciones en Java

## 📋 Lista de Excepciones Integradas en Java

### 🔢 Excepciones Aritméticas

- **ArithmeticException**: Se lanza cuando ocurre un error en una operación aritmética.  
  int result = 10 / 0; // Lanza ArithmeticException

### 🧩 Excepciones de Índices en Arreglos

- **ArrayIndexOutOfBoundsException**: Esta excepción se lanza al intentar acceder a un índice inválido de un array.
  int[] arr = new int[3];
  int val = arr[10]; // Lanza ArrayIndexOutOfBoundsException

### 📚 Excepciones de Clases

- **ClassNotFoundException**: Se lanza cuando intentamos acceder a una clase cuya definición no se encuentra.
  Class.forName("ClaseInexistente"); // Lanza ClassNotFoundException

### 📂 Excepciones de Archivos

- **FileNotFoundException**: Ocurre cuando se intenta abrir un archivo que no se encuentra o no puede ser accedido.
  File file = new File("archivo_no_existente.txt");
  FileReader fr = new FileReader(file); // Lanza FileNotFoundException

- **IOException**: Se lanza en caso de fallos o interrupciones en operaciones de entrada/salida.
  BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"));
  reader.readLine(); // Puede lanzar IOException


### 🧵 Excepciones de Hilos

- **InterruptedException**: Se lanza cuando un hilo en espera o dormido es interrumpido.
  Thread.sleep(1000); // Puede lanzar InterruptedException


### 🛠️ Excepciones de Campos y Métodos

- **NoSuchFieldException**: Se lanza cuando un campo especificado no existe en la clase.
  
- **NoSuchMethodException**: Se lanza al intentar acceder a un método que no existe.

### 🧑‍💻 Excepciones de Objetos Nulos

- **NullPointerException**: Se lanza al intentar acceder a un miembro de un objeto que es `null`.
  String str = null;
  str.length(); // Lanza NullPointerException

### 🔢 Excepciones de Formato Numérico

- **NumberFormatException**: Se lanza cuando un método intenta convertir una cadena a un número, pero el formato no es válido.
  int num = Integer.parseInt("abc"); // Lanza NumberFormatException

### 🚀 Excepciones en Tiempo de Ejecución

- **RuntimeException**: Excepciones que ocurren durante la ejecución del programa. Muchas otras excepciones, como NullPointerException y ArithmeticException, son subclases de RuntimeException.

### 📝 Excepciones en Cadenas de Texto

- **StringIndexOutOfBoundsException**: Se lanza cuando un índice en una cadena es inválido.
  String text = "Hola";
  char ch = text.charAt(10); // Lanza StringIndexOutOfBoundsException

### 📥 Excepciones Ilegales

- **IllegalArgumentException**: Se lanza cuando un método recibe un argumento inapropiado.
  Thread t = new Thread();
  t.setPriority(100); // Lanza IllegalArgumentException

- **IllegalStateException**: Se lanza cuando el método es llamado en un momento inapropiado.
  Iterator<Integer> iterator = list.iterator();
  iterator.remove(); // Lanza IllegalStateException

## 🛠️ Cómo Manejar Excepciones en Java

Para manejar excepciones, se usa el bloque `try-catch`.

try {
    int division = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("¡Error de división por cero!");
}

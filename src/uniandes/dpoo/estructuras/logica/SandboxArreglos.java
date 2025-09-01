package uniandes.dpoo.estructuras.logica;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
    	int[] copia = new int[this.arregloEnteros.length];
        for (int i = 0; i < this.arregloEnteros.length; i++) {
            copia[i] = this.arregloEnteros[i];
        }
        return copia;
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
    	String[] copia = new String[this.arregloCadenas.length];
        for (int i = 0; i < this.arregloCadenas.length; i++) {
            copia[i] = this.arregloCadenas[i];
        }
        return copia;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
        return this.arregloEnteros.length;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
        return this.arregloCadenas.length;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
        int[] nuevoArreglo = new int[this.arregloEnteros.length + 1];

        for (int i = 0; i < this.arregloEnteros.length; i++) {
            nuevoArreglo[i] = this.arregloEnteros[i];
        }

        nuevoArreglo[nuevoArreglo.length - 1] = entero;

        this.arregloEnteros = nuevoArreglo;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	String[] nuevoCadenas=new String[this.arregloCadenas.length + 1];
    	for (int i = 0; i<this.arregloCadenas.length;i++) {
    		nuevoCadenas[i]=this.arregloCadenas[i];
    	}
    	nuevoCadenas[nuevoCadenas.length-1]=cadena;
    	this.arregloCadenas=nuevoCadenas;
    	
    		

    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	int count = 0;
        for (int i = 0; i < this.arregloEnteros.length; i++)
        {
            if (this.arregloEnteros[i] != valor)
            {
                count++;
            }
        }

        int[] nuevoArreglo = new int[count];
        int j = 0;

        for (int i = 0; i < this.arregloEnteros.length; i++)
        {
            if (this.arregloEnteros[i] != valor)
            {
                nuevoArreglo[j] = this.arregloEnteros[i];
                j++;
            }
        }

        this.arregloEnteros = nuevoArreglo;

    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	int count =0;
    	for (int i =0;i<this.arregloCadenas.length;i++) {
    		if (this.arregloCadenas[i]!=cadena){
    			count++;
    		}
    	}
    	int j=0;
    	String[] nuevoCadenas=new String[count];
    	for (int i =0;i<this.arregloCadenas.length;i++) {
    		if (this.arregloCadenas[i]!=cadena) {
    			nuevoCadenas[j]=this.arregloCadenas[i];
    			j++;
    		}
    	}
    	this.arregloCadenas=nuevoCadenas;
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	int[] nuevoEnteros=new int[this.arregloEnteros.length+1];
    	if (posicion<=0) {
    		nuevoEnteros[0]=entero;
    		for(int i =0; i<this.arregloEnteros.length;i++) {
    			nuevoEnteros[i+1]=this.arregloEnteros[i];
    		}
    	}
    	else if (posicion>=this.arregloEnteros.length) {
    		nuevoEnteros[nuevoEnteros.length-1]=entero;
    		for(int i =0; i<this.arregloEnteros.length;i++) {
    			nuevoEnteros[i]=this.arregloEnteros[i];
    		}
    	}
    	else {
    		for (int i =0; i<posicion;i++) { 
    			nuevoEnteros[i]=this.arregloEnteros[i];
    		}
    		nuevoEnteros[posicion]=entero;
    		for (int i=posicion;i<this.arregloEnteros.length;i++) {
    			nuevoEnteros[i+1]=this.arregloEnteros[i];
    		}
    	}
    	this.arregloEnteros=nuevoEnteros;

    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	if (posicion>=0 && posicion<this.arregloEnteros.length) {
    		int[] nuevoEnteros=new int[this.arregloEnteros.length-1];
    		for (int i=0;i<posicion;i++) {
    			nuevoEnteros[i]=this.arregloEnteros[i];
    		}
    		for (int i=posicion;i<this.arregloEnteros.length-1;i++) {
    			nuevoEnteros[i]=this.arregloEnteros[i+1];
    		}
    		this.arregloEnteros=nuevoEnteros;
    	}

    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    
    	this.arregloEnteros = new int[valores.length];
        for (int i = 0; i < valores.length; i++) {
            this.arregloEnteros[i] = (int) valores[i];
    	}

    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	this.arregloCadenas=new String[objetos.length];
    	for(int i=0;i<this.arregloCadenas.length;i++) {
    		this.arregloCadenas[i]=objetos[i].toString();
    	}

    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	for(int i=0;i<this.arregloEnteros.length;i++) {
    		if(this.arregloEnteros[i]<0) {
    			this.arregloEnteros[i]=this.arregloEnteros[i]*(-1);
    		}
    	}

    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
        for (int i = 1; i < this.arregloEnteros.length; i++) {
            int key = this.arregloEnteros[i];
            int j = i - 1;

            while (j >= 0 && this.arregloEnteros[j] > key) {
                this.arregloEnteros[j + 1] = this.arregloEnteros[j];
                j--;
            }

            this.arregloEnteros[j + 1] = key;
        }

    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
        for (int i = 1; i < this.arregloCadenas.length; i++) {
            String key = this.arregloCadenas[i];
            int j = i - 1;

            while (j >= 0 && this.arregloCadenas[j].compareTo(key) > 0) {
                this.arregloCadenas[j + 1] = this.arregloCadenas[j];
                j--;
            }

            this.arregloCadenas[j + 1] = key;
        }

    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
    	 int count = 0;
    	    for (int i = 0; i < this.arregloEnteros.length; i++) {
    	        if (this.arregloEnteros[i] == valor) {
    	            count++;
    	        }
    	    }
    	    return count;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
    	int count = 0;
        for (int i = 0; i < this.arregloCadenas.length; i++) {
            if (this.arregloCadenas[i].equalsIgnoreCase(cadena)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
    	int count = contarApariciones(valor);
        int[] posiciones = new int[count];
        int idx = 0;
        for (int i = 0; i < this.arregloEnteros.length; i++) {
            if (this.arregloEnteros[i] == valor) {
                posiciones[idx++] = i;
            }
        }
        return posiciones;
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
    	if (this.arregloEnteros.length == 0) return new int[0];
        int min = this.arregloEnteros[0];
        int max = this.arregloEnteros[0];
        for (int i = 1; i < this.arregloEnteros.length; i++) {
            if (this.arregloEnteros[i] < min) min = this.arregloEnteros[i];
            if (this.arregloEnteros[i] > max) max = this.arregloEnteros[i];
        }
        return new int[]{min, max};
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
    	HashMap<Integer, Integer> histograma = new HashMap<>();
        for (int i = 0; i < this.arregloEnteros.length; i++) {
            int valor = this.arregloEnteros[i];
            if (histograma.containsKey(valor)) {
                histograma.put(valor, histograma.get(valor) + 1);
            } else {
                histograma.put(valor, 1);
            }
        }
        return histograma;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	int countRepetidos = 0;

        for (int i = 0; i < this.arregloEnteros.length; i++) {
            int actual = this.arregloEnteros[i];
            boolean yaContado = false;

            for (int j = 0; j < i; j++) {
                if (this.arregloEnteros[j] == actual) {
                    yaContado = true;
                    break;
                }
            }

            if (yaContado) continue; 
            int apariciones = 0;
            for (int k = 0; k < this.arregloEnteros.length; k++) {
                if (this.arregloEnteros[k] == actual) {
                    apariciones++;
                }
            }

            if (apariciones > 1) countRepetidos++; 
        }

        return countRepetidos;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	if (this.arregloEnteros.length != otroArreglo.length) return false;
        for (int i = 0; i < this.arregloEnteros.length; i++) {
            if (this.arregloEnteros[i] != otroArreglo[i]) return false;
        }
        return true;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    	if (this.arregloEnteros.length != otroArreglo.length) return false;

        // Création d'une copie des deux tableaux pour les manipuler
        int[] copia1 = new int[this.arregloEnteros.length];
        int[] copia2 = new int[otroArreglo.length];
        for (int i = 0; i < this.arregloEnteros.length; i++) {
            copia1[i] = this.arregloEnteros[i];
            copia2[i] = otroArreglo[i];
        }

        // Tri par insertion pour éviter Collections.sort
        for (int i = 1; i < copia1.length; i++) {
            int key = copia1[i];
            int j = i - 1;
            while (j >= 0 && copia1[j] > key) {
                copia1[j + 1] = copia1[j];
                j--;
            }
            copia1[j + 1] = key;
        }

        for (int i = 1; i < copia2.length; i++) {
            int key = copia2[i];
            int j = i - 1;
            while (j >= 0 && copia2[j] > key) {
                copia2[j + 1] = copia2[j];
                j--;
            }
            copia2[j + 1] = key;
        }

        for (int i = 0; i < copia1.length; i++) {
            if (copia1[i] != copia2[i]) return false;
        }
        return true;
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    	this.arregloEnteros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            this.arregloEnteros[i] = minimo + (int)(Math.random() * (maximo - minimo + 1));
        }

    }

}

#3_5_Ejercicio_1

En este ejercicio se pide escribir el siguiente código:

public class input {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Tu platillo favorito: ");
        System.out.println(input);
    }
}

El código muestra un error, posteriormente se solicita realizar la importación de la biblioteca -util- de java.

Una vez hecha la importación de la biblioteca, el programa se ejecuta sin complicaciones.


#3_5_Ejercicio_2

Usando el código anterior, se solicita almacenar la variable de entrada como un String, posteriormente debe analizarse como un valor del tipo int e incrementar en 1 e imprimirlo. Para ello se utilizó el método Integer.parseInt() para convertir el valor string en int. Este valor se almacena en otra variable que es incrementada en uno para su visualización. Al correr el programa apareció un error de sintaxis, puesto que no se colocó el caracter "t" en el método Integer.parseInt(). Se corrigió y se corrió el programa, el cual se ejecuta sin más complicaciones.



#3_5_Ejercicio_3

En este ejercicio se pide ingresar un dato e imprimirlo utilizando el método Scanner, sin importación de biblioteca, al compilar el programa, se detectan errores debido a que no está declarado Scanner. 



Posteriormente se incluye la biblioteca y el programa corre sin complicaciones.

El siguiente paso del ejercicio consiste en crear un programa que realice la suma de tres valores ingresados al sistema. Para ello se realizó el programa -entrada-.


Para finalizar se pide ingresar un valor que no pueda ser analizado como un int. Se ingresa una cadena y el programa muestra un error.


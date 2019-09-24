#3_5_Ejercicio_1

En este ejercicio se pide escribir el siguiente código:

public class input {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Tu platillo favorito: ");
        System.out.println(input);
    }
}

El código muestra un error, posteriormente se solicita realizar la importación de la biblioteca -util- de java.

![Ejercicio 1_1](https://user-images.githubusercontent.com/54320247/65534690-928abc00-dec5-11e9-9949-f85177446c8a.jpg)

Una vez hecha la importación de la biblioteca, el programa se ejecuta sin complicaciones.

![Ejercicio 1_2](https://user-images.githubusercontent.com/54320247/65534691-928abc00-dec5-11e9-9310-a150d2903379.jpg)
![Ejercicio 1_3](https://user-images.githubusercontent.com/54320247/65534692-928abc00-dec5-11e9-81f0-ba2096457e75.jpg)

#3_5_Ejercicio_2

Usando el código anterior, se solicita almacenar la variable de entrada como un String, posteriormente debe analizarse como un valor del tipo int e incrementar en 1 e imprimirlo. Para ello se utilizó el método Integer.parseInt() para convertir el valor string en int. Este valor se almacena en otra variable que es incrementada en uno para su visualización. 

![Ejercicio 1_4](https://user-images.githubusercontent.com/54320247/65534693-93235280-dec5-11e9-9c45-a3ddf30262fc.jpg)

Al correr el programa apareció un error de sintaxis, puesto que no se colocó el caracter "t" en el método Integer.parseInt(). Se corrigió y se corrió el programa, el cual se ejecuta sin más complicaciones.

![Ejercicio 1_5](https://user-images.githubusercontent.com/54320247/65534694-93235280-dec5-11e9-981e-1cd86540f957.jpg)

#3_5_Ejercicio_3

En este ejercicio se pide ingresar un dato e imprimirlo utilizando el método Scanner, sin importación de biblioteca, al compilar el programa, se detectan errores debido a que no está declarado Scanner. 

![Ejercicio 2_1](https://user-images.githubusercontent.com/54320247/65534695-93235280-dec5-11e9-9ff3-bcbdb6ce0ee1.jpg)

Posteriormente se incluye la biblioteca y el programa corre sin complicaciones.

![Ejercicio 2_2](https://user-images.githubusercontent.com/54320247/65534696-93bbe900-dec5-11e9-8697-e40288666676.jpg)

El siguiente paso del ejercicio consiste en crear un programa que realice la suma de tres valores ingresados al sistema. Para ello se realizó el programa -entrada-.

![Ejercicio 2_3](https://user-images.githubusercontent.com/54320247/65534697-93bbe900-dec5-11e9-9832-19393fffad1d.jpg)

Para finalizar se pide ingresar un valor que no pueda ser analizado como un int. Se ingresa una cadena y el programa muestra un error.

![Ejercicio 2_4](https://user-images.githubusercontent.com/54320247/65534699-93bbe900-dec5-11e9-8157-e1498ee9bd82.jpg)

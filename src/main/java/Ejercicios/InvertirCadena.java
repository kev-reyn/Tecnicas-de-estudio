package Ejercicios;

public class InvertirCadena {

    //Ambos String vienen del paquete java.lang
    public StringBuilder getReverseStringBuilderWay(String cadena){
        String[] array = cadena.split("");
        StringBuilder respuesta = new StringBuilder();
        //Se declara la variable int i en los 2 metodos por su scope
        for(int i = array.length; i > 0; i--){
            // CON STRING NORMALrespuesta = respuesta + cadena.charAt(i-1);
            // CON STRING BUILDER
            respuesta.append(array[i-1]);
        }
        return respuesta;
    }

    public String getReverseStringWay(String cadena){
        //Se declara la variable int i en los 2 metodos por su scope
        String resp = "";
        for (int i = cadena.length(); i > 0; i--){
            //Se pone el -1 porque i es igual a la longitud en este caso CINCO = 5; 1,2,3,4,5
            //Pero se debe empezar de cero por que en un String
            //La posicion seria [0=C], [1=I],[2=N],[3=C],[4=C]
            //O sea que si no ponemos el -1 tomaria primero la pocision 5 {charAt[5=null]} por que ese es el tamano
            //Del String, entonces con el menos uno queda {charAt[5-1 = 4 = C]}
            //resp = resp + cadena.charAt(i-1);
            //La linea de arriba es la misma que la de abajo
            resp += cadena.charAt(i-1);
        }

        return resp;
    }
}

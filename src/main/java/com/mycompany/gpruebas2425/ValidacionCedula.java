package com.mycompany.gpruebas2425;

public class ValidacionCedula {

    private ValidacionCedula() {
    }

    
    public static boolean validar(String cedula) {
        // Validar que la cédula solo contenga números
        if (!cedula.matches("\\d+")) {
            return false;
        }
        // Validar longitud de la cédula
        if (cedula.length() != 10) {
            return false;
        }

        // Validar que los primeros dos dígitos estén entre 01 y 24 (provincias)
        int provincia = Integer.parseInt(cedula.substring(0, 2));
        if (provincia < 1 || provincia > 24) {
            return false;
        }

        // Validar que el tercer dígito no sea mayor a 6
        int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
        if (tercerDigito > 6) {
            return false;
        }

        // Algoritmo para validar el último dígito
        int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};
        int suma = 0;

        // Recorrer los primeros 9 dígitos
        for (int i = 0; i < 9; i++) {
            int digito = Integer.parseInt(cedula.substring(i, i + 1)) * coeficientes[i];
            if (digito >= 10) {
                digito -= 9;
            }
            suma += digito;
        }

        // Obtener el último dígito de la cédula
        int ultimoDigito = Integer.parseInt(cedula.substring(9, 10));

        // Comparar la suma con el último dígito
        int digitoVerificador = 10 - (suma % 10);
        if (digitoVerificador == 10) {
            digitoVerificador = 0;
        }

        return digitoVerificador == ultimoDigito;
    }
}

package co.edu.utp.misiontic2022.c2;

public class promediointerativo {

    public static double nota_quizes(int nota1, int nota2,int nota3, int nota4, int nota5){

        double promedioAjustado = 0;
/*
        if(peorNota > nota2){
            peorNota = nota2;
        }

        if(peorNota > nota3){
            peorNota = nota3; 
        }

        if(peorNota > nota4){
            peorNota = nota4; 
        }

        if(peorNota > nota5){
            peorNota = nota5; 
        }*/
        int peorNota = nota1;
        peorNota =  nota2 < peorNota? nota2 : peorNota;
        peorNota =  nota3 < peorNota? nota3 : peorNota;
        peorNota =  nota4 < peorNota? nota4 : peorNota;
        peorNota =  nota5 < peorNota? nota5 : peorNota;

        promedioAjustado = ((nota1 + nota2 + nota3 + nota4 + nota5) - peorNota) / 4;

        promedioAjustado = promedioAjustado/20;

        return promedioAjustado;
    }

    //interaccion

    public static void presentarResultados(String codigo, double promedioAjustado){
        System.out.println("El promedio ajustado del estudiante "+ codigo + " es " + promedioAjustado);
    }

    public static void main(String[] args) {
        String codigo = "aa01";
        double resultadoPromedio = nota_quizes(40, 50, 39, 76, 96);
        presentarResultados(codigo, resultadoPromedio);

        //System.out.println("El promedio ajustado del estudiante "+ codigo + " es " + resultadoPromedio );
    }
}

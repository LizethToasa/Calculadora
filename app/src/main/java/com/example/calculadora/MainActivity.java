package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    private TextView ingreso;
    boolean punto = false;
    int cont = 0;
    public double numero1 = 0, numero2 = 0, resultado = 0;
    int menu = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ingreso=(TextView) findViewById(R.id.txt_ingreso);
    }
    public void btn1 (View v){
        String res = ingreso.getText().toString();
        res = res+"1";
        ingreso.setText(res);
        cont = cont + 1;
    }

    public void btn2 (View v){
        String res = ingreso.getText().toString();
        res = res+"2";
        ingreso.setText(res);
        cont = cont + 1;
    }

    public void btn3 (View v){
        String res = ingreso.getText().toString();
        res = res+"3";
        ingreso.setText(res);
        cont = cont + 1;
    }

    public void btn4 (View v){
        String res = ingreso.getText().toString();
        res = res+"4";
        ingreso.setText(res);
        cont = cont + 1;
    }

    public void btn5 (View v){
        String res = ingreso.getText().toString();
        res = res+"5";
        ingreso.setText(res);
        cont = cont + 1;
    }

    public void btn6 (View v){
        String res = ingreso.getText().toString();
        res = res+"6";
        ingreso.setText(res);
        cont = cont + 1;
    }

    public void btn7 (View v){
        String res = ingreso.getText().toString();
        res = res+"7";
        ingreso.setText(res);
        cont = cont + 1;
    }

    public void btn8 (View v){
        String res = ingreso.getText().toString();
        res = res+"8";
        ingreso.setText(res);
        cont = cont + 1;
    }

    public void btn9 (View v){
        String res = ingreso.getText().toString();
        res = res+"9";
        ingreso.setText(res);
        cont = cont + 1;
    }

    public void btn0 (View v){
        String res = ingreso.getText().toString();
        res = res+"0";
        ingreso.setText(res);
        cont = cont + 1;
    }

    public void btnpunto (View v){
        if(cont >= 1){
            if(punto == false){
                String res = ingreso.getText().toString();
                res = res+".";
                ingreso.setText(res);
                punto = true;
            }

        }

    }

    public void sumar(View v){
        try{
            String num1 = ingreso.getText().toString();
            numero1 = Double.parseDouble(num1);
        }catch(NumberFormatException nfe){};
        ingreso.setText("");
        menu = 1;
        cont = 0;
        punto = false;
    }

    public void restar(View v){
        try{
            String num1 = ingreso.getText().toString();
            numero1 = Double.parseDouble(num1);
        }catch(NumberFormatException nfe){};
        ingreso.setText("");
        menu = 2;
        cont = 0;
        punto = false;
    }

    public void multiplicar(View v){
        try{
            String num1 = ingreso.getText().toString();
            numero1 = Double.parseDouble(num1);
        }catch(NumberFormatException nfe){};
        ingreso.setText("");
        menu = 3;
        cont = 0;
        punto = false;
    }

    public void dividir(View v){
        try{
            String num1 = ingreso.getText().toString();
            numero1 = Double.parseDouble(num1);
        }catch(NumberFormatException nfe){};
        ingreso.setText("");
        menu = 4;
        cont = 0;
        punto = false;
    }

    public void igual (View v){
        try{
            String num2 = ingreso.getText().toString();
            numero2 = Double.parseDouble(num2);
        }catch(NumberFormatException nfe){};
        ingreso.setText("");
        String imprimir = "";
        if (menu == 1){
            resultado = numero1 + numero2;
            imprimir = String.valueOf(resultado);
            ingreso.setText(imprimir);
        }else if(menu == 2){
            resultado = numero1 - numero2;
            imprimir = String.valueOf(resultado);
            ingreso.setText(imprimir);
        }else if(menu == 3){
            resultado = numero1 * numero2;
            imprimir = String.valueOf(resultado);
            ingreso.setText(imprimir);
        }else if(menu == 4){
            if(numero2 == 0.0 || numero2 == 0){
                ingreso.setText("Número no se puede dividir para 0");
            }else{
                resultado = numero1 / numero2;
                imprimir = String.valueOf(resultado);
                ingreso.setText(imprimir);
            }

        }

    }
    public void seno(View v){
        try{
            String num1 = ingreso.getText().toString();
            numero1 = Double.parseDouble(num1);
        }catch(NumberFormatException nfe){};
        resultado = Math.toRadians(numero1);
        resultado = Math.sin(resultado);
        String imprimir = String.valueOf(resultado);
        ingreso.setText(imprimir);
    }

    public void coseno(View v){
        try{
            String num1 = ingreso.getText().toString();
            numero1 = Double.parseDouble(num1);
        }catch(NumberFormatException nfe){};
        resultado = Math.toRadians(numero1);
        resultado = Math.cos(resultado);
        String imprimir = String.valueOf(resultado);
        ingreso.setText(imprimir);
    }

    public void tangente(View v){
        try{
            String num1 = ingreso.getText().toString();
            numero1 = Double.parseDouble(num1);
        }catch(NumberFormatException nfe){};
        if(numero1 == 90 || numero1 == 90.00){
            ingreso.setText("Error Matemáticas");
        }else{
            resultado = Math.toRadians(numero1);
            resultado = Math.tan(resultado);
            String imprimir = String.valueOf(resultado);
            ingreso.setText(imprimir);
        }

    }

    public void limpiar (View v){
        ingreso.setText("");
        numero1 = 0.0;
        numero2 = 0.0;
        resultado = 0.0;
        cont = 0;
        punto = false;
    }
}

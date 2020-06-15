package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    private TextView ingreso;
    boolean punto = false;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnigual,
    btnsuma, btnmenos, btnmult, btndividir, btntan, btncos, btnsen, btnpunto;
    int cont = 0;
    public double numero1 = 0, numero2 = 0, resultado = 0;
    int menu = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ingreso=(TextView) findViewById(R.id.txt_ingreso);
        btnigual = (Button) findViewById(R.id.btnigual);
        btnsuma = (Button) findViewById(R.id.btnsuma);
        btnmenos = (Button) findViewById(R.id.btnmenos);
        btnmult = (Button) findViewById(R.id.btnmult);
        btndividir = (Button) findViewById(R.id.btndividir);
        btntan = (Button) findViewById(R.id.btntan);
        btncos = (Button) findViewById(R.id.btncos);
        btnsen = (Button) findViewById(R.id.btnsen);
        btnpunto = (Button) findViewById(R.id.btnpunto);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);



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
            if(num1.equals("")){
                num1="0";
            }
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
            if(num1.equals("")){
                num1="0";
            }
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
            if(num1.equals("")){
                num1="0";
            }
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
            if(num1.equals("")){
                num1="0";
            }
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
            if(num2.equals("")){
                num2="0";
            }
            numero2 = Double.parseDouble(num2);
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
                    btnigual.setEnabled(false);
                    btnsuma.setEnabled(false);
                    btnmenos.setEnabled(false);
                    btnmult.setEnabled(false);
                    btndividir.setEnabled(false);
                    btntan.setEnabled(false);
                    btncos.setEnabled(false);
                    btnsen.setEnabled(false);
                    btnpunto.setEnabled(false);
                    btn1.setEnabled(false);
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    btn5.setEnabled(false);
                    btn6.setEnabled(false);
                    btn7.setEnabled(false);
                    btn8.setEnabled(false);
                    btn9.setEnabled(false);
                    btn0.setEnabled(false);
                }else{
                    resultado = numero1 / numero2;
                    imprimir = String.valueOf(resultado);
                    ingreso.setText(imprimir);
                }
            }
        }catch(NumberFormatException nfe){};


    }
    public void seno(View v){
        try{
            String num1 = ingreso.getText().toString();
            if((num1.equals("")) || (num1.equals("0")) || (num1.equals("0.00")) || (num1.equals("180.00")) || (num1.equals("180")) || (num1.equals("360")) || (num1.equals("360.00"))){
                ingreso.setText("0");
            }else if((num1.equals("90")) || (num1.equals("90.00"))){
                ingreso.setText("1");
            }else{
                numero1 = Double.parseDouble(num1);
                resultado = Math.toRadians(numero1);
                resultado = Math.sin(resultado);
                String imprimir = String.valueOf(resultado);
                ingreso.setText(imprimir);
            }
        }catch(NumberFormatException nfe){};
    }

    public void coseno(View v){
        try{
            String num1 = ingreso.getText().toString();
            if((num1.equals("")) || (num1.equals("0")) || (num1.equals("0.00")) || (num1.equals("360.00")) || (num1.equals("360"))){
                ingreso.setText("1");
            }else if((num1.equals("90")) || (num1.equals("90.00")) || (num1.equals("270.00")) || (num1.equals("270"))){
                ingreso.setText("0");
            }else{
                numero1 = Double.parseDouble(num1);
                resultado = Math.toRadians(numero1);
                resultado = Math.cos(resultado);
                String imprimir = String.valueOf(resultado);
                ingreso.setText(imprimir);
            }
        }catch(NumberFormatException nfe){};
    }

    public void tangente(View v){
        try{
            String num1 = ingreso.getText().toString();
            if((num1.equals("")) || (num1.equals("0")) || (num1.equals("0.00"))){
                ingreso.setText("0");
            }else if((num1.equals("45")) || (num1.equals("45.00"))){
                ingreso.setText("1");
            }else if((num1.equals("90")) || (num1.equals("90.00")) || (num1.equals("270.00")) || (num1.equals("270"))){
                ingreso.setText("Error Matemáticas");
                btnigual.setEnabled(false);
                btnsuma.setEnabled(false);
                btnmenos.setEnabled(false);
                btnmult.setEnabled(false);
                btndividir.setEnabled(false);
                btntan.setEnabled(false);
                btncos.setEnabled(false);
                btnsen.setEnabled(false);
                btnpunto.setEnabled(false);
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
                btn5.setEnabled(false);
                btn6.setEnabled(false);
                btn7.setEnabled(false);
                btn8.setEnabled(false);
                btn9.setEnabled(false);
                btn0.setEnabled(false);
            }else if((num1.equals("360")) || (num1.equals("360.00"))){
                ingreso.setText("0");
            }else if((num1.equals("180")) || (num1.equals("180.00"))){
                ingreso.setText("0");
            }else{
                numero1 = Double.parseDouble(num1);
                resultado = Math.toRadians(numero1);
                resultado = Math.tan(resultado);
                String imprimir = String.valueOf(resultado);
                ingreso.setText(imprimir);
            }
        }catch(NumberFormatException nfe){};


    }

    public void limpiar (View v){
        try{
            ingreso.setText("");
            numero1 = 0.0;
            numero2 = 0.0;
            resultado = 0.0;
            cont = 0;
            punto = false;
            btnigual.setEnabled(true);
            btnsuma.setEnabled(true);
            btnmenos.setEnabled(true);
            btnmult.setEnabled(true);
            btndividir.setEnabled(true);
            btntan.setEnabled(true);
            btncos.setEnabled(true);
            btnsen.setEnabled(true);
            btnpunto.setEnabled(true);
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            btn0.setEnabled(true);
        }catch (Exception e){};

    }
}

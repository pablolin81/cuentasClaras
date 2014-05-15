package com.kaduu.cuentasclaras;

import com.kaduu.cuentasclaras.R;
import com.kaduu.cuentasclaras.R.layout;
import com.kaduu.cuentasclaras.R.menu;
import com.kaduu.cuentasclaras.model.Gasto;
import com.kaduu.cuentasclaras.model.Persona;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Persona persona = new Persona(1, "David");
		Persona persona2 = new Persona(2, "Pablo");
		
		Gasto gasto = new Gasto(11, "Chinchulines", 21);
		
		System.out.println(persona.toString());
		System.out.println(persona2.toString());
		System.out.println(gasto.toString());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

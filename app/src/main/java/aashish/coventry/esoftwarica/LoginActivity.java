package aashish.coventry.esoftwarica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.jar.Attributes;

import aashish.coventry.esoftwarica.model.Student;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText txtname, txtpassword;
    Button login;
    String Name, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtname = findViewById(R.id.txtname);
        txtpassword = findViewById(R.id.txtpassword);

        login = findViewById(R.id.btnlogin);

        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Name = txtname.getText().toString();
        Password = txtpassword.getText().toString();
        if (Name.equals("Aashish") && Password.equals("1234")) {
            Intent intent = new Intent(LoginActivity.this, DashBoard.class);
            startActivity(intent);
            Toast.makeText(LoginActivity.this, "Login Sucessful :" + Name, Toast.LENGTH_LONG).show();


        } else {
            Toast.makeText(LoginActivity.this, "Incorrect Username Or Password" + Name + Password, Toast.LENGTH_LONG).show();

        }

    }
}

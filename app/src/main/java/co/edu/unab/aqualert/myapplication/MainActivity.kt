package co.edu.unab.aqualert.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.edu.unab.aqualert.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AqualertUI()
        }
    }
}

@Composable
fun AqualertUI() {
    Column(
        modifier = Modifier
    ) {
        // Imagen que ocupa la parte superior de la pantalla
        Image(
            painter = painterResource(id = R.drawable.aqualert), // Coloca tu logo aquí
            contentDescription = "Logo de Aqualert",
            contentScale = ContentScale.Crop,  // Esto hará que la imagen se recorte si es necesario
            modifier = Modifier
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(50.dp))

        // Campo de Usuario
        var username by remember { mutableStateOf("") }
        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("Usuario") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Campo de Contraseña
        var password by remember { mutableStateOf("") }
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Contraseña") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Botones de Registrarse e Ingresar
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Button(
                onClick = { /* Acción de registro */ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF33CAFF) // Color azul oscuro
                ),
                modifier = Modifier.weight(1f)
            ) {
                Text("REGISTRARSE", fontSize = 16.sp)
            }
            Spacer(modifier = Modifier.width(16.dp))

            Button(
                onClick = { /* Acción de login */ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF33CAFF) // Color azul oscuro
                ),
                modifier = Modifier.weight(1f)
            ) {
                Text("INGRESAR", fontSize = 16.sp)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Imagen decorativa de la gota
        Image(
            painter = painterResource(id = R.drawable.waterdrop), // Coloca tu imagen de gota aquí
            contentDescription = "Imagen de gotas de agua",
            modifier = Modifier
                .fillMaxWidth()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AqualertPreview() {
    AqualertUI()
}

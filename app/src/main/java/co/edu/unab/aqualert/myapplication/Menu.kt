package co.edu.unab.aqualert.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Arrangement


class MenuActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MenuScreen()
        }
    }
}

@Composable
fun MenuScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            // Imagen superior
            Image(
                painter = painterResource(id = R.drawable.aqualert), // Coloca tu logo aquí
                contentDescription = "Logo de Aqualert",
                contentScale = ContentScale.Crop,  // Esto hará que la imagen se recorte si es necesario
                modifier = Modifier
                    .fillMaxWidth()
            )

            // Botones principales en el centro
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.weight(1f)
            ) {
                Button(
                    onClick = { /* Acción para HIDRÁTATE */ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF33CAFF)), // Color azul
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth()

                ) {
                    Text(text = "HIDRÁTATE", fontSize = 16.sp, textAlign = TextAlign.Center)
                }

                Button(
                    onClick = { /* Acción para Tu actividad */ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF33CAFF)), // Color azul
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                ) {
                    Text(text = "Tu actividad", fontSize = 16.sp, textAlign = TextAlign.Center)
                }

                Button(
                    onClick = { /* Acción para Tu resumen anual */ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF33CAFF)), // Color azul
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                ) {
                    Text(text = "Tu resumen anual", fontSize = 16.sp, textAlign = TextAlign.Center)
                }

                Button(
                    onClick = { /* Acción para Información Aqua */ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF33CAFF)), // Color azul
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                ) {
                    Text(text = "Información Aqua", fontSize = 16.sp, textAlign = TextAlign.Center)
                }

                Button(
                    onClick = { /* Acción para Perfil */ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF33CAFF)), // Color azul
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                ) {
                    Text(text = "Perfil", fontSize = 16.sp, textAlign = TextAlign.Center)
                }
            }

            // Imagen inferior
            Image(
                painter = painterResource(id = R.drawable.waterdrop), // Coloca tu logo inferior aquí
                contentDescription = null,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MenuPreview() {
    MenuScreen()
}

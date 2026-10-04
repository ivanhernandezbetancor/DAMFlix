package com.example.damflix

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                PerfilUsuario()
            }
        }
    }
}

@Composable
fun CabeceraUsuario() {
    Image(
        painter = painterResource(id = R.drawable.user_avatar),
        contentDescription = stringResource(id = R.string.avatar_desc),
        modifier = Modifier
            .size(120.dp)
            .clip(CircleShape)
            .border(3.dp, MaterialTheme.colorScheme.primary, CircleShape)
    )
}

@Composable
fun InfoUsuario() {
    Column {
        Text(
            text = stringResource(id = R.string.user_name),
            style = MaterialTheme.typography.headlineSmall
        )
        Text(
            text = stringResource(id = R.string.user_rol),
            style = MaterialTheme.typography.bodyLarge
        )
        Row {
            Text(
                text = stringResource(id = R.string.estadisticas_peliculas, 42),
                style = MaterialTheme.typography.bodySmall
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = stringResource(id = R.string.estadisticas_resenas, 12),
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}

@Composable
fun PerfilUsuario() {
    Row(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        CabeceraUsuario()
        Spacer(modifier = Modifier.width(12.dp))
        InfoUsuario()
    }
}
 // Use el Preview para mostrarlo mientras la este modificando el código
@Preview(showBackground = true)
@Composable
fun PerfilUsuarioPreview() {
    MaterialTheme {
        PerfilUsuario()
    }
}
package com.example.botaoflutuante

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.botaoflutuante.ui.theme.BotaoFlutuanteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BotaoFlutuanteTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FloatingActionButtonExamples()
                }
            }
        }
    }
}

@Composable
fun FloatingActionButtonExamples() {
    Column(
        modifier = Modifier
            .padding(48.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        // Exemplo do FAB padrão
        Text("Floating action button:")
        Example(onClick = { Log.d("FAB", "FAB padrão clicado.") })

        // Exemplo de Small FAB com cores personalizadas
        Text("Small floating action button:")
        SmallExample(onClick = { Log.d("FAB", "Small FAB clicado.") })

        // Exemplo de Large FAB
        Text("Large floating action button:")
        LargeExample(onClick = { Log.d("FAB", "Large FAB clicado.") })

        // Exemplo de Extended FAB com texto
        Text("Floating action button with text:")
        ExtendedExample(onClick = { Log.d("FAB", "Extended FAB clicado.") })
    }
}

// Exemplo de um FAB padrão
@Composable
fun Example(onClick: () -> Unit) {
    FloatingActionButton(
        onClick = { onClick() },
        containerColor = MaterialTheme.colorScheme.primary, // Cor de fundo do FAB
        contentColor = MaterialTheme.colorScheme.onPrimary // Cor do ícone
    ) {
        Icon(Icons.Filled.Add, contentDescription = "Floating action button")
    }
}

// Exemplo de um FAB com texto (Extended FAB)
@Composable
fun ExtendedExample(onClick: () -> Unit) {
    ExtendedFloatingActionButton(
        onClick = { onClick() },
        icon = { Icon(Icons.Filled.Edit, contentDescription = "Extended floating action button") },
        text = { Text("Extended FAB") },
        containerColor = MaterialTheme.colorScheme.secondaryContainer,
        contentColor = MaterialTheme.colorScheme.onSecondaryContainer
    )
}

// Exemplo de um Small FAB com cores personalizadas
@Composable
fun SmallExample(onClick: () -> Unit) {
    SmallFloatingActionButton(
        onClick = { onClick() },
        containerColor = MaterialTheme.colorScheme.secondaryContainer,
        contentColor = MaterialTheme.colorScheme.onSecondaryContainer
    ) {
        Icon(Icons.Filled.Add, contentDescription = "Small floating action button")
    }
}

// Exemplo de um Large FAB com formato circular
@Composable
fun LargeExample(onClick: () -> Unit) {
    LargeFloatingActionButton(
        onClick = { onClick() },
        shape = CircleShape, // Forma circular
        containerColor = MaterialTheme.colorScheme.tertiaryContainer,
        contentColor = MaterialTheme.colorScheme.onTertiaryContainer
    ) {
        Icon(Icons.Filled.Add, contentDescription = "Large floating action button")
    }
}

@Preview(showBackground = true)
@Composable
fun FloatingActionButtonExamplesPreview() {
    BotaoFlutuanteTheme {
        FloatingActionButtonExamples()
    }
}


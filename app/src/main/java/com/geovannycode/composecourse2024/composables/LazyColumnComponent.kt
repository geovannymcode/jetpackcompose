package com.geovannycode.composecourse2024.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.geovannycode.composecourse2024.R
import com.geovannycode.composecourse2024.previews.MyPreviewDefault
import com.geovannycode.composecourse2024.previews.MyPreviewWithoutBackground
import com.geovannycode.composecourse2024.ui.theme.BackgrounTopBar


data class Pokemon(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val type: String
)

fun getPrkemons() = (1..151).map {
    Pokemon(
        id = it,
        name = "Pokemon $it",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/$it.png",
        type = if (it in 1..49) "Planta" else if (it in 50..100) "Agua" else "Fuego"
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PokedexScreen() {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Pokedex")
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = BackgrounTopBar,
                    titleContentColor = Color.White
                ),
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Menu",
                            tint = Color.White
                        )
                    }
                },
                actions = {
                    Icon(
                        imageVector = Icons.Filled.Star,
                        contentDescription = "Menu",
                        tint = Color.White
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Icon(
                        imageVector = Icons.Filled.Favorite,
                        contentDescription = "Menu",
                        tint = Color.White
                    )
                }
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            items(getPrkemons()) { pokemon ->
                PokemonItem(
                    pokemon = pokemon
                )
            }
        }
    }
}

@Composable
fun PokemonItem(
    modifier: Modifier = Modifier,
    pokemon: Pokemon
) {
    Card(
        border = BorderStroke(
            width = 1.dp,
            color = Color.Black
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color.LightGray
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 16.dp
        ),
        shape = RoundedCornerShape(12.dp),
        modifier = modifier.fillMaxWidth()
    ) {
        Column {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.template),
                    contentDescription = "Pokemon"
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(BackgrounTopBar)
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = pokemon.name,
                    fontSize = 20.sp,
                    color = Color.White
                )
            }
        }
    }
}

@MyPreviewWithoutBackground
@Composable
fun PokemonItemPreview() {
    PokemonItem(
        pokemon = Pokemon(
            id = 1,
            name = "Pokemon 1",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1.png",
            type = "Fuego"
        ),
        //context = LocalContext.current
    )
}

@MyPreviewDefault
@Composable
fun PokedexScreenPreview() {
    PokedexScreen()
}
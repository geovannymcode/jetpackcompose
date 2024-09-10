package com.geovannycode.composecourse2024.exercises


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.geovannycode.composecourse2024.R

@Composable
fun CardPresentation() {

        Row(modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFCC0000)),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
            ){
            Image(painter = painterResource(id = R.drawable.avatar)
                , contentDescription = "Avatar",
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .border(width = 1.dp, color = Color.White, CircleShape),
                contentScale = ContentScale.Inside
            )
            Column(modifier = Modifier.weight(1f)){
                Text(
                    text = "Geovanny Mendoza",
                    style = TextStyle(
                        fontSize = 18.sp,
                        color = Color.White,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.SemiBold
                    ),
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = "Geovanny@gmail.com",
                    style = TextStyle(
                        fontSize = 15.sp,
                        color = Color.White,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Thin
                    ),
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)){
                    Icon(painter = painterResource(id = R.drawable.linkedin),
                        contentDescription = "Linkedin",
                    tint = Color.White)
                    Icon(painter = painterResource(id = R.drawable.github),
                        contentDescription = "Github",
                        tint = Color.White)
                }

            }

        }
}

@Preview(name = "CardPresentation")
@Composable
fun CardPresentationPreview(){
CardPresentation()
}
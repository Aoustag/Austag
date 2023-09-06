package com.austag

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

object ReusableComponents {
    @Composable
    fun ViewHeader(headerTitle: String, body:@Composable()()->Unit, onBackPressed:()->Unit){
        Column(modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF9F9F9))


        ) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(20.dp), verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "backward arrow",
                    modifier = Modifier
                        .clickable {
                            onBackPressed()
                        }
                        .size(20.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = headerTitle,
                    style = TextStyle(
                        fontSize = 20.sp,
                        lineHeight = 32.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF021218),
                    )
                )

            }

            Column(modifier = Modifier.verticalScroll(rememberScrollState()).fillMaxWidth()) {
                body()
            }
        }
    }
    @Composable
    fun BlackButtonFilled(title1: String,onClick:()->Unit){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .height(56.dp)
                .background(color = Color.Black, shape = RoundedCornerShape(size = 8.dp))
                .clickable {
                    onClick()
                },
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(text = title1,
                style = TextStyle(
                    fontSize = 18.sp,
                    lineHeight = 30.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xFFFFFFFF),
                )
            )
        }
    }
    @Composable
    fun BlackButtonTransparent(title1: String,onClick:()->Unit){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .height(56.dp)
                .background(color = Color.Transparent, shape = RoundedCornerShape(size = 8.dp))
                .clickable {
                    onClick()
                },
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(text = title1,
                style = TextStyle(
                    fontSize = 18.sp,
                    lineHeight = 30.sp,
                    fontWeight = FontWeight(400),
                    color = Color.Black,
                )
            )
        }
    }
    @Composable
    fun BlackButtonOutlined(title1: String,onClick: () -> Unit){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .height(60.dp)
                .border(
                    border = BorderStroke(2.dp, Color.Black),
                    shape = RoundedCornerShape(size = 8.dp)
                )
                .clickable {
                    onClick()
                },
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(text = title1,
                style = TextStyle(
                    fontSize = 18.sp,
                    lineHeight = 30.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xFFF21B1B),
                )
            )
        }
    }
}
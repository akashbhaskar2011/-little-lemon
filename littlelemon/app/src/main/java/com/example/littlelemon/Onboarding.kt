package com.example.littlelemon
import android.graphics.drawable.ColorDrawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.R.color.primaryGreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Onboarding() {
    var first_name by rememberSaveable { mutableStateOf("") }
    var last_name by rememberSaveable { mutableStateOf("") }
    var email by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {

        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo of the page",
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .width(184.dp)
                .height(42.dp)
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .height(80.dp)
                .background(color = Color(0xFF495E57)),
            contentAlignment = Alignment.Center // Center content horizontally and vertically in the Box
        ) {
            Text(
                text = "Let's get to know you",
                style=TextStyle(fontSize = 30.sp,color = Color.LightGray),
                textAlign = TextAlign.Center
            )

        }
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = "Personal Information",
            style=TextStyle(fontSize = 25.sp,color = Color.LightGray),
            modifier=Modifier.padding(16.dp),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(text ="First name",
            style = TextStyle(fontSize = 15.sp, color = Color.Gray), modifier = Modifier.padding(start=16.dp, bottom = 10.dp) )
        TextField(value = first_name, onValueChange = { it->
                first_name=it},placeholder = { Text(text = "Enter your first name") },


            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.LightGray,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),

            shape = RoundedCornerShape(16.dp),
            modifier= Modifier
                .padding(start = 16.dp, end = 16.dp)
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(15.dp))
        Text(text ="Last Name",
            style = TextStyle(fontSize = 15.sp, color = Color.Gray), modifier = Modifier.padding(start=16.dp, bottom = 10.dp) )
        TextField(value = last_name, onValueChange = { it->
            last_name=it},placeholder = { Text(text = "Enter your Last name") },shape = RoundedCornerShape(16.dp),

            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.LightGray,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),

            modifier= Modifier
                .padding(start = 16.dp, end = 16.dp)
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(15.dp))
        Text(text ="Email",
            style = TextStyle(fontSize = 15.sp, color = Color.Gray), modifier = Modifier.padding(start=16.dp, bottom = 10.dp) )
        TextField(value = email, onValueChange = { it->
            email=it},placeholder = { Text(text = "Enter your Email") },shape = RoundedCornerShape(16.dp),

            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.LightGray,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),

            modifier= Modifier
                .padding(start = 16.dp, end = 16.dp)
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = { /*TODO*/ },
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),  colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4CE14), contentColor = Color.Black),
        ) {
            Text(text = "Register")
        }
        Spacer(modifier = Modifier.weight(.5f))


    }
}

@Preview
@Composable
fun viewOnboarding(){
    Onboarding()
}
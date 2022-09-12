package ramizbek.aliyev.jetpackcompose

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import ramizbek.aliyev.jetpackcompose.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            text()
//            columnCustom()
//            rowCustom()
            constraintLayout(context = this)
//           homeWork2()
        }
    }
}

@Composable
fun text() {
    Text(text = "Hello World!")
}

//Column = LinearLayout(Vertically)
@Composable
fun columnCustom() {
    Column(
        modifier = Modifier
            .width(100.dp)
            .height(100.dp)
            .background(Color.Red), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Ramizbek 1", color = Color.White)
        Text(text = "Ramizbek 2", color = Color.White)
        Text(text = "Ramizbek 3", color = Color.White)
        Text(text = "Ramizbek 4", color = Color.White)
        Text(text = "Ramizbek 5", color = Color.White)
    }
}

//Row = LinearLayout(Horizontally)
@Composable
fun rowCustom() {
    Row(
        modifier = Modifier
            .wrapContentWidth()
            .wrapContentHeight()
            .background(Color.Yellow), verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Text 1",
            color = Color.Black,
            fontSize = 40.sp,
            modifier = Modifier.padding(10.dp)
        )
        Text(
            text = "Text 2",
            color = Color.Black,
            fontSize = 40.sp,
            modifier = Modifier.padding(10.dp)
        )
        Text(
            text = "Text 3",
            color = Color.Black,
            fontSize = 40.sp,
            modifier = Modifier.padding(10.dp)
        )
    }
}

//ConstraintLayout
@Composable
fun constraintLayout(context: Context) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .background(paleBlue)
    ) {
        val (redBox, blueBox, yellowBox, greenBox, centerBox) = createRefs()

        Box(modifier = Modifier
            .size(100.dp)
            .padding(start = 10.dp)
            .background(Color.Red)
            .clickable {
                Toast
                    .makeText(context, "RED", Toast.LENGTH_SHORT)
                    .show()
            }
            .constrainAs(redBox) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            }
        ) {
            FunctionTextView(txt = "Red")
        }

        Box(modifier = Modifier
            .size(100.dp)
            .padding(end = 10.dp)
            .background(Color.Blue)
            .clickable {
                Toast
                    .makeText(context, "Blue", Toast.LENGTH_SHORT)
                    .show()
            }
            .constrainAs(blueBox) {
                top.linkTo(parent.top)
                end.linkTo(parent.end)
            }) {
            FunctionTextView(txt = "Blue")
        }

        Box(modifier = Modifier
            .size(100.dp)
            .padding(start = 10.dp)
            .background(Color.Yellow)
            .clickable {
                Toast
                    .makeText(context, "Yellow", Toast.LENGTH_SHORT)
                    .show()
            }
            .constrainAs(yellowBox) {
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
            }) {
            FunctionTextView(txt = "Yellow")
        }

        Box(modifier = Modifier
            .size(100.dp)
            .padding(end = 10.dp)
            .background(Color.Green)
            .clickable {
                Toast
                    .makeText(context, "Green", Toast.LENGTH_SHORT)
                    .show()
            }
            .constrainAs(greenBox) {
                bottom.linkTo(parent.bottom)
                end.linkTo(parent.end)
            }) {
            FunctionTextView(txt = "Green")
        }

        Box(modifier = Modifier
            .size(100.dp)
            .padding(end = 10.dp)
            .background(Color.Cyan)
            .clickable {
                Toast
                    .makeText(context, "Cyan", Toast.LENGTH_SHORT)
                    .show()
            }
            .constrainAs(centerBox) {
                bottom.linkTo(parent.bottom)
                end.linkTo(parent.end)
                start.linkTo(parent.start)
                top.linkTo(parent.top)
            }) {
            FunctionTextView(txt = "Cyan")
        }
    }
}

@Composable
fun FunctionTextView(txt: String) {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = txt,
            color = Color.White,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

//Homework 2
@Composable
fun homeWork2() {
    Column(modifier = Modifier.fillMaxSize()) {

        //First
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            //1st corner
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .background(bir)
                    ) {

                    }
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .background(ikki)
                    ) {

                    }

                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .background(uch)
                    ) {

                    }
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .background(tort)
                    ) {

                    }

                }
            }

            //2nd corner
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(0.7f)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .background(besh)
                    ) {

                    }
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                    ) {

                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(1f)
                                .background(tort)
                        ) {

                        }
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(1f)
                                .background(olti)
                        ) {

                        }
                    }
                }
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(0.3f)
                        .background(Color.Green)
                ) {

                }
            }
        }

        //Second part
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            //3rd corner
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .background(Color.Black)
                    ) {

                    }
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .background(Color.White)
                    ) {

                    }
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .background(Color.Black)
                    ) {

                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                        .background(yetti)
                ) {

                }
            }
            //4th corner
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .background(Color.White)
                    ) {

                    }
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                    ) {

                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(1f)
                                .background(tort)
                        ) {

                        }
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(1f)
                                .background(olti)
                        ) {

                        }
                    }
                }
            }
        }
    }
}
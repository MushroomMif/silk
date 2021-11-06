@file:Suppress("FunctionName")

package net.axay.fabrik.test.compose.guis

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import net.axay.fabrik.compose.color.toCompose
import net.minecraft.block.MapColor

private val colorList = listOf(Color.Green, Color.Magenta, Color.Red, Color.Blue, Color.Yellow)

@Composable
fun TestGuiComposable() {
    Row(Modifier.padding(6.dp)) {
        Column {
            repeat(5) {
                Button(onClick = {}, colors = ButtonDefaults.buttonColors(colorList[it])) {
                    Text("Button $it")
                }
            }
        }
        Column(Modifier.padding(start = 10.dp)) {
            Text("Hey, this is test :)")
            Text("red background", Modifier.background(Color.Red))

            var clickCounter by remember { mutableStateOf(0) }

            Button(onClick = { clickCounter += 1 }) {
                Text("Click me")
            }
            Spacer(Modifier.height(5.dp))
            Text("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo.")
            Spacer(Modifier.height(5.dp))
            Text("Amount of clicks: $clickCounter")
            Spacer(Modifier.height(5.dp))
            Button(onClick = {}, colors = ButtonDefaults.buttonColors(MapColor.DARK_AQUA.toCompose())) {
                Text("DARK_AQUA looks like this")
            }
        }
    }
}
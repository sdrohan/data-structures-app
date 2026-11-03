import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import ui.QueueScreen
import ui.StackScreen
import ui.theme.AppTheme

@Composable
fun App() {
    //StackScreen()
    QueueScreen()
}

fun main() = application {

    Window(
        onCloseRequest = ::exitApplication,
        title = "Custom Data Structures"
    ) {
        AppTheme (false){
            App()
        }
    }
}
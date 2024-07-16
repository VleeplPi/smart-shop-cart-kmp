import androidx.compose.ui.window.ComposeUIViewController
import ru.vleeplpi.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }

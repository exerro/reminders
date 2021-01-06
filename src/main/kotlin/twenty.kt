import java.awt.SystemTray
import java.awt.Toolkit
import java.awt.TrayIcon

const val MINUTES = 20L

fun main() {
    val tray = SystemTray.getSystemTray()
    val image = Toolkit.getDefaultToolkit().createImage("icon.png")
    val trayIcon = TrayIcon(image, "")

    tray.add(trayIcon)

    fun showReminder() {
        trayIcon.displayMessage(
            "Do yo exercise",
            "10 pushups\n20 squats\n10 L-out-band\n10 leg-up-band",
            TrayIcon.MessageType.WARNING
        )
    }

    while (true) {
        showReminder()
        Thread.sleep(MINUTES * 60 * 1000)
    }
}

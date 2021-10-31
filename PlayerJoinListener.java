import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {



    @EventHandler
    public void sendJoinMessage(PlayerJoinEvent event) {
        event.getPlayer().sendMessage(player.getDisplayName+"が戦場に参加したぞ！");

    }
}

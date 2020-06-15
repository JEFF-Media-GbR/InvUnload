package de.jeff_media.InvUnload;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CommandUnloadinfo implements CommandExecutor {
	
	Main main;
	
	CommandUnloadinfo(Main main) {
		this.main=main;
	}

	@Override
	public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label,
			@NotNull String[] args) {
		
		if(!(sender instanceof Player)) {
			return false;
		}
		
		Player p = (Player) sender;
		
		if(main.visualizer.activeVisualizations.containsKey(p.getUniqueId())) {
			main.visualizer.cancelVisualization(p);
		} else {
			main.visualizer.play(p);
		}
		
		return true;
	}

}

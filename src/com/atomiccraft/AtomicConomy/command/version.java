package com.atomiccraft.AtomicConomy.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class version {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("ACon")){ 
			if (args[0].equalsIgnoreCase("version")){
				if (!(sender instanceof Player)) {
					sender.sendMessage("TODO");
					//TODO Add version!
					return true;
				}
				 else {
					System.out.println("[AtomicConomy] Todo");
					//TODO Add version!
					return true;
				 	}
				 }
			if (args[0].equalsIgnoreCase("admin")){
				if (!(sender instanceof Player)) {
					sender.sendMessage("TODO");
					//TODO Add version!
					return true;
				}
				 else {
					System.out.println("[AtomicConomy] Todo");
					//TODO Add version!
					return true;
		 	}
		 }
	}
		return false;
}
}

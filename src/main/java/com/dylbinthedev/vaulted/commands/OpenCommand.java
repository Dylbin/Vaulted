package com.dylbinthedev.vaulted.commands;

import com.dylbinthedev.vaulted.utils.VaultedUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class OpenCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){

            Player p = (Player) sender;

            if(args.length > 0){
                if (args[0].equalsIgnoreCase("open")){

                    ArrayList<ItemStack> vaultItems = VaultedUtils.getItems(p);

                    Inventory vault = Bukkit.createInventory(p, 54, "Personal Vault");

                    vaultItems.stream()
                            .forEach(itemStack -> vault.addItem(itemStack));

                    p.openInventory(vault);

                }
            }
        }




        return true;
    }
}

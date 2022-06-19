# Changelog

## 5.0.0
- Full 1.19 support
- **HUGE performance improvements**! You could now easily use a radius of 200 blocks without ANY lag.
- Added config option "ignore-blocked-chests"

## 4.17.1
- Full 1.18.2 support
- Improved UpdateChecker

## 4.17.0
- Added Cooldown for /unload and /dump
- Fixed /dump command putting shulkerboxes inside shulkerboxes
- Fixed "All your items are blacklisted" message being shown when there are no remaining chests for non-blacklisted items

## 4.16.0
- Improved unloading for enchanted books (see option "match-enchantments-on-books")

## 4.15.5
- Unload summary shows chest names instead of CHEST, DOUBLECHEST etc. when set

## 4.15.4
- Added Polish translation

## 4.15.1
- Added Dutch translation
- Updated Spanish translation

## 4.15.0
- Updated ChestSortAPI to version 11.0.0.

## 4.14.0
- Added support for PlotSquared 6 API (why do they change their API on every new major release? >.<)

## 4.13.5
- Fixed InvUnload not enabling when ChestSort is not installed

## 4.13.4
- Improved performance and memory consumption
- Updated Turkish translation

## 4.13.3
- Fixed ChestSort compatibility (again, sorry for the trouble)

## 4.13.2
- Fixed ChestSort compatibility

## 4.13.1
- Updated to newest ChestSort API version. If you have ChestSort installed, you MUST use at least ChestSort version 10.0.0!

## 4.12.1
- Removed forgotten debug messages

## 4.12.0
- Added ItemsAdder support, seems to be working fine for now
- Added two new config options to control behaviour regarding enchantments
  - "match-enchantments": Only unload items when all enchantments are the same
  - "match-enchantments-on-books": When "match-enchantments" is false, you can anyway have enchanted books only be put into matching chests
- Fixed warning regarding CoreProtect being to old when CoreProtect isn't installed

## 4.11.0
- Added "force-chestsort" to sort chests even if the user has ChestSort disabled

## 4.10.3
- Fixed /search command showing "%s" instead of the material name

## 4.10.1
- Fixed blacklist message

## 4.10.0
- Added new message to show when all items in the inventory are blacklisted

## 4.9.5
- Fixed: users being able to add duplicate entries to their blacklist

## 4.9.2
- Added InventoryPages support

## 4.9.1
- InvUnload will no longer try to unload into droppers and dispensers
- Fixed compatibility with some older versions
- Added /chestsearch as alias for /searchitem

## 4.9.0
- Added commands to add / remove all items to / from your blacklist that you currently have in your inventory / hotbar:
  - /blacklist add inventory
  - /blacklist remove inventory
  - /blacklist add hotbar
  - /blacklist remove hotbar

## 4.8.2
- Fixed exception on startup

## 4.8.1
- Updated Chinese (Simplified) translation
- Fixed config updating everytime the server starts

## 4.8.0
- Use custom event instead of PlayerInteractEvent to check if a player has access to a chest so that 3rd party plugins (especially OpenInv) can handle this properly

## 4.7.0
- Added per-player setting whether hotbar contents should be unloaded / dumped as well.
  - /unload hotbar: Toggle whether hotbar contents get unloaded
  - /dump hotbar: Toggle whether hotbar contents get dumped

## 4.6.0
- Added per player blacklist for items that should not be unloaded
  - /blacklist: Shows your blacklist, including clickable links to delete items
  - /blacklist add: Adds your currently held item to the blacklist
  - /blacklist add <Items...>: Adds all specified materials to the blacklist
  - /blacklist remove: Removes your currently held item from the blacklist
  - /blacklist remove <Items...>: Removes all specified materials from the blacklist
- Fixed exception when using ancient versions of CoreProtect
- Added config option to completely disable CoreProtect logging
- Laser animation is always shown after /unloadinfo or /search

## 4.5.0
- Made laser particles configurable
- Sound will only play once, regardless of how many chests have been affected

## 4.4.2
- Updated ChestSortAPI to latest version (please use ChestSort 8.14.0 or higher)
- Updated Turkish translation
- Updated Spigot-API to 1.16.1

## 4.4.1
- Fixed players being able to use a higher radius for /search than the defined max radius

## 4.4.0
- Updated Spanish translation
- Fixed items being counted twice in double chests when using /search
- Fixed /search not working when "always-show-summary" was set to false

## 4.3.0
- Added CoreProtect logging

## 4.2.2
- Works with 1.16
- Improved PlotSquared Hook: You will no longer get messages that you cannot use a chest, instead InvUnload will just ignore chests protected by PlotSquared

## 4.2.1
- Fixed update checker again (sorry)

## 4.2.0
- Fixed weird config update problem regarding UTF8
- Added /searchitem command (permission: invunload.search, alias: /search)
- Added Material tab complete for /searchitem
- Made stuffPlayerInventoryIntoAnother() public for API access
- Improved UpdateChecker

NOTE: This update includes a new message in the config.yml, so please send me your new translations :)

## 4.1.0
- Added PlotSquared support. Players will only be allowed to unload into their own plot (configurable). Players will also be disallowed to unload outside of their own plots (configurable).
- Added groups.yml file. You can define custom max-radius and default-radius for different player groups. A player will need the invunload.groups.<groupname> permission. See the groups.example.yml file for syntax.
- Added support for Spartan Anti-Cheat

## 4.0.0
Because some people wondered in which chests their stuff went into, I have added this:
- Added a text summary that shows where all your items went. By default, it is shown every time you use /unload or /dump, but you can also disable it so that it is only shown when using /unloadinfo (or /dumpinfo).
- Added a "laser" beam that will point to the affected chests for a few second. You can view the laser by running /unloadinfo or /dumpinfo. You can also set the laser to be always shown when using /unload or /dump.
- You can also overwrite the default laser duration with /unloadinfo [duration] or /dumpinfo [duration]
- You can also set laser-moves-with-player to true to have the lasers move when the player moves
- Added a reload command (/unload reload) that requires the permission "invunload.reload".

Further bugfixes:
- /unload is properly executed before /dump 

## 3.0.1
- Fixed: /unload now properly ignores the hotbar
- Fixed: Prevents Minepacks bagpacks from being put into chests
- Added (almost complete) Spanish translation

## 3.0.0
- Rewrote plugin from scratch. Source code is now muuuuch cleaner and faster
- Unload/dump now works with chests, double chests, shulkerboxes and barrels
- InvUnload should now work with every protection plugin like WorldGuard, GriefPrevention, etc. by calling an InventoryOpenEvent. InvUnload will only put items into chests if that event is not cancelled by other plugins.
- /dump will no longer take items from the player's hotbar
- When using /dump, InvUnload will always run /unload first. The config option has been removed.
- Permissions "invunload.unload" and "invunload.dump" have been renamed to "invunload.use"
- InvUnload can use ChestSort to sort chests that have been affected by unloading/dumping. This can be disabled in the config and only works if the player has automatic chest sorting enabled
- Particle types and sound effects can be set in the config.yml
- Update-Checker interval is now configurable in the config.yml
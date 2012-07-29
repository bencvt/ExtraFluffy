**ExtraFluffy** is a Bukkit (Minecraft server) plugin allowing you to increase
the number of items dropped by mobs.

Sheep can be fluffier, yielding more wool per shear. Slimes can be slimier,
dropping slime balls every time they split. Dying mobs of all types can drop
extra items.

## Basic usage

Once installed and configured, ExtraFluffy detects whenever a mob drops an item.
It then adds the extra items specified by the config, essentially giving you
full control over the loot tables.

## Why do this?

Boosting mob drops is one way to encourage players to keep fewer farm animals.
Fewer entities generally means improved server performance.

## But wait, there's more!

You can also do some creative things with this plugin. Dying mobs can drop any
item, even if they don't normally drop it. Examples:

* Give ocelots a chance to drop a raw fish. This could be a nice alternate way
  of obtaining fish when lag makes it impossible to use a fishing rod.

* Give ghasts a chance to drop glowstone dust. This could be handy for large
  servers with a nether that's been stripped clean of natural glowstone.

* Give silverfish a chance to drop a monster egg or two. Players could then
  essentially breed silverfish by fighting them. Players could also use the
  silverfish eggs for dispenser traps in their base.

## Installation

Works exactly the same as any other Bukkit plugin:

1. Get the latest jar. You can either:

  * Download the latest release from
    [BukkitDev/Curse](http://dev.bukkit.org/server-mods/extrafluffy/); or

  * Compile from source.
    Clone the [GitHub repo](https://github.com/bencvt/ExtraFluffy) and use
    [Maven](http://maven.apache.org/) to build.

2. Stick the jar in your CraftBukkit server's `plugins` directory.

3. Start the server. This will create `plugins/ExtraFluffy/config.yml`.
   Documentation is included in the config file itself.

4. Edit the config file to your heart's content.

5. Restart the server for the updated config to take effect. If you're on a
   test server or if you just like living dangerously, use Bukkit's */reload*
   command instead of a full restart.

Please report bugs, or any other feedback, via GitHub.

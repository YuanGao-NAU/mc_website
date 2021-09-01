## About mc_plugin

This is a Minecraft plugin which allows you to get the IDs of online players. The plugin will get the IDs of online players and send them to a server by ``POST`` data to the API called ``onlineplayers``.

## How to use

**Before you move forward, you may make some modification to the ``SendHttpData.java``.**

It's a ``maven`` project, so you may use the following commands to package it:
```Bash
cd the_folder_where_you_save_the_project/mc_plugin
mvn clean
mvn package
```
The ``.jar`` file will be in target folder. You are all set after putting the ``.jar`` file to the plugins folder. The IDs of online players will be sent as Json string, the format would be:
```Json
{"players":["ID1", "ID2", "ID3", "ID4"]}
```

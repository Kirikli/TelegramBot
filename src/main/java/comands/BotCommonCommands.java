package comands;

public class BotCommonCommands {

    @AppBotCommand(name = "/hello", description = "when request hello", showInHelp = true)
    String hello(){
        return "Hello, user";
    }

    @AppBotCommand(name = "/bye", description = "when request bye", showInHelp = true)
    String bye(){
        return "Good bye, user";
    }

    @AppBotCommand(name = "/help", description = "when request help", showInKeyBord = true)
    String help(){
        return "HEEEELP";
    }
}

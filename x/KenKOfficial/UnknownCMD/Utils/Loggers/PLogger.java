package x.KenKOfficial.UnknownCMD.Utils.Loggers;

import java.util.logging.*;
import x.KenKOfficial.UnknownCMD.Main.*;

public class PLogger
{
    private static final /* synthetic */ Logger logger;
    
    public static Logger getPluginLog() {
        return PLogger.logger;
    }
    
    static {
        logger = Logger.getLogger(Main.getPlugin().getName());
    }
}

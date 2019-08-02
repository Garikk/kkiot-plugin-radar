package kkdev.kksystem.plugin.radar;

import kkdev.kksystem.base.classes.plugins.PluginConfiguration;
import kkdev.kksystem.base.classes.plugins.PluginMessage;
import kkdev.kksystem.base.classes.plugins.simple.KKPluginBase;
import kkdev.kksystem.plugin.radar.manager.RadarManager;
import kkdev.kksystem.base.interfaces.IBaseConnection;




/**
 *
 * @author blinov_is
 */
public final class KKPlugin extends KKPluginBase {
    public KKPlugin() {
        super(new RadarPluginInfo());
        Global.GM=new RadarManager();
    }

    @Override
    public void pluginInit(IBaseConnection BaseConnector, String GlobalConfUID) {
        super.pluginInit(BaseConnector, GlobalConfUID);
    //    Global.GM.Init(this);
    }

    
    @Override
    public void executePin(PluginMessage Pin) {
        super.executePin(Pin);
        Global.GM.ReceivePIN(Pin);
    }
    
    
     @Override
    public void pluginStart() {
         super.pluginStart();
       //  Global.GM.Start();
    }
 @Override
    public PluginConfiguration getPluginSettings() {
       return null;//PluginSettings.MainConfiguration;
    }
}

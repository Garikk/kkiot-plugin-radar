/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkdev.kksystem.plugin.radar.manager;

import kkdev.kksystem.base.classes.base.PinDataTaggedObj;
import kkdev.kksystem.base.classes.plugins.PluginMessage;
import kkdev.kksystem.base.classes.plugins.simple.managers.PluginManagerBase;
import kkdev.kksystem.base.constants.PluginConsts;
import kkdev.kksystem.plugin.radar.KKPlugin;

/**
 *
 * @author blinov_is
 */
public class RadarManager extends PluginManagerBase {
    public final String RADAR_TAG="RADAR_DATA";
   
    public void Init(KKPlugin BaseConnector)
    {
        setPluginConnector(BaseConnector);
    }
    
    public void ReceivePIN(PluginMessage PM)
    {
        if (!PM.pinName.equals(PluginConsts.KK_PLUGIN_BASE_BASIC_TAGGEDOBJ_DATA))
            return;
        
        PinDataTaggedObj Dat=(PinDataTaggedObj)PM.getPinData();
        //===
        if (!Dat.tag.equals(RADAR_TAG))
            return;
       // if (Dat.pinDataType!=PinBaseData.BASE_DATA_TYPE.TAGGED_OBJ)
        //    return;
        //===
        
       //PinDataGeo PBG=new  PinDataGeo();
       
       //PBG.FillNMEAData((String)Dat.value);
        
       //this.BASE_SendPluginMessage(SystemConsts.KK_BASE_FEATURES_SYSTEM_MULTIFEATURE_UID,SystemConsts.KK_BASE_UICONTEXT_DEFAULT, PluginConsts.KK_PLUGIN_BASE_BASIC_TAGGEDOBJ_DATA, PBG);
    }
}

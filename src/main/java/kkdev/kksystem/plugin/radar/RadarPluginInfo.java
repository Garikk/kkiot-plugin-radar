package kkdev.kksystem.plugin.radar;

import kkdev.kksystem.base.classes.plugins.PluginInfo;
import kkdev.kksystem.base.classes.plugins.simple.IPluginInfoRequest;
import kkdev.kksystem.base.constants.PluginConsts;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author blinov_is e
 */
public class RadarPluginInfo implements IPluginInfoRequest {

    @Override
    public PluginInfo getPluginInfo() {
        PluginInfo Ret = new PluginInfo();

        Ret.PluginName = "KKRadar";
        Ret.PluginDescription = "Basic park radar plugin";
        Ret.PluginVersion = 1;
        Ret.Enabled = true;
        Ret.ReceivePins = GetMyReceivePinInfo();
        Ret.TransmitPins = GetMyTransmitPinInfo();
        Ret.PluginUUID = "482c6f54-91b4-488f-ba0e-e620033372a7";
        return Ret;
    }

   private String[] GetMyReceivePinInfo() {

        String[] ret = new String[2];

        ret[0] = PluginConsts.KK_PLUGIN_BASE_PIN_COMMAND;
        ret[1] = PluginConsts.KK_PLUGIN_BASE_NOTIFY_DATA;

        return ret;
    }

    private String[] GetMyTransmitPinInfo() {

        String[] ret = new String[1];
        ret[0] = PluginConsts.KK_PLUGIN_BASE_BASIC_TAGGEDOBJ_DATA;
        return ret;
    }
}

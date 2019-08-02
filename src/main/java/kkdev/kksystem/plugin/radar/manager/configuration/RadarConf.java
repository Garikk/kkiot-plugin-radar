/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkdev.kksystem.plugin.radar.manager.configuration;

import kkdev.kksystem.base.classes.plugins.PluginConfiguration;


/**
 *
 * @author blinov_is
 */
public class RadarConf  extends PluginConfiguration {
    public static enum RadarSources
    {
        RDR_SRC_EXTCONNECTOR
    }
    
    public RadarCluster[] Clusters;
    
}

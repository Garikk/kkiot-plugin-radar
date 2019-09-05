/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkdev.kksystem.plugin.radar.manager.configuration;

/**
 *
 * @author garikk
 */
public class RadarClusterConf {
    public String Name;
    public Integer AreaId;
    public RadarSensorConf[] Sensors;
    public AlertRule[] AlertRules;
}

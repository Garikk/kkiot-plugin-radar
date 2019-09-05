/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkdev.kksystem.plugin.radar.radar;

import java.util.List;
import java.util.Map;
import kkdev.kksystem.plugin.radar.manager.configuration.RadarClusterConf;

/**
 *
 * @author garikk
 */
public class Radar {
    private Map<Integer, ClusterProcessor> Clusters;
    private Map<String, List<Integer>> AdapterOnClusters;
    
    public Radar(RadarClusterConf conf)
    {
    }
    public void ReceiveSensorData(String SensorUID, Float SensorData)
    {
    }
}

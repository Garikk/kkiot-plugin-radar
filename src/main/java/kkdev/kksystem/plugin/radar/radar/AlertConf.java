/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkdev.kksystem.plugin.radar.radar;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author garikk
 */
public class AlertConf {
    String name;
    Map<Integer, Integer> alertrules;
    public AlertConf()
    {
        this.alertrules = new HashMap();
    }
    public void addAlertValue(int range, int value){
        this.alertrules.put(range, value);
    }
    public Integer checkAlert(int range)
    {
        if (this.alertrules.containsKey(range)) {
            return this.alertrules.get(range);
        }
        return null;
    }
}

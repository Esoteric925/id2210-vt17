package se.kth.GBEB;

import se.sics.kompics.KompicsEvent;
import se.sics.ktoolbox.util.network.KAddress;

import java.io.Serializable;

/**
 * Created by Amir on 2017-04-12.
 */
public class GBEBEvent implements KompicsEvent, Serializable {

    public final KAddress adress;
    public final String msg;

    public GBEBEvent(KAddress adress, String msg){
        this.adress = adress;
        this.msg = msg;
    }
}

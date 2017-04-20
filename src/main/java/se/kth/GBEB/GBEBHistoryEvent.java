package se.kth.GBEB;

import se.sics.kompics.KompicsEvent;
import se.sics.ktoolbox.util.network.KAddress;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * Created by Amir on 2017-04-12.
 */
public class GBEBHistoryEvent implements KompicsEvent, Serializable {

    public KAddress self;
    public Set<GBEBEvent> history;

    public GBEBHistoryEvent(KAddress self, Set<GBEBEvent> history){
        this.self = self;
        this.history = history;
    }

}

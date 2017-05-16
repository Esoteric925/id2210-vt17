package se.kth.GBEB;

import se.sics.kompics.PortType;

/**
 * Created by Amir on 2017-04-12.
 */
public class GBEBPort extends PortType {

    {
        indication(GBEBHistoryEvent.class);
        indication(GBEBEvent.class);

    }
}

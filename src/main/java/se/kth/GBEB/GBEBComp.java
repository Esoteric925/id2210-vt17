package se.kth.GBEB;

import com.google.common.collect.Sets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import se.kth.croupier.util.CroupierHelper;
import se.sics.kompics.ComponentDefinition;
import se.sics.kompics.Handler;
import se.sics.kompics.Port;
import se.sics.kompics.Start;
import se.sics.ktoolbox.croupier.event.CroupierSample;
import se.sics.ktoolbox.util.network.KAddress;
import se.sics.ktoolbox.util.network.KContentMsg;
import se.sics.ktoolbox.util.network.KHeader;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Amir on 2017-04-12.
 */
public class GBEBComp extends ComponentDefinition {

    final static Logger LOG = LoggerFactory.getLogger(GBEBComp.class);

    protected Set<GBEBEvent> past;
    protected Set<GBEBEvent> delivered = new HashSet<>();
    protected final Port<GBEBPort> gbebPort = requires(GBEBPort.class);

    protected final Handler<Start> init = new Handler<Start>(){
        @Override
        public void handle(Start event){

            past = new HashSet<>();
        }
    };

    protected final Handler<GBEBEvent> broadcast = new Handler<GBEBEvent>() {
        @Override
        public void handle(GBEBEvent gbebEvent) {
            past.add(gbebEvent);
        }
    };

    protected final Handler<CroupierSample> sample = new Handler<CroupierSample>(){

        @Override
        public void handle(CroupierSample croupierSample) {

            List<KAddress> samples = CroupierHelper.getSample(croupierSample);

            for(KAddress peer : samples){
                KHeader address;
                KContentMsg msg;
               // trigger(msg, ....);
            }

        }
    };



    protected final Handler<GBEBHistoryResponse> checkHistory = new Handler<GBEBHistoryResponse>(){

        @Override
        public void handle(GBEBHistoryResponse gbebHistoryEvent) {

            System.out.println("HEHE");
          // Set<GBEBEvent> unseen = Sets.symmetricDifference( past);
/*
           for(GBEBEvent gb : unseen){
               past.add(gb);
           }*/


        }
    };

}
